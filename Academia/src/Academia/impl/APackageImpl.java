
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AClassifier;
import Academia.APackage;
import Academia.AcademiaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>APackage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.APackageImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link Academia.impl.APackageImpl#getDProject <em>DProject</em>}</li>
 *   <li>{@link Academia.impl.APackageImpl#getAClassifiers <em>AClassifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APackageImpl extends EObjectImpl implements APackage {

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDomain()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = "Academia";

	/**
	 * The default value of the '{@link #getDProject() <em>DProject</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDProject()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String DPROJECT_EDEFAULT = "academia";

	/**
	 * The cached value of the '{@link #getAClassifiers() <em>AClassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<AClassifier> aClassifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.APACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getDomain() {
		return DOMAIN_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getDProject() {
		return DPROJECT_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AClassifier> getAClassifiers() {
		if (aClassifiers == null) {
			aClassifiers = new EObjectContainmentEList<AClassifier>(AClassifier.class, this, AcademiaPackage.APACKAGE__ACLASSIFIERS);
		}
		return aClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				return ((InternalEList<?>)getAClassifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcademiaPackage.APACKAGE__DOMAIN:
				return getDomain();
			case AcademiaPackage.APACKAGE__DPROJECT:
				return getDProject();
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				return getAClassifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				getAClassifiers().clear();
				getAClassifiers().addAll((Collection<? extends AClassifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				getAClassifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AcademiaPackage.APACKAGE__DOMAIN:
				return DOMAIN_EDEFAULT == null ? getDomain() != null : !DOMAIN_EDEFAULT.equals(getDomain());
			case AcademiaPackage.APACKAGE__DPROJECT:
				return DPROJECT_EDEFAULT == null ? getDProject() != null : !DPROJECT_EDEFAULT.equals(getDProject());
			case AcademiaPackage.APACKAGE__ACLASSIFIERS:
				return aClassifiers != null && !aClassifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // APackageImpl
