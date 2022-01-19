/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Character#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.Character#getStats <em>Stats</em>}</li>
 *   <li>{@link conversationalGame.Character#isDead <em>Dead</em>}</li>
 *   <li>{@link conversationalGame.Character#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getCharacter_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getInventory();

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Stat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getCharacter_Stats()
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
	 * @see conversationalGame.ConversationalGamePackage#getCharacter_Dead()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDead();

	/**
	 * Sets the value of the '{@link conversationalGame.Character#isDead <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead</em>' attribute.
	 * @see #isDead()
	 * @generated
	 */
	void setDead(boolean value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link conversationalGame.CharacterAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see conversationalGame.ConversationalGamePackage#getCharacter_Actions()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<CharacterAction> getActions();

} // Character
