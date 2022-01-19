/**
 */
package conversationalGame.impl;

import conversationalGame.ConsequenceSpawnItem;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;
import conversationalGame.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consequence Spawn Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.ConsequenceSpawnItemImpl#getNewItems <em>New Items</em>}</li>
 *   <li>{@link conversationalGame.impl.ConsequenceSpawnItemImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsequenceSpawnItemImpl extends ConsequenceImpl implements ConsequenceSpawnItem {
	/**
	 * The cached value of the '{@link #getNewItems() <em>New Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> newItems;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsequenceSpawnItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.CONSEQUENCE_SPAWN_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getNewItems() {
		if (newItems == null) {
			newItems = new EObjectResolvingEList<Item>(Item.class, this, ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__NEW_ITEMS);
		}
		return newItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__NEW_ITEMS:
				return getNewItems();
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
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
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__NEW_ITEMS:
				getNewItems().clear();
				getNewItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM:
				setRoom((Room)newValue);
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
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__NEW_ITEMS:
				getNewItems().clear();
				return;
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM:
				setRoom((Room)null);
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
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__NEW_ITEMS:
				return newItems != null && !newItems.isEmpty();
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM__ROOM:
				return room != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsequenceSpawnItemImpl
