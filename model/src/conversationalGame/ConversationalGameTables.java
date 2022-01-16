/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ConversationalGame/model/dsl.ecore
 * using:
 *   /ConversationalGame/model/dsl.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package conversationalGame;

// import conversationalGame.ConversationalGamePackage;
// import conversationalGame.ConversationalGameTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ConversationalGameTables provides the dispatch tables for the conversationalGame for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ConversationalGameTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ConversationalGamePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_var = IdManager.getNsURIPackageId("http://www.example.org/var", null, ConversationalGamePackage.eINSTANCE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_PRIMid_String = TypeId.BAG.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActionNewItem = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("ActionNewItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ActionTrigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("ActionTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ConversationalGameTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Door = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Door", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Game = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Game", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ItemTrigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("ItemTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Npc = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Npc", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NpcTrigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("NpcTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Player = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Player", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PlayerTrigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("PlayerTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Room = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Room", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RoomAction = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("RoomAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RoomTrigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("RoomTrigger", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Stat = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Stat", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StatAction = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("StatAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Trigger = ConversationalGameTables.PACKid_http_c_s_s_www_example_org_s_var.getClassId("Trigger", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ConversationalGameTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Action = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_Action);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ActionNewItem = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_ActionNewItem);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ActionTrigger = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_ActionTrigger);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Door = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_Door);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Game = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_Game);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Item = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ItemTrigger = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_ItemTrigger);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NpcTrigger = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_NpcTrigger);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Player = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_Player);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PlayerTrigger = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_PlayerTrigger);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_RoomAction = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_RoomAction);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_RoomTrigger = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_RoomTrigger);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StatAction = TypeId.BAG.getSpecializedId(ConversationalGameTables.CLSSid_StatAction);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Action);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Item = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Npc = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Npc);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Room = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Room);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Stat = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Stat);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Trigger = TypeId.ORDERED_SET.getSpecializedId(ConversationalGameTables.CLSSid_Trigger);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Door = TypeId.SET.getSpecializedId(ConversationalGameTables.CLSSid_Door);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Item = TypeId.SET.getSpecializedId(ConversationalGameTables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Room = TypeId.SET.getSpecializedId(ConversationalGameTables.CLSSid_Room);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ConversationalGameTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(ConversationalGamePackage.Literals.ACTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ActionNewItem = new EcoreExecutorType(ConversationalGamePackage.Literals.ACTION_NEW_ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _ActionTrigger = new EcoreExecutorType(ConversationalGamePackage.Literals.ACTION_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _AskAction = new EcoreExecutorType(ConversationalGamePackage.Literals.ASK_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Door = new EcoreExecutorType(ConversationalGamePackage.Literals.DOOR, PACKAGE, 0);
		public static final EcoreExecutorType _Game = new EcoreExecutorType(ConversationalGamePackage.Literals.GAME, PACKAGE, 0);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(ConversationalGamePackage.Literals.ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _ItemTrigger = new EcoreExecutorType(ConversationalGamePackage.Literals.ITEM_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _Npc = new EcoreExecutorType(ConversationalGamePackage.Literals.NPC, PACKAGE, 0);
		public static final EcoreExecutorType _NpcTrigger = new EcoreExecutorType(ConversationalGamePackage.Literals.NPC_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _Player = new EcoreExecutorType(ConversationalGamePackage.Literals.PLAYER, PACKAGE, 0);
		public static final EcoreExecutorType _PlayerTrigger = new EcoreExecutorType(ConversationalGamePackage.Literals.PLAYER_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _Room = new EcoreExecutorType(ConversationalGamePackage.Literals.ROOM, PACKAGE, 0);
		public static final EcoreExecutorType _RoomAction = new EcoreExecutorType(ConversationalGamePackage.Literals.ROOM_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _RoomTrigger = new EcoreExecutorType(ConversationalGamePackage.Literals.ROOM_TRIGGER, PACKAGE, 0);
		public static final EcoreExecutorType _Stat = new EcoreExecutorType(ConversationalGamePackage.Literals.STAT, PACKAGE, 0);
		public static final EcoreExecutorType _StatAction = new EcoreExecutorType(ConversationalGamePackage.Literals.STAT_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Trigger = new EcoreExecutorType(ConversationalGamePackage.Literals.TRIGGER, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_ActionNewItem,
			_ActionTrigger,
			_AskAction,
			_Door,
			_Game,
			_Item,
			_ItemTrigger,
			_Npc,
			_NpcTrigger,
			_Player,
			_PlayerTrigger,
			_Room,
			_RoomAction,
			_RoomTrigger,
			_Stat,
			_StatAction,
			_Trigger
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, ConversationalGameTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActionNewItem__Action = new ExecutorFragment(Types._ActionNewItem, ConversationalGameTables.Types._Action);
		private static final ExecutorFragment _ActionNewItem__ActionNewItem = new ExecutorFragment(Types._ActionNewItem, ConversationalGameTables.Types._ActionNewItem);
		private static final ExecutorFragment _ActionNewItem__OclAny = new ExecutorFragment(Types._ActionNewItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActionNewItem__OclElement = new ExecutorFragment(Types._ActionNewItem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActionTrigger__ActionTrigger = new ExecutorFragment(Types._ActionTrigger, ConversationalGameTables.Types._ActionTrigger);
		private static final ExecutorFragment _ActionTrigger__OclAny = new ExecutorFragment(Types._ActionTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActionTrigger__OclElement = new ExecutorFragment(Types._ActionTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ActionTrigger__Trigger = new ExecutorFragment(Types._ActionTrigger, ConversationalGameTables.Types._Trigger);

		private static final ExecutorFragment _AskAction__Action = new ExecutorFragment(Types._AskAction, ConversationalGameTables.Types._Action);
		private static final ExecutorFragment _AskAction__AskAction = new ExecutorFragment(Types._AskAction, ConversationalGameTables.Types._AskAction);
		private static final ExecutorFragment _AskAction__OclAny = new ExecutorFragment(Types._AskAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AskAction__OclElement = new ExecutorFragment(Types._AskAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Door__Door = new ExecutorFragment(Types._Door, ConversationalGameTables.Types._Door);
		private static final ExecutorFragment _Door__OclAny = new ExecutorFragment(Types._Door, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Door__OclElement = new ExecutorFragment(Types._Door, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Game__Game = new ExecutorFragment(Types._Game, ConversationalGameTables.Types._Game);
		private static final ExecutorFragment _Game__OclAny = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Game__OclElement = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, ConversationalGameTables.Types._Item);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItemTrigger__ItemTrigger = new ExecutorFragment(Types._ItemTrigger, ConversationalGameTables.Types._ItemTrigger);
		private static final ExecutorFragment _ItemTrigger__OclAny = new ExecutorFragment(Types._ItemTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItemTrigger__OclElement = new ExecutorFragment(Types._ItemTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ItemTrigger__Trigger = new ExecutorFragment(Types._ItemTrigger, ConversationalGameTables.Types._Trigger);

		private static final ExecutorFragment _Npc__Npc = new ExecutorFragment(Types._Npc, ConversationalGameTables.Types._Npc);
		private static final ExecutorFragment _Npc__OclAny = new ExecutorFragment(Types._Npc, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Npc__OclElement = new ExecutorFragment(Types._Npc, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NpcTrigger__NpcTrigger = new ExecutorFragment(Types._NpcTrigger, ConversationalGameTables.Types._NpcTrigger);
		private static final ExecutorFragment _NpcTrigger__OclAny = new ExecutorFragment(Types._NpcTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NpcTrigger__OclElement = new ExecutorFragment(Types._NpcTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NpcTrigger__Trigger = new ExecutorFragment(Types._NpcTrigger, ConversationalGameTables.Types._Trigger);

		private static final ExecutorFragment _Player__OclAny = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Player__OclElement = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Player__Player = new ExecutorFragment(Types._Player, ConversationalGameTables.Types._Player);

		private static final ExecutorFragment _PlayerTrigger__OclAny = new ExecutorFragment(Types._PlayerTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PlayerTrigger__OclElement = new ExecutorFragment(Types._PlayerTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PlayerTrigger__PlayerTrigger = new ExecutorFragment(Types._PlayerTrigger, ConversationalGameTables.Types._PlayerTrigger);
		private static final ExecutorFragment _PlayerTrigger__Trigger = new ExecutorFragment(Types._PlayerTrigger, ConversationalGameTables.Types._Trigger);

		private static final ExecutorFragment _Room__OclAny = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Room__OclElement = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Room__Room = new ExecutorFragment(Types._Room, ConversationalGameTables.Types._Room);

		private static final ExecutorFragment _RoomAction__Action = new ExecutorFragment(Types._RoomAction, ConversationalGameTables.Types._Action);
		private static final ExecutorFragment _RoomAction__OclAny = new ExecutorFragment(Types._RoomAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RoomAction__OclElement = new ExecutorFragment(Types._RoomAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RoomAction__RoomAction = new ExecutorFragment(Types._RoomAction, ConversationalGameTables.Types._RoomAction);

		private static final ExecutorFragment _RoomTrigger__OclAny = new ExecutorFragment(Types._RoomTrigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RoomTrigger__OclElement = new ExecutorFragment(Types._RoomTrigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RoomTrigger__RoomTrigger = new ExecutorFragment(Types._RoomTrigger, ConversationalGameTables.Types._RoomTrigger);
		private static final ExecutorFragment _RoomTrigger__Trigger = new ExecutorFragment(Types._RoomTrigger, ConversationalGameTables.Types._Trigger);

		private static final ExecutorFragment _Stat__OclAny = new ExecutorFragment(Types._Stat, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Stat__OclElement = new ExecutorFragment(Types._Stat, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Stat__Stat = new ExecutorFragment(Types._Stat, ConversationalGameTables.Types._Stat);

		private static final ExecutorFragment _StatAction__Action = new ExecutorFragment(Types._StatAction, ConversationalGameTables.Types._Action);
		private static final ExecutorFragment _StatAction__OclAny = new ExecutorFragment(Types._StatAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StatAction__OclElement = new ExecutorFragment(Types._StatAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StatAction__StatAction = new ExecutorFragment(Types._StatAction, ConversationalGameTables.Types._StatAction);

		private static final ExecutorFragment _Trigger__OclAny = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Trigger__OclElement = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Trigger__Trigger = new ExecutorFragment(Types._Trigger, ConversationalGameTables.Types._Trigger);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__Consequence = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__CONSEQUENCE, Types._Action, 0);
		public static final ExecutorProperty _Action__Description = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__DESCRIPTION, Types._Action, 1);
		public static final ExecutorProperty _Action__Message = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__MESSAGE, Types._Action, 2);
		public static final ExecutorProperty _Action__Name = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__NAME, Types._Action, 3);
		public static final ExecutorProperty _Action__Npcs = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__NPCS, Types._Action, 4);
		public static final ExecutorProperty _Action__Player = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION__PLAYER, Types._Action, 5);
		public static final ExecutorProperty _Action__Action__Consequence = new ExecutorPropertyWithImplementation("Action", Types._Action, 6, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ACTION__CONSEQUENCE));
		public static final ExecutorProperty _Action__ActionTrigger__Action = new ExecutorPropertyWithImplementation("ActionTrigger", Types._Action, 7, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ACTION_TRIGGER__ACTION));
		public static final ExecutorProperty _Action__Item__Actions = new ExecutorPropertyWithImplementation("Item", Types._Action, 8, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ITEM__ACTIONS));

		public static final ExecutorProperty _ActionNewItem__NewItems = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION_NEW_ITEM__NEW_ITEMS, Types._ActionNewItem, 0);

		public static final ExecutorProperty _ActionTrigger__Action = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ACTION_TRIGGER__ACTION, Types._ActionTrigger, 0);

		public static final ExecutorProperty _AskAction__Answer = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ASK_ACTION__ANSWER, Types._AskAction, 0);
		public static final ExecutorProperty _AskAction__Question = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ASK_ACTION__QUESTION, Types._AskAction, 1);

		public static final ExecutorProperty _Door__Id = new EcoreExecutorProperty(ConversationalGamePackage.Literals.DOOR__ID, Types._Door, 0);
		public static final ExecutorProperty _Door__Next = new EcoreExecutorProperty(ConversationalGamePackage.Literals.DOOR__NEXT, Types._Door, 1);
		public static final ExecutorProperty _Door__Open = new EcoreExecutorProperty(ConversationalGamePackage.Literals.DOOR__OPEN, Types._Door, 2);
		public static final ExecutorProperty _Door__Room__East = new ExecutorPropertyWithImplementation("Room", Types._Door, 3, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__EAST));
		public static final ExecutorProperty _Door__Room__North = new ExecutorPropertyWithImplementation("Room", Types._Door, 4, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__NORTH));
		public static final ExecutorProperty _Door__Room__South = new ExecutorPropertyWithImplementation("Room", Types._Door, 5, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__SOUTH));
		public static final ExecutorProperty _Door__Room__West = new ExecutorPropertyWithImplementation("Room", Types._Door, 6, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__WEST));
		public static final ExecutorProperty _Door__RoomAction__Door = new ExecutorPropertyWithImplementation("RoomAction", Types._Door, 7, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM_ACTION__DOOR));

		public static final ExecutorProperty _Game__Player = new EcoreExecutorProperty(ConversationalGamePackage.Literals.GAME__PLAYER, Types._Game, 0);
		public static final ExecutorProperty _Game__RoomList = new EcoreExecutorProperty(ConversationalGamePackage.Literals.GAME__ROOM_LIST, Types._Game, 1);
		public static final ExecutorProperty _Game__SpawnRoom = new EcoreExecutorProperty(ConversationalGamePackage.Literals.GAME__SPAWN_ROOM, Types._Game, 2);
		public static final ExecutorProperty _Game__TriggerList = new EcoreExecutorProperty(ConversationalGamePackage.Literals.GAME__TRIGGER_LIST, Types._Game, 3);

		public static final ExecutorProperty _Item__Actions = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ITEM__ACTIONS, Types._Item, 0);
		public static final ExecutorProperty _Item__Id = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ITEM__ID, Types._Item, 1);
		public static final ExecutorProperty _Item__Name = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ITEM__NAME, Types._Item, 2);
		public static final ExecutorProperty _Item__ActionNewItem__NewItems = new ExecutorPropertyWithImplementation("ActionNewItem", Types._Item, 3, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ACTION_NEW_ITEM__NEW_ITEMS));
		public static final ExecutorProperty _Item__ItemTrigger__Item = new ExecutorPropertyWithImplementation("ItemTrigger", Types._Item, 4, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ITEM_TRIGGER__ITEM));
		public static final ExecutorProperty _Item__Npc__Inventory = new ExecutorPropertyWithImplementation("Npc", Types._Item, 5, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.NPC__INVENTORY));
		public static final ExecutorProperty _Item__Player__Inventory = new ExecutorPropertyWithImplementation("Player", Types._Item, 6, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.PLAYER__INVENTORY));
		public static final ExecutorProperty _Item__Room__Items = new ExecutorPropertyWithImplementation("Room", Types._Item, 7, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__ITEMS));

		public static final ExecutorProperty _ItemTrigger__Item = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ITEM_TRIGGER__ITEM, Types._ItemTrigger, 0);

		public static final ExecutorProperty _Npc__Dead = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC__DEAD, Types._Npc, 0);
		public static final ExecutorProperty _Npc__Greeting = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC__GREETING, Types._Npc, 1);
		public static final ExecutorProperty _Npc__Inventory = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC__INVENTORY, Types._Npc, 2);
		public static final ExecutorProperty _Npc__Name = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC__NAME, Types._Npc, 3);
		public static final ExecutorProperty _Npc__Stats = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC__STATS, Types._Npc, 4);
		public static final ExecutorProperty _Npc__Action__Npcs = new ExecutorPropertyWithImplementation("Action", Types._Npc, 5, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ACTION__NPCS));
		public static final ExecutorProperty _Npc__NpcTrigger__Npc = new ExecutorPropertyWithImplementation("NpcTrigger", Types._Npc, 6, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.NPC_TRIGGER__NPC));
		public static final ExecutorProperty _Npc__Room__Npcs = new ExecutorPropertyWithImplementation("Room", Types._Npc, 7, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM__NPCS));

		public static final ExecutorProperty _NpcTrigger__Npc = new EcoreExecutorProperty(ConversationalGamePackage.Literals.NPC_TRIGGER__NPC, Types._NpcTrigger, 0);

		public static final ExecutorProperty _Player__CurrentRoom = new EcoreExecutorProperty(ConversationalGamePackage.Literals.PLAYER__CURRENT_ROOM, Types._Player, 0);
		public static final ExecutorProperty _Player__Dead = new EcoreExecutorProperty(ConversationalGamePackage.Literals.PLAYER__DEAD, Types._Player, 1);
		public static final ExecutorProperty _Player__Inventory = new EcoreExecutorProperty(ConversationalGamePackage.Literals.PLAYER__INVENTORY, Types._Player, 2);
		public static final ExecutorProperty _Player__Stats = new EcoreExecutorProperty(ConversationalGamePackage.Literals.PLAYER__STATS, Types._Player, 3);
		public static final ExecutorProperty _Player__Action__Player = new ExecutorPropertyWithImplementation("Action", Types._Player, 4, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ACTION__PLAYER));
		public static final ExecutorProperty _Player__Game__Player = new ExecutorPropertyWithImplementation("Game", Types._Player, 5, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.GAME__PLAYER));
		public static final ExecutorProperty _Player__PlayerTrigger__Player = new ExecutorPropertyWithImplementation("PlayerTrigger", Types._Player, 6, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.PLAYER_TRIGGER__PLAYER));

		public static final ExecutorProperty _PlayerTrigger__Player = new EcoreExecutorProperty(ConversationalGamePackage.Literals.PLAYER_TRIGGER__PLAYER, Types._PlayerTrigger, 0);

		public static final ExecutorProperty _Room__East = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__EAST, Types._Room, 0);
		public static final ExecutorProperty _Room__Id = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__ID, Types._Room, 1);
		public static final ExecutorProperty _Room__Items = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__ITEMS, Types._Room, 2);
		public static final ExecutorProperty _Room__North = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__NORTH, Types._Room, 3);
		public static final ExecutorProperty _Room__Npcs = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__NPCS, Types._Room, 4);
		public static final ExecutorProperty _Room__South = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__SOUTH, Types._Room, 5);
		public static final ExecutorProperty _Room__West = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM__WEST, Types._Room, 6);
		public static final ExecutorProperty _Room__Door__Next = new ExecutorPropertyWithImplementation("Door", Types._Room, 7, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.DOOR__NEXT));
		public static final ExecutorProperty _Room__Game__RoomList = new ExecutorPropertyWithImplementation("Game", Types._Room, 8, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.GAME__ROOM_LIST));
		public static final ExecutorProperty _Room__Game__SpawnRoom = new ExecutorPropertyWithImplementation("Game", Types._Room, 9, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.GAME__SPAWN_ROOM));
		public static final ExecutorProperty _Room__Player__CurrentRoom = new ExecutorPropertyWithImplementation("Player", Types._Room, 10, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.PLAYER__CURRENT_ROOM));
		public static final ExecutorProperty _Room__RoomTrigger__Room = new ExecutorPropertyWithImplementation("RoomTrigger", Types._Room, 11, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.ROOM_TRIGGER__ROOM));

		public static final ExecutorProperty _RoomAction__Door = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM_ACTION__DOOR, Types._RoomAction, 0);

		public static final ExecutorProperty _RoomTrigger__Room = new EcoreExecutorProperty(ConversationalGamePackage.Literals.ROOM_TRIGGER__ROOM, Types._RoomTrigger, 0);

		public static final ExecutorProperty _Stat__Name = new EcoreExecutorProperty(ConversationalGamePackage.Literals.STAT__NAME, Types._Stat, 0);
		public static final ExecutorProperty _Stat__Value = new EcoreExecutorProperty(ConversationalGamePackage.Literals.STAT__VALUE, Types._Stat, 1);
		public static final ExecutorProperty _Stat__Npc__Stats = new ExecutorPropertyWithImplementation("Npc", Types._Stat, 2, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.NPC__STATS));
		public static final ExecutorProperty _Stat__Player__Stats = new ExecutorPropertyWithImplementation("Player", Types._Stat, 3, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.PLAYER__STATS));
		public static final ExecutorProperty _Stat__StatAction__Stat = new ExecutorPropertyWithImplementation("StatAction", Types._Stat, 4, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.STAT_ACTION__STAT));

		public static final ExecutorProperty _StatAction__Stat = new EcoreExecutorProperty(ConversationalGamePackage.Literals.STAT_ACTION__STAT, Types._StatAction, 0);
		public static final ExecutorProperty _StatAction__Value = new EcoreExecutorProperty(ConversationalGamePackage.Literals.STAT_ACTION__VALUE, Types._StatAction, 1);

		public static final ExecutorProperty _Trigger__EndGame = new EcoreExecutorProperty(ConversationalGamePackage.Literals.TRIGGER__END_GAME, Types._Trigger, 0);
		public static final ExecutorProperty _Trigger__Id = new EcoreExecutorProperty(ConversationalGamePackage.Literals.TRIGGER__ID, Types._Trigger, 1);
		public static final ExecutorProperty _Trigger__Message = new EcoreExecutorProperty(ConversationalGamePackage.Literals.TRIGGER__MESSAGE, Types._Trigger, 2);
		public static final ExecutorProperty _Trigger__Triggered = new EcoreExecutorProperty(ConversationalGamePackage.Literals.TRIGGER__TRIGGERED, Types._Trigger, 3);
		public static final ExecutorProperty _Trigger__Game__TriggerList = new ExecutorPropertyWithImplementation("Game", Types._Trigger, 4, new EcoreLibraryOppositeProperty(ConversationalGamePackage.Literals.GAME__TRIGGER_LIST));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActionNewItem =
			{
				Fragments._ActionNewItem__OclAny /* 0 */,
				Fragments._ActionNewItem__OclElement /* 1 */,
				Fragments._ActionNewItem__Action /* 2 */,
				Fragments._ActionNewItem__ActionNewItem /* 3 */
			};
		private static final int /*@NonNull*/ [] __ActionNewItem = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActionTrigger =
			{
				Fragments._ActionTrigger__OclAny /* 0 */,
				Fragments._ActionTrigger__OclElement /* 1 */,
				Fragments._ActionTrigger__Trigger /* 2 */,
				Fragments._ActionTrigger__ActionTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __ActionTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AskAction =
			{
				Fragments._AskAction__OclAny /* 0 */,
				Fragments._AskAction__OclElement /* 1 */,
				Fragments._AskAction__Action /* 2 */,
				Fragments._AskAction__AskAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __AskAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Door =
			{
				Fragments._Door__OclAny /* 0 */,
				Fragments._Door__OclElement /* 1 */,
				Fragments._Door__Door /* 2 */
			};
		private static final int /*@NonNull*/ [] __Door = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Game =
			{
				Fragments._Game__OclAny /* 0 */,
				Fragments._Game__OclElement /* 1 */,
				Fragments._Game__Game /* 2 */
			};
		private static final int /*@NonNull*/ [] __Game = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__Item /* 2 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItemTrigger =
			{
				Fragments._ItemTrigger__OclAny /* 0 */,
				Fragments._ItemTrigger__OclElement /* 1 */,
				Fragments._ItemTrigger__Trigger /* 2 */,
				Fragments._ItemTrigger__ItemTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __ItemTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Npc =
			{
				Fragments._Npc__OclAny /* 0 */,
				Fragments._Npc__OclElement /* 1 */,
				Fragments._Npc__Npc /* 2 */
			};
		private static final int /*@NonNull*/ [] __Npc = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NpcTrigger =
			{
				Fragments._NpcTrigger__OclAny /* 0 */,
				Fragments._NpcTrigger__OclElement /* 1 */,
				Fragments._NpcTrigger__Trigger /* 2 */,
				Fragments._NpcTrigger__NpcTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __NpcTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Player =
			{
				Fragments._Player__OclAny /* 0 */,
				Fragments._Player__OclElement /* 1 */,
				Fragments._Player__Player /* 2 */
			};
		private static final int /*@NonNull*/ [] __Player = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PlayerTrigger =
			{
				Fragments._PlayerTrigger__OclAny /* 0 */,
				Fragments._PlayerTrigger__OclElement /* 1 */,
				Fragments._PlayerTrigger__Trigger /* 2 */,
				Fragments._PlayerTrigger__PlayerTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __PlayerTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Room =
			{
				Fragments._Room__OclAny /* 0 */,
				Fragments._Room__OclElement /* 1 */,
				Fragments._Room__Room /* 2 */
			};
		private static final int /*@NonNull*/ [] __Room = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RoomAction =
			{
				Fragments._RoomAction__OclAny /* 0 */,
				Fragments._RoomAction__OclElement /* 1 */,
				Fragments._RoomAction__Action /* 2 */,
				Fragments._RoomAction__RoomAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __RoomAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RoomTrigger =
			{
				Fragments._RoomTrigger__OclAny /* 0 */,
				Fragments._RoomTrigger__OclElement /* 1 */,
				Fragments._RoomTrigger__Trigger /* 2 */,
				Fragments._RoomTrigger__RoomTrigger /* 3 */
			};
		private static final int /*@NonNull*/ [] __RoomTrigger = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Stat =
			{
				Fragments._Stat__OclAny /* 0 */,
				Fragments._Stat__OclElement /* 1 */,
				Fragments._Stat__Stat /* 2 */
			};
		private static final int /*@NonNull*/ [] __Stat = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StatAction =
			{
				Fragments._StatAction__OclAny /* 0 */,
				Fragments._StatAction__OclElement /* 1 */,
				Fragments._StatAction__Action /* 2 */,
				Fragments._StatAction__StatAction /* 3 */
			};
		private static final int /*@NonNull*/ [] __StatAction = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Trigger =
			{
				Fragments._Trigger__OclAny /* 0 */,
				Fragments._Trigger__OclElement /* 1 */,
				Fragments._Trigger__Trigger /* 2 */
			};
		private static final int /*@NonNull*/ [] __Trigger = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._ActionNewItem.initFragments(_ActionNewItem, __ActionNewItem);
			Types._ActionTrigger.initFragments(_ActionTrigger, __ActionTrigger);
			Types._AskAction.initFragments(_AskAction, __AskAction);
			Types._Door.initFragments(_Door, __Door);
			Types._Game.initFragments(_Game, __Game);
			Types._Item.initFragments(_Item, __Item);
			Types._ItemTrigger.initFragments(_ItemTrigger, __ItemTrigger);
			Types._Npc.initFragments(_Npc, __Npc);
			Types._NpcTrigger.initFragments(_NpcTrigger, __NpcTrigger);
			Types._Player.initFragments(_Player, __Player);
			Types._PlayerTrigger.initFragments(_PlayerTrigger, __PlayerTrigger);
			Types._Room.initFragments(_Room, __Room);
			Types._RoomAction.initFragments(_RoomAction, __RoomAction);
			Types._RoomTrigger.initFragments(_RoomTrigger, __RoomTrigger);
			Types._Stat.initFragments(_Stat, __Stat);
			Types._StatAction.initFragments(_StatAction, __StatAction);
			Types._Trigger.initFragments(_Trigger, __Trigger);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActionNewItem__ActionNewItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionNewItem__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionNewItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionNewItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActionTrigger__ActionTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActionTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AskAction__AskAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AskAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AskAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AskAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Door__Door = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Door__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Door__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Game__Game = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItemTrigger__ItemTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Npc__Npc = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Npc__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Npc__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NpcTrigger__NpcTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NpcTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NpcTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NpcTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Player__Player = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PlayerTrigger__PlayerTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PlayerTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlayerTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PlayerTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Room__Room = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RoomAction__RoomAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RoomTrigger__RoomTrigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomTrigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomTrigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RoomTrigger__Trigger = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Stat__Stat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Stat__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Stat__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StatAction__StatAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StatAction__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StatAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StatAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__Trigger = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Trigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._ActionNewItem__Action.initOperations(_ActionNewItem__Action);
			Fragments._ActionNewItem__ActionNewItem.initOperations(_ActionNewItem__ActionNewItem);
			Fragments._ActionNewItem__OclAny.initOperations(_ActionNewItem__OclAny);
			Fragments._ActionNewItem__OclElement.initOperations(_ActionNewItem__OclElement);

			Fragments._ActionTrigger__ActionTrigger.initOperations(_ActionTrigger__ActionTrigger);
			Fragments._ActionTrigger__OclAny.initOperations(_ActionTrigger__OclAny);
			Fragments._ActionTrigger__OclElement.initOperations(_ActionTrigger__OclElement);
			Fragments._ActionTrigger__Trigger.initOperations(_ActionTrigger__Trigger);

			Fragments._AskAction__Action.initOperations(_AskAction__Action);
			Fragments._AskAction__AskAction.initOperations(_AskAction__AskAction);
			Fragments._AskAction__OclAny.initOperations(_AskAction__OclAny);
			Fragments._AskAction__OclElement.initOperations(_AskAction__OclElement);

			Fragments._Door__Door.initOperations(_Door__Door);
			Fragments._Door__OclAny.initOperations(_Door__OclAny);
			Fragments._Door__OclElement.initOperations(_Door__OclElement);

			Fragments._Game__Game.initOperations(_Game__Game);
			Fragments._Game__OclAny.initOperations(_Game__OclAny);
			Fragments._Game__OclElement.initOperations(_Game__OclElement);

			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._ItemTrigger__ItemTrigger.initOperations(_ItemTrigger__ItemTrigger);
			Fragments._ItemTrigger__OclAny.initOperations(_ItemTrigger__OclAny);
			Fragments._ItemTrigger__OclElement.initOperations(_ItemTrigger__OclElement);
			Fragments._ItemTrigger__Trigger.initOperations(_ItemTrigger__Trigger);

			Fragments._Npc__Npc.initOperations(_Npc__Npc);
			Fragments._Npc__OclAny.initOperations(_Npc__OclAny);
			Fragments._Npc__OclElement.initOperations(_Npc__OclElement);

			Fragments._NpcTrigger__NpcTrigger.initOperations(_NpcTrigger__NpcTrigger);
			Fragments._NpcTrigger__OclAny.initOperations(_NpcTrigger__OclAny);
			Fragments._NpcTrigger__OclElement.initOperations(_NpcTrigger__OclElement);
			Fragments._NpcTrigger__Trigger.initOperations(_NpcTrigger__Trigger);

			Fragments._Player__OclAny.initOperations(_Player__OclAny);
			Fragments._Player__OclElement.initOperations(_Player__OclElement);
			Fragments._Player__Player.initOperations(_Player__Player);

			Fragments._PlayerTrigger__OclAny.initOperations(_PlayerTrigger__OclAny);
			Fragments._PlayerTrigger__OclElement.initOperations(_PlayerTrigger__OclElement);
			Fragments._PlayerTrigger__PlayerTrigger.initOperations(_PlayerTrigger__PlayerTrigger);
			Fragments._PlayerTrigger__Trigger.initOperations(_PlayerTrigger__Trigger);

			Fragments._Room__OclAny.initOperations(_Room__OclAny);
			Fragments._Room__OclElement.initOperations(_Room__OclElement);
			Fragments._Room__Room.initOperations(_Room__Room);

			Fragments._RoomAction__Action.initOperations(_RoomAction__Action);
			Fragments._RoomAction__OclAny.initOperations(_RoomAction__OclAny);
			Fragments._RoomAction__OclElement.initOperations(_RoomAction__OclElement);
			Fragments._RoomAction__RoomAction.initOperations(_RoomAction__RoomAction);

			Fragments._RoomTrigger__OclAny.initOperations(_RoomTrigger__OclAny);
			Fragments._RoomTrigger__OclElement.initOperations(_RoomTrigger__OclElement);
			Fragments._RoomTrigger__RoomTrigger.initOperations(_RoomTrigger__RoomTrigger);
			Fragments._RoomTrigger__Trigger.initOperations(_RoomTrigger__Trigger);

			Fragments._Stat__OclAny.initOperations(_Stat__OclAny);
			Fragments._Stat__OclElement.initOperations(_Stat__OclElement);
			Fragments._Stat__Stat.initOperations(_Stat__Stat);

			Fragments._StatAction__Action.initOperations(_StatAction__Action);
			Fragments._StatAction__OclAny.initOperations(_StatAction__OclAny);
			Fragments._StatAction__OclElement.initOperations(_StatAction__OclElement);
			Fragments._StatAction__StatAction.initOperations(_StatAction__StatAction);

			Fragments._Trigger__OclAny.initOperations(_Trigger__OclAny);
			Fragments._Trigger__OclElement.initOperations(_Trigger__OclElement);
			Fragments._Trigger__Trigger.initOperations(_Trigger__Trigger);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			ConversationalGameTables.Properties._Action__Consequence,
			ConversationalGameTables.Properties._Action__Description,
			ConversationalGameTables.Properties._Action__Message,
			ConversationalGameTables.Properties._Action__Name,
			ConversationalGameTables.Properties._Action__Npcs,
			ConversationalGameTables.Properties._Action__Player,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActionNewItem = {
			ConversationalGameTables.Properties._Action__Consequence,
			ConversationalGameTables.Properties._Action__Description,
			ConversationalGameTables.Properties._Action__Message,
			ConversationalGameTables.Properties._Action__Name,
			ConversationalGameTables.Properties._ActionNewItem__NewItems,
			ConversationalGameTables.Properties._Action__Npcs,
			ConversationalGameTables.Properties._Action__Player,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActionTrigger = {
			ConversationalGameTables.Properties._ActionTrigger__Action,
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AskAction = {
			ConversationalGameTables.Properties._AskAction__Answer,
			ConversationalGameTables.Properties._Action__Consequence,
			ConversationalGameTables.Properties._Action__Description,
			ConversationalGameTables.Properties._Action__Message,
			ConversationalGameTables.Properties._Action__Name,
			ConversationalGameTables.Properties._Action__Npcs,
			ConversationalGameTables.Properties._Action__Player,
			ConversationalGameTables.Properties._AskAction__Question,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Door = {
			ConversationalGameTables.Properties._Door__Id,
			ConversationalGameTables.Properties._Door__Next,
			ConversationalGameTables.Properties._Door__Open,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Game = {
			ConversationalGameTables.Properties._Game__Player,
			ConversationalGameTables.Properties._Game__RoomList,
			ConversationalGameTables.Properties._Game__SpawnRoom,
			ConversationalGameTables.Properties._Game__TriggerList,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			ConversationalGameTables.Properties._Item__Actions,
			ConversationalGameTables.Properties._Item__Id,
			ConversationalGameTables.Properties._Item__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItemTrigger = {
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._ItemTrigger__Item,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Npc = {
			ConversationalGameTables.Properties._Npc__Dead,
			ConversationalGameTables.Properties._Npc__Greeting,
			ConversationalGameTables.Properties._Npc__Inventory,
			ConversationalGameTables.Properties._Npc__Name,
			ConversationalGameTables.Properties._Npc__Stats,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NpcTrigger = {
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._NpcTrigger__Npc,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Player = {
			ConversationalGameTables.Properties._Player__CurrentRoom,
			ConversationalGameTables.Properties._Player__Dead,
			ConversationalGameTables.Properties._Player__Inventory,
			ConversationalGameTables.Properties._Player__Stats,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PlayerTrigger = {
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._PlayerTrigger__Player,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Room = {
			ConversationalGameTables.Properties._Room__East,
			ConversationalGameTables.Properties._Room__Id,
			ConversationalGameTables.Properties._Room__Items,
			ConversationalGameTables.Properties._Room__North,
			ConversationalGameTables.Properties._Room__Npcs,
			ConversationalGameTables.Properties._Room__South,
			ConversationalGameTables.Properties._Room__West,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RoomAction = {
			ConversationalGameTables.Properties._Action__Consequence,
			ConversationalGameTables.Properties._Action__Description,
			ConversationalGameTables.Properties._RoomAction__Door,
			ConversationalGameTables.Properties._Action__Message,
			ConversationalGameTables.Properties._Action__Name,
			ConversationalGameTables.Properties._Action__Npcs,
			ConversationalGameTables.Properties._Action__Player,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RoomTrigger = {
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._RoomTrigger__Room,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Stat = {
			ConversationalGameTables.Properties._Stat__Name,
			ConversationalGameTables.Properties._Stat__Value,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StatAction = {
			ConversationalGameTables.Properties._Action__Consequence,
			ConversationalGameTables.Properties._Action__Description,
			ConversationalGameTables.Properties._Action__Message,
			ConversationalGameTables.Properties._Action__Name,
			ConversationalGameTables.Properties._Action__Npcs,
			ConversationalGameTables.Properties._Action__Player,
			ConversationalGameTables.Properties._StatAction__Stat,
			ConversationalGameTables.Properties._StatAction__Value,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Trigger = {
			ConversationalGameTables.Properties._Trigger__EndGame,
			ConversationalGameTables.Properties._Trigger__Id,
			ConversationalGameTables.Properties._Trigger__Message,
			ConversationalGameTables.Properties._Trigger__Triggered,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._ActionNewItem__ActionNewItem.initProperties(_ActionNewItem);
			Fragments._ActionTrigger__ActionTrigger.initProperties(_ActionTrigger);
			Fragments._AskAction__AskAction.initProperties(_AskAction);
			Fragments._Door__Door.initProperties(_Door);
			Fragments._Game__Game.initProperties(_Game);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._ItemTrigger__ItemTrigger.initProperties(_ItemTrigger);
			Fragments._Npc__Npc.initProperties(_Npc);
			Fragments._NpcTrigger__NpcTrigger.initProperties(_NpcTrigger);
			Fragments._Player__Player.initProperties(_Player);
			Fragments._PlayerTrigger__PlayerTrigger.initProperties(_PlayerTrigger);
			Fragments._Room__Room.initProperties(_Room);
			Fragments._RoomAction__RoomAction.initProperties(_RoomAction);
			Fragments._RoomTrigger__RoomTrigger.initProperties(_RoomTrigger);
			Fragments._Stat__Stat.initProperties(_Stat);
			Fragments._StatAction__StatAction.initProperties(_StatAction);
			Fragments._Trigger__Trigger.initProperties(_Trigger);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ConversationalGameTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ConversationalGameTables();
	}

	private ConversationalGameTables() {
		super(ConversationalGamePackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ConversationalGamePackage.Literals.DOOR,
		ConversationalGamePackage.Literals.ITEM,
		ConversationalGamePackage.Literals.ROOM
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
