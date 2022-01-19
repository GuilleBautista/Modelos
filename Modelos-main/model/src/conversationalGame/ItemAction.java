/**
 */
package conversationalGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.ItemAction#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.ItemAction#getDescription <em>Description</em>}</li>
 *   <li>{@link conversationalGame.ItemAction#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getItemAction()
 * @model
 * @generated
 */
public interface ItemAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conversationalGame.ConversationalGamePackage#getItemAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conversationalGame.ItemAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conversationalGame.ConversationalGamePackage#getItemAction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conversationalGame.ItemAction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' reference.
	 * @see #setConsequence(Consequence)
	 * @see conversationalGame.ConversationalGamePackage#getItemAction_Consequence()
	 * @model
	 * @generated
	 */
	Consequence getConsequence();

	/**
	 * Sets the value of the '{@link conversationalGame.ItemAction#getConsequence <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Consequence value);

} // ItemAction
