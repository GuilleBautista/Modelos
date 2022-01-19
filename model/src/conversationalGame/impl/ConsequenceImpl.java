/**
 */
package conversationalGame.impl;

import conversationalGame.CharacterAction;
import conversationalGame.Consequence;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.ItemAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.ConsequenceImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link conversationalGame.impl.ConsequenceImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link conversationalGame.impl.ConsequenceImpl#getItemAction <em>Item Action</em>}</li>
 *   <li>{@link conversationalGame.impl.ConsequenceImpl#getCharacterAction <em>Character Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsequenceImpl extends MinimalEObjectImpl.Container implements Consequence {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected Consequence consequence;

	/**
	 * The cached value of the '{@link #getItemAction() <em>Item Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemAction()
	 * @generated
	 * @ordered
	 */
	protected ItemAction itemAction;

	/**
	 * The cached value of the '{@link #getCharacterAction() <em>Character Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterAction()
	 * @generated
	 * @ordered
	 */
	protected CharacterAction characterAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence getConsequence() {
		if (consequence != null && consequence.eIsProxy()) {
			InternalEObject oldConsequence = (InternalEObject)consequence;
			consequence = (Consequence)eResolveProxy(oldConsequence);
			if (consequence != oldConsequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE, oldConsequence, consequence));
			}
		}
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence basicGetConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequence(Consequence newConsequence) {
		Consequence oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE, oldConsequence, consequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAction getItemAction() {
		if (itemAction != null && itemAction.eIsProxy()) {
			InternalEObject oldItemAction = (InternalEObject)itemAction;
			itemAction = (ItemAction)eResolveProxy(oldItemAction);
			if (itemAction != oldItemAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION, oldItemAction, itemAction));
			}
		}
		return itemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAction basicGetItemAction() {
		return itemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemAction(ItemAction newItemAction) {
		ItemAction oldItemAction = itemAction;
		itemAction = newItemAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION, oldItemAction, itemAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterAction getCharacterAction() {
		if (characterAction != null && characterAction.eIsProxy()) {
			InternalEObject oldCharacterAction = (InternalEObject)characterAction;
			characterAction = (CharacterAction)eResolveProxy(oldCharacterAction);
			if (characterAction != oldCharacterAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION, oldCharacterAction, characterAction));
			}
		}
		return characterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterAction basicGetCharacterAction() {
		return characterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterAction(CharacterAction newCharacterAction) {
		CharacterAction oldCharacterAction = characterAction;
		characterAction = newCharacterAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION, oldCharacterAction, characterAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE__MESSAGE:
				return getMessage();
			case ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE:
				if (resolve) return getConsequence();
				return basicGetConsequence();
			case ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION:
				if (resolve) return getItemAction();
				return basicGetItemAction();
			case ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION:
				if (resolve) return getCharacterAction();
				return basicGetCharacterAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE:
				setConsequence((Consequence)newValue);
				return;
			case ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION:
				setItemAction((ItemAction)newValue);
				return;
			case ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION:
				setCharacterAction((CharacterAction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE:
				setConsequence((Consequence)null);
				return;
			case ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION:
				setItemAction((ItemAction)null);
				return;
			case ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION:
				setCharacterAction((CharacterAction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ConversationalGamePackage.CONSEQUENCE__CONSEQUENCE:
				return consequence != null;
			case ConversationalGamePackage.CONSEQUENCE__ITEM_ACTION:
				return itemAction != null;
			case ConversationalGamePackage.CONSEQUENCE__CHARACTER_ACTION:
				return characterAction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //ConsequenceImpl
