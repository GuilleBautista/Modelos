/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Game;
import conversationalGame.Item;
import conversationalGame.Npc;
import conversationalGame.Player;
import conversationalGame.Room;
import conversationalGame.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.GameImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getSpawnRoom <em>Spawn Room</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getRoomList <em>Room List</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getTriggerList <em>Trigger List</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getItemList <em>Item List</em>}</li>
 *   <li>{@link conversationalGame.impl.GameImpl#getNpcList <em>Npc List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The cached value of the '{@link #getSpawnRoom() <em>Spawn Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpawnRoom()
	 * @generated
	 * @ordered
	 */
	protected Room spawnRoom;

	/**
	 * The cached value of the '{@link #getRoomList() <em>Room List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomList()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> roomList;

	/**
	 * The cached value of the '{@link #getTriggerList() <em>Trigger List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerList()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggerList;

	/**
	 * The default value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreeting()
	 * @generated
	 * @ordered
	 */
	protected static final String GREETING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreeting()
	 * @generated
	 * @ordered
	 */
	protected String greeting = GREETING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemList() <em>Item List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemList()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> itemList;

	/**
	 * The cached value of the '{@link #getNpcList() <em>Npc List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcList()
	 * @generated
	 * @ordered
	 */
	protected EList<Npc> npcList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayer(Player newPlayer, NotificationChain msgs) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.GAME__PLAYER, oldPlayer, newPlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer(Player newPlayer) {
		if (newPlayer != player) {
			NotificationChain msgs = null;
			if (player != null)
				msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.GAME__PLAYER, null, msgs);
			if (newPlayer != null)
				msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.GAME__PLAYER, null, msgs);
			msgs = basicSetPlayer(newPlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.GAME__PLAYER, newPlayer, newPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getSpawnRoom() {
		if (spawnRoom != null && spawnRoom.eIsProxy()) {
			InternalEObject oldSpawnRoom = (InternalEObject)spawnRoom;
			spawnRoom = (Room)eResolveProxy(oldSpawnRoom);
			if (spawnRoom != oldSpawnRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.GAME__SPAWN_ROOM, oldSpawnRoom, spawnRoom));
			}
		}
		return spawnRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetSpawnRoom() {
		return spawnRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpawnRoom(Room newSpawnRoom) {
		Room oldSpawnRoom = spawnRoom;
		spawnRoom = newSpawnRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.GAME__SPAWN_ROOM, oldSpawnRoom, spawnRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoomList() {
		if (roomList == null) {
			roomList = new EObjectContainmentEList<Room>(Room.class, this, ConversationalGamePackage.GAME__ROOM_LIST);
		}
		return roomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggerList() {
		if (triggerList == null) {
			triggerList = new EObjectContainmentEList<Trigger>(Trigger.class, this, ConversationalGamePackage.GAME__TRIGGER_LIST);
		}
		return triggerList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreeting() {
		return greeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreeting(String newGreeting) {
		String oldGreeting = greeting;
		greeting = newGreeting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.GAME__GREETING, oldGreeting, greeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItemList() {
		if (itemList == null) {
			itemList = new EObjectResolvingEList<Item>(Item.class, this, ConversationalGamePackage.GAME__ITEM_LIST);
		}
		return itemList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Npc> getNpcList() {
		if (npcList == null) {
			npcList = new EObjectResolvingEList<Npc>(Npc.class, this, ConversationalGamePackage.GAME__NPC_LIST);
		}
		return npcList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationalGamePackage.GAME__PLAYER:
				return basicSetPlayer(null, msgs);
			case ConversationalGamePackage.GAME__ROOM_LIST:
				return ((InternalEList<?>)getRoomList()).basicRemove(otherEnd, msgs);
			case ConversationalGamePackage.GAME__TRIGGER_LIST:
				return ((InternalEList<?>)getTriggerList()).basicRemove(otherEnd, msgs);
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
			case ConversationalGamePackage.GAME__PLAYER:
				return getPlayer();
			case ConversationalGamePackage.GAME__SPAWN_ROOM:
				if (resolve) return getSpawnRoom();
				return basicGetSpawnRoom();
			case ConversationalGamePackage.GAME__ROOM_LIST:
				return getRoomList();
			case ConversationalGamePackage.GAME__TRIGGER_LIST:
				return getTriggerList();
			case ConversationalGamePackage.GAME__GREETING:
				return getGreeting();
			case ConversationalGamePackage.GAME__ITEM_LIST:
				return getItemList();
			case ConversationalGamePackage.GAME__NPC_LIST:
				return getNpcList();
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
			case ConversationalGamePackage.GAME__PLAYER:
				setPlayer((Player)newValue);
				return;
			case ConversationalGamePackage.GAME__SPAWN_ROOM:
				setSpawnRoom((Room)newValue);
				return;
			case ConversationalGamePackage.GAME__ROOM_LIST:
				getRoomList().clear();
				getRoomList().addAll((Collection<? extends Room>)newValue);
				return;
			case ConversationalGamePackage.GAME__TRIGGER_LIST:
				getTriggerList().clear();
				getTriggerList().addAll((Collection<? extends Trigger>)newValue);
				return;
			case ConversationalGamePackage.GAME__GREETING:
				setGreeting((String)newValue);
				return;
			case ConversationalGamePackage.GAME__ITEM_LIST:
				getItemList().clear();
				getItemList().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.GAME__NPC_LIST:
				getNpcList().clear();
				getNpcList().addAll((Collection<? extends Npc>)newValue);
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
			case ConversationalGamePackage.GAME__PLAYER:
				setPlayer((Player)null);
				return;
			case ConversationalGamePackage.GAME__SPAWN_ROOM:
				setSpawnRoom((Room)null);
				return;
			case ConversationalGamePackage.GAME__ROOM_LIST:
				getRoomList().clear();
				return;
			case ConversationalGamePackage.GAME__TRIGGER_LIST:
				getTriggerList().clear();
				return;
			case ConversationalGamePackage.GAME__GREETING:
				setGreeting(GREETING_EDEFAULT);
				return;
			case ConversationalGamePackage.GAME__ITEM_LIST:
				getItemList().clear();
				return;
			case ConversationalGamePackage.GAME__NPC_LIST:
				getNpcList().clear();
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
			case ConversationalGamePackage.GAME__PLAYER:
				return player != null;
			case ConversationalGamePackage.GAME__SPAWN_ROOM:
				return spawnRoom != null;
			case ConversationalGamePackage.GAME__ROOM_LIST:
				return roomList != null && !roomList.isEmpty();
			case ConversationalGamePackage.GAME__TRIGGER_LIST:
				return triggerList != null && !triggerList.isEmpty();
			case ConversationalGamePackage.GAME__GREETING:
				return GREETING_EDEFAULT == null ? greeting != null : !GREETING_EDEFAULT.equals(greeting);
			case ConversationalGamePackage.GAME__ITEM_LIST:
				return itemList != null && !itemList.isEmpty();
			case ConversationalGamePackage.GAME__NPC_LIST:
				return npcList != null && !npcList.isEmpty();
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
		result.append(" (Greeting: ");
		result.append(greeting);
		result.append(')');
		return result.toString();
	}

} //GameImpl
