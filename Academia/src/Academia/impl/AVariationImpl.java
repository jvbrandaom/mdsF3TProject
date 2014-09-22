/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import org.eclipse.emf.ecore.EClass;

import Academia.AVariation;
import Academia.AcademiaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVariation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AVariationImpl#getLocalAttributes <em>Local Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AVariationImpl extends AFeatureImpl implements AVariation {
	
	/**
	 * The default value of the '{@link #getLocalAttributes() <em>Local Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ATTRIBUTES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVariationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.AVARIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getTYPE() {
		return "AVARIATION";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLocalAttributes() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcademiaPackage.AVARIATION__LOCAL_ATTRIBUTES:
				return getLocalAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AcademiaPackage.AVARIATION__LOCAL_ATTRIBUTES:
				return LOCAL_ATTRIBUTES_EDEFAULT == null ? getLocalAttributes() != null : !LOCAL_ATTRIBUTES_EDEFAULT.equals(getLocalAttributes());
		}
		return super.eIsSet(featureID);
	}

} //AVariationImpl
