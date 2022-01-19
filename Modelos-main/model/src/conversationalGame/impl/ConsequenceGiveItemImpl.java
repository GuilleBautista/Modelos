/**
 */
package conversationalGame.impl;

import conversationalGame.ConsequenceGiveItem;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consequence Give Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.ConsequenceGiveItemImpl#getNewItems <em>New Items</em>}</li>
 *   <li>{@link conversationalGame.impl.ConsequenceGiveItemImpl#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsequenceGiveItemImpl extends ConsequenceImpl implements ConsequenceGiveItem {
	/**
	 * The cached value of the '{@link #getNewItems() <em>New Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> newItems;

	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected conversationalGame.Character character;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsequenceGiveItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.CONSEQUENCE_GIVE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getNewItems() {
		if (newItems == null) {
			newItems = new EObjectResolvingEList<Item>(Item.class, this, ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__NEW_ITEMS);
		}
		return newItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conversationalGame.Character getCharacter() {
		if (character != null && character.eIsProxy()) {
			InternalEObject oldCharacter = (InternalEObject)character;
			character = (conversationalGame.Character)eResolveProxy(oldCharacter);
			if (character != oldCharacter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER, oldCharacter, character));
			}
		}
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public conversationalGame.Character basicGetCharacter() {
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacter(conversationalGame.Character newCharacter) {
		conversationalGame.Character oldCharacter = character;
		character = newCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__NEW_ITEMS:
				return getNewItems();
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER:
				if (resolve) return getCharacter();
				return basicGetCharacter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__NEW_ITEMS:
				getNewItems().clear();
				getNewItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER:
				setCharacter((conversationalGame.Character)newValue);
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
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__NEW_ITEMS:
				getNewItems().clear();
				return;
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER:
				setCharacter((conversationalGame.Character)null);
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
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__NEW_ITEMS:
				return newItems != null && !newItems.isEmpty();
			case ConversationalGamePackage.CONSEQUENCE_GIVE_ITEM__CHARACTER:
				return character != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsequenceGiveItemImpl
