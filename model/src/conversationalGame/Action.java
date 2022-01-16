/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Action#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.Action#getDescription <em>Description</em>}</li>
 *   <li>{@link conversationalGame.Action#getMessage <em>Message</em>}</li>
 *   <li>{@link conversationalGame.Action#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link conversationalGame.Action#getNpcs <em>Npcs</em>}</li>
 *   <li>{@link conversationalGame.Action#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conversationalGame.ConversationalGamePackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conversationalGame.Action#getName <em>Name</em>}' attribute.
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
	 * @see conversationalGame.ConversationalGamePackage#getAction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conversationalGame.Action#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see conversationalGame.ConversationalGamePackage#getAction_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link conversationalGame.Action#getMessage <em>Message</em>}' attribute.
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
	 * @see #setConsequence(Action)
	 * @see conversationalGame.ConversationalGamePackage#getAction_Consequence()
	 * @model
	 * @generated
	 */
	Action getConsequence();

	/**
	 * Sets the value of the '{@link conversationalGame.Action#getConsequence <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Action value);

	/**
	 * Returns the value of the '<em><b>Npcs</b></em>' reference list.
	 * The list contents are of type {@link conversationalGame.Npc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npcs</em>' reference list.
	 * @see conversationalGame.ConversationalGamePackage#getAction_Npcs()
	 * @model
	 * @generated
	 */
	EList<Npc> getNpcs();

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see conversationalGame.ConversationalGamePackage#getAction_Player()
	 * @model required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link conversationalGame.Action#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // Action
