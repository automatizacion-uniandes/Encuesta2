/**
 */
package encuesta2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.Nodo#getTexto <em>Texto</em>}</li>
 * </ul>
 *
 * @see encuesta2.Encuesta2Package#getNodo()
 * @model abstract="true"
 * @generated
 */
public interface Nodo extends Elemento {
	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see encuesta2.Encuesta2Package#getNodo_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link encuesta2.Nodo#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Nodo
