/**
 */
package conversationalGame;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Trigger#isTriggered <em>Triggered</em>}</li>
 *   <li>{@link conversationalGame.Trigger#getId <em>Id</em>}</li>
 *   <li>{@link conversationalGame.Trigger#getMessage <em>Message</em>}</li>
 *   <li>{@link conversationalGame.Trigger#isEndGame <em>End Game</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getTrigger()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idUniqueDoor'"
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered</em>' attribute.
	 * @see #setTriggered(boolean)
	 * @see conversationalGame.ConversationalGamePackage#getTrigger_Triggered()
	 * @model required="true"
	 * @generated
	 */
	boolean isTriggered();

	/**
	 * Sets the value of the '{@link conversationalGame.Trigger#isTriggered <em>Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered</em>' attribute.
	 * @see #isTriggered()
	 * @generated
	 */
	void setTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see conversationalGame.ConversationalGamePackage#getTrigger_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link conversationalGame.Trigger#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see conversationalGame.ConversationalGamePackage#getTrigger_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link conversationalGame.Trigger#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>End Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Game</em>' attribute.
	 * @see #setEndGame(boolean)
	 * @see conversationalGame.ConversationalGamePackage#getTrigger_EndGame()
	 * @model required="true"
	 * @generated
	 */
	boolean isEndGame();

	/**
	 * Sets the value of the '{@link conversationalGame.Trigger#isEndGame <em>End Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Game</em>' attribute.
	 * @see #isEndGame()
	 * @generated
	 */
	void setEndGame(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tDoor.allInstances()-&gt;isUnique(Id)\n\t\t'"
	 * @generated
	 */
	boolean idUniqueDoor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Trigger
