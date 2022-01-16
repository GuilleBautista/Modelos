/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link conversationalGame.Game#getSpawnRoom <em>Spawn Room</em>}</li>
 *   <li>{@link conversationalGame.Game#getRoomList <em>Room List</em>}</li>
 *   <li>{@link conversationalGame.Game#getTriggerList <em>Trigger List</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference.
	 * @see #setPlayer(Player)
	 * @see conversationalGame.ConversationalGamePackage#getGame_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link conversationalGame.Game#getPlayer <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' containment reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Spawn Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spawn Room</em>' reference.
	 * @see #setSpawnRoom(Room)
	 * @see conversationalGame.ConversationalGamePackage#getGame_SpawnRoom()
	 * @model required="true"
	 * @generated
	 */
	Room getSpawnRoom();

	/**
	 * Sets the value of the '{@link conversationalGame.Game#getSpawnRoom <em>Spawn Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spawn Room</em>' reference.
	 * @see #getSpawnRoom()
	 * @generated
	 */
	void setSpawnRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Room List</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room List</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getGame_RoomList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRoomList();

	/**
	 * Returns the value of the '<em><b>Trigger List</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger List</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getGame_TriggerList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggerList();

} // Game
