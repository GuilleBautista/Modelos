/**
 */
package conversationalGame.impl;

import conversationalGame.AnswerConsequence;
import conversationalGame.CharacterAction;
import conversationalGame.Consequence;
import conversationalGame.ConsequenceGiveItem;
import conversationalGame.ConsequenceSpawnItem;
import conversationalGame.ConversationalGameFactory;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Door;
import conversationalGame.Game;
import conversationalGame.Item;
import conversationalGame.ItemAction;
import conversationalGame.ItemTrigger;
import conversationalGame.Npc;
import conversationalGame.NpcTrigger;
import conversationalGame.Player;
import conversationalGame.PlayerTrigger;
import conversationalGame.Room;
import conversationalGame.RoomConsequence;
import conversationalGame.RoomTrigger;
import conversationalGame.Stat;
import conversationalGame.StatConsequence;
import conversationalGame.Trigger;

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
			case ConversationalGamePackage.CHARACTER: return createCharacter();
			case ConversationalGamePackage.PLAYER: return createPlayer();
			case ConversationalGamePackage.NPC: return createNpc();
			case ConversationalGamePackage.ROOM: return createRoom();
			case ConversationalGamePackage.ITEM: return createItem();
			case ConversationalGamePackage.ITEM_ACTION: return createItemAction();
			case ConversationalGamePackage.CHARACTER_ACTION: return createCharacterAction();
			case ConversationalGamePackage.STAT_CONSEQUENCE: return createStatConsequence();
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM: return createConsequenceGiveItem();
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM: return createConsequenceSpawnItem();
			case ConversationalGamePackage.ROOM_CONSEQUENCE: return createRoomConsequence();
			case ConversationalGamePackage.DOOR: return createDoor();
			case ConversationalGamePackage.ANSWER_CONSEQUENCE: return createAnswerConsequence();
			case ConversationalGamePackage.STAT: return createStat();
			case ConversationalGamePackage.TRIGGER: return createTrigger();
			case ConversationalGamePackage.ROOM_TRIGGER: return createRoomTrigger();
			case ConversationalGamePackage.ITEM_TRIGGER: return createItemTrigger();
			case ConversationalGamePackage.NPC_TRIGGER: return createNpcTrigger();
			case ConversationalGamePackage.PLAYER_TRIGGER: return createPlayerTrigger();
			case ConversationalGamePackage.CONSEQUENCE: return createConsequence();
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
	public conversationalGame.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
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
	public Npc createNpc() {
		NpcImpl npc = new NpcImpl();
		return npc;
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
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAction createItemAction() {
		ItemActionImpl itemAction = new ItemActionImpl();
		return itemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterAction createCharacterAction() {
		CharacterActionImpl characterAction = new CharacterActionImpl();
		return characterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatConsequence createStatConsequence() {
		StatConsequenceImpl statConsequence = new StatConsequenceImpl();
		return statConsequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceGiveItem createConsequenceGiveItem() {
		ConsequenceGiveItemImpl consequenceGiveItem = new ConsequenceGiveItemImpl();
		return consequenceGiveItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsequenceSpawnItem createConsequenceSpawnItem() {
		ConsequenceSpawnItemImpl consequenceSpawnItem = new ConsequenceSpawnItemImpl();
		return consequenceSpawnItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomConsequence createRoomConsequence() {
		RoomConsequenceImpl roomConsequence = new RoomConsequenceImpl();
		return roomConsequence;
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
	public AnswerConsequence createAnswerConsequence() {
		AnswerConsequenceImpl answerConsequence = new AnswerConsequenceImpl();
		return answerConsequence;
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
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
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
	public Consequence createConsequence() {
		ConsequenceImpl consequence = new ConsequenceImpl();
		return consequence;
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
