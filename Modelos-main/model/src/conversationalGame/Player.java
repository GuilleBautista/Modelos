/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Player#getCurrentRoom <em>Current Room</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends conversationalGame.Character {
	/**
	 * Returns the value of the '<em><b>Current Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Room</em>' reference.
	 * @see #setCurrentRoom(Room)
	 * @see conversationalGame.ConversationalGamePackage#getPlayer_CurrentRoom()
	 * @model required="true"
	 * @generated
	 */
	Room getCurrentRoom();

	/**
	 * Sets the value of the '{@link conversationalGame.Player#getCurrentRoom <em>Current Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Room</em>' reference.
	 * @see #getCurrentRoom()
	 * @generated
	 */
	void setCurrentRoom(Room value);

} // Player
