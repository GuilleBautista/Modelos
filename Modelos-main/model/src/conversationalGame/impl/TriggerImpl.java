/**
 */
package conversationalGame.impl;

import conversationalGame.Consequence;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.ConversationalGameTables;
import conversationalGame.Door;
import conversationalGame.Trigger;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.TriggerImpl#isTriggered <em>Triggered</em>}</li>
 *   <li>{@link conversationalGame.impl.TriggerImpl#getId <em>Id</em>}</li>
 *   <li>{@link conversationalGame.impl.TriggerImpl#isEndGame <em>End Game</em>}</li>
 *   <li>{@link conversationalGame.impl.TriggerImpl#getConsequences <em>Consequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The default value of the '{@link #isTriggered() <em>Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTriggered() <em>Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggered()
	 * @generated
	 * @ordered
	 */
	protected boolean triggered = TRIGGERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEndGame() <em>End Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndGame()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_GAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEndGame() <em>End Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndGame()
	 * @generated
	 * @ordered
	 */
	protected boolean endGame = END_GAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> consequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriggered() {
		return triggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggered(boolean newTriggered) {
		boolean oldTriggered = triggered;
		triggered = newTriggered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.TRIGGER__TRIGGERED, oldTriggered, triggered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.TRIGGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndGame() {
		return endGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndGame(boolean newEndGame) {
		boolean oldEndGame = endGame;
		endGame = newEndGame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.TRIGGER__END_GAME, oldEndGame, endGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consequence> getConsequences() {
		if (consequences == null) {
			consequences = new EObjectResolvingEList<Consequence>(Consequence.class, this, ConversationalGamePackage.TRIGGER__CONSEQUENCES);
		}
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean idUniqueDoor(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Trigger::idUniqueDoor";
		try {
			/**
			 *
			 * inv idUniqueDoor:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Door.allInstances()->isUnique(Id)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ConversationalGamePackage.Literals.TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ConversationalGameTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_0 = idResolver.getClass(ConversationalGameTables.CLSSid_Door, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, TYP_conversationalGame_c_c_Door_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(ConversationalGameTables.SET_CLSSid_Door);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Door _1 = (Door)ITERATOR__1.next();
						/**
						 * Id
						 */
						final /*@NonInvalid*/ String Id = _1.getId();
						//
						if (accumulator.includes(Id) == ValueUtil.TRUE_VALUE) {
							result = false;
							break;			// Abort after second find
						}
						else {
							accumulator.add(Id);
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ConversationalGameTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationalGamePackage.TRIGGER__TRIGGERED:
				return isTriggered();
			case ConversationalGamePackage.TRIGGER__ID:
				return getId();
			case ConversationalGamePackage.TRIGGER__END_GAME:
				return isEndGame();
			case ConversationalGamePackage.TRIGGER__CONSEQUENCES:
				return getConsequences();
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
			case ConversationalGamePackage.TRIGGER__TRIGGERED:
				setTriggered((Boolean)newValue);
				return;
			case ConversationalGamePackage.TRIGGER__ID:
				setId((String)newValue);
				return;
			case ConversationalGamePackage.TRIGGER__END_GAME:
				setEndGame((Boolean)newValue);
				return;
			case ConversationalGamePackage.TRIGGER__CONSEQUENCES:
				getConsequences().clear();
				getConsequences().addAll((Collection<? extends Consequence>)newValue);
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
			case ConversationalGamePackage.TRIGGER__TRIGGERED:
				setTriggered(TRIGGERED_EDEFAULT);
				return;
			case ConversationalGamePackage.TRIGGER__ID:
				setId(ID_EDEFAULT);
				return;
			case ConversationalGamePackage.TRIGGER__END_GAME:
				setEndGame(END_GAME_EDEFAULT);
				return;
			case ConversationalGamePackage.TRIGGER__CONSEQUENCES:
				getConsequences().clear();
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
			case ConversationalGamePackage.TRIGGER__TRIGGERED:
				return triggered != TRIGGERED_EDEFAULT;
			case ConversationalGamePackage.TRIGGER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConversationalGamePackage.TRIGGER__END_GAME:
				return endGame != END_GAME_EDEFAULT;
			case ConversationalGamePackage.TRIGGER__CONSEQUENCES:
				return consequences != null && !consequences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConversationalGamePackage.TRIGGER___ID_UNIQUE_DOOR__DIAGNOSTICCHAIN_MAP:
				return idUniqueDoor((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Triggered: ");
		result.append(triggered);
		result.append(", Id: ");
		result.append(id);
		result.append(", EndGame: ");
		result.append(endGame);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
