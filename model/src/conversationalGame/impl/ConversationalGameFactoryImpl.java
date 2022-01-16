/**
 */
package conversationalGame.impl;

import conversationalGame.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversationalGameFactoryImpl extends EFactoryImpl implements ConversationalGameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConversationalGameFactory init() {
		try {
			ConversationalGameFactory theConversationalGameFactory = (ConversationalGameFactory)EPackage.Registry.INSTANCE.getEFactory(ConversationalGamePackage.eNS_URI);
			if (theConversationalGameFactory != null) {
				return theConversationalGameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConversationalGameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationalGameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConversationalGamePackage.GAME: return createGame();
			case ConversationalGamePackage.PLAYER: return createPlayer();
			case ConversationalGamePackage.ROOM: return createRoom();
			case ConversationalGamePackage.NPC: return createNpc();
			case ConversationalGamePackage.ITEM: return createItem();
			case ConversationalGamePackage.STAT_ACTION: return createStatAction();
			case ConversationalGamePackage.ACTION_NEW_ITEM: return createActionNewItem();
			case ConversationalGamePackage.ROOM_ACTION: return createRoomAction();
			case ConversationalGamePackage.DOOR: return createDoor();
			case ConversationalGamePackage.ASK_ACTION: return createAskAction();
			case ConversationalGamePackage.STAT: return createStat();
			case ConversationalGamePackage.ROOM_TRIGGER: return createRoomTrigger();
			case ConversationalGamePackage.ITEM_TRIGGER: return createItemTrigger();
			case ConversationalGamePackage.NPC_TRIGGER: return createNpcTrigger();
			case ConversationalGamePackage.PLAYER_TRIGGER: return createPlayerTrigger();
			case ConversationalGamePackage.ACTION_TRIGGER: return createActionTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Npc createNpc() {
		NpcImpl npc = new NpcImpl();
		return npc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatAction createStatAction() {
		StatActionImpl statAction = new StatActionImpl();
		return statAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionNewItem createActionNewItem() {
		ActionNewItemImpl actionNewItem = new ActionNewItemImpl();
		return actionNewItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAction createRoomAction() {
		RoomActionImpl roomAction = new RoomActionImpl();
		return roomAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AskAction createAskAction() {
		AskActionImpl askAction = new AskActionImpl();
		return askAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stat createStat() {
		StatImpl stat = new StatImpl();
		return stat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTrigger createRoomTrigger() {
		RoomTriggerImpl roomTrigger = new RoomTriggerImpl();
		return roomTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTrigger createItemTrigger() {
		ItemTriggerImpl itemTrigger = new ItemTriggerImpl();
		return itemTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NpcTrigger createNpcTrigger() {
		NpcTriggerImpl npcTrigger = new NpcTriggerImpl();
		return npcTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTrigger createPlayerTrigger() {
		PlayerTriggerImpl playerTrigger = new PlayerTriggerImpl();
		return playerTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTrigger createActionTrigger() {
		ActionTriggerImpl actionTrigger = new ActionTriggerImpl();
		return actionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationalGamePackage getConversationalGamePackage() {
		return (ConversationalGamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConversationalGamePackage getPackage() {
		return ConversationalGamePackage.eINSTANCE;
	}

} //ConversationalGameFactoryImpl
