/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.PlayerTrigger#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getPlayerTrigger()
 * @model
 * @generated
 */
public interface PlayerTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see conversationalGame.ConversationalGamePackage#getPlayerTrigger_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link conversationalGame.PlayerTrigger#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // PlayerTrigger
