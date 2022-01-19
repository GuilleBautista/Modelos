/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.Stat;
import conversationalGame.StatConsequence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stat Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.StatConsequenceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link conversationalGame.impl.StatConsequenceImpl#getStat <em>Stat</em>}</li>
 *   <li>{@link conversationalGame.impl.StatConsequenceImpl#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatConsequenceImpl extends ConsequenceImpl implements StatConsequence {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStat() <em>Stat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStat()
	 * @generated
	 * @ordered
	 */
	protected Stat stat;

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
	protected StatConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.STAT_CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.STAT_CONSEQUENCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stat getStat() {
		if (stat != null && stat.eIsProxy()) {
			InternalEObject oldStat = (InternalEObject)stat;
			stat = (Stat)eResolveProxy(oldStat);
			if (stat != oldStat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.STAT_CONSEQUENCE__STAT, oldStat, stat));
			}
		}
		return stat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stat basicGetStat() {
		return stat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStat(Stat newStat) {
		Stat oldStat = stat;
		stat = newStat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.STAT_CONSEQUENCE__STAT, oldStat, stat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER, oldCharacter, character));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.STAT_CONSEQUENCE__VALUE:
				return getValue();
			case ConversationalGamePackage.STAT_CONSEQUENCE__STAT:
				if (resolve) return getStat();
				return basicGetStat();
			case ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConversationalGamePackage.STAT_CONSEQUENCE__VALUE:
				setValue((Integer)newValue);
				return;
			case ConversationalGamePackage.STAT_CONSEQUENCE__STAT:
				setStat((Stat)newValue);
				return;
			case ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER:
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
			case ConversationalGamePackage.STAT_CONSEQUENCE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ConversationalGamePackage.STAT_CONSEQUENCE__STAT:
				setStat((Stat)null);
				return;
			case ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER:
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
			case ConversationalGamePackage.STAT_CONSEQUENCE__VALUE:
				return value != VALUE_EDEFAULT;
			case ConversationalGamePackage.STAT_CONSEQUENCE__STAT:
				return stat != null;
			case ConversationalGamePackage.STAT_CONSEQUENCE__CHARACTER:
				return character != null;
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
		result.append(" (Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //StatConsequenceImpl
