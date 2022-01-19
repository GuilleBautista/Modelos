/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Player;
import conversationalGame.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.PlayerImpl#getCurrentRoom <em>Current Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends CharacterImpl implements Player {
	/**
	 * The cached value of the '{@link #getCurrentRoom() <em>Current Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRoom()
	 * @generated
	 * @ordered
	 */
	protected Room currentRoom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getCurrentRoom() {
		if (currentRoom != null && currentRoom.eIsProxy()) {
			InternalEObject oldCurrentRoom = (InternalEObject)currentRoom;
			currentRoom = (Room)eResolveProxy(oldCurrentRoom);
			if (currentRoom != oldCurrentRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.PLAYER__CURRENT_ROOM, oldCurrentRoom, currentRoom));
			}
		}
		return currentRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetCurrentRoom() {
		return currentRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentRoom(Room newCurrentRoom) {
		Room oldCurrentRoom = currentRoom;
		currentRoom = newCurrentRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.PLAYER__CURRENT_ROOM, oldCurrentRoom, currentRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				if (resolve) return getCurrentRoom();
				return basicGetCurrentRoom();
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
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
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
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				setCurrentRoom((Room)null);
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
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				return currentRoom != null;
		}
		return super.eIsSet(featureID);
	}

} //PlayerImpl
