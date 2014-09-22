/**
 */
package Academia.impl;

import Academia.ABoundedElement;
import Academia.ADocumentatedElement;
import Academia.AModeledElement;
import Academia.AObject;
import Academia.AOperation;
import Academia.AParameter;
import Academia.ATypedElement;
import Academia.AcademiaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AOperationImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#getAContainer <em>AContainer</em>}</li>
 *   <li>{@link Academia.impl.AOperationImpl#getAParameters <em>AParameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AOperationImpl extends ANamedElementImpl implements AOperation {
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAParameters() <em>AParameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AParameter> aParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.AOPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__CHANGEABLE, oldChangeable, changeable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__SINGLETON, oldSingleton, singleton));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__LOWER_BOUND, oldLowerBound, lowerBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AObject getAContainer() {
		if (eContainerFeatureID() != AcademiaPackage.AOPERATION__ACONTAINER) return null;
		return (AObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAContainer(AObject newAContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAContainer, AcademiaPackage.AOPERATION__ACONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAContainer(AObject newAContainer) {
		if (newAContainer != eInternalContainer() || (eContainerFeatureID() != AcademiaPackage.AOPERATION__ACONTAINER && newAContainer != null)) {
			if (EcoreUtil.isAncestor(this, newAContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAContainer != null)
				msgs = ((InternalEObject)newAContainer).eInverseAdd(this, AcademiaPackage.AOBJECT__AOPERATIONS, AObject.class, msgs);
			msgs = basicSetAContainer(newAContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AOPERATION__ACONTAINER, newAContainer, newAContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AParameter> getAParameters() {
		if (aParameters == null) {
			aParameters = new EObjectContainmentWithInverseEList<AParameter>(AParameter.class, this, AcademiaPackage.AOPERATION__APARAMETERS, AcademiaPackage.APARAMETER__ACONTAINER);
		}
		return aParameters;
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
			case AcademiaPackage.AOPERATION__ACONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAContainer((AObject)otherEnd, msgs);
			case AcademiaPackage.AOPERATION__APARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAParameters()).basicAdd(otherEnd, msgs);
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
			case AcademiaPackage.AOPERATION__ACONTAINER:
				return basicSetAContainer(null, msgs);
			case AcademiaPackage.AOPERATION__APARAMETERS:
				return ((InternalEList<?>)getAParameters()).basicRemove(otherEnd, msgs);
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
			case AcademiaPackage.AOPERATION__ACONTAINER:
				return eInternalContainer().eInverseRemove(this, AcademiaPackage.AOBJECT__AOPERATIONS, AObject.class, msgs);
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
			case AcademiaPackage.AOPERATION__TYPE_NAME:
				return getTypeName();
			case AcademiaPackage.AOPERATION__CHANGEABLE:
				return isChangeable();
			case AcademiaPackage.AOPERATION__SINGLETON:
				return isSingleton();
			case AcademiaPackage.AOPERATION__LOWER_BOUND:
				return getLowerBound();
			case AcademiaPackage.AOPERATION__UPPER_BOUND:
				return getUpperBound();
			case AcademiaPackage.AOPERATION__DOCUMENTATION:
				return getDocumentation();
			case AcademiaPackage.AOPERATION__ACONTAINER:
				return getAContainer();
			case AcademiaPackage.AOPERATION__APARAMETERS:
				return getAParameters();
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
			case AcademiaPackage.AOPERATION__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case AcademiaPackage.AOPERATION__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case AcademiaPackage.AOPERATION__SINGLETON:
				setSingleton((Boolean)newValue);
				return;
			case AcademiaPackage.AOPERATION__LOWER_BOUND:
				setLowerBound((String)newValue);
				return;
			case AcademiaPackage.AOPERATION__UPPER_BOUND:
				setUpperBound((String)newValue);
				return;
			case AcademiaPackage.AOPERATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AcademiaPackage.AOPERATION__ACONTAINER:
				setAContainer((AObject)newValue);
				return;
			case AcademiaPackage.AOPERATION__APARAMETERS:
				getAParameters().clear();
				getAParameters().addAll((Collection<? extends AParameter>)newValue);
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
			case AcademiaPackage.AOPERATION__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__SINGLETON:
				setSingleton(SINGLETON_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AcademiaPackage.AOPERATION__ACONTAINER:
				setAContainer((AObject)null);
				return;
			case AcademiaPackage.AOPERATION__APARAMETERS:
				getAParameters().clear();
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
			case AcademiaPackage.AOPERATION__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case AcademiaPackage.AOPERATION__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case AcademiaPackage.AOPERATION__SINGLETON:
				return singleton != SINGLETON_EDEFAULT;
			case AcademiaPackage.AOPERATION__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case AcademiaPackage.AOPERATION__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case AcademiaPackage.AOPERATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AcademiaPackage.AOPERATION__ACONTAINER:
				return getAContainer() != null;
			case AcademiaPackage.AOPERATION__APARAMETERS:
				return aParameters != null && !aParameters.isEmpty();
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
				case AcademiaPackage.AOPERATION__TYPE_NAME: return AcademiaPackage.ATYPED_ELEMENT__TYPE_NAME;
				case AcademiaPackage.AOPERATION__CHANGEABLE: return AcademiaPackage.ATYPED_ELEMENT__CHANGEABLE;
				case AcademiaPackage.AOPERATION__SINGLETON: return AcademiaPackage.ATYPED_ELEMENT__SINGLETON;
				default: return -1;
			}
		}
		if (baseClass == ABoundedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.AOPERATION__LOWER_BOUND: return AcademiaPackage.ABOUNDED_ELEMENT__LOWER_BOUND;
				case AcademiaPackage.AOPERATION__UPPER_BOUND: return AcademiaPackage.ABOUNDED_ELEMENT__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == AModeledElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ADocumentatedElement.class) {
			switch (derivedFeatureID) {
				case AcademiaPackage.AOPERATION__DOCUMENTATION: return AcademiaPackage.ADOCUMENTATED_ELEMENT__DOCUMENTATION;
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
				case AcademiaPackage.ATYPED_ELEMENT__TYPE_NAME: return AcademiaPackage.AOPERATION__TYPE_NAME;
				case AcademiaPackage.ATYPED_ELEMENT__CHANGEABLE: return AcademiaPackage.AOPERATION__CHANGEABLE;
				case AcademiaPackage.ATYPED_ELEMENT__SINGLETON: return AcademiaPackage.AOPERATION__SINGLETON;
				default: return -1;
			}
		}
		if (baseClass == ABoundedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ABOUNDED_ELEMENT__LOWER_BOUND: return AcademiaPackage.AOPERATION__LOWER_BOUND;
				case AcademiaPackage.ABOUNDED_ELEMENT__UPPER_BOUND: return AcademiaPackage.AOPERATION__UPPER_BOUND;
				default: return -1;
			}
		}
		if (baseClass == AModeledElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ADocumentatedElement.class) {
			switch (baseFeatureID) {
				case AcademiaPackage.ADOCUMENTATED_ELEMENT__DOCUMENTATION: return AcademiaPackage.AOPERATION__DOCUMENTATION;
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
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //AOperationImpl
