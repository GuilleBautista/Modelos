/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Npc Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.NpcTrigger#getNpc <em>Npc</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getNpcTrigger()
 * @model
 * @generated
 */
public interface NpcTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Npc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npc</em>' reference.
	 * @see #setNpc(Npc)
	 * @see conversationalGame.ConversationalGamePackage#getNpcTrigger_Npc()
	 * @model
	 * @generated
	 */
	Npc getNpc();

	/**
	 * Sets the value of the '{@link conversationalGame.NpcTrigger#getNpc <em>Npc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Npc</em>' reference.
	 * @see #getNpc()
	 * @generated
	 */
	void setNpc(Npc value);

} // NpcTrigger
