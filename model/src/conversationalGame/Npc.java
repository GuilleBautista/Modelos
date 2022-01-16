/**
 */
package conversationalGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Npc#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.Npc#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link conversationalGame.Npc#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.Npc#isDead <em>Dead</em>}</li>
 *   <li>{@link conversationalGame.Npc#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getNpc()
 * @model
 * @generated
 */
public interface Npc extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conversationalGame.ConversationalGamePackage#getNpc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conversationalGame.Npc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Greeting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greeting</em>' attribute.
	 * @see #setGreeting(String)
	 * @see conversationalGame.ConversationalGamePackage#getNpc_Greeting()
	 * @model
	 * @generated
	 */
	String getGreeting();

	/**
	 * Sets the value of the '{@link conversationalGame.Npc#getGreeting <em>Greeting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greeting</em>' attribute.
	 * @see #getGreeting()
	 * @generated
	 */
	void setGreeting(String value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getNpc_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getInventory();

	/**
	 * Returns the value of the '<em><b>Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead</em>' attribute.
	 * @see #setDead(boolean)
	 * @see conversationalGame.ConversationalGamePackage#getNpc_Dead()
	 * @model required="true"
	 * @generated
	 */
	boolean isDead();

	/**
	 * Sets the value of the '{@link conversationalGame.Npc#isDead <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead</em>' attribute.
	 * @see #isDead()
	 * @generated
	 */
	void setDead(boolean value);

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Stat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getNpc_Stats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stat> getStats();

} // Npc
