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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see conversationalGame.ConversationalGamePackage
 * @generated
 */
public class ConversationalGameSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConversationalGamePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationalGameSwitch() {
		if (modelPackage == null) {
			modelPackage = ConversationalGamePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConversationalGamePackage.GAME: {
				Game game = (Game)theEObject;
				T result = caseGame(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.CHARACTER: {
				conversationalGame.Character character = (conversationalGame.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.PLAYER: {
				Player player = (Player)theEObject;
				T result = casePlayer(player);
				if (result == null) result = caseCharacter(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.NPC: {
				Npc npc = (Npc)theEObject;
				T result = caseNpc(npc);
				if (result == null) result = caseCharacter(npc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ITEM_ACTION: {
				ItemAction itemAction = (ItemAction)theEObject;
				T result = caseItemAction(itemAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.CHARACTER_ACTION: {
				CharacterAction characterAction = (CharacterAction)theEObject;
				T result = caseCharacterAction(characterAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.STAT_CONSEQUENCE: {
				StatConsequence statConsequence = (StatConsequence)theEObject;
				T result = caseStatConsequence(statConsequence);
				if (result == null) result = caseConsequence(statConsequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM: {
				ConsequenceGiveItem consequenceGiveItem = (ConsequenceGiveItem)theEObject;
				T result = caseConsequenceGiveItem(consequenceGiveItem);
				if (result == null) result = caseConsequence(consequenceGiveItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.CONSEQUENCE_SPAWN_ITEM: {
				ConsequenceSpawnItem consequenceSpawnItem = (ConsequenceSpawnItem)theEObject;
				T result = caseConsequenceSpawnItem(consequenceSpawnItem);
				if (result == null) result = caseConsequence(consequenceSpawnItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ROOM_CONSEQUENCE: {
				RoomConsequence roomConsequence = (RoomConsequence)theEObject;
				T result = caseRoomConsequence(roomConsequence);
				if (result == null) result = caseConsequence(roomConsequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.DOOR: {
				Door door = (Door)theEObject;
				T result = caseDoor(door);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ANSWER_CONSEQUENCE: {
				AnswerConsequence answerConsequence = (AnswerConsequence)theEObject;
				T result = caseAnswerConsequence(answerConsequence);
				if (result == null) result = caseConsequence(answerConsequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.STAT: {
				Stat stat = (Stat)theEObject;
				T result = caseStat(stat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ROOM_TRIGGER: {
				RoomTrigger roomTrigger = (RoomTrigger)theEObject;
				T result = caseRoomTrigger(roomTrigger);
				if (result == null) result = caseTrigger(roomTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.ITEM_TRIGGER: {
				ItemTrigger itemTrigger = (ItemTrigger)theEObject;
				T result = caseItemTrigger(itemTrigger);
				if (result == null) result = caseTrigger(itemTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.NPC_TRIGGER: {
				NpcTrigger npcTrigger = (NpcTrigger)theEObject;
				T result = caseNpcTrigger(npcTrigger);
				if (result == null) result = caseTrigger(npcTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.PLAYER_TRIGGER: {
				PlayerTrigger playerTrigger = (PlayerTrigger)theEObject;
				T result = casePlayerTrigger(playerTrigger);
				if (result == null) result = caseTrigger(playerTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationalGamePackage.CONSEQUENCE: {
				Consequence consequence = (Consequence)theEObject;
				T result = caseConsequence(consequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(conversationalGame.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Npc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Npc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNpc(Npc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemAction(ItemAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterAction(CharacterAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stat Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stat Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatConsequence(StatConsequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence Give Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence Give Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequenceGiveItem(ConsequenceGiveItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence Spawn Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence Spawn Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequenceSpawnItem(ConsequenceSpawnItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomConsequence(RoomConsequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerConsequence(AnswerConsequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStat(Stat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomTrigger(RoomTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemTrigger(ItemTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Npc Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Npc Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNpcTrigger(NpcTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerTrigger(PlayerTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequence(Consequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConversationalGameSwitch
