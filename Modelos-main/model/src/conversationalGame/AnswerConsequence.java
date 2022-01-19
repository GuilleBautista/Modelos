/**
 */
package conversationalGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Consequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.AnswerConsequence#getQuestion <em>Question</em>}</li>
 *   <li>{@link conversationalGame.AnswerConsequence#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getAnswerConsequence()
 * @model
 * @generated
 */
public interface AnswerConsequence extends Consequence {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see conversationalGame.ConversationalGamePackage#getAnswerConsequence_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link conversationalGame.AnswerConsequence#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' attribute.
	 * @see #setAnswer(String)
	 * @see conversationalGame.ConversationalGamePackage#getAnswerConsequence_Answer()
	 * @model
	 * @generated
	 */
	String getAnswer();

	/**
	 * Sets the value of the '{@link conversationalGame.AnswerConsequence#getAnswer <em>Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' attribute.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(String value);

} // AnswerConsequence
