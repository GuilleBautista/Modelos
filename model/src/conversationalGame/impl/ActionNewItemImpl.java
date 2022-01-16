/**
 */
package conversationalGame.impl;

import conversationalGame.ActionNewItem;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action New Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.ActionNewItemImpl#getNewItems <em>New Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionNewItemImpl extends ActionImpl implements ActionNewItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionNewItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.ACTION_NEW_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getNewItems() {
		if (newItems == null) {
			newItems = new EObjectResolvingEList<Item>(Item.class, this, ConversationalGamePackage.ACTION_NEW_ITEM__NEW_ITEMS);
		}
		return newItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.ACTION_NEW_ITEM__NEW_ITEMS:
				return getNewItems();
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
			case ConversationalGamePackage.ACTION_NEW_ITEM__NEW_ITEMS:
				getNewItems().clear();
				getNewItems().addAll((Collection<? extends Item>)newValue);
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
			case ConversationalGamePackage.ACTION_NEW_ITEM__NEW_ITEMS:
				getNewItems().clear();
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
			case ConversationalGamePackage.ACTION_NEW_ITEM__NEW_ITEMS:
				return newItems != null && !newItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionNewItemImpl
