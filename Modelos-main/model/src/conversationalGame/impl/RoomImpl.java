/**
 */
package conversationalGame.impl;

import conversationalGame.ConversationalGamePackage;
import conversationalGame.ConversationalGameTables;
import conversationalGame.Door;
import conversationalGame.Item;
import conversationalGame.Npc;
import conversationalGame.Room;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.impl.RoomImpl#getNorth <em>North</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getSouth <em>South</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getEast <em>East</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getWest <em>West</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getId <em>Id</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getItems <em>Items</em>}</li>
 *   <li>{@link conversationalGame.impl.RoomImpl#getNpcs <em>Npcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected Door north;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected Door south;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected Door east;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected Door west;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The cached value of the '{@link #getNpcs() <em>Npcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Npc> npcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationalGamePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorth(Door newNorth, NotificationChain msgs) {
		Door oldNorth = north;
		north = newNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__NORTH, oldNorth, newNorth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorth(Door newNorth) {
		if (newNorth != north) {
			NotificationChain msgs = null;
			if (north != null)
				msgs = ((InternalEObject)north).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__NORTH, null, msgs);
			if (newNorth != null)
				msgs = ((InternalEObject)newNorth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__NORTH, null, msgs);
			msgs = basicSetNorth(newNorth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__NORTH, newNorth, newNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouth(Door newSouth, NotificationChain msgs) {
		Door oldSouth = south;
		south = newSouth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__SOUTH, oldSouth, newSouth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouth(Door newSouth) {
		if (newSouth != south) {
			NotificationChain msgs = null;
			if (south != null)
				msgs = ((InternalEObject)south).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__SOUTH, null, msgs);
			if (newSouth != null)
				msgs = ((InternalEObject)newSouth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__SOUTH, null, msgs);
			msgs = basicSetSouth(newSouth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__SOUTH, newSouth, newSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEast(Door newEast, NotificationChain msgs) {
		Door oldEast = east;
		east = newEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__EAST, oldEast, newEast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEast(Door newEast) {
		if (newEast != east) {
			NotificationChain msgs = null;
			if (east != null)
				msgs = ((InternalEObject)east).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__EAST, null, msgs);
			if (newEast != null)
				msgs = ((InternalEObject)newEast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__EAST, null, msgs);
			msgs = basicSetEast(newEast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__EAST, newEast, newEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWest(Door newWest, NotificationChain msgs) {
		Door oldWest = west;
		west = newWest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__WEST, oldWest, newWest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWest(Door newWest) {
		if (newWest != west) {
			NotificationChain msgs = null;
			if (west != null)
				msgs = ((InternalEObject)west).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__WEST, null, msgs);
			if (newWest != null)
				msgs = ((InternalEObject)newWest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationalGamePackage.ROOM__WEST, null, msgs);
			msgs = basicSetWest(newWest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__WEST, newWest, newWest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationalGamePackage.ROOM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ConversationalGamePackage.ROOM__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Npc> getNpcs() {
		if (npcs == null) {
			npcs = new EObjectContainmentEList<Npc>(Npc.class, this, ConversationalGamePackage.ROOM__NPCS);
		}
		return npcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean idUniqueRoom(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::idUniqueRoom";
		try {
			/**
			 *
			 * inv idUniqueRoom:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Room.allInstances()->isUnique(Id)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ConversationalGamePackage.Literals.ROOM___ID_UNIQUE_ROOM__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ConversationalGameTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Room = idResolver.getClass(ConversationalGameTables.CLSSid_Room, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Room, TYP_conversationalGame_c_c_Room);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(ConversationalGameTables.SET_CLSSid_Room);
					Iterator<Object> ITERATOR__1 = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Room _1 = (Room)ITERATOR__1.next();
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
	public boolean NoSelfNavigation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::NoSelfNavigation";
		try {
			/**
			 *
			 * inv NoSelfNavigation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           ngo : Boolean[1] = North->collect(d | d.oclAsType(Door).Next.Id)
			 *           ->select(i | i = self.Id)
			 *           ->isEmpty()
			 *         in
			 *           let
			 *             sgo : Boolean[1] = South->collect(d |
			 *               d.oclAsType(Door).Next.Id)
			 *             ->select(i | i = self.Id)
			 *             ->isEmpty()
			 *           in
			 *             let
			 *               ego : Boolean[1] = East->collect(d |
			 *                 d.oclAsType(Door).Next.Id)
			 *               ->select(i | i = self.Id)
			 *               ->isEmpty()
			 *             in
			 *               let
			 *                 wgo : Boolean[1] = West->collect(d |
			 *                   d.oclAsType(Door).Next.Id)
			 *                 ->select(i | i = self.Id)
			 *                 ->isEmpty()
			 *               in ngo and sgo and ego and wgo
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ConversationalGamePackage.Literals.ROOM___NO_SELF_NAVIGATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ConversationalGameTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_and_1;
				try {
					/*@Caught*/ Object CAUGHT_ngo;
					try {
						final /*@NonInvalid*/ Door North = this.getNorth();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, North);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d = oclAsSet.iterator();
						/*@Thrown*/ BagValue collect;
						while (true) {
							if (!ITERATOR_d.hasNext()) {
								collect = accumulator;
								break;
							}
							/*@NonInvalid*/ Door d = (Door)ITERATOR_d.next();
							/**
							 * d.oclAsType(Door).Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door = idResolver.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d, TYP_conversationalGame_c_c_Door);
							final /*@Thrown*/ Room Next = oclAsType.getNext();
							final /*@Thrown*/ String Id = Next.getId();
							//
							accumulator.add(Id);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i = collect.iterator();
						/*@Thrown*/ BagValue select;
						while (true) {
							if (!ITERATOR_i.hasNext()) {
								select = accumulator_0;
								break;
							}
							/*@NonInvalid*/ String i = (String)ITERATOR_i.next();
							/**
							 * i = self.Id
							 */
							final /*@NonInvalid*/ String Id_0 = this.getId();
							final /*@NonInvalid*/ boolean eq = (i != null) ? i.equals(Id_0) : (Id_0 == null);
							//
							if (eq) {
								accumulator_0.add(i);
							}
						}
						final /*@Thrown*/ boolean ngo = CollectionIsEmptyOperation.INSTANCE.evaluate(select).booleanValue();
						CAUGHT_ngo = ngo;
					}
					catch (Exception e) {
						CAUGHT_ngo = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_sgo;
					try {
						final /*@NonInvalid*/ Door South = this.getSouth();
						final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, South);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_0 = oclAsSet_0.iterator();
						/*@Thrown*/ BagValue collect_0;
						while (true) {
							if (!ITERATOR_d_0.hasNext()) {
								collect_0 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ Door d_0 = (Door)ITERATOR_d_0.next();
							/**
							 * d.oclAsType(Door).Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_0 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_0 = idResolver_0.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_0 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_0, TYP_conversationalGame_c_c_Door_0);
							final /*@Thrown*/ Room Next_0 = oclAsType_0.getNext();
							final /*@Thrown*/ String Id_1 = Next_0.getId();
							//
							accumulator_1.add(Id_1);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_0 = collect_0.iterator();
						/*@Thrown*/ BagValue select_0;
						while (true) {
							if (!ITERATOR_i_0.hasNext()) {
								select_0 = accumulator_2;
								break;
							}
							/*@NonInvalid*/ String i_0 = (String)ITERATOR_i_0.next();
							/**
							 * i = self.Id
							 */
							final /*@NonInvalid*/ String Id_2 = this.getId();
							final /*@NonInvalid*/ boolean eq_0 = (i_0 != null) ? i_0.equals(Id_2) : (Id_2 == null);
							//
							if (eq_0) {
								accumulator_2.add(i_0);
							}
						}
						final /*@Thrown*/ boolean sgo = CollectionIsEmptyOperation.INSTANCE.evaluate(select_0).booleanValue();
						CAUGHT_sgo = sgo;
					}
					catch (Exception e) {
						CAUGHT_sgo = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_ego;
					try {
						final /*@NonInvalid*/ Door East = this.getEast();
						final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, East);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_1 = oclAsSet_1.iterator();
						/*@Thrown*/ BagValue collect_1;
						while (true) {
							if (!ITERATOR_d_1.hasNext()) {
								collect_1 = accumulator_3;
								break;
							}
							/*@NonInvalid*/ Door d_1 = (Door)ITERATOR_d_1.next();
							/**
							 * d.oclAsType(Door).Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_1 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_1 = idResolver_1.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_1 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_1, TYP_conversationalGame_c_c_Door_1);
							final /*@Thrown*/ Room Next_1 = oclAsType_1.getNext();
							final /*@Thrown*/ String Id_3 = Next_1.getId();
							//
							accumulator_3.add(Id_3);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_4 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_1 = collect_1.iterator();
						/*@Thrown*/ BagValue select_1;
						while (true) {
							if (!ITERATOR_i_1.hasNext()) {
								select_1 = accumulator_4;
								break;
							}
							/*@NonInvalid*/ String i_1 = (String)ITERATOR_i_1.next();
							/**
							 * i = self.Id
							 */
							final /*@NonInvalid*/ String Id_4 = this.getId();
							final /*@NonInvalid*/ boolean eq_1 = (i_1 != null) ? i_1.equals(Id_4) : (Id_4 == null);
							//
							if (eq_1) {
								accumulator_4.add(i_1);
							}
						}
						final /*@Thrown*/ boolean ego = CollectionIsEmptyOperation.INSTANCE.evaluate(select_1).booleanValue();
						CAUGHT_ego = ego;
					}
					catch (Exception e) {
						CAUGHT_ego = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_wgo;
					try {
						final /*@NonInvalid*/ Door West = this.getWest();
						final /*@Thrown*/ SetValue oclAsSet_2 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, West);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_5 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_2 = oclAsSet_2.iterator();
						/*@Thrown*/ BagValue collect_2;
						while (true) {
							if (!ITERATOR_d_2.hasNext()) {
								collect_2 = accumulator_5;
								break;
							}
							/*@NonInvalid*/ Door d_2 = (Door)ITERATOR_d_2.next();
							/**
							 * d.oclAsType(Door).Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_2 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_2 = idResolver_2.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_2 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_2, TYP_conversationalGame_c_c_Door_2);
							final /*@Thrown*/ Room Next_2 = oclAsType_2.getNext();
							final /*@Thrown*/ String Id_5 = Next_2.getId();
							//
							accumulator_5.add(Id_5);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_6 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_2 = collect_2.iterator();
						/*@Thrown*/ BagValue select_2;
						while (true) {
							if (!ITERATOR_i_2.hasNext()) {
								select_2 = accumulator_6;
								break;
							}
							/*@NonInvalid*/ String i_2 = (String)ITERATOR_i_2.next();
							/**
							 * i = self.Id
							 */
							final /*@NonInvalid*/ String Id_6 = this.getId();
							final /*@NonInvalid*/ boolean eq_2 = (i_2 != null) ? i_2.equals(Id_6) : (Id_6 == null);
							//
							if (eq_2) {
								accumulator_6.add(i_2);
							}
						}
						final /*@Thrown*/ boolean wgo = CollectionIsEmptyOperation.INSTANCE.evaluate(select_2).booleanValue();
						CAUGHT_wgo = wgo;
					}
					catch (Exception e) {
						CAUGHT_wgo = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_ngo == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_sgo == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_ngo instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_ngo;
									}
									if (CAUGHT_sgo instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_sgo;
									}
									and = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0;
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_ego == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and;
								}
								if (CAUGHT_ego instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_ego;
								}
								if (CAUGHT_and == null) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_1;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					}
					else {
						if (CAUGHT_wgo == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_wgo instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_wgo;
							}
							if (CAUGHT_and_0 == null) {
								and_1 = null;
							}
							else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_and_1 = and_1;
				}
				catch (Exception e) {
					CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_and_1, ConversationalGameTables.INT_0).booleanValue();
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
	public boolean atLeastOne(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::atLeastOne";
		try {
			/**
			 *
			 * inv atLeastOne:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = let
			 *           ndoor : Integer[1] = North->collect(d | d.oclAsType(Door))
			 *           ->size()
			 *         in
			 *           let
			 *             sdoor : Integer[1] = South->collect(d | d.oclAsType(Door))
			 *             ->size()
			 *           in
			 *             let
			 *               edoor : Integer[1] = East->collect(d | d.oclAsType(Door))
			 *               ->size()
			 *             in
			 *               let
			 *                 wdoor : Integer[1] = West->collect(d | d.oclAsType(Door))
			 *                 ->size()
			 *               in ndoor + sdoor + edoor + wdoor >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ConversationalGamePackage.Literals.ROOM___AT_LEAST_ONE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ConversationalGameTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_ge;
				try {
					final /*@NonInvalid*/ Door North = this.getNorth();
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, North);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_CLSSid_Door);
					Iterator<Object> ITERATOR_d = oclAsSet.iterator();
					/*@Thrown*/ BagValue collect;
					while (true) {
						if (!ITERATOR_d.hasNext()) {
							collect = accumulator;
							break;
						}
						/*@NonInvalid*/ Door d = (Door)ITERATOR_d.next();
						/**
						 * d.oclAsType(Door)
						 */
						final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_0 = idResolver.getClass(ConversationalGameTables.CLSSid_Door, null);
						final /*@Thrown*/ Door oclAsType = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d, TYP_conversationalGame_c_c_Door_0);
						//
						accumulator.add(oclAsType);
					}
					final /*@Thrown*/ IntegerValue ndoor = CollectionSizeOperation.INSTANCE.evaluate(collect);
					final /*@NonInvalid*/ Door South = this.getSouth();
					final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, South);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_CLSSid_Door);
					Iterator<Object> ITERATOR_d_0 = oclAsSet_0.iterator();
					/*@Thrown*/ BagValue collect_0;
					while (true) {
						if (!ITERATOR_d_0.hasNext()) {
							collect_0 = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Door d_0 = (Door)ITERATOR_d_0.next();
						/**
						 * d.oclAsType(Door)
						 */
						final /*@NonInvalid*/ IdResolver idResolver_0 = executor.getIdResolver();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_1 = idResolver_0.getClass(ConversationalGameTables.CLSSid_Door, null);
						final /*@Thrown*/ Door oclAsType_0 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_0, TYP_conversationalGame_c_c_Door_1);
						//
						accumulator_0.add(oclAsType_0);
					}
					final /*@Thrown*/ IntegerValue sdoor = CollectionSizeOperation.INSTANCE.evaluate(collect_0);
					final /*@NonInvalid*/ Door East = this.getEast();
					final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, East);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_CLSSid_Door);
					Iterator<Object> ITERATOR_d_1 = oclAsSet_1.iterator();
					/*@Thrown*/ BagValue collect_1;
					while (true) {
						if (!ITERATOR_d_1.hasNext()) {
							collect_1 = accumulator_1;
							break;
						}
						/*@NonInvalid*/ Door d_1 = (Door)ITERATOR_d_1.next();
						/**
						 * d.oclAsType(Door)
						 */
						final /*@NonInvalid*/ IdResolver idResolver_1 = executor.getIdResolver();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_2 = idResolver_1.getClass(ConversationalGameTables.CLSSid_Door, null);
						final /*@Thrown*/ Door oclAsType_1 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_1, TYP_conversationalGame_c_c_Door_2);
						//
						accumulator_1.add(oclAsType_1);
					}
					final /*@Thrown*/ IntegerValue edoor = CollectionSizeOperation.INSTANCE.evaluate(collect_1);
					final /*@NonInvalid*/ Door West = this.getWest();
					final /*@Thrown*/ SetValue oclAsSet_2 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, West);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_CLSSid_Door);
					Iterator<Object> ITERATOR_d_2 = oclAsSet_2.iterator();
					/*@Thrown*/ BagValue collect_2;
					while (true) {
						if (!ITERATOR_d_2.hasNext()) {
							collect_2 = accumulator_2;
							break;
						}
						/*@NonInvalid*/ Door d_2 = (Door)ITERATOR_d_2.next();
						/**
						 * d.oclAsType(Door)
						 */
						final /*@NonInvalid*/ IdResolver idResolver_2 = executor.getIdResolver();
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_3 = idResolver_2.getClass(ConversationalGameTables.CLSSid_Door, null);
						final /*@Thrown*/ Door oclAsType_2 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_2, TYP_conversationalGame_c_c_Door_3);
						//
						accumulator_2.add(oclAsType_2);
					}
					final /*@Thrown*/ IntegerValue wdoor = CollectionSizeOperation.INSTANCE.evaluate(collect_2);
					if (sdoor instanceof InvalidValueException) {
						throw (InvalidValueException)sdoor;
					}
					final /*@Thrown*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(ndoor, sdoor);
					if (edoor instanceof InvalidValueException) {
						throw (InvalidValueException)edoor;
					}
					final /*@Thrown*/ IntegerValue sum_0 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum, edoor);
					if (wdoor instanceof InvalidValueException) {
						throw (InvalidValueException)wdoor;
					}
					final /*@Thrown*/ IntegerValue sum_1 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum_0, wdoor);
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, sum_1, ConversationalGameTables.INT_1).booleanValue();
					CAUGHT_ge = ge;
				}
				catch (Exception e) {
					CAUGHT_ge = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_ge, ConversationalGameTables.INT_0).booleanValue();
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
	public boolean goAndBack(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Room::goAndBack";
		try {
			/**
			 *
			 * inv goAndBack:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let
			 *           ngoback : Boolean[1] = North->collect(d |
			 *             d.oclAsType(Door).Next.South.Next.Id)
			 *           ->select(i | i <> self.Id)
			 *           ->isEmpty()
			 *         in
			 *           let
			 *             sgoback : Boolean[1] = South->collect(d |
			 *               d.oclAsType(Door).Next.North.Next.Id)
			 *             ->select(i | i <> self.Id)
			 *             ->isEmpty()
			 *           in
			 *             let
			 *               egoback : Boolean[1] = East->collect(d |
			 *                 d.oclAsType(Door).Next.West.Next.Id)
			 *               ->select(i | i <> self.Id)
			 *               ->isEmpty()
			 *             in
			 *               let
			 *                 wgoback : Boolean[1] = West->collect(d |
			 *                   d.oclAsType(Door).Next.East.Next.Id)
			 *                 ->select(i | i <> self.Id)
			 *                 ->isEmpty()
			 *               in ngoback and sgoback and egoback and wgoback
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ConversationalGamePackage.Literals.ROOM___GO_AND_BACK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ConversationalGameTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_and_1;
				try {
					/*@Caught*/ Object CAUGHT_ngoback;
					try {
						final /*@NonInvalid*/ Door North = this.getNorth();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, North);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d = oclAsSet.iterator();
						/*@Thrown*/ BagValue collect;
						while (true) {
							if (!ITERATOR_d.hasNext()) {
								collect = accumulator;
								break;
							}
							/*@NonInvalid*/ Door d = (Door)ITERATOR_d.next();
							/**
							 * d.oclAsType(Door).Next.South.Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_0 = idResolver.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d, TYP_conversationalGame_c_c_Door_0);
							final /*@Thrown*/ Room Next = oclAsType.getNext();
							final /*@Thrown*/ Door South = Next.getSouth();
							if (South == null) {
								throw new InvalidValueException("Null source for \'\'http://www.example.org/var\'::Door::Next\'");
							}
							final /*@Thrown*/ Room Next_0 = South.getNext();
							final /*@Thrown*/ String Id = Next_0.getId();
							//
							accumulator.add(Id);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i = collect.iterator();
						/*@Thrown*/ BagValue select;
						while (true) {
							if (!ITERATOR_i.hasNext()) {
								select = accumulator_0;
								break;
							}
							/*@NonInvalid*/ String i = (String)ITERATOR_i.next();
							/**
							 * i <> self.Id
							 */
							final /*@NonInvalid*/ String Id_0 = this.getId();
							final /*@NonInvalid*/ boolean ne = (i != null) ? !i.equals(Id_0) : (Id_0 != null);
							//
							if (ne) {
								accumulator_0.add(i);
							}
						}
						final /*@Thrown*/ boolean ngoback = CollectionIsEmptyOperation.INSTANCE.evaluate(select).booleanValue();
						CAUGHT_ngoback = ngoback;
					}
					catch (Exception e) {
						CAUGHT_ngoback = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_sgoback;
					try {
						final /*@NonInvalid*/ Door South_0 = this.getSouth();
						final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, South_0);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_0 = oclAsSet_0.iterator();
						/*@Thrown*/ BagValue collect_0;
						while (true) {
							if (!ITERATOR_d_0.hasNext()) {
								collect_0 = accumulator_1;
								break;
							}
							/*@NonInvalid*/ Door d_0 = (Door)ITERATOR_d_0.next();
							/**
							 * d.oclAsType(Door).Next.North.Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_0 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_1 = idResolver_0.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_0 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_0, TYP_conversationalGame_c_c_Door_1);
							final /*@Thrown*/ Room Next_1 = oclAsType_0.getNext();
							final /*@Thrown*/ Door North_0 = Next_1.getNorth();
							if (North_0 == null) {
								throw new InvalidValueException("Null source for \'\'http://www.example.org/var\'::Door::Next\'");
							}
							final /*@Thrown*/ Room Next_2 = North_0.getNext();
							final /*@Thrown*/ String Id_1 = Next_2.getId();
							//
							accumulator_1.add(Id_1);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_0 = collect_0.iterator();
						/*@Thrown*/ BagValue select_0;
						while (true) {
							if (!ITERATOR_i_0.hasNext()) {
								select_0 = accumulator_2;
								break;
							}
							/*@NonInvalid*/ String i_0 = (String)ITERATOR_i_0.next();
							/**
							 * i <> self.Id
							 */
							final /*@NonInvalid*/ String Id_2 = this.getId();
							final /*@NonInvalid*/ boolean ne_0 = (i_0 != null) ? !i_0.equals(Id_2) : (Id_2 != null);
							//
							if (ne_0) {
								accumulator_2.add(i_0);
							}
						}
						final /*@Thrown*/ boolean sgoback = CollectionIsEmptyOperation.INSTANCE.evaluate(select_0).booleanValue();
						CAUGHT_sgoback = sgoback;
					}
					catch (Exception e) {
						CAUGHT_sgoback = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_egoback;
					try {
						final /*@NonInvalid*/ Door East = this.getEast();
						final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, East);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_1 = oclAsSet_1.iterator();
						/*@Thrown*/ BagValue collect_1;
						while (true) {
							if (!ITERATOR_d_1.hasNext()) {
								collect_1 = accumulator_3;
								break;
							}
							/*@NonInvalid*/ Door d_1 = (Door)ITERATOR_d_1.next();
							/**
							 * d.oclAsType(Door).Next.West.Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_1 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_2 = idResolver_1.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_1 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_1, TYP_conversationalGame_c_c_Door_2);
							final /*@Thrown*/ Room Next_3 = oclAsType_1.getNext();
							final /*@Thrown*/ Door West = Next_3.getWest();
							if (West == null) {
								throw new InvalidValueException("Null source for \'\'http://www.example.org/var\'::Door::Next\'");
							}
							final /*@Thrown*/ Room Next_4 = West.getNext();
							final /*@Thrown*/ String Id_3 = Next_4.getId();
							//
							accumulator_3.add(Id_3);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_4 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_1 = collect_1.iterator();
						/*@Thrown*/ BagValue select_1;
						while (true) {
							if (!ITERATOR_i_1.hasNext()) {
								select_1 = accumulator_4;
								break;
							}
							/*@NonInvalid*/ String i_1 = (String)ITERATOR_i_1.next();
							/**
							 * i <> self.Id
							 */
							final /*@NonInvalid*/ String Id_4 = this.getId();
							final /*@NonInvalid*/ boolean ne_1 = (i_1 != null) ? !i_1.equals(Id_4) : (Id_4 != null);
							//
							if (ne_1) {
								accumulator_4.add(i_1);
							}
						}
						final /*@Thrown*/ boolean egoback = CollectionIsEmptyOperation.INSTANCE.evaluate(select_1).booleanValue();
						CAUGHT_egoback = egoback;
					}
					catch (Exception e) {
						CAUGHT_egoback = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_wgoback;
					try {
						final /*@NonInvalid*/ Door West_0 = this.getWest();
						final /*@Thrown*/ SetValue oclAsSet_2 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ConversationalGameTables.SET_CLSSid_Door, West_0);
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_5 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_d_2 = oclAsSet_2.iterator();
						/*@Thrown*/ BagValue collect_2;
						while (true) {
							if (!ITERATOR_d_2.hasNext()) {
								collect_2 = accumulator_5;
								break;
							}
							/*@NonInvalid*/ Door d_2 = (Door)ITERATOR_d_2.next();
							/**
							 * d.oclAsType(Door).Next.East.Next.Id
							 */
							final /*@NonInvalid*/ IdResolver idResolver_2 = executor.getIdResolver();
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_conversationalGame_c_c_Door_3 = idResolver_2.getClass(ConversationalGameTables.CLSSid_Door, null);
							final /*@Thrown*/ Door oclAsType_2 = (Door)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, d_2, TYP_conversationalGame_c_c_Door_3);
							final /*@Thrown*/ Room Next_5 = oclAsType_2.getNext();
							final /*@Thrown*/ Door East_0 = Next_5.getEast();
							if (East_0 == null) {
								throw new InvalidValueException("Null source for \'\'http://www.example.org/var\'::Door::Next\'");
							}
							final /*@Thrown*/ Room Next_6 = East_0.getNext();
							final /*@Thrown*/ String Id_5 = Next_6.getId();
							//
							accumulator_5.add(Id_5);
						}
						/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_6 = ValueUtil.createBagAccumulatorValue(ConversationalGameTables.BAG_PRIMid_String);
						Iterator<Object> ITERATOR_i_2 = collect_2.iterator();
						/*@Thrown*/ BagValue select_2;
						while (true) {
							if (!ITERATOR_i_2.hasNext()) {
								select_2 = accumulator_6;
								break;
							}
							/*@NonInvalid*/ String i_2 = (String)ITERATOR_i_2.next();
							/**
							 * i <> self.Id
							 */
							final /*@NonInvalid*/ String Id_6 = this.getId();
							final /*@NonInvalid*/ boolean ne_2 = (i_2 != null) ? !i_2.equals(Id_6) : (Id_6 != null);
							//
							if (ne_2) {
								accumulator_6.add(i_2);
							}
						}
						final /*@Thrown*/ boolean wgoback = CollectionIsEmptyOperation.INSTANCE.evaluate(select_2).booleanValue();
						CAUGHT_wgoback = wgoback;
					}
					catch (Exception e) {
						CAUGHT_wgoback = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_ngoback == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_sgoback == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_ngoback instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_ngoback;
									}
									if (CAUGHT_sgoback instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_sgoback;
									}
									and = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0;
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_egoback == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and;
								}
								if (CAUGHT_egoback instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_egoback;
								}
								if (CAUGHT_and == null) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_1;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					}
					else {
						if (CAUGHT_wgoback == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_wgoback instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_wgoback;
							}
							if (CAUGHT_and_0 == null) {
								and_1 = null;
							}
							else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_and_1 = and_1;
				}
				catch (Exception e) {
					CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_and_1, ConversationalGameTables.INT_0).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationalGamePackage.ROOM__NORTH:
				return basicSetNorth(null, msgs);
			case ConversationalGamePackage.ROOM__SOUTH:
				return basicSetSouth(null, msgs);
			case ConversationalGamePackage.ROOM__EAST:
				return basicSetEast(null, msgs);
			case ConversationalGamePackage.ROOM__WEST:
				return basicSetWest(null, msgs);
			case ConversationalGamePackage.ROOM__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ConversationalGamePackage.ROOM__NPCS:
				return ((InternalEList<?>)getNpcs()).basicRemove(otherEnd, msgs);
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
			case ConversationalGamePackage.ROOM__NORTH:
				return getNorth();
			case ConversationalGamePackage.ROOM__SOUTH:
				return getSouth();
			case ConversationalGamePackage.ROOM__EAST:
				return getEast();
			case ConversationalGamePackage.ROOM__WEST:
				return getWest();
			case ConversationalGamePackage.ROOM__ID:
				return getId();
			case ConversationalGamePackage.ROOM__ITEMS:
				return getItems();
			case ConversationalGamePackage.ROOM__NPCS:
				return getNpcs();
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
			case ConversationalGamePackage.ROOM__NORTH:
				setNorth((Door)newValue);
				return;
			case ConversationalGamePackage.ROOM__SOUTH:
				setSouth((Door)newValue);
				return;
			case ConversationalGamePackage.ROOM__EAST:
				setEast((Door)newValue);
				return;
			case ConversationalGamePackage.ROOM__WEST:
				setWest((Door)newValue);
				return;
			case ConversationalGamePackage.ROOM__ID:
				setId((String)newValue);
				return;
			case ConversationalGamePackage.ROOM__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ConversationalGamePackage.ROOM__NPCS:
				getNpcs().clear();
				getNpcs().addAll((Collection<? extends Npc>)newValue);
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
			case ConversationalGamePackage.ROOM__NORTH:
				setNorth((Door)null);
				return;
			case ConversationalGamePackage.ROOM__SOUTH:
				setSouth((Door)null);
				return;
			case ConversationalGamePackage.ROOM__EAST:
				setEast((Door)null);
				return;
			case ConversationalGamePackage.ROOM__WEST:
				setWest((Door)null);
				return;
			case ConversationalGamePackage.ROOM__ID:
				setId(ID_EDEFAULT);
				return;
			case ConversationalGamePackage.ROOM__ITEMS:
				getItems().clear();
				return;
			case ConversationalGamePackage.ROOM__NPCS:
				getNpcs().clear();
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
			case ConversationalGamePackage.ROOM__NORTH:
				return north != null;
			case ConversationalGamePackage.ROOM__SOUTH:
				return south != null;
			case ConversationalGamePackage.ROOM__EAST:
				return east != null;
			case ConversationalGamePackage.ROOM__WEST:
				return west != null;
			case ConversationalGamePackage.ROOM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConversationalGamePackage.ROOM__ITEMS:
				return items != null && !items.isEmpty();
			case ConversationalGamePackage.ROOM__NPCS:
				return npcs != null && !npcs.isEmpty();
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
			case ConversationalGamePackage.ROOM___ID_UNIQUE_ROOM__DIAGNOSTICCHAIN_MAP:
				return idUniqueRoom((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConversationalGamePackage.ROOM___NO_SELF_NAVIGATION__DIAGNOSTICCHAIN_MAP:
				return NoSelfNavigation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConversationalGamePackage.ROOM___AT_LEAST_ONE__DIAGNOSTICCHAIN_MAP:
				return atLeastOne((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConversationalGamePackage.ROOM___GO_AND_BACK__DIAGNOSTICCHAIN_MAP:
				return goAndBack((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
