/**
 */
package encuesta2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navegacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.Navegacion#getDesde <em>Desde</em>}</li>
 *   <li>{@link encuesta2.Navegacion#getHacia <em>Hacia</em>}</li>
 * </ul>
 *
 * @see encuesta2.Encuesta2Package#getNavegacion()
 * @model
 * @generated
 */
public interface Navegacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Desde</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desde</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desde</em>' reference.
	 * @see #setDesde(Elemento)
	 * @see encuesta2.Encuesta2Package#getNavegacion_Desde()
	 * @model required="true"
	 * @generated
	 */
	Elemento getDesde();

	/**
	 * Sets the value of the '{@link encuesta2.Navegacion#getDesde <em>Desde</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desde</em>' reference.
	 * @see #getDesde()
	 * @generated
	 */
	void setDesde(Elemento value);

	/**
	 * Returns the value of the '<em><b>Hacia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hacia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hacia</em>' reference.
	 * @see #setHacia(Elemento)
	 * @see encuesta2.Encuesta2Package#getNavegacion_Hacia()
	 * @model required="true"
	 * @generated
	 */
	Elemento getHacia();

	/**
	 * Sets the value of the '{@link encuesta2.Navegacion#getHacia <em>Hacia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hacia</em>' reference.
	 * @see #getHacia()
	 * @generated
	 */
	void setHacia(Elemento value);

} // Navegacion
