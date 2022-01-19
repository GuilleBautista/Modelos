/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.StatConsequence#getValue <em>Value</em>}</li>
 *   <li>{@link conversationalGame.StatConsequence#getStat <em>Stat</em>}</li>
 *   <li>{@link conversationalGame.StatConsequence#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getStatConsequence()
 * @model
 * @generated
 */
public interface StatConsequence extends Consequence {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see conversationalGame.ConversationalGamePackage#getStatConsequence_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link conversationalGame.StatConsequence#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Stat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat</em>' reference.
	 * @see #setStat(Stat)
	 * @see conversationalGame.ConversationalGamePackage#getStatConsequence_Stat()
	 * @model required="true"
	 * @generated
	 */
	Stat getStat();

	/**
	 * Sets the value of the '{@link conversationalGame.StatConsequence#getStat <em>Stat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat</em>' reference.
	 * @see #getStat()
	 * @generated
	 */
	void setStat(Stat value);

	/**
	 * Returns the value of the '<em><b>Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' reference.
	 * @see #setCharacter(conversationalGame.Character)
	 * @see conversationalGame.ConversationalGamePackage#getStatConsequence_Character()
	 * @model required="true"
	 * @generated
	 */
	conversationalGame.Character getCharacter();

	/**
	 * Sets the value of the '{@link conversationalGame.StatConsequence#getCharacter <em>Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' reference.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(conversationalGame.Character value);

} // StatConsequence
