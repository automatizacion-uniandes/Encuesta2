/**
 */
package encuesta2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see encuesta2.Encuesta2Package
 * @generated
 */
public interface Encuesta2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Encuesta2Factory eINSTANCE = encuesta2.impl.Encuesta2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encuesta</em>'.
	 * @generated
	 */
	Encuesta createEncuesta();

	/**
	 * Returns a new object of class '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modulo</em>'.
	 * @generated
	 */
	Modulo createModulo();

	/**
	 * Returns a new object of class '<em>Unica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unica</em>'.
	 * @generated
	 */
	Unica createUnica();

	/**
	 * Returns a new object of class '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple</em>'.
	 * @generated
	 */
	Multiple createMultiple();

	/**
	 * Returns a new object of class '<em>Abierta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abierta</em>'.
	 * @generated
	 */
	Abierta createAbierta();

	/**
	 * Returns a new object of class '<em>Navegacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navegacion</em>'.
	 * @generated
	 */
	Navegacion createNavegacion();

	/**
	 * Returns a new object of class '<em>Opcion Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opcion Respuesta</em>'.
	 * @generated
	 */
	OpcionRespuesta createOpcionRespuesta();

	/**
	 * Returns a new object of class '<em>Nodo Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodo Inicio</em>'.
	 * @generated
	 */
	NodoInicio createNodoInicio();

	/**
	 * Returns a new object of class '<em>Nodo Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodo Fin</em>'.
	 * @generated
	 */
	NodoFin createNodoFin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Encuesta2Package getEncuesta2Package();

} //Encuesta2Factory
