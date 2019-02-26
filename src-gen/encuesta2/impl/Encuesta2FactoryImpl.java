/**
 */
package encuesta2.impl;

import encuesta2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Encuesta2FactoryImpl extends EFactoryImpl implements Encuesta2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Encuesta2Factory init() {
		try {
			Encuesta2Factory theEncuesta2Factory = (Encuesta2Factory) EPackage.Registry.INSTANCE
					.getEFactory(Encuesta2Package.eNS_URI);
			if (theEncuesta2Factory != null) {
				return theEncuesta2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Encuesta2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Encuesta2Package.ENCUESTA:
			return createEncuesta();
		case Encuesta2Package.MODULO:
			return createModulo();
		case Encuesta2Package.UNICA:
			return createUnica();
		case Encuesta2Package.MULTIPLE:
			return createMultiple();
		case Encuesta2Package.ABIERTA:
			return createAbierta();
		case Encuesta2Package.NAVEGACION:
			return createNavegacion();
		case Encuesta2Package.OPCION_RESPUESTA:
			return createOpcionRespuesta();
		case Encuesta2Package.NODO_INICIO:
			return createNodoInicio();
		case Encuesta2Package.NODO_FIN:
			return createNodoFin();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta createEncuesta() {
		EncuestaImpl encuesta = new EncuestaImpl();
		return encuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unica createUnica() {
		UnicaImpl unica = new UnicaImpl();
		return unica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple() {
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abierta createAbierta() {
		AbiertaImpl abierta = new AbiertaImpl();
		return abierta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navegacion createNavegacion() {
		NavegacionImpl navegacion = new NavegacionImpl();
		return navegacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcionRespuesta createOpcionRespuesta() {
		OpcionRespuestaImpl opcionRespuesta = new OpcionRespuestaImpl();
		return opcionRespuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodoInicio createNodoInicio() {
		NodoInicioImpl nodoInicio = new NodoInicioImpl();
		return nodoInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodoFin createNodoFin() {
		NodoFinImpl nodoFin = new NodoFinImpl();
		return nodoFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta2Package getEncuesta2Package() {
		return (Encuesta2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Encuesta2Package getPackage() {
		return Encuesta2Package.eINSTANCE;
	}

} //Encuesta2FactoryImpl
