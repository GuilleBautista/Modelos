/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.ItemTrigger#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getItemTrigger()
 * @model
 * @generated
 */
public interface ItemTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(Item)
	 * @see conversationalGame.ConversationalGamePackage#getItemTrigger_Item()
	 * @model
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link conversationalGame.ItemTrigger#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

} // ItemTrigger
