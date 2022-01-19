/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.RoomTrigger#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getRoomTrigger()
 * @model
 * @generated
 */
public interface RoomTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see conversationalGame.ConversationalGamePackage#getRoomTrigger_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link conversationalGame.RoomTrigger#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // RoomTrigger
