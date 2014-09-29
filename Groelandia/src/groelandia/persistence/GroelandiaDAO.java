package groelandia.persistence;

import dcore.core.DObject;
import dcore.logging.LoggingStrategy;
import dcore.persistence.DObjectDAO;
import dcore.persistence.PersistenceStrategy;

import groelandia.logging.GroelandiaLoggingStrategy;

/**
 * Defines the Data Abstract Object (DAO) that encapsulates the DObject
 * sublasses to add the functionality implemented by the strategies used in the
 * application.
 * 
 * @generated
 */
public class GroelandiaDAO extends DObjectDAO {

	/**
	 * Constructor with no parameters. Loads the strategies classes chosen for
	 * the application. The DObjectDAO instance created does not encapsulate a
	 * DOBject instance.
	 * 
	 * @generated
	 */
	public GroelandiaDAO() {
		super();
	}

	/**
	 * Constructor with parameters. Loads the strategies classes chosen for the
	 * application. The DOBjectDAO instance created encapsulates the DOBject
	 * instance passed as parameter.
	 * 
	 * @param dObject
	 *            the DObject instance to be encapsulated by the DOBjectDAO.
	 * 
	 * @generated
	 */
	public GroelandiaDAO(DObject dObject) {
		super(dObject);
	}

	/**
	 * Returns the class which implements the application logging strategy.
	 * 
	 * @generated
	 */
	@Override
	public Class<? extends LoggingStrategy> getLoggingStrategyClass() {
		return GroelandiaLoggingStrategy.class;
	}

	/**
	 * Returns the class which implements the application persistence strategy.
	 * 
	 * @generated
	 */
	@Override
	public Class<? extends PersistenceStrategy> getPersistenceStrategyClass() {
		return GroelandiaPersistenceStrategy.class;
	}

}
