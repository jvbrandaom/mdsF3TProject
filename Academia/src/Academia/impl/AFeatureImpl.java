
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Academia.impl;

import Academia.AClassifier;
import Academia.AFeature;
import Academia.AcademiaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>AFeature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Academia.impl.AFeatureImpl#getStereo <em>Stereo</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getAParent <em>AParent</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getAAllParents <em>AAll Parents</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getProvidedAttributes <em>Provided Attributes</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getAttributesSQL <em>Attributes SQL</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getMultipleFields <em>Multiple Fields</em>}</li>
 *   <li>{@link Academia.impl.AFeatureImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AFeatureImpl extends AClassifierImpl implements AFeature {

	/**
	 * The default value of the '{@link #getStereo() <em>Stereo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereo()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAParent() <em>AParent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAParent()
	 * @generated
	 * @ordered
	 */
	protected AClassifier aParent;
	/**
	 * The default value of the '{@link #getAAllParents() <em>AAll Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAllParents()
	 * @generated
	 * @ordered
	 */
	protected static final String AALL_PARENTS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProvidedAttributes() <em>Provided Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDED_ATTRIBUTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAttributesSQL() <em>Attributes SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesSQL()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTES_SQL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMultipleFields() <em>Multiple Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleFields()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLE_FIELDS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAssociations() <em>Associations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcademiaPackage.Literals.AFEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getTYPE() {
		return "AFEATURE";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getStereo() {
		return getClass().getInterfaces()[0].getSimpleName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AClassifier getAParent() {
		if (aParent != null && aParent.eIsProxy()) {
			InternalEObject oldAParent = (InternalEObject)aParent;
			aParent = (AClassifier)eResolveProxy(oldAParent);
			if (aParent != oldAParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AcademiaPackage.AFEATURE__APARENT, oldAParent, aParent));
			}
		}
		return aParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AClassifier basicGetAParent() {
		return aParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAParent(AClassifier newAParent, NotificationChain msgs) {
		AClassifier oldAParent = aParent;
		aParent = newAParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AcademiaPackage.AFEATURE__APARENT, oldAParent, newAParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAParent(AClassifier newAParent) {
		if (newAParent != aParent) {
			NotificationChain msgs = null;
			if (aParent != null)
				msgs = ((InternalEObject)aParent).eInverseRemove(this, AcademiaPackage.ACLASSIFIER__ACHILDS, AClassifier.class, msgs);
			if (newAParent != null)
				msgs = ((InternalEObject)newAParent).eInverseAdd(this, AcademiaPackage.ACLASSIFIER__ACHILDS, AClassifier.class, msgs);
			msgs = basicSetAParent(newAParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcademiaPackage.AFEATURE__APARENT, newAParent, newAParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getAAllParents() {
		String allParents = "";
		int count = 0;
		Class<?> aParent = this.getClass();
		while (aParent != AObjectImpl.class && aParent != AVariationImpl.class) {
			allParents += (count++ > 0 ? ";" : "")
					+ aParent.getSimpleName().replace("Impl", "");
			aParent = aParent.getSuperclass();
		}
		return allParents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getProvidedAttributes() {
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getAttributesSQL() {
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getMultipleFields() {
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getAssociations() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcademiaPackage.AFEATURE__APARENT:
				if (aParent != null)
					msgs = ((InternalEObject)aParent).eInverseRemove(this, AcademiaPackage.ACLASSIFIER__ACHILDS, AClassifier.class, msgs);
				return basicSetAParent((AClassifier)otherEnd, msgs);
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
			case AcademiaPackage.AFEATURE__APARENT:
				return basicSetAParent(null, msgs);
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
			case AcademiaPackage.AFEATURE__STEREO:
				return getStereo();
			case AcademiaPackage.AFEATURE__APARENT:
				if (resolve) return getAParent();
				return basicGetAParent();
			case AcademiaPackage.AFEATURE__AALL_PARENTS:
				return getAAllParents();
			case AcademiaPackage.AFEATURE__PROVIDED_ATTRIBUTES:
				return getProvidedAttributes();
			case AcademiaPackage.AFEATURE__ATTRIBUTES_SQL:
				return getAttributesSQL();
			case AcademiaPackage.AFEATURE__MULTIPLE_FIELDS:
				return getMultipleFields();
			case AcademiaPackage.AFEATURE__ASSOCIATIONS:
				return getAssociations();
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
			case AcademiaPackage.AFEATURE__APARENT:
				setAParent((AClassifier)newValue);
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
			case AcademiaPackage.AFEATURE__APARENT:
				setAParent((AClassifier)null);
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
			case AcademiaPackage.AFEATURE__STEREO:
				return STEREO_EDEFAULT == null ? getStereo() != null : !STEREO_EDEFAULT.equals(getStereo());
			case AcademiaPackage.AFEATURE__APARENT:
				return aParent != null;
			case AcademiaPackage.AFEATURE__AALL_PARENTS:
				return AALL_PARENTS_EDEFAULT == null ? getAAllParents() != null : !AALL_PARENTS_EDEFAULT.equals(getAAllParents());
			case AcademiaPackage.AFEATURE__PROVIDED_ATTRIBUTES:
				return PROVIDED_ATTRIBUTES_EDEFAULT == null ? getProvidedAttributes() != null : !PROVIDED_ATTRIBUTES_EDEFAULT.equals(getProvidedAttributes());
			case AcademiaPackage.AFEATURE__ATTRIBUTES_SQL:
				return ATTRIBUTES_SQL_EDEFAULT == null ? getAttributesSQL() != null : !ATTRIBUTES_SQL_EDEFAULT.equals(getAttributesSQL());
			case AcademiaPackage.AFEATURE__MULTIPLE_FIELDS:
				return MULTIPLE_FIELDS_EDEFAULT == null ? getMultipleFields() != null : !MULTIPLE_FIELDS_EDEFAULT.equals(getMultipleFields());
			case AcademiaPackage.AFEATURE__ASSOCIATIONS:
				return ASSOCIATIONS_EDEFAULT == null ? getAssociations() != null : !ASSOCIATIONS_EDEFAULT.equals(getAssociations());
		}
		return super.eIsSet(featureID);
	}

} // AFeatureImpl
