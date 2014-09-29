package dcore.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * Retrieves data from a properties file. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @param propertiesFile
 *            the stream of the properties file.
 * @param key
 *            the identification of data which must be retrieved.
 * @return a String with the value of the key passed as parameter, an empty
 *         String if the file is found but it does not contains the key passed
 *         as parameter or an error message if the file is not found.
 * @generated
 */
public class PropertiesReader {

	/**
	 * Retrieves data from a properties file. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param propertiesFile
	 *            the stream of the properties file.
	 * @param key
	 *            the identification of data which must be retrieved.
	 * @return a String with the value of the key passed as parameter, an empty
	 *         String if the file is found but it does not contains the key
	 *         passed as parameter or an error message if the file is not found.
	 * @generated
	 */
	public static String getProperty(InputStream propertiesFile, String key) {
		try {
			Properties properties = new Properties();
			properties.load(propertiesFile);
			propertiesFile.close();
			if (!properties.containsKey(key))
				return "";
			else
				return properties.getProperty(key).trim();
		} catch (Exception ex) {
			return "ERROR: it is not possible to read the properties file.";
		}
	}

	/**
	 * Retrieves data from a properties file and customizes it with jokers. Use
	 * the symbol <code><!></code> to indicate a spot where the jokers must be
	 * inserted. The replacement of the spots by the jokers obeys the order of
	 * the array passed as parameter. If there is more jokers than spots, the
	 * exceeding jokers are ignored. If there is more spots than jokers, the
	 * exceeding spots are not replaced. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param propertiesFile
	 *            the stream of the properties file.
	 * @param key
	 *            the identification of data which must be retrieved.
	 * @param jokers
	 *            values used to customize the data retrieved from the property.
	 * @return a String with the value of the key passed as parameter, an empty
	 *         String if the file is found but it does not contains the key
	 *         passed as parameter or an error message if the file is not found.
	 * @generated
	 */
	public static String getProperty(InputStream propertiesFile, String key,
			String[] jokers) {
		String property = getProperty(propertiesFile, key);
		for (String joker : jokers) {
			property = property.replaceFirst("<!>", joker);
		}
		return property;
	}

}
