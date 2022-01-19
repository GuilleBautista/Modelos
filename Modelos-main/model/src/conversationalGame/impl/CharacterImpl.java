/**
 */
package conversationalGame.impl;

import conversationalGame.CharacterAction;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;
import conversationalGame.Stat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.CharacterImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.impl.CharacterImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link conversationalGame.impl.CharacterImpl#isDead <em>Dead</em>}</li>
 *   <li>{@link conversationalGame.impl.CharacterImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterImpl extends MinimalEObjectImpl.Container implements conversationalGame.Character {
	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> inventory;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected EList<Stat> stats;

	/**
	 * The default value of the '{@link #isDead() <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDead() <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDead()
	 * @generated
	 * @ordered
	 */
	protected boolean dead = DEAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectContainmentEList<Item>(Item.class, this, ConversationalGamePackage.CHARACTER__INVENTORY);
		}
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stat> getStats() {
		if (stats == null) {
			stats = new EObjectContainmentEList<Stat>(Stat.class, this, ConversationalGamePackage.CHARACTER__STATS);
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDead() {
		return dead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDead(boolean newDead) {
		boolean oldDead = dead;
		dead = newDead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.CHARACTER__DEAD, oldDead, dead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacterAction> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<CharacterAction>(CharacterAction.class, this, ConversationalGamePackage.CHARACTER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationalGamePackage.CHARACTER__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
			case ConversationalGamePackage.CHARACTER__STATS:
				return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.CHARACTER__INVENTORY:
				return getInventory();
			case ConversationalGamePackage.CHARACTER__STATS:
				return getStats();
			case ConversationalGamePackage.CHARACTER__DEAD:
				return isDead();
			case ConversationalGamePackage.CHARACTER__ACTIONS:
				return getActions();
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
			case ConversationalGamePackage.CHARACTER__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.CHARACTER__STATS:
				getStats().clear();
				getStats().addAll((Collection<? extends Stat>)newValue);
				return;
			case ConversationalGamePackage.CHARACTER__DEAD:
				setDead((Boolean)newValue);
				return;
			case ConversationalGamePackage.CHARACTER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends CharacterAction>)newValue);
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
			case ConversationalGamePackage.CHARACTER__INVENTORY:
				getInventory().clear();
				return;
			case ConversationalGamePackage.CHARACTER__STATS:
				getStats().clear();
				return;
			case ConversationalGamePackage.CHARACTER__DEAD:
				setDead(DEAD_EDEFAULT);
				return;
			case ConversationalGamePackage.CHARACTER__ACTIONS:
				getActions().clear();
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
			case ConversationalGamePackage.CHARACTER__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case ConversationalGamePackage.CHARACTER__STATS:
				return stats != null && !stats.isEmpty();
			case ConversationalGamePackage.CHARACTER__DEAD:
				return dead != DEAD_EDEFAULT;
			case ConversationalGamePackage.CHARACTER__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (Dead: ");
		result.append(dead);
		result.append(')');
		return result.toString();
	}

} //CharacterImpl
