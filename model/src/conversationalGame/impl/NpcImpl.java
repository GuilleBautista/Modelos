/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Item;
import conversationalGame.Npc;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Npc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.NpcImpl#getName <em>Name</em>}</li>
 *   <li>{@link conversationalGame.impl.NpcImpl#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link conversationalGame.impl.NpcImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link conversationalGame.impl.NpcImpl#isDead <em>Dead</em>}</li>
 *   <li>{@link conversationalGame.impl.NpcImpl#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NpcImpl extends MinimalEObjectImpl.Container implements Npc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreeting()
	 * @generated
	 * @ordered
	 */
	protected static final String GREETING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreeting() <em>Greeting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreeting()
	 * @generated
	 * @ordered
	 */
	protected String greeting = GREETING_EDEFAULT;

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
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected EList<Stat> stats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NpcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.NPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.NPC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreeting() {
		return greeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreeting(String newGreeting) {
		String oldGreeting = greeting;
		greeting = newGreeting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.NPC__GREETING, oldGreeting, greeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getInventory() {
		if (inventory == null) {
			inventory = new EObjectContainmentEList<Item>(Item.class, this, ConversationalGamePackage.NPC__INVENTORY);
		}
		return inventory;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.NPC__DEAD, oldDead, dead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stat> getStats() {
		if (stats == null) {
			stats = new EObjectContainmentEList<Stat>(Stat.class, this, ConversationalGamePackage.NPC__STATS);
		}
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationalGamePackage.NPC__INVENTORY:
				return ((InternalEList<?>)getInventory()).basicRemove(otherEnd, msgs);
			case ConversationalGamePackage.NPC__STATS:
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
			case ConversationalGamePackage.NPC__NAME:
				return getName();
			case ConversationalGamePackage.NPC__GREETING:
				return getGreeting();
			case ConversationalGamePackage.NPC__INVENTORY:
				return getInventory();
			case ConversationalGamePackage.NPC__DEAD:
				return isDead();
			case ConversationalGamePackage.NPC__STATS:
				return getStats();
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
			case ConversationalGamePackage.NPC__NAME:
				setName((String)newValue);
				return;
			case ConversationalGamePackage.NPC__GREETING:
				setGreeting((String)newValue);
				return;
			case ConversationalGamePackage.NPC__INVENTORY:
				getInventory().clear();
				getInventory().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.NPC__DEAD:
				setDead((Boolean)newValue);
				return;
			case ConversationalGamePackage.NPC__STATS:
				getStats().clear();
				getStats().addAll((Collection<? extends Stat>)newValue);
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
			case ConversationalGamePackage.NPC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConversationalGamePackage.NPC__GREETING:
				setGreeting(GREETING_EDEFAULT);
				return;
			case ConversationalGamePackage.NPC__INVENTORY:
				getInventory().clear();
				return;
			case ConversationalGamePackage.NPC__DEAD:
				setDead(DEAD_EDEFAULT);
				return;
			case ConversationalGamePackage.NPC__STATS:
				getStats().clear();
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
			case ConversationalGamePackage.NPC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConversationalGamePackage.NPC__GREETING:
				return GREETING_EDEFAULT == null ? greeting != null : !GREETING_EDEFAULT.equals(greeting);
			case ConversationalGamePackage.NPC__INVENTORY:
				return inventory != null && !inventory.isEmpty();
			case ConversationalGamePackage.NPC__DEAD:
				return dead != DEAD_EDEFAULT;
			case ConversationalGamePackage.NPC__STATS:
				return stats != null && !stats.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Greeting: ");
		result.append(greeting);
		result.append(", Dead: ");
		result.append(dead);
		result.append(')');
		return result.toString();
	}

} //NpcImpl
