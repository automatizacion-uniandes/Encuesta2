/**
 */
package encuesta2.util;

import encuesta2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see encuesta2.Encuesta2Package
 * @generated
 */
public class Encuesta2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Encuesta2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta2Switch() {
		if (modelPackage == null) {
			modelPackage = Encuesta2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Encuesta2Package.ENCUESTA: {
			Encuesta encuesta = (Encuesta) theEObject;
			T result = caseEncuesta(encuesta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.MODULO: {
			Modulo modulo = (Modulo) theEObject;
			T result = caseModulo(modulo);
			if (result == null)
				result = caseElemento(modulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.PREGUNTA: {
			Pregunta pregunta = (Pregunta) theEObject;
			T result = casePregunta(pregunta);
			if (result == null)
				result = caseElemento(pregunta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.UNICA: {
			Unica unica = (Unica) theEObject;
			T result = caseUnica(unica);
			if (result == null)
				result = casePregunta(unica);
			if (result == null)
				result = caseElemento(unica);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.MULTIPLE: {
			Multiple multiple = (Multiple) theEObject;
			T result = caseMultiple(multiple);
			if (result == null)
				result = casePregunta(multiple);
			if (result == null)
				result = caseElemento(multiple);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.ABIERTA: {
			Abierta abierta = (Abierta) theEObject;
			T result = caseAbierta(abierta);
			if (result == null)
				result = casePregunta(abierta);
			if (result == null)
				result = caseElemento(abierta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.ELEMENTO: {
			Elemento elemento = (Elemento) theEObject;
			T result = caseElemento(elemento);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.NAVEGACION: {
			Navegacion navegacion = (Navegacion) theEObject;
			T result = caseNavegacion(navegacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.OPCION_RESPUESTA: {
			OpcionRespuesta opcionRespuesta = (OpcionRespuesta) theEObject;
			T result = caseOpcionRespuesta(opcionRespuesta);
			if (result == null)
				result = caseElemento(opcionRespuesta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.NODO: {
			Nodo nodo = (Nodo) theEObject;
			T result = caseNodo(nodo);
			if (result == null)
				result = caseElemento(nodo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.NODO_INICIO: {
			NodoInicio nodoInicio = (NodoInicio) theEObject;
			T result = caseNodoInicio(nodoInicio);
			if (result == null)
				result = caseNodo(nodoInicio);
			if (result == null)
				result = caseElemento(nodoInicio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Encuesta2Package.NODO_FIN: {
			NodoFin nodoFin = (NodoFin) theEObject;
			T result = caseNodoFin(nodoFin);
			if (result == null)
				result = caseNodo(nodoFin);
			if (result == null)
				result = caseElemento(nodoFin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncuesta(Encuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregunta(Pregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnica(Unica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiple(Multiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abierta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abierta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbierta(Abierta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navegacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navegacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavegacion(Navegacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opcion Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opcion Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcionRespuesta(OpcionRespuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodo(Nodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodo Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodo Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodoInicio(NodoInicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodo Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodo Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodoFin(NodoFin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Encuesta2Switch
