/**
 */
package conversationalGame;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conversationalGame.ConversationalGameFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ConversationalGamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conversationalGame";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/var";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conversationalGame";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConversationalGamePackage eINSTANCE = conversationalGame.impl.ConversationalGamePackageImpl.init();

	/**
	 * The meta object id for the '{@link conversationalGame.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.GameImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Spawn Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SPAWN_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ROOM_LIST = 2;

	/**
	 * The feature id for the '<em><b>Trigger List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TRIGGER_LIST = 3;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.PlayerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__INVENTORY = 0;

	/**
	 * The feature id for the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__CURRENT_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__STATS = 2;

	/**
	 * The feature id for the '<em><b>Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__DEAD = 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.RoomImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 2;

	/**
	 * The feature id for the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NORTH = 0;

	/**
	 * The feature id for the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SOUTH = 1;

	/**
	 * The feature id for the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EAST = 2;

	/**
	 * The feature id for the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WEST = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ITEMS = 5;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NPCS = 6;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Id Unique Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ID_UNIQUE_ROOM__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>No Self Navigation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___NO_SELF_NAVIGATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>At Least One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___AT_LEAST_ONE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Go And Back</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___GO_AND_BACK__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.NpcImpl <em>Npc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.NpcImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getNpc()
	 * @generated
	 */
	int NPC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Greeting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__GREETING = 1;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__INVENTORY = 2;

	/**
	 * The feature id for the '<em><b>Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__DEAD = 3;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC__STATS = 4;

	/**
	 * The number of structural features of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Npc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.ItemImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Id Unique Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___ID_UNIQUE_ITEM__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.ActionImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONSEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NPCS = 4;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PLAYER = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.StatActionImpl <em>Stat Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.StatActionImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getStatAction()
	 * @generated
	 */
	int STAT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__MESSAGE = ACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__CONSEQUENCE = ACTION__CONSEQUENCE;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__NPCS = ACTION__NPCS;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__PLAYER = ACTION__PLAYER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION__STAT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stat Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.ActionNewItemImpl <em>Action New Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.ActionNewItemImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getActionNewItem()
	 * @generated
	 */
	int ACTION_NEW_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__MESSAGE = ACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__CONSEQUENCE = ACTION__CONSEQUENCE;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__NPCS = ACTION__NPCS;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__PLAYER = ACTION__PLAYER;

	/**
	 * The feature id for the '<em><b>New Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM__NEW_ITEMS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action New Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action New Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NEW_ITEM_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.RoomActionImpl <em>Room Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.RoomActionImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoomAction()
	 * @generated
	 */
	int ROOM_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__MESSAGE = ACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__CONSEQUENCE = ACTION__CONSEQUENCE;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__NPCS = ACTION__NPCS;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__PLAYER = ACTION__PLAYER;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION__DOOR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.DoorImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 9;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__OPEN = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ID = 2;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.AskActionImpl <em>Ask Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.AskActionImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getAskAction()
	 * @generated
	 */
	int ASK_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__MESSAGE = ACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__CONSEQUENCE = ACTION__CONSEQUENCE;

	/**
	 * The feature id for the '<em><b>Npcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__NPCS = ACTION__NPCS;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__PLAYER = ACTION__PLAYER;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__QUESTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION__ANSWER = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ask Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ask Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.StatImpl <em>Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.StatImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getStat()
	 * @generated
	 */
	int STAT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.TriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGERED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ID = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__END_GAME = 3;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.RoomTriggerImpl <em>Room Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.RoomTriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoomTrigger()
	 * @generated
	 */
	int ROOM_TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER__TRIGGERED = TRIGGER__TRIGGERED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER__ID = TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER__MESSAGE = TRIGGER__MESSAGE;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER__END_GAME = TRIGGER__END_GAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER__ROOM = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Room Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.ItemTriggerImpl <em>Item Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.ItemTriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getItemTrigger()
	 * @generated
	 */
	int ITEM_TRIGGER = 14;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER__TRIGGERED = TRIGGER__TRIGGERED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER__ID = TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER__MESSAGE = TRIGGER__MESSAGE;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER__END_GAME = TRIGGER__END_GAME;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER__ITEM = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Item Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.NpcTriggerImpl <em>Npc Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.NpcTriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getNpcTrigger()
	 * @generated
	 */
	int NPC_TRIGGER = 15;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER__TRIGGERED = TRIGGER__TRIGGERED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER__ID = TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER__MESSAGE = TRIGGER__MESSAGE;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER__END_GAME = TRIGGER__END_GAME;

	/**
	 * The feature id for the '<em><b>Npc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER__NPC = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Npc Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Npc Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NPC_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.PlayerTriggerImpl <em>Player Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.PlayerTriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getPlayerTrigger()
	 * @generated
	 */
	int PLAYER_TRIGGER = 16;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER__TRIGGERED = TRIGGER__TRIGGERED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER__ID = TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER__MESSAGE = TRIGGER__MESSAGE;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER__END_GAME = TRIGGER__END_GAME;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER__PLAYER = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Player Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conversationalGame.impl.ActionTriggerImpl <em>Action Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conversationalGame.impl.ActionTriggerImpl
	 * @see conversationalGame.impl.ConversationalGamePackageImpl#getActionTrigger()
	 * @generated
	 */
	int ACTION_TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER__TRIGGERED = TRIGGER__TRIGGERED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER__ID = TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER__MESSAGE = TRIGGER__MESSAGE;

	/**
	 * The feature id for the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER__END_GAME = TRIGGER__END_GAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER__ACTION = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Id Unique Door</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Action Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link conversationalGame.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see conversationalGame.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link conversationalGame.Game#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see conversationalGame.Game#getPlayer()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Player();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.Game#getSpawnRoom <em>Spawn Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spawn Room</em>'.
	 * @see conversationalGame.Game#getSpawnRoom()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_SpawnRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Game#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room List</em>'.
	 * @see conversationalGame.Game#getRoomList()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_RoomList();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Game#getTriggerList <em>Trigger List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger List</em>'.
	 * @see conversationalGame.Game#getTriggerList()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_TriggerList();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see conversationalGame.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Player#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory</em>'.
	 * @see conversationalGame.Player#getInventory()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Inventory();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.Player#getCurrentRoom <em>Current Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Room</em>'.
	 * @see conversationalGame.Player#getCurrentRoom()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_CurrentRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Player#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see conversationalGame.Player#getStats()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Stats();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Player#isDead <em>Dead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead</em>'.
	 * @see conversationalGame.Player#isDead()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Dead();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see conversationalGame.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference '{@link conversationalGame.Room#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>North</em>'.
	 * @see conversationalGame.Room#getNorth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_North();

	/**
	 * Returns the meta object for the containment reference '{@link conversationalGame.Room#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>South</em>'.
	 * @see conversationalGame.Room#getSouth()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_South();

	/**
	 * Returns the meta object for the containment reference '{@link conversationalGame.Room#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>East</em>'.
	 * @see conversationalGame.Room#getEast()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_East();

	/**
	 * Returns the meta object for the containment reference '{@link conversationalGame.Room#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>West</em>'.
	 * @see conversationalGame.Room#getWest()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_West();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Room#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see conversationalGame.Room#getId()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Room#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see conversationalGame.Room#getItems()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Room#getNpcs <em>Npcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Npcs</em>'.
	 * @see conversationalGame.Room#getNpcs()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Npcs();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Room#idUniqueRoom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique Room</em>' operation.
	 * @see conversationalGame.Room#idUniqueRoom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__IdUniqueRoom__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Room#NoSelfNavigation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Self Navigation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Self Navigation</em>' operation.
	 * @see conversationalGame.Room#NoSelfNavigation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__NoSelfNavigation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Room#atLeastOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One</em>' operation.
	 * @see conversationalGame.Room#atLeastOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__AtLeastOne__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Room#goAndBack(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Go And Back</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Go And Back</em>' operation.
	 * @see conversationalGame.Room#goAndBack(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoom__GoAndBack__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Npc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Npc</em>'.
	 * @see conversationalGame.Npc
	 * @generated
	 */
	EClass getNpc();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Npc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conversationalGame.Npc#getName()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_Name();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Npc#getGreeting <em>Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greeting</em>'.
	 * @see conversationalGame.Npc#getGreeting()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_Greeting();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Npc#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory</em>'.
	 * @see conversationalGame.Npc#getInventory()
	 * @see #getNpc()
	 * @generated
	 */
	EReference getNpc_Inventory();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Npc#isDead <em>Dead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead</em>'.
	 * @see conversationalGame.Npc#isDead()
	 * @see #getNpc()
	 * @generated
	 */
	EAttribute getNpc_Dead();

	/**
	 * Returns the meta object for the containment reference list '{@link conversationalGame.Npc#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stats</em>'.
	 * @see conversationalGame.Npc#getStats()
	 * @see #getNpc()
	 * @generated
	 */
	EReference getNpc_Stats();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see conversationalGame.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference list '{@link conversationalGame.Item#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see conversationalGame.Item#getActions()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Actions();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conversationalGame.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see conversationalGame.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Item#idUniqueItem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique Item</em>' operation.
	 * @see conversationalGame.Item#idUniqueItem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getItem__IdUniqueItem__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see conversationalGame.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conversationalGame.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conversationalGame.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Action#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see conversationalGame.Action#getMessage()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Message();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.Action#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consequence</em>'.
	 * @see conversationalGame.Action#getConsequence()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Consequence();

	/**
	 * Returns the meta object for the reference list '{@link conversationalGame.Action#getNpcs <em>Npcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Npcs</em>'.
	 * @see conversationalGame.Action#getNpcs()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Npcs();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.Action#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see conversationalGame.Action#getPlayer()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Player();

	/**
	 * Returns the meta object for class '{@link conversationalGame.StatAction <em>Stat Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stat Action</em>'.
	 * @see conversationalGame.StatAction
	 * @generated
	 */
	EClass getStatAction();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.StatAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see conversationalGame.StatAction#getValue()
	 * @see #getStatAction()
	 * @generated
	 */
	EAttribute getStatAction_Value();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.StatAction#getStat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stat</em>'.
	 * @see conversationalGame.StatAction#getStat()
	 * @see #getStatAction()
	 * @generated
	 */
	EReference getStatAction_Stat();

	/**
	 * Returns the meta object for class '{@link conversationalGame.ActionNewItem <em>Action New Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action New Item</em>'.
	 * @see conversationalGame.ActionNewItem
	 * @generated
	 */
	EClass getActionNewItem();

	/**
	 * Returns the meta object for the reference list '{@link conversationalGame.ActionNewItem#getNewItems <em>New Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Items</em>'.
	 * @see conversationalGame.ActionNewItem#getNewItems()
	 * @see #getActionNewItem()
	 * @generated
	 */
	EReference getActionNewItem_NewItems();

	/**
	 * Returns the meta object for class '{@link conversationalGame.RoomAction <em>Room Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Action</em>'.
	 * @see conversationalGame.RoomAction
	 * @generated
	 */
	EClass getRoomAction();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.RoomAction#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see conversationalGame.RoomAction#getDoor()
	 * @see #getRoomAction()
	 * @generated
	 */
	EReference getRoomAction_Door();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see conversationalGame.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Door#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see conversationalGame.Door#isOpen()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Open();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.Door#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see conversationalGame.Door#getNext()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Next();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see conversationalGame.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Id();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Door#idUniqueDoor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique Door</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique Door</em>' operation.
	 * @see conversationalGame.Door#idUniqueDoor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDoor__IdUniqueDoor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link conversationalGame.AskAction <em>Ask Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ask Action</em>'.
	 * @see conversationalGame.AskAction
	 * @generated
	 */
	EClass getAskAction();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.AskAction#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see conversationalGame.AskAction#getQuestion()
	 * @see #getAskAction()
	 * @generated
	 */
	EAttribute getAskAction_Question();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.AskAction#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see conversationalGame.AskAction#getAnswer()
	 * @see #getAskAction()
	 * @generated
	 */
	EAttribute getAskAction_Answer();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Stat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stat</em>'.
	 * @see conversationalGame.Stat
	 * @generated
	 */
	EClass getStat();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Stat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conversationalGame.Stat#getName()
	 * @see #getStat()
	 * @generated
	 */
	EAttribute getStat_Name();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Stat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see conversationalGame.Stat#getValue()
	 * @see #getStat()
	 * @generated
	 */
	EAttribute getStat_Value();

	/**
	 * Returns the meta object for class '{@link conversationalGame.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see conversationalGame.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Trigger#isTriggered <em>Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered</em>'.
	 * @see conversationalGame.Trigger#isTriggered()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Triggered();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Trigger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see conversationalGame.Trigger#getId()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Id();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Trigger#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see conversationalGame.Trigger#getMessage()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Message();

	/**
	 * Returns the meta object for the attribute '{@link conversationalGame.Trigger#isEndGame <em>End Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Game</em>'.
	 * @see conversationalGame.Trigger#isEndGame()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_EndGame();

	/**
	 * Returns the meta object for the '{@link conversationalGame.Trigger#idUniqueDoor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique Door</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique Door</em>' operation.
	 * @see conversationalGame.Trigger#idUniqueDoor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTrigger__IdUniqueDoor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link conversationalGame.RoomTrigger <em>Room Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Trigger</em>'.
	 * @see conversationalGame.RoomTrigger
	 * @generated
	 */
	EClass getRoomTrigger();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.RoomTrigger#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see conversationalGame.RoomTrigger#getRoom()
	 * @see #getRoomTrigger()
	 * @generated
	 */
	EReference getRoomTrigger_Room();

	/**
	 * Returns the meta object for class '{@link conversationalGame.ItemTrigger <em>Item Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Trigger</em>'.
	 * @see conversationalGame.ItemTrigger
	 * @generated
	 */
	EClass getItemTrigger();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.ItemTrigger#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see conversationalGame.ItemTrigger#getItem()
	 * @see #getItemTrigger()
	 * @generated
	 */
	EReference getItemTrigger_Item();

	/**
	 * Returns the meta object for class '{@link conversationalGame.NpcTrigger <em>Npc Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Npc Trigger</em>'.
	 * @see conversationalGame.NpcTrigger
	 * @generated
	 */
	EClass getNpcTrigger();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.NpcTrigger#getNpc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Npc</em>'.
	 * @see conversationalGame.NpcTrigger#getNpc()
	 * @see #getNpcTrigger()
	 * @generated
	 */
	EReference getNpcTrigger_Npc();

	/**
	 * Returns the meta object for class '{@link conversationalGame.PlayerTrigger <em>Player Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Trigger</em>'.
	 * @see conversationalGame.PlayerTrigger
	 * @generated
	 */
	EClass getPlayerTrigger();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.PlayerTrigger#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see conversationalGame.PlayerTrigger#getPlayer()
	 * @see #getPlayerTrigger()
	 * @generated
	 */
	EReference getPlayerTrigger_Player();

	/**
	 * Returns the meta object for class '{@link conversationalGame.ActionTrigger <em>Action Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Trigger</em>'.
	 * @see conversationalGame.ActionTrigger
	 * @generated
	 */
	EClass getActionTrigger();

	/**
	 * Returns the meta object for the reference '{@link conversationalGame.ActionTrigger#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see conversationalGame.ActionTrigger#getAction()
	 * @see #getActionTrigger()
	 * @generated
	 */
	EReference getActionTrigger_Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConversationalGameFactory getConversationalGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conversationalGame.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.GameImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYER = eINSTANCE.getGame_Player();

		/**
		 * The meta object literal for the '<em><b>Spawn Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SPAWN_ROOM = eINSTANCE.getGame_SpawnRoom();

		/**
		 * The meta object literal for the '<em><b>Room List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ROOM_LIST = eINSTANCE.getGame_RoomList();

		/**
		 * The meta object literal for the '<em><b>Trigger List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TRIGGER_LIST = eINSTANCE.getGame_TriggerList();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.PlayerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__INVENTORY = eINSTANCE.getPlayer_Inventory();

		/**
		 * The meta object literal for the '<em><b>Current Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__CURRENT_ROOM = eINSTANCE.getPlayer_CurrentRoom();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__STATS = eINSTANCE.getPlayer_Stats();

		/**
		 * The meta object literal for the '<em><b>Dead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__DEAD = eINSTANCE.getPlayer_Dead();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.RoomImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NORTH = eINSTANCE.getRoom_North();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SOUTH = eINSTANCE.getRoom_South();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EAST = eINSTANCE.getRoom_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WEST = eINSTANCE.getRoom_West();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ID = eINSTANCE.getRoom_Id();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ITEMS = eINSTANCE.getRoom_Items();

		/**
		 * The meta object literal for the '<em><b>Npcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NPCS = eINSTANCE.getRoom_Npcs();

		/**
		 * The meta object literal for the '<em><b>Id Unique Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___ID_UNIQUE_ROOM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__IdUniqueRoom__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Self Navigation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___NO_SELF_NAVIGATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__NoSelfNavigation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>At Least One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___AT_LEAST_ONE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__AtLeastOne__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Go And Back</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___GO_AND_BACK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRoom__GoAndBack__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.NpcImpl <em>Npc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.NpcImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getNpc()
		 * @generated
		 */
		EClass NPC = eINSTANCE.getNpc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__NAME = eINSTANCE.getNpc_Name();

		/**
		 * The meta object literal for the '<em><b>Greeting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__GREETING = eINSTANCE.getNpc_Greeting();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC__INVENTORY = eINSTANCE.getNpc_Inventory();

		/**
		 * The meta object literal for the '<em><b>Dead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NPC__DEAD = eINSTANCE.getNpc_Dead();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC__STATS = eINSTANCE.getNpc_Stats();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.ItemImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ACTIONS = eINSTANCE.getItem_Actions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '<em><b>Id Unique Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___ID_UNIQUE_ITEM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getItem__IdUniqueItem__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.ActionImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__MESSAGE = eINSTANCE.getAction_Message();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONSEQUENCE = eINSTANCE.getAction_Consequence();

		/**
		 * The meta object literal for the '<em><b>Npcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__NPCS = eINSTANCE.getAction_Npcs();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PLAYER = eINSTANCE.getAction_Player();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.StatActionImpl <em>Stat Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.StatActionImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getStatAction()
		 * @generated
		 */
		EClass STAT_ACTION = eINSTANCE.getStatAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT_ACTION__VALUE = eINSTANCE.getStatAction_Value();

		/**
		 * The meta object literal for the '<em><b>Stat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAT_ACTION__STAT = eINSTANCE.getStatAction_Stat();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.ActionNewItemImpl <em>Action New Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.ActionNewItemImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getActionNewItem()
		 * @generated
		 */
		EClass ACTION_NEW_ITEM = eINSTANCE.getActionNewItem();

		/**
		 * The meta object literal for the '<em><b>New Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_NEW_ITEM__NEW_ITEMS = eINSTANCE.getActionNewItem_NewItems();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.RoomActionImpl <em>Room Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.RoomActionImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoomAction()
		 * @generated
		 */
		EClass ROOM_ACTION = eINSTANCE.getRoomAction();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ACTION__DOOR = eINSTANCE.getRoomAction_Door();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.DoorImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__OPEN = eINSTANCE.getDoor_Open();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__NEXT = eINSTANCE.getDoor_Next();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__ID = eINSTANCE.getDoor_Id();

		/**
		 * The meta object literal for the '<em><b>Id Unique Door</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOOR___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDoor__IdUniqueDoor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.AskActionImpl <em>Ask Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.AskActionImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getAskAction()
		 * @generated
		 */
		EClass ASK_ACTION = eINSTANCE.getAskAction();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASK_ACTION__QUESTION = eINSTANCE.getAskAction_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASK_ACTION__ANSWER = eINSTANCE.getAskAction_Answer();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.StatImpl <em>Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.StatImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getStat()
		 * @generated
		 */
		EClass STAT = eINSTANCE.getStat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT__NAME = eINSTANCE.getStat_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAT__VALUE = eINSTANCE.getStat_Value();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.TriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TRIGGERED = eINSTANCE.getTrigger_Triggered();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ID = eINSTANCE.getTrigger_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__MESSAGE = eINSTANCE.getTrigger_Message();

		/**
		 * The meta object literal for the '<em><b>End Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__END_GAME = eINSTANCE.getTrigger_EndGame();

		/**
		 * The meta object literal for the '<em><b>Id Unique Door</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTrigger__IdUniqueDoor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.RoomTriggerImpl <em>Room Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.RoomTriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getRoomTrigger()
		 * @generated
		 */
		EClass ROOM_TRIGGER = eINSTANCE.getRoomTrigger();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TRIGGER__ROOM = eINSTANCE.getRoomTrigger_Room();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.ItemTriggerImpl <em>Item Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.ItemTriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getItemTrigger()
		 * @generated
		 */
		EClass ITEM_TRIGGER = eINSTANCE.getItemTrigger();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TRIGGER__ITEM = eINSTANCE.getItemTrigger_Item();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.NpcTriggerImpl <em>Npc Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.NpcTriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getNpcTrigger()
		 * @generated
		 */
		EClass NPC_TRIGGER = eINSTANCE.getNpcTrigger();

		/**
		 * The meta object literal for the '<em><b>Npc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NPC_TRIGGER__NPC = eINSTANCE.getNpcTrigger_Npc();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.PlayerTriggerImpl <em>Player Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.PlayerTriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getPlayerTrigger()
		 * @generated
		 */
		EClass PLAYER_TRIGGER = eINSTANCE.getPlayerTrigger();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER_TRIGGER__PLAYER = eINSTANCE.getPlayerTrigger_Player();

		/**
		 * The meta object literal for the '{@link conversationalGame.impl.ActionTriggerImpl <em>Action Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conversationalGame.impl.ActionTriggerImpl
		 * @see conversationalGame.impl.ConversationalGamePackageImpl#getActionTrigger()
		 * @generated
		 */
		EClass ACTION_TRIGGER = eINSTANCE.getActionTrigger();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TRIGGER__ACTION = eINSTANCE.getActionTrigger_Action();

	}

} //ConversationalGamePackage
