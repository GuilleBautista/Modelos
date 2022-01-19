/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequence Give Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.ConsequenceGiveItem#getNewItems <em>New Items</em>}</li>
 *   <li>{@link conversationalGame.ConsequenceGiveItem#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getConsequenceGiveItem()
 * @model
 * @generated
 */
public interface ConsequenceGiveItem extends Consequence {
	/**
	 * Returns the value of the '<em><b>New Items</b></em>' reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Items</em>' reference list.
	 * @see conversationalGame.ConversationalGamePackage#getConsequenceGiveItem_NewItems()
	 * @model
	 * @generated
	 */
	EList<Item> getNewItems();

	/**
	 * Returns the value of the '<em><b>Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' reference.
	 * @see #setCharacter(conversationalGame.Character)
	 * @see conversationalGame.ConversationalGamePackage#getConsequenceGiveItem_Character()
	 * @model required="true"
	 * @generated
	 */
	conversationalGame.Character getCharacter();

	/**
	 * Sets the value of the '{@link conversationalGame.ConsequenceGiveItem#getCharacter <em>Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' reference.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(conversationalGame.Character value);

} // ConsequenceGiveItem
