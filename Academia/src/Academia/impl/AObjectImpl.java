
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import Academia.AAttribute;
import Academia.ANamedElement;
import Academia.AObject;
import Academia.AOperation;
import Academia.AcademiaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>AObject</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link Academia.impl.AObjectImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link Academia.impl.AObjectImpl#getAAttributes <em>AAttributes</em>}</li>
 *   <li>{@link Academia.impl.AObjectImpl#getAOperations <em>AOperations</em>}</li>
 *   <li>{@link Academia.impl.AObjectImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AObjectImpl extends AFeatureImpl implements AObject {

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAAttributes() <em>AAttributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AAttribute> aAttributes;
	/**
	 * The cached value of the '{@link #getAOperations() <em>AOperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AOperation> aOperations;
	/**
	 * The default value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.AOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOBJECT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AAttribute> getAAttributes() {
		if (aAttributes == null) {
			aAttributes = new EObjectContainmentWithInverseEList<AAttribute>(AAttribute.class, this, AcademiaPackage.AOBJECT__AATTRIBUTES, AcademiaPackage.AATTRIBUTE__ACONTAINER);
		}
		return aAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AOperation> getAOperations() {
		if (aOperations == null) {
			aOperations = new EObjectContainmentWithInverseEList<AOperation>(AOperation.class, this, AcademiaPackage.AOBJECT__AOPERATIONS, AcademiaPackage.AOPERATION__ACONTAINER);
		}
		return aOperations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getTYPE() {
		return "AOBJECT";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getPrimaryKey() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAAttributes()).basicAdd(otherEnd, msgs);
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAOperations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				return ((InternalEList<?>)getAAttributes()).basicRemove(otherEnd, msgs);
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				return ((InternalEList<?>)getAOperations()).basicRemove(otherEnd, msgs);
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
			case AcademiaPackage.AOBJECT__NAME:
				return getName();
			case AcademiaPackage.AOBJECT__ABSTRACT:
				return isAbstract();
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				return getAAttributes();
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				return getAOperations();
			case AcademiaPackage.AOBJECT__PRIMARY_KEY:
				return getPrimaryKey();
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
			case AcademiaPackage.AOBJECT__NAME:
				setName((String)newValue);
				return;
			case AcademiaPackage.AOBJECT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				getAAttributes().clear();
				getAAttributes().addAll((Collection<? extends AAttribute>)newValue);
				return;
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				getAOperations().clear();
				getAOperations().addAll((Collection<? extends AOperation>)newValue);
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
			case AcademiaPackage.AOBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AcademiaPackage.AOBJECT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				getAAttributes().clear();
				return;
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				getAOperations().clear();
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
			case AcademiaPackage.AOBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AcademiaPackage.AOBJECT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case AcademiaPackage.AOBJECT__AATTRIBUTES:
				return aAttributes != null && !aAttributes.isEmpty();
			case AcademiaPackage.AOBJECT__AOPERATIONS:
				return aOperations != null && !aOperations.isEmpty();
			case AcademiaPackage.AOBJECT__PRIMARY_KEY:
				return PRIMARY_KEY_EDEFAULT == null ? getPrimaryKey() != null : !PRIMARY_KEY_EDEFAULT.equals(getPrimaryKey());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ANamedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.AOBJECT__NAME: return AcademiaPackage.ANAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ANamedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ANAMED_ELEMENT__NAME: return AcademiaPackage.AOBJECT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} // AObjectImpl
