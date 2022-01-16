/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Player#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.Player#getCurrentRoom <em>Current Room</em>}</li>
 *   <li>{@link conversationalGame.Player#getStats <em>Stats</em>}</li>
 *   <li>{@link conversationalGame.Player#isDead <em>Dead</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getPlayer_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getInventory();

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

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Stat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getPlayer_Stats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stat> getStats();

	/**
	 * Returns the value of the '<em><b>Dead</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead</em>' attribute.
	 * @see #setDead(boolean)
	 * @see conversationalGame.ConversationalGamePackage#getPlayer_Dead()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDead();

	/**
	 * Sets the value of the '{@link conversationalGame.Player#isDead <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead</em>' attribute.
	 * @see #isDead()
	 * @generated
	 */
	void setDead(boolean value);

} // Player
