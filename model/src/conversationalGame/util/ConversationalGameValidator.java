/**
 */
package conversationalGame.util;

import conversationalGame.AnswerConsequence;
import conversationalGame.CharacterAction;
import conversationalGame.Consequence;
import conversationalGame.ConsequenceGiveItem;
import conversationalGame.ConsequenceSpawnItem;
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
import conversationalGame.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see conversationalGame.ConversationalGamePackage
 * @generated
 */
public class ConversationalGameValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConversationalGameValidator INSTANCE = new ConversationalGameValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "conversationalGame";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique Room' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__ID_UNIQUE_ROOM = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Self Navigation' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__NO_SELF_NAVIGATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__AT_LEAST_ONE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Go And Back' of 'Room'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROOM__GO_AND_BACK = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique Item' of 'Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM__ID_UNIQUE_ITEM = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique Door' of 'Door'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOOR__ID_UNIQUE_DOOR = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique Door' of 'Trigger'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRIGGER__ID_UNIQUE_DOOR = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationalGameValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ConversationalGamePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ConversationalGamePackage.GAME:
				return validateGame((Game)value, diagnostics, context);
			case ConversationalGamePackage.CHARACTER:
				return validateCharacter((conversationalGame.Character)value, diagnostics, context);
			case ConversationalGamePackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case ConversationalGamePackage.NPC:
				return validateNpc((Npc)value, diagnostics, context);
			case ConversationalGamePackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case ConversationalGamePackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case ConversationalGamePackage.ITEM_ACTION:
				return validateItemAction((ItemAction)value, diagnostics, context);
			case ConversationalGamePackage.CHARACTER_ACTION:
				return validateCharacterAction((CharacterAction)value, diagnostics, context);
			case ConversationalGamePackage.STAT_CONSEQUENCE:
				return validateStatConsequence((StatConsequence)value, diagnostics, context);
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM:
				return validateConsequenceGiveItem((ConsequenceGiveItem)value, diagnostics, context);
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM:
				return validateConsequenceSpawnItem((ConsequenceSpawnItem)value, diagnostics, context);
			case ConversationalGamePackage.ROOM_CONSEQUENCE:
				return validateRoomConsequence((RoomConsequence)value, diagnostics, context);
			case ConversationalGamePackage.DOOR:
				return validateDoor((Door)value, diagnostics, context);
			case ConversationalGamePackage.ANSWER_CONSEQUENCE:
				return validateAnswerConsequence((AnswerConsequence)value, diagnostics, context);
			case ConversationalGamePackage.STAT:
				return validateStat((Stat)value, diagnostics, context);
			case ConversationalGamePackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case ConversationalGamePackage.ROOM_TRIGGER:
				return validateRoomTrigger((RoomTrigger)value, diagnostics, context);
			case ConversationalGamePackage.ITEM_TRIGGER:
				return validateItemTrigger((ItemTrigger)value, diagnostics, context);
			case ConversationalGamePackage.NPC_TRIGGER:
				return validateNpcTrigger((NpcTrigger)value, diagnostics, context);
			case ConversationalGamePackage.PLAYER_TRIGGER:
				return validatePlayerTrigger((PlayerTrigger)value, diagnostics, context);
			case ConversationalGamePackage.CONSEQUENCE:
				return validateConsequence((Consequence)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(conversationalGame.Character character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(character, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(room, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_goAndBack(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_idUniqueRoom(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_NoSelfNavigation(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_atLeastOne(room, diagnostics, context);
		return result;
	}

	/**
	 * Validates the goAndBack constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_goAndBack(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.goAndBack(diagnostics, context);
	}

	/**
	 * Validates the idUniqueRoom constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_idUniqueRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.idUniqueRoom(diagnostics, context);
	}

	/**
	 * Validates the NoSelfNavigation constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_NoSelfNavigation(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.NoSelfNavigation(diagnostics, context);
	}

	/**
	 * Validates the atLeastOne constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_atLeastOne(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return room.atLeastOne(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNpc(Npc npc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(npc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_idUniqueItem(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idUniqueItem constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_idUniqueItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return item.idUniqueItem(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemAction(ItemAction itemAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterAction(CharacterAction characterAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatConsequence(StatConsequence statConsequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statConsequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsequenceGiveItem(ConsequenceGiveItem consequenceGiveItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consequenceGiveItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsequenceSpawnItem(ConsequenceSpawnItem consequenceSpawnItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consequenceSpawnItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoomConsequence(RoomConsequence roomConsequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roomConsequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoor(Door door, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(door, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(door, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(door, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoor_idUniqueDoor(door, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idUniqueDoor constraint of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoor_idUniqueDoor(Door door, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return door.idUniqueDoor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswerConsequence(AnswerConsequence answerConsequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(answerConsequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStat(Stat stat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_idUniqueDoor(trigger, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idUniqueDoor constraint of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger_idUniqueDoor(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trigger.idUniqueDoor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoomTrigger(RoomTrigger roomTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roomTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roomTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_idUniqueDoor(roomTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemTrigger(ItemTrigger itemTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_idUniqueDoor(itemTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNpcTrigger(NpcTrigger npcTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(npcTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(npcTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_idUniqueDoor(npcTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerTrigger(PlayerTrigger playerTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(playerTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(playerTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_idUniqueDoor(playerTrigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsequence(Consequence consequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consequence, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ConversationalGameValidator
