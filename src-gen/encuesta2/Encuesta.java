/**
 */
package encuesta2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.Encuesta#getModulos <em>Modulos</em>}</li>
 *   <li>{@link encuesta2.Encuesta#getNavegacion <em>Navegacion</em>}</li>
 *   <li>{@link encuesta2.Encuesta#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see encuesta2.Encuesta2Package#getEncuesta()
 * @model
 * @generated
 */
public interface Encuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulos</b></em>' containment reference list.
	 * The list contents are of type {@link encuesta2.Modulo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulos</em>' containment reference list.
	 * @see encuesta2.Encuesta2Package#getEncuesta_Modulos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Modulo> getModulos();

	/**
	 * Returns the value of the '<em><b>Navegacion</b></em>' containment reference list.
	 * The list contents are of type {@link encuesta2.Navegacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegacion</em>' containment reference list.
	 * @see encuesta2.Encuesta2Package#getEncuesta_Navegacion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Navegacion> getNavegacion();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see encuesta2.Encuesta2Package#getEncuesta_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link encuesta2.Encuesta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Encuesta
