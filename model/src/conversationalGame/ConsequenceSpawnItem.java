/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequence Spawn Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.ConsequenceSpawnItem#getNewItems <em>New Items</em>}</li>
 *   <li>{@link conversationalGame.ConsequenceSpawnItem#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getConsequenceSpawnItem()
 * @model
 * @generated
 */
public interface ConsequenceSpawnItem extends Consequence {
	/**
	 * Returns the value of the '<em><b>New Items</b></em>' reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Items</em>' reference list.
	 * @see conversationalGame.ConversationalGamePackage#getConsequenceSpawnItem_NewItems()
	 * @model
	 * @generated
	 */
	EList<Item> getNewItems();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see conversationalGame.ConversationalGamePackage#getConsequenceSpawnItem_Room()
	 * @model required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link conversationalGame.ConsequenceSpawnItem#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // ConsequenceSpawnItem
