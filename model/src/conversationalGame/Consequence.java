/**
 */
package conversationalGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Consequence#getMessage <em>Message</em>}</li>
 *   <li>{@link conversationalGame.Consequence#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link conversationalGame.Consequence#getItemAction <em>Item Action</em>}</li>
 *   <li>{@link conversationalGame.Consequence#getCharacterAction <em>Character Action</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getConsequence()
 * @model
 * @generated
 */
public interface Consequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see conversationalGame.ConversationalGamePackage#getConsequence_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link conversationalGame.Consequence#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' reference.
	 * @see #setConsequence(Consequence)
	 * @see conversationalGame.ConversationalGamePackage#getConsequence_Consequence()
	 * @model
	 * @generated
	 */
	Consequence getConsequence();

	/**
	 * Sets the value of the '{@link conversationalGame.Consequence#getConsequence <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Consequence value);

	/**
	 * Returns the value of the '<em><b>Item Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Action</em>' reference.
	 * @see #setItemAction(ItemAction)
	 * @see conversationalGame.ConversationalGamePackage#getConsequence_ItemAction()
	 * @model
	 * @generated
	 */
	ItemAction getItemAction();

	/**
	 * Sets the value of the '{@link conversationalGame.Consequence#getItemAction <em>Item Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Action</em>' reference.
	 * @see #getItemAction()
	 * @generated
	 */
	void setItemAction(ItemAction value);

	/**
	 * Returns the value of the '<em><b>Character Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Action</em>' reference.
	 * @see #setCharacterAction(CharacterAction)
	 * @see conversationalGame.ConversationalGamePackage#getConsequence_CharacterAction()
	 * @model
	 * @generated
	 */
	CharacterAction getCharacterAction();

	/**
	 * Sets the value of the '{@link conversationalGame.Consequence#getCharacterAction <em>Character Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Action</em>' reference.
	 * @see #getCharacterAction()
	 * @generated
	 */
	void setCharacterAction(CharacterAction value);

} // Consequence
