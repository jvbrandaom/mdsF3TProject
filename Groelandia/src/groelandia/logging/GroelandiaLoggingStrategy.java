package groelandia.logging;

import java.io.InputStream;

import dcore.logging.PropertiesLoggingStrategy;

import groelandia.Groelandia;

/**
 * Implements the logging strategy of the application by using a properties
 * file.
 * 
 * @generated
 */
public class GroelandiaLoggingStrategy extends PropertiesLoggingStrategy {

	/**
	 * Indicates the properties file which contains the sentences used by the
	 * application logging system.
	 * 
	 * @return the stream of the properties file or null if it was not found.
	 * @generated
	 */
	@Override
	public InputStream getPropertiesFileStream() {
		return Groelandia.class.getResourceAsStream("groelandia.properties");
	}

}
