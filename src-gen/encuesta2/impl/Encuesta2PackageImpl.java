/**
 */
package encuesta2.impl;

import encuesta2.Abierta;
import encuesta2.Elemento;
import encuesta2.Encuesta;
import encuesta2.Encuesta2Factory;
import encuesta2.Encuesta2Package;
import encuesta2.Modulo;
import encuesta2.Multiple;
import encuesta2.Navegacion;
import encuesta2.Nodo;
import encuesta2.NodoFin;
import encuesta2.NodoInicio;
import encuesta2.OpcionRespuesta;
import encuesta2.Pregunta;
import encuesta2.Unica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Encuesta2PackageImpl extends EPackageImpl implements Encuesta2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abiertaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navegacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcionRespuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoInicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoFinEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see encuesta2.Encuesta2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Encuesta2PackageImpl() {
		super(eNS_URI, Encuesta2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Encuesta2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Encuesta2Package init() {
		if (isInited)
			return (Encuesta2Package) EPackage.Registry.INSTANCE.getEPackage(Encuesta2Package.eNS_URI);

		// Obtain or create and register package
		Encuesta2PackageImpl theEncuesta2Package = (Encuesta2PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Encuesta2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Encuesta2PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEncuesta2Package.createPackageContents();

		// Initialize created meta-data
		theEncuesta2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEncuesta2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Encuesta2Package.eNS_URI, theEncuesta2Package);
		return theEncuesta2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncuesta() {
		return encuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncuesta_Modulos() {
		return (EReference) encuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncuesta_Navegacion() {
		return (EReference) encuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncuesta_Nombre() {
		return (EAttribute) encuestaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Preguntas() {
		return (EReference) moduloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_Nombre() {
		return (EAttribute) moduloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Nodos() {
		return (EReference) moduloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregunta() {
		return preguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregunta_Opciones() {
		return (EReference) preguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Enunciado() {
		return (EAttribute) preguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Prefijo() {
		return (EAttribute) preguntaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnica() {
		return unicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbierta() {
		return abiertaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavegacion() {
		return navegacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavegacion_Desde() {
		return (EReference) navegacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavegacion_Hacia() {
		return (EReference) navegacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpcionRespuesta() {
		return opcionRespuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpcionRespuesta_Valor() {
		return (EAttribute) opcionRespuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodo() {
		return nodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodo_Texto() {
		return (EAttribute) nodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodoInicio() {
		return nodoInicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodoFin() {
		return nodoFinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta2Factory getEncuesta2Factory() {
		return (Encuesta2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		encuestaEClass = createEClass(ENCUESTA);
		createEReference(encuestaEClass, ENCUESTA__MODULOS);
		createEReference(encuestaEClass, ENCUESTA__NAVEGACION);
		createEAttribute(encuestaEClass, ENCUESTA__NOMBRE);

		moduloEClass = createEClass(MODULO);
		createEReference(moduloEClass, MODULO__PREGUNTAS);
		createEAttribute(moduloEClass, MODULO__NOMBRE);
		createEReference(moduloEClass, MODULO__NODOS);

		preguntaEClass = createEClass(PREGUNTA);
		createEReference(preguntaEClass, PREGUNTA__OPCIONES);
		createEAttribute(preguntaEClass, PREGUNTA__ENUNCIADO);
		createEAttribute(preguntaEClass, PREGUNTA__PREFIJO);

		unicaEClass = createEClass(UNICA);

		multipleEClass = createEClass(MULTIPLE);

		abiertaEClass = createEClass(ABIERTA);

		elementoEClass = createEClass(ELEMENTO);

		navegacionEClass = createEClass(NAVEGACION);
		createEReference(navegacionEClass, NAVEGACION__DESDE);
		createEReference(navegacionEClass, NAVEGACION__HACIA);

		opcionRespuestaEClass = createEClass(OPCION_RESPUESTA);
		createEAttribute(opcionRespuestaEClass, OPCION_RESPUESTA__VALOR);

		nodoEClass = createEClass(NODO);
		createEAttribute(nodoEClass, NODO__TEXTO);

		nodoInicioEClass = createEClass(NODO_INICIO);

		nodoFinEClass = createEClass(NODO_FIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduloEClass.getESuperTypes().add(this.getElemento());
		preguntaEClass.getESuperTypes().add(this.getElemento());
		unicaEClass.getESuperTypes().add(this.getPregunta());
		multipleEClass.getESuperTypes().add(this.getPregunta());
		abiertaEClass.getESuperTypes().add(this.getPregunta());
		opcionRespuestaEClass.getESuperTypes().add(this.getElemento());
		nodoEClass.getESuperTypes().add(this.getElemento());
		nodoInicioEClass.getESuperTypes().add(this.getNodo());
		nodoFinEClass.getESuperTypes().add(this.getNodo());

		// Initialize classes, features, and operations; add parameters
		initEClass(encuestaEClass, Encuesta.class, "Encuesta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncuesta_Modulos(), this.getModulo(), null, "modulos", null, 1, -1, Encuesta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncuesta_Navegacion(), this.getNavegacion(), null, "navegacion", null, 1, -1, Encuesta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncuesta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Encuesta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulo_Preguntas(), this.getPregunta(), null, "preguntas", null, 1, -1, Modulo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Modulo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Nodos(), this.getNodo(), null, "nodos", null, 1, -1, Modulo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPregunta_Opciones(), this.getOpcionRespuesta(), null, "opciones", null, 0, -1, Pregunta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Enunciado(), ecorePackage.getEString(), "enunciado", null, 0, 1, Pregunta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Prefijo(), ecorePackage.getEString(), "prefijo", null, 0, 1, Pregunta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unicaEClass, Unica.class, "Unica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abiertaEClass, Abierta.class, "Abierta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navegacionEClass, Navegacion.class, "Navegacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavegacion_Desde(), this.getElemento(), null, "desde", null, 1, 1, Navegacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavegacion_Hacia(), this.getElemento(), null, "hacia", null, 1, 1, Navegacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opcionRespuestaEClass, OpcionRespuesta.class, "OpcionRespuesta", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpcionRespuesta_Valor(), ecorePackage.getEString(), "valor", null, 0, 1,
				OpcionRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(nodoEClass, Nodo.class, "Nodo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodo_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Nodo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoInicioEClass, NodoInicio.class, "NodoInicio", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodoFinEClass, NodoFin.class, "NodoFin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Encuesta2PackageImpl
