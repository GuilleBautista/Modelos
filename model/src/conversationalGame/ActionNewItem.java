/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action New Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.ActionNewItem#getNewItems <em>New Items</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getActionNewItem()
 * @model
 * @generated
 */
public interface ActionNewItem extends Action {
	/**
	 * Returns the value of the '<em><b>New Items</b></em>' reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Items</em>' reference list.
	 * @see conversationalGame.ConversationalGamePackage#getActionNewItem_NewItems()
	 * @model
	 * @generated
	 */
	EList<Item> getNewItems();

} // ActionNewItem
