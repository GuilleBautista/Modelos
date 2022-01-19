/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Door;
import conversationalGame.RoomConsequence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.RoomConsequenceImpl#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomConsequenceImpl extends ConsequenceImpl implements RoomConsequence {
	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected Door door;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.ROOM_CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (door != null && door.eIsProxy()) {
			InternalEObject oldDoor = (InternalEObject)door;
			door = (Door)eResolveProxy(oldDoor);
			if (door != oldDoor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR, oldDoor, door));
			}
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		Door oldDoor = door;
		door = newDoor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR, oldDoor, door));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR:
				if (resolve) return getDoor();
				return basicGetDoor();
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
			case ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR:
				setDoor((Door)newValue);
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
			case ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR:
				setDoor((Door)null);
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
			case ConversationalGamePackage.ROOM_CONSEQUENCE__DOOR:
				return door != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomConsequenceImpl
