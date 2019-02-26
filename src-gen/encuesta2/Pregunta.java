/**
 */
package encuesta2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.Pregunta#getOpciones <em>Opciones</em>}</li>
 *   <li>{@link encuesta2.Pregunta#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link encuesta2.Pregunta#getPrefijo <em>Prefijo</em>}</li>
 * </ul>
 *
 * @see encuesta2.Encuesta2Package#getPregunta()
 * @model abstract="true"
 * @generated
 */
public interface Pregunta extends Elemento {
	/**
	 * Returns the value of the '<em><b>Opciones</b></em>' containment reference list.
	 * The list contents are of type {@link encuesta2.OpcionRespuesta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opciones</em>' containment reference list.
	 * @see encuesta2.Encuesta2Package#getPregunta_Opciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpcionRespuesta> getOpciones();

	/**
	 * Returns the value of the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enunciado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enunciado</em>' attribute.
	 * @see #setEnunciado(String)
	 * @see encuesta2.Encuesta2Package#getPregunta_Enunciado()
	 * @model
	 * @generated
	 */
	String getEnunciado();

	/**
	 * Sets the value of the '{@link encuesta2.Pregunta#getEnunciado <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enunciado</em>' attribute.
	 * @see #getEnunciado()
	 * @generated
	 */
	void setEnunciado(String value);

	/**
	 * Returns the value of the '<em><b>Prefijo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefijo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefijo</em>' attribute.
	 * @see #setPrefijo(String)
	 * @see encuesta2.Encuesta2Package#getPregunta_Prefijo()
	 * @model
	 * @generated
	 */
	String getPrefijo();

	/**
	 * Sets the value of the '{@link encuesta2.Pregunta#getPrefijo <em>Prefijo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefijo</em>' attribute.
	 * @see #getPrefijo()
	 * @generated
	 */
	void setPrefijo(String value);

} // Pregunta
