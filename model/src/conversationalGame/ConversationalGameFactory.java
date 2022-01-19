/**
 */
package conversationalGame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see conversationalGame.ConversationalGamePackage
 * @generated
 */
public interface ConversationalGameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConversationalGameFactory eINSTANCE = conversationalGame.impl.ConversationalGameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character</em>'.
	 * @generated
	 */
	Character createCharacter();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Npc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Npc</em>'.
	 * @generated
	 */
	Npc createNpc();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Item Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Action</em>'.
	 * @generated
	 */
	ItemAction createItemAction();

	/**
	 * Returns a new object of class '<em>Character Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Action</em>'.
	 * @generated
	 */
	CharacterAction createCharacterAction();

	/**
	 * Returns a new object of class '<em>Stat Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stat Consequence</em>'.
	 * @generated
	 */
	StatConsequence createStatConsequence();

	/**
	 * Returns a new object of class '<em>Consequence Give Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence Give Item</em>'.
	 * @generated
	 */
	ConsequenceGiveItem createConsequenceGiveItem();

	/**
	 * Returns a new object of class '<em>Consequence Spawn Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence Spawn Item</em>'.
	 * @generated
	 */
	ConsequenceSpawnItem createConsequenceSpawnItem();

	/**
	 * Returns a new object of class '<em>Room Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Consequence</em>'.
	 * @generated
	 */
	RoomConsequence createRoomConsequence();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Answer Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Consequence</em>'.
	 * @generated
	 */
	AnswerConsequence createAnswerConsequence();

	/**
	 * Returns a new object of class '<em>Stat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stat</em>'.
	 * @generated
	 */
	Stat createStat();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Room Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Trigger</em>'.
	 * @generated
	 */
	RoomTrigger createRoomTrigger();

	/**
	 * Returns a new object of class '<em>Item Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Trigger</em>'.
	 * @generated
	 */
	ItemTrigger createItemTrigger();

	/**
	 * Returns a new object of class '<em>Npc Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Npc Trigger</em>'.
	 * @generated
	 */
	NpcTrigger createNpcTrigger();

	/**
	 * Returns a new object of class '<em>Player Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Trigger</em>'.
	 * @generated
	 */
	PlayerTrigger createPlayerTrigger();

	/**
	 * Returns a new object of class '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence</em>'.
	 * @generated
	 */
	Consequence createConsequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConversationalGamePackage getConversationalGamePackage();

} //ConversationalGameFactory
