/**
 */
package Academia.provider;


import Academia.APackage;
import Academia.AcademiaFactory;
import Academia.AcademiaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Academia.APackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APackageItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APackageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDomainPropertyDescriptor(object);
			addDProjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APackage_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APackage_domain_feature", "_UI_APackage_type"),
				 AcademiaPackage.Literals.APACKAGE__DOMAIN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DProject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APackage_dProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APackage_dProject_feature", "_UI_APackage_type"),
				 AcademiaPackage.Literals.APACKAGE__DPROJECT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns APackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((APackage)object).getDomain();
		return label == null || label.length() == 0 ?
			getString("_UI_APackage_type") :
			getString("_UI_APackage_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(APackage.class)) {
			case AcademiaPackage.APACKAGE__DOMAIN:
			case AcademiaPackage.APACKAGE__DPROJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createAApplication()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createAObject()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createAVariation()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createMatricula()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createAluno()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createCurso()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createDepartamento()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createCampus()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createDisciplinaSemestre()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createDisciplinaPaga()));

		newChildDescriptors.add
			(createChildParameter
				(AcademiaPackage.Literals.APACKAGE__ACLASSIFIERS,
				 AcademiaFactory.eINSTANCE.createDisciplinaGratis()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AcademiaEditPlugin.INSTANCE;
	}

}
