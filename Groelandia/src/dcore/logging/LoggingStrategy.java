package dcore.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import dcore.core.DObject;

/**
 * Defines the default methods for the classes which perform a logging strategy
 * for the DSF. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class LoggingStrategy {

	/**
	 * Stores the log sentences as they are generated. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	private List<String> log;

	/**
	 * Constructor of the Logging strategy. Resets the log attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LoggingStrategy() {
		resetLog();
	}

	/**
	 * Adds a message at the end of the log. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param message
	 *            the text that must be added to the log.
	 * @param dObject
	 *            the DObject instance related to this message.
	 * @return the message added to the log.
	 * @generated
	 */
	public abstract String add(String message, DObject dObject);

	/**
	 * Returns the content of the log. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a list of Strings. Each String of this list is a message added to
	 *         the log.
	 */
	public List<String> getLog() {
		return log;
	}

	/**
	 * Returns the last message added to the log. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a String with the last message added to the log or an empty
	 *         String if the log is empty.
	 * @generated
	 */
	public String getLastMessage() {
		return log.size() > 0 ? log.get(log.size() - 1) : "";
	}

	/**
	 * Clears all content of the log. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void resetLog() {
		log = new ArrayList<String>();
	}

	/**
	 * Returns the content of the log as a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a String with all content of the log list attribute.
	 * @generated
	 */
	@Override
	public String toString() {
		String result = "";
		for (String logline : log) {
			result += logline + "\n";
		}
		return result;
	}

	/**
	 * Saves all log content in a file. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void toFile(String path) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(path));
			out.write(toString());
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
