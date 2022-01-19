/**
 */
package conversationalGame.impl;

import conversationalGame.CharacterAction;
import conversationalGame.Consequence;
import conversationalGame.ConversationalGamePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.CharacterActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.impl.CharacterActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conversationalGame.impl.CharacterActionImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterActionImpl extends MinimalEObjectImpl.Container implements CharacterAction {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected Consequence consequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.CHARACTER_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CHARACTER_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CHARACTER_ACTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence getConsequence() {
		if (consequence != null && consequence.eIsProxy()) {
			InternalEObject oldConsequence = (InternalEObject)consequence;
			consequence = (Consequence)eResolveProxy(oldConsequence);
			if (consequence != oldConsequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE, oldConsequence, consequence));
			}
		}
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence basicGetConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequence(Consequence newConsequence) {
		Consequence oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE, oldConsequence, consequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.CHARACTER_ACTION__NAME:
				return getName();
			case ConversationalGamePackage.CHARACTER_ACTION__DESCRIPTION:
				return getDescription();
			case ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE:
				if (resolve) return getConsequence();
				return basicGetConsequence();
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
			case ConversationalGamePackage.CHARACTER_ACTION__NAME:
				setName((String)newValue);
				return;
			case ConversationalGamePackage.CHARACTER_ACTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE:
				setConsequence((Consequence)newValue);
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
			case ConversationalGamePackage.CHARACTER_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConversationalGamePackage.CHARACTER_ACTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE:
				setConsequence((Consequence)null);
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
			case ConversationalGamePackage.CHARACTER_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConversationalGamePackage.CHARACTER_ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConversationalGamePackage.CHARACTER_ACTION__CONSEQUENCE:
				return consequence != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CharacterActionImpl
