/**
 */
package encuesta2.util;

import encuesta2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see encuesta2.Encuesta2Package
 * @generated
 */
public class Encuesta2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Encuesta2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Encuesta2Package.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Encuesta2Switch<Adapter> modelSwitch = new Encuesta2Switch<Adapter>() {
		@Override
		public Adapter caseEncuesta(Encuesta object) {
			return createEncuestaAdapter();
		}

		@Override
		public Adapter caseModulo(Modulo object) {
			return createModuloAdapter();
		}

		@Override
		public Adapter casePregunta(Pregunta object) {
			return createPreguntaAdapter();
		}

		@Override
		public Adapter caseUnica(Unica object) {
			return createUnicaAdapter();
		}

		@Override
		public Adapter caseMultiple(Multiple object) {
			return createMultipleAdapter();
		}

		@Override
		public Adapter caseAbierta(Abierta object) {
			return createAbiertaAdapter();
		}

		@Override
		public Adapter caseElemento(Elemento object) {
			return createElementoAdapter();
		}

		@Override
		public Adapter caseNavegacion(Navegacion object) {
			return createNavegacionAdapter();
		}

		@Override
		public Adapter caseOpcionRespuesta(OpcionRespuesta object) {
			return createOpcionRespuestaAdapter();
		}

		@Override
		public Adapter caseNodo(Nodo object) {
			return createNodoAdapter();
		}

		@Override
		public Adapter caseNodoInicio(NodoInicio object) {
			return createNodoInicioAdapter();
		}

		@Override
		public Adapter caseNodoFin(NodoFin object) {
			return createNodoFinAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Encuesta
	 * @generated
	 */
	public Adapter createEncuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Pregunta
	 * @generated
	 */
	public Adapter createPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Unica <em>Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Unica
	 * @generated
	 */
	public Adapter createUnicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Multiple
	 * @generated
	 */
	public Adapter createMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Abierta <em>Abierta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Abierta
	 * @generated
	 */
	public Adapter createAbiertaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Navegacion <em>Navegacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Navegacion
	 * @generated
	 */
	public Adapter createNavegacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.OpcionRespuesta <em>Opcion Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.OpcionRespuesta
	 * @generated
	 */
	public Adapter createOpcionRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.Nodo
	 * @generated
	 */
	public Adapter createNodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.NodoInicio <em>Nodo Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.NodoInicio
	 * @generated
	 */
	public Adapter createNodoInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link encuesta2.NodoFin <em>Nodo Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see encuesta2.NodoFin
	 * @generated
	 */
	public Adapter createNodoFinAdapter() {
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

} //Encuesta2AdapterFactory
