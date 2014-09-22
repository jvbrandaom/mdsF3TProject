package Academia.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

public class GenCodeFromFileAction extends Action implements IViewActionDelegate {
	
	private static final String JET_PROJECT = "advanse.acore.generator";

	private static final String PROJECT_VAR = "org.eclipse.jet.resource.project.name";
	
	private IFile file;
	
	@Override
	public void init(IViewPart view) {	}
	
	@Override
	public void run(IAction action) {
		IStatus status = generateCode(file, action, new NullProgressMonitor());
		String messageText;
		int messageStyle;
		if (status.isOK()) {
			messageText = "The application code was generated successfully.";
			messageStyle = SWT.ICON_WORKING;
		}
		else {
			messageText = "A failure occured while generating the application code.";
			messageStyle = SWT.ICON_ERROR;
			System.out.println(status.toString());
		}
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
			messageStyle);
		box.setMessage(messageText);
		box.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	    if (selection instanceof IStructuredSelection) {
	    	setEnabled(updateSelection((IStructuredSelection)selection));
	    }
	    else {
	    	setEnabled(false);
	    }
	}
	
	public boolean updateSelection(IStructuredSelection selection) {
	  	for (Iterator<?> objects = selection.iterator(); objects.hasNext(); ) {
		  	Object object = objects.next();
		  	if (object instanceof IFile) {
		  		this.file = (IFile)object;
		  		return true;
	      	}
	  	}
	  	return false;	  	
  	}

	public IStatus generateCode(IFile input, IAction action, IProgressMonitor monitor) {
	    Map<String,Object> variables = new HashMap<String,Object>();
    	variables.put(PROJECT_VAR, input.getProject().getName());
	    return JET2Platform.runTransformOnResource(JET_PROJECT, input, variables, monitor);	    
	}
	
}
