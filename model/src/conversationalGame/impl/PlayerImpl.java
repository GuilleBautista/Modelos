/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;
import conversationalGame.Player;
import conversationalGame.Room;
import conversationalGame.Stat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.PlayerImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.impl.PlayerImpl#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link conversationalGame.impl.PlayerImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link conversationalGame.impl.PlayerImpl#isDead <em>Dead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> inventory;

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
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected EList<Stat> stats;

	/**
	 * The default value of the '{@link #isDead() <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDead() <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDead()
	 * @generated
	 * @ordered
	 */
	protected boolean dead = DEAD_EDEFAULT;

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
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectContainmentEList<Item>(Item.class, this, ConversationalGamePackage.PLAYER__INVENTORY);
		}
		return inventory;
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
	public EList<Stat> getStats() {
		if (stats == null) {
			stats = new EObjectContainmentEList<Stat>(Stat.class, this, ConversationalGamePackage.PLAYER__STATS);
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDead() {
		return dead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDead(boolean newDead) {
		boolean oldDead = dead;
		dead = newDead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.PLAYER__DEAD, oldDead, dead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationalGamePackage.PLAYER__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
			case ConversationalGamePackage.PLAYER__STATS:
				return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
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
			case ConversationalGamePackage.PLAYER__INVENTORY:
				return getInventory();
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				if (resolve) return getCurrentRoom();
				return basicGetCurrentRoom();
			case ConversationalGamePackage.PLAYER__STATS:
				return getStats();
			case ConversationalGamePackage.PLAYER__DEAD:
				return isDead();
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
			case ConversationalGamePackage.PLAYER__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				setCurrentRoom((Room)newValue);
				return;
			case ConversationalGamePackage.PLAYER__STATS:
				getStats().clear();
				getStats().addAll((Collection<? extends Stat>)newValue);
				return;
			case ConversationalGamePackage.PLAYER__DEAD:
				setDead((Boolean)newValue);
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
			case ConversationalGamePackage.PLAYER__INVENTORY:
				getInventory().clear();
				return;
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				setCurrentRoom((Room)null);
				return;
			case ConversationalGamePackage.PLAYER__STATS:
				getStats().clear();
				return;
			case ConversationalGamePackage.PLAYER__DEAD:
				setDead(DEAD_EDEFAULT);
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
			case ConversationalGamePackage.PLAYER__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case ConversationalGamePackage.PLAYER__CURRENT_ROOM:
				return currentRoom != null;
			case ConversationalGamePackage.PLAYER__STATS:
				return stats != null && !stats.isEmpty();
			case ConversationalGamePackage.PLAYER__DEAD:
				return dead != DEAD_EDEFAULT;
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
		result.append(" (Dead: ");
		result.append(dead);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
