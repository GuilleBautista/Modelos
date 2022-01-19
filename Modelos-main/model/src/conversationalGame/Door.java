/**
 */
package conversationalGame;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Door#isOpen <em>Open</em>}</li>
 *   <li>{@link conversationalGame.Door#getNext <em>Next</em>}</li>
 *   <li>{@link conversationalGame.Door#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getDoor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idUniqueDoor'"
 * @generated
 */
public interface Door extends EObject {
	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(boolean)
	 * @see conversationalGame.ConversationalGamePackage#getDoor_Open()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link conversationalGame.Door#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Room)
	 * @see conversationalGame.ConversationalGamePackage#getDoor_Next()
	 * @model required="true"
	 * @generated
	 */
	Room getNext();

	/**
	 * Sets the value of the '{@link conversationalGame.Door#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Room value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see conversationalGame.ConversationalGamePackage#getDoor_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link conversationalGame.Door#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tDoor.allInstances()-&gt;isUnique(Id)\n\t\t'"
	 * @generated
	 */
	boolean idUniqueDoor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Door
