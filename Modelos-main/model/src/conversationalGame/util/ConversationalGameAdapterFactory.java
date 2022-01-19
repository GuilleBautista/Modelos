/**
 */
package conversationalGame.util;

import conversationalGame.AnswerConsequence;
import conversationalGame.CharacterAction;
import conversationalGame.Consequence;
import conversationalGame.ConsequenceGiveItem;
import conversationalGame.ConsequenceSpawnItem;
import conversationalGame.ConversationalGamePackage;
import conversationalGame.Door;
import conversationalGame.Game;
import conversationalGame.Item;
import conversationalGame.ItemAction;
import conversationalGame.ItemTrigger;
import conversationalGame.Npc;
import conversationalGame.NpcTrigger;
import conversationalGame.Player;
import conversationalGame.PlayerTrigger;
import conversationalGame.Room;
import conversationalGame.RoomConsequence;
import conversationalGame.RoomTrigger;
import conversationalGame.Stat;
import conversationalGame.StatConsequence;
import conversationalGame.Trigger;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see conversationalGame.ConversationalGamePackage
 * @generated
 */
public class ConversationalGameAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConversationalGamePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationalGameAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConversationalGamePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationalGameSwitch<Adapter> modelSwitch =
		new ConversationalGameSwitch<Adapter>() {
			@Override
			public Adapter caseGame(Game object) {
				return createGameAdapter();
			}
			@Override
			public Adapter caseCharacter(conversationalGame.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseNpc(Npc object) {
				return createNpcAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseItemAction(ItemAction object) {
				return createItemActionAdapter();
			}
			@Override
			public Adapter caseCharacterAction(CharacterAction object) {
				return createCharacterActionAdapter();
			}
			@Override
			public Adapter caseStatConsequence(StatConsequence object) {
				return createStatConsequenceAdapter();
			}
			@Override
			public Adapter caseConsequenceGiveItem(ConsequenceGiveItem object) {
				return createConsequenceGiveItemAdapter();
			}
			@Override
			public Adapter caseConsequenceSpawnItem(ConsequenceSpawnItem object) {
				return createConsequenceSpawnItemAdapter();
			}
			@Override
			public Adapter caseRoomConsequence(RoomConsequence object) {
				return createRoomConsequenceAdapter();
			}
			@Override
			public Adapter caseDoor(Door object) {
				return createDoorAdapter();
			}
			@Override
			public Adapter caseAnswerConsequence(AnswerConsequence object) {
				return createAnswerConsequenceAdapter();
			}
			@Override
			public Adapter caseStat(Stat object) {
				return createStatAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseRoomTrigger(RoomTrigger object) {
				return createRoomTriggerAdapter();
			}
			@Override
			public Adapter caseItemTrigger(ItemTrigger object) {
				return createItemTriggerAdapter();
			}
			@Override
			public Adapter caseNpcTrigger(NpcTrigger object) {
				return createNpcTriggerAdapter();
			}
			@Override
			public Adapter casePlayerTrigger(PlayerTrigger object) {
				return createPlayerTriggerAdapter();
			}
			@Override
			public Adapter caseConsequence(Consequence object) {
				return createConsequenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Npc <em>Npc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Npc
	 * @generated
	 */
	public Adapter createNpcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.ItemAction <em>Item Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.ItemAction
	 * @generated
	 */
	public Adapter createItemActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.CharacterAction <em>Character Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.CharacterAction
	 * @generated
	 */
	public Adapter createCharacterActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.StatConsequence <em>Stat Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.StatConsequence
	 * @generated
	 */
	public Adapter createStatConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.ConsequenceGiveItem <em>Consequence Give Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.ConsequenceGiveItem
	 * @generated
	 */
	public Adapter createConsequenceGiveItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.ConsequenceSpawnItem <em>Consequence Spawn Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.ConsequenceSpawnItem
	 * @generated
	 */
	public Adapter createConsequenceSpawnItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.RoomConsequence <em>Room Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.RoomConsequence
	 * @generated
	 */
	public Adapter createRoomConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.AnswerConsequence <em>Answer Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.AnswerConsequence
	 * @generated
	 */
	public Adapter createAnswerConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Stat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Stat
	 * @generated
	 */
	public Adapter createStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.RoomTrigger <em>Room Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.RoomTrigger
	 * @generated
	 */
	public Adapter createRoomTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.ItemTrigger <em>Item Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.ItemTrigger
	 * @generated
	 */
	public Adapter createItemTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.NpcTrigger <em>Npc Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.NpcTrigger
	 * @generated
	 */
	public Adapter createNpcTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.PlayerTrigger <em>Player Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.PlayerTrigger
	 * @generated
	 */
	public Adapter createPlayerTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conversationalGame.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conversationalGame.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConversationalGameAdapterFactory
