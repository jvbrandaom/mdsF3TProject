package groelandia.persistence;

import java.io.InputStream;

import dcore.persistence.DObjectDAO;
import dcore.persistence.JavaSQLPersistenceStrategy;
import dcore.util.PropertiesReader;

import groelandia.Groelandia;

/**
 * Implements the persistence strategy of the application by using the Java SQL
 * library.
 * 
 * @generated
 */
public class GroelandiaPersistenceStrategy extends JavaSQLPersistenceStrategy {

	/**
	 * Indicates the application DObjectDAO class.
	 * 
	 * @generated
	 */
	@Override
	public Class<? extends DObjectDAO> getDAOClass() {
		return GroelandiaDAO.class;
	}

	/**
	 * Indicates the properties file which contains the information about the
	 * database. This method is optional since this information included in this
	 * class. Although is recommended to use a properties file.
	 * 
	 * @return the stream of the properties file or null if it was not found.
	 * 
	 * @generated
	 */
	public InputStream getPropertiesFile() {
		return Groelandia.class.getResourceAsStream("groelandia.properties");
	}

	/**
	 * Indicates the name of the database drive used by the application.
	 * 
	 * @return a String with the name of the database drive.
	 * 
	 * @generated
	 */
	@Override
	public String getDatabaseDriver() {
		return PropertiesReader.getProperty(getPropertiesFile(),
				"database_driver");
	}

	/**
	 * Indicates the URL of the database used by the application.
	 * 
	 * @return a String with the URL of the database.
	 * 
	 * @generated
	 */
	@Override
	public String getDatabaseURL() {
		return PropertiesReader
				.getProperty(getPropertiesFile(), "database_url");
	}

	/**
	 * Indicates a user of the database used by the application.
	 * 
	 * @return a String with a user of the database.
	 * 
	 * @generated
	 */
	@Override
	public String getDatabaseUser() {
		return PropertiesReader.getProperty(getPropertiesFile(),
				"database_user");
	}

	/**
	 * Indicates the password of the database user used by the application.
	 * 
	 * @return a String with the password the the database user.
	 * 
	 * @generated
	 */
	@Override
	public String getDatabasePassword() {
		return PropertiesReader.getProperty(getPropertiesFile(),
				"database_password");
	}

}
