/**
 */
package Academia.impl;

import Academia.ABoundedElement;
import Academia.AModeledElement;
import Academia.AOperation;
import Academia.AParameter;
import Academia.ATypedElement;
import Academia.AcademiaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AParameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AParameterImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Academia.impl.AParameterImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link Academia.impl.AParameterImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link Academia.impl.AParameterImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link Academia.impl.AParameterImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link Academia.impl.AParameterImpl#getAContainer <em>AContainer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AParameterImpl extends ANamedElementImpl implements AParameter {
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLETON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleton()
	 * @generated
	 * @ordered
	 */
	protected boolean singleton = SINGLETON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUND_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUND_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.APARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleton() {
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleton(boolean newSingleton) {
		boolean oldSingleton = singleton;
		singleton = newSingleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__SINGLETON, oldSingleton, singleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(String newLowerBound) {
		String oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(String newUpperBound) {
		String oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOperation getAContainer() {
		if (eContainerFeatureID() != AcademiaPackage.APARAMETER__ACONTAINER) return null;
		return (AOperation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAContainer(AOperation newAContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAContainer, AcademiaPackage.APARAMETER__ACONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAContainer(AOperation newAContainer) {
		if (newAContainer != eInternalContainer() || (eContainerFeatureID() != AcademiaPackage.APARAMETER__ACONTAINER && newAContainer != null)) {
			if (EcoreUtil.isAncestor(this, newAContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAContainer != null)
				msgs = ((InternalEObject)newAContainer).eInverseAdd(this, AcademiaPackage.AOPERATION__APARAMETERS, AOperation.class, msgs);
			msgs = basicSetAContainer(newAContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.APARAMETER__ACONTAINER, newAContainer, newAContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcademiaPackage.APARAMETER__ACONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAContainer((AOperation)otherEnd, msgs);
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
			case AcademiaPackage.APARAMETER__ACONTAINER:
				return basicSetAContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AcademiaPackage.APARAMETER__ACONTAINER:
				return eInternalContainer().eInverseRemove(this, AcademiaPackage.AOPERATION__APARAMETERS, AOperation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcademiaPackage.APARAMETER__TYPE_NAME:
				return getTypeName();
			case AcademiaPackage.APARAMETER__CHANGEABLE:
				return isChangeable();
			case AcademiaPackage.APARAMETER__SINGLETON:
				return isSingleton();
			case AcademiaPackage.APARAMETER__LOWER_BOUND:
				return getLowerBound();
			case AcademiaPackage.APARAMETER__UPPER_BOUND:
				return getUpperBound();
			case AcademiaPackage.APARAMETER__ACONTAINER:
				return getAContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcademiaPackage.APARAMETER__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case AcademiaPackage.APARAMETER__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case AcademiaPackage.APARAMETER__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case AcademiaPackage.APARAMETER__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case AcademiaPackage.APARAMETER__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case AcademiaPackage.APARAMETER__ACONTAINER:
				setAContainer((AOperation)newValue);
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
			case AcademiaPackage.APARAMETER__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case AcademiaPackage.APARAMETER__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case AcademiaPackage.APARAMETER__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case AcademiaPackage.APARAMETER__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case AcademiaPackage.APARAMETER__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case AcademiaPackage.APARAMETER__ACONTAINER:
				setAContainer((AOperation)null);
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
			case AcademiaPackage.APARAMETER__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case AcademiaPackage.APARAMETER__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case AcademiaPackage.APARAMETER__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case AcademiaPackage.APARAMETER__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case AcademiaPackage.APARAMETER__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case AcademiaPackage.APARAMETER__ACONTAINER:
				return getAContainer() != null;
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
		if (baseClass == ATypedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.APARAMETER__TYPE_NAME: return AcademiaPackage.ATYPED_ELEMENT__TYPE_NAME;
				case AcademiaPackage.APARAMETER__CHANGEABLE: return AcademiaPackage.ATYPED_ELEMENT__CHANGEABLE;
				case AcademiaPackage.APARAMETER__SINGLETON: return AcademiaPackage.ATYPED_ELEMENT__SINGLETON;
				default: return -1;
			}
		}
		if (baseClass == ABoundedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.APARAMETER__LOWER_BOUND: return AcademiaPackage.ABOUNDED_ELEMENT__LOWER_BOUND;
				case AcademiaPackage.APARAMETER__UPPER_BOUND: return AcademiaPackage.ABOUNDED_ELEMENT__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == AModeledElement.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ATypedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ATYPED_ELEMENT__TYPE_NAME: return AcademiaPackage.APARAMETER__TYPE_NAME;
				case AcademiaPackage.ATYPED_ELEMENT__CHANGEABLE: return AcademiaPackage.APARAMETER__CHANGEABLE;
				case AcademiaPackage.ATYPED_ELEMENT__SINGLETON: return AcademiaPackage.APARAMETER__SINGLETON;
				default: return -1;
			}
		}
		if (baseClass == ABoundedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ABOUNDED_ELEMENT__LOWER_BOUND: return AcademiaPackage.APARAMETER__LOWER_BOUND;
				case AcademiaPackage.ABOUNDED_ELEMENT__UPPER_BOUND: return AcademiaPackage.APARAMETER__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == AModeledElement.class) {
			switch (baseFeatureID) {
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", changeable: ");
		result.append(changeable);
		result.append(", singleton: ");
		result.append(singleton);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //AParameterImpl
