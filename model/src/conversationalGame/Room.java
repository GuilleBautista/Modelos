/**
 */
package conversationalGame;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conversationalGame.Room#getNorth <em>North</em>}</li>
 *   <li>{@link conversationalGame.Room#getSouth <em>South</em>}</li>
 *   <li>{@link conversationalGame.Room#getEast <em>East</em>}</li>
 *   <li>{@link conversationalGame.Room#getWest <em>West</em>}</li>
 *   <li>{@link conversationalGame.Room#getId <em>Id</em>}</li>
 *   <li>{@link conversationalGame.Room#getItems <em>Items</em>}</li>
 *   <li>{@link conversationalGame.Room#getNpcs <em>Npcs</em>}</li>
 * </ul>
 *
 * @see conversationalGame.ConversationalGamePackage#getRoom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='goAndBack'"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' containment reference.
	 * @see #setNorth(Door)
	 * @see conversationalGame.ConversationalGamePackage#getRoom_North()
	 * @model containment="true"
	 * @generated
	 */
	Door getNorth();

	/**
	 * Sets the value of the '{@link conversationalGame.Room#getNorth <em>North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' containment reference.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(Door value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' containment reference.
	 * @see #setSouth(Door)
	 * @see conversationalGame.ConversationalGamePackage#getRoom_South()
	 * @model containment="true"
	 * @generated
	 */
	Door getSouth();

	/**
	 * Sets the value of the '{@link conversationalGame.Room#getSouth <em>South</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' containment reference.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(Door value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' containment reference.
	 * @see #setEast(Door)
	 * @see conversationalGame.ConversationalGamePackage#getRoom_East()
	 * @model containment="true"
	 * @generated
	 */
	Door getEast();

	/**
	 * Sets the value of the '{@link conversationalGame.Room#getEast <em>East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' containment reference.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(Door value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' containment reference.
	 * @see #setWest(Door)
	 * @see conversationalGame.ConversationalGamePackage#getRoom_West()
	 * @model containment="true"
	 * @generated
	 */
	Door getWest();

	/**
	 * Sets the value of the '{@link conversationalGame.Room#getWest <em>West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' containment reference.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(Door value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see conversationalGame.ConversationalGamePackage#getRoom_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link conversationalGame.Room#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getRoom_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Npcs</b></em>' containment reference list.
	 * The list contents are of type {@link conversationalGame.Npc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Npcs</em>' containment reference list.
	 * @see conversationalGame.ConversationalGamePackage#getRoom_Npcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Npc> getNpcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tRoom.allInstances()-&gt;isUnique(Id)\n\t\t'"
	 * @generated
	 */
	boolean idUniqueRoom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet ngo: Boolean = North-&gt;collect(d | d.oclAsType(Door).Next.Id)-&gt;select(i | i = self.Id)-&gt;isEmpty() in\n\t\t\tlet sgo: Boolean = South-&gt;collect(d | d.oclAsType(Door).Next.Id)-&gt;select(i | i = self.Id)-&gt;isEmpty() in\n\t\t\tlet ego: Boolean = East-&gt;collect(d | d.oclAsType(Door).Next.Id)-&gt;select(i | i = self.Id)-&gt;isEmpty() in\n\t\t\tlet wgo: Boolean = West-&gt;collect(d | d.oclAsType(Door).Next.Id)-&gt;select(i | i = self.Id)-&gt;isEmpty() in\n\t\t\tngo and sgo and ego and wgo'"
	 * @generated
	 */
	boolean NoSelfNavigation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet ndoor: Integer = North-&gt;collect(d | d.oclAsType(Door))-&gt;size() in\n\t\t\tlet sdoor: Integer = South-&gt;collect(d | d.oclAsType(Door))-&gt;size() in\n\t\t\tlet edoor: Integer = East-&gt;collect(d | d.oclAsType(Door))-&gt;size() in\n\t\t\tlet wdoor: Integer = West-&gt;collect(d | d.oclAsType(Door))-&gt;size() in\n\t\t\tndoor + sdoor + edoor + wdoor &gt;= 1'"
	 * @generated
	 */
	boolean atLeastOne(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlet ngoback: Boolean = North-&gt;collect(d | d.oclAsType(Door).Next.South.Next.Id)-&gt;select(i | i &lt;&gt; self.Id)-&gt;isEmpty() in\n\t\t\tlet sgoback: Boolean = South-&gt;collect(d | d.oclAsType(Door).Next.North.Next.Id)-&gt;select(i | i &lt;&gt; self.Id)-&gt;isEmpty() in\n\t\t\tlet egoback: Boolean = East-&gt;collect(d | d.oclAsType(Door).Next.West.Next.Id)-&gt;select(i | i &lt;&gt; self.Id)-&gt;isEmpty() in\n\t\t\tlet wgoback: Boolean = West-&gt;collect(d | d.oclAsType(Door).Next.East.Next.Id)-&gt;select(i | i &lt;&gt; self.Id)-&gt;isEmpty() in\n\t\t\tngoback and sgoback and egoback and wgoback'"
	 * @generated
	 */
	boolean goAndBack(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Room
