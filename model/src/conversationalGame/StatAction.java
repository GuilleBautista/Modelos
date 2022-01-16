/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stat Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.StatAction#getValue <em>Value</em>}</li>
 *   <li>{@link conversationalGame.StatAction#getStat <em>Stat</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getStatAction()
 * @model
 * @generated
 */
public interface StatAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see conversationalGame.ConversationalGamePackage#getStatAction_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link conversationalGame.StatAction#getValue <em>Value</em>}' attribute.
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
	 * @see conversationalGame.ConversationalGamePackage#getStatAction_Stat()
	 * @model required="true"
	 * @generated
	 */
	Stat getStat();

	/**
	 * Sets the value of the '{@link conversationalGame.StatAction#getStat <em>Stat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat</em>' reference.
	 * @see #getStat()
	 * @generated
	 */
	void setStat(Stat value);

} // StatAction
