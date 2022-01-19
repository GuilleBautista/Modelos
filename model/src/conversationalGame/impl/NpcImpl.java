/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Npc;
import conversationalGame.RoomTrigger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.NpcImpl#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.impl.NpcImpl#getFirstEncounterTrigger <em>First Encounter Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NpcImpl extends CharacterImpl implements Npc {
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
	 * The cached value of the '{@link #getFirstEncounterTrigger() <em>First Encounter Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEncounterTrigger()
	 * @generated
	 * @ordered
	 */
	protected RoomTrigger firstEncounterTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NpcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.NPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.NPC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTrigger getFirstEncounterTrigger() {
		if (firstEncounterTrigger != null && firstEncounterTrigger.eIsProxy()) {
			InternalEObject oldFirstEncounterTrigger = (InternalEObject)firstEncounterTrigger;
			firstEncounterTrigger = (RoomTrigger)eResolveProxy(oldFirstEncounterTrigger);
			if (firstEncounterTrigger != oldFirstEncounterTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER, oldFirstEncounterTrigger, firstEncounterTrigger));
			}
		}
		return firstEncounterTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTrigger basicGetFirstEncounterTrigger() {
		return firstEncounterTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstEncounterTrigger(RoomTrigger newFirstEncounterTrigger) {
		RoomTrigger oldFirstEncounterTrigger = firstEncounterTrigger;
		firstEncounterTrigger = newFirstEncounterTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER, oldFirstEncounterTrigger, firstEncounterTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.NPC__NAME:
				return getName();
			case ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER:
				if (resolve) return getFirstEncounterTrigger();
				return basicGetFirstEncounterTrigger();
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
			case ConversationalGamePackage.NPC__NAME:
				setName((String)newValue);
				return;
			case ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER:
				setFirstEncounterTrigger((RoomTrigger)newValue);
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
			case ConversationalGamePackage.NPC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER:
				setFirstEncounterTrigger((RoomTrigger)null);
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
			case ConversationalGamePackage.NPC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConversationalGamePackage.NPC__FIRST_ENCOUNTER_TRIGGER:
				return firstEncounterTrigger != null;
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
		result.append(')');
		return result.toString();
	}

} //NpcImpl
