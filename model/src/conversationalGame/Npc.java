/**
 */
package conversationalGame;

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
 *   <li>{@link conversationalGame.Npc#getFirstEncounterTrigger <em>First Encounter Trigger</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getNpc()
 * @model
 * @generated
 */
public interface Npc extends conversationalGame.Character {
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
	 * Returns the value of the '<em><b>First Encounter Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Encounter Trigger</em>' reference.
	 * @see #setFirstEncounterTrigger(RoomTrigger)
	 * @see conversationalGame.ConversationalGamePackage#getNpc_FirstEncounterTrigger()
	 * @model
	 * @generated
	 */
	RoomTrigger getFirstEncounterTrigger();

	/**
	 * Sets the value of the '{@link conversationalGame.Npc#getFirstEncounterTrigger <em>First Encounter Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Encounter Trigger</em>' reference.
	 * @see #getFirstEncounterTrigger()
	 * @generated
	 */
	void setFirstEncounterTrigger(RoomTrigger value);

} // Npc
