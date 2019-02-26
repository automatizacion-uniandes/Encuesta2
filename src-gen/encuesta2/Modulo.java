/**
 */
package encuesta2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.Modulo#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link encuesta2.Modulo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link encuesta2.Modulo#getNodos <em>Nodos</em>}</li>
 * </ul>
 *
 * @see encuesta2.Encuesta2Package#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Preguntas</b></em>' containment reference list.
	 * The list contents are of type {@link encuesta2.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preguntas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas</em>' containment reference list.
	 * @see encuesta2.Encuesta2Package#getModulo_Preguntas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pregunta> getPreguntas();

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
	 * @see encuesta2.Encuesta2Package#getModulo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link encuesta2.Modulo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link encuesta2.Nodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodos</em>' containment reference list.
	 * @see encuesta2.Encuesta2Package#getModulo_Nodos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Nodo> getNodos();

} // Modulo
