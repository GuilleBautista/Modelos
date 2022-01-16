/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.RoomAction#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getRoomAction()
 * @model
 * @generated
 */
public interface RoomAction extends Action {
	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see conversationalGame.ConversationalGamePackage#getRoomAction_Door()
	 * @model
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link conversationalGame.RoomAction#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // RoomAction
