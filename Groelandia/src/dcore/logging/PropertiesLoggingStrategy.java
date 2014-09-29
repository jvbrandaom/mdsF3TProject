package dcore.logging;

import java.io.InputStream;

import dcore.core.DObject;
import dcore.core.DReflection;
import dcore.util.PropertiesReader;

/**
 * A LoggingStrategy subclass which uses a properties file to define the format
 * of the log sentences. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @see #LoggingStrategy
 * @generated
 */
public abstract class PropertiesLoggingStrategy extends LoggingStrategy {

	/**
	 * Adds a message at the end of the log. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param key
	 *            identifies the message that must be added to the log.
	 * @param dObject
	 *            the DObject instance related to this message.
	 * @return the message added to the log.
	 * @generated
	 */
	@Override
	public String add(String key, DObject dObject) {
		String[] jokers = { DReflection.lowerCaseFirst(dObject.getClass()
				.getSimpleName()) };
		String message = PropertiesReader.getProperty(
				getPropertiesFileStream(), key, jokers);
		getLog().add(message);
		return message;
	}

	/**
	 * Override this method to indicate the properties file which contains the
	 * sentences used by the application logging strategy. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the stream of the properties file or null if it was not found.
	 * @generated
	 */
	public abstract InputStream getPropertiesFileStream();

}
