/**
 */
package encuesta2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see encuesta2.Encuesta2Factory
 * @model kind="package"
 * @generated
 */
public interface Encuesta2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "encuesta2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/encuesta2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "encuesta2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Encuesta2Package eINSTANCE = encuesta2.impl.Encuesta2PackageImpl.init();

	/**
	 * The meta object id for the '{@link encuesta2.impl.EncuestaImpl <em>Encuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.EncuestaImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getEncuesta()
	 * @generated
	 */
	int ENCUESTA = 0;

	/**
	 * The feature id for the '<em><b>Modulos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__MODULOS = 0;

	/**
	 * The feature id for the '<em><b>Navegacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__NAVEGACION = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.ElementoImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 6;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.ModuloImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 1;

	/**
	 * The feature id for the '<em><b>Preguntas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__PREGUNTAS = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__NOMBRE = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__NODOS = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.PreguntaImpl <em>Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.PreguntaImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getPregunta()
	 * @generated
	 */
	int PREGUNTA = 2;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__OPCIONES = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__ENUNCIADO = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefijo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__PREFIJO = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.UnicaImpl <em>Unica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.UnicaImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getUnica()
	 * @generated
	 */
	int UNICA = 3;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICA__OPCIONES = PREGUNTA__OPCIONES;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICA__ENUNCIADO = PREGUNTA__ENUNCIADO;

	/**
	 * The feature id for the '<em><b>Prefijo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICA__PREFIJO = PREGUNTA__PREFIJO;

	/**
	 * The number of structural features of the '<em>Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICA_FEATURE_COUNT = PREGUNTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNICA_OPERATION_COUNT = PREGUNTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.MultipleImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 4;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__OPCIONES = PREGUNTA__OPCIONES;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__ENUNCIADO = PREGUNTA__ENUNCIADO;

	/**
	 * The feature id for the '<em><b>Prefijo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__PREFIJO = PREGUNTA__PREFIJO;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = PREGUNTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = PREGUNTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.AbiertaImpl <em>Abierta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.AbiertaImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getAbierta()
	 * @generated
	 */
	int ABIERTA = 5;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABIERTA__OPCIONES = PREGUNTA__OPCIONES;

	/**
	 * The feature id for the '<em><b>Enunciado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABIERTA__ENUNCIADO = PREGUNTA__ENUNCIADO;

	/**
	 * The feature id for the '<em><b>Prefijo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABIERTA__PREFIJO = PREGUNTA__PREFIJO;

	/**
	 * The number of structural features of the '<em>Abierta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABIERTA_FEATURE_COUNT = PREGUNTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abierta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABIERTA_OPERATION_COUNT = PREGUNTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.NavegacionImpl <em>Navegacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.NavegacionImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getNavegacion()
	 * @generated
	 */
	int NAVEGACION = 7;

	/**
	 * The feature id for the '<em><b>Desde</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION__DESDE = 0;

	/**
	 * The feature id for the '<em><b>Hacia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION__HACIA = 1;

	/**
	 * The number of structural features of the '<em>Navegacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Navegacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.OpcionRespuestaImpl <em>Opcion Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.OpcionRespuestaImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getOpcionRespuesta()
	 * @generated
	 */
	int OPCION_RESPUESTA = 8;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION_RESPUESTA__VALOR = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opcion Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION_RESPUESTA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Opcion Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION_RESPUESTA_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.NodoImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 9;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__TEXTO = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.NodoInicioImpl <em>Nodo Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.NodoInicioImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getNodoInicio()
	 * @generated
	 */
	int NODO_INICIO = 10;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_INICIO__TEXTO = NODO__TEXTO;

	/**
	 * The number of structural features of the '<em>Nodo Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_INICIO_FEATURE_COUNT = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nodo Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_INICIO_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link encuesta2.impl.NodoFinImpl <em>Nodo Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see encuesta2.impl.NodoFinImpl
	 * @see encuesta2.impl.Encuesta2PackageImpl#getNodoFin()
	 * @generated
	 */
	int NODO_FIN = 11;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FIN__TEXTO = NODO__TEXTO;

	/**
	 * The number of structural features of the '<em>Nodo Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FIN_FEATURE_COUNT = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nodo Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FIN_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link encuesta2.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encuesta</em>'.
	 * @see encuesta2.Encuesta
	 * @generated
	 */
	EClass getEncuesta();

	/**
	 * Returns the meta object for the containment reference list '{@link encuesta2.Encuesta#getModulos <em>Modulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modulos</em>'.
	 * @see encuesta2.Encuesta#getModulos()
	 * @see #getEncuesta()
	 * @generated
	 */
	EReference getEncuesta_Modulos();

	/**
	 * Returns the meta object for the containment reference list '{@link encuesta2.Encuesta#getNavegacion <em>Navegacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navegacion</em>'.
	 * @see encuesta2.Encuesta#getNavegacion()
	 * @see #getEncuesta()
	 * @generated
	 */
	EReference getEncuesta_Navegacion();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.Encuesta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see encuesta2.Encuesta#getNombre()
	 * @see #getEncuesta()
	 * @generated
	 */
	EAttribute getEncuesta_Nombre();

	/**
	 * Returns the meta object for class '{@link encuesta2.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see encuesta2.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the containment reference list '{@link encuesta2.Modulo#getPreguntas <em>Preguntas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preguntas</em>'.
	 * @see encuesta2.Modulo#getPreguntas()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Preguntas();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.Modulo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see encuesta2.Modulo#getNombre()
	 * @see #getModulo()
	 * @generated
	 */
	EAttribute getModulo_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link encuesta2.Modulo#getNodos <em>Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodos</em>'.
	 * @see encuesta2.Modulo#getNodos()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Nodos();

	/**
	 * Returns the meta object for class '{@link encuesta2.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta</em>'.
	 * @see encuesta2.Pregunta
	 * @generated
	 */
	EClass getPregunta();

	/**
	 * Returns the meta object for the containment reference list '{@link encuesta2.Pregunta#getOpciones <em>Opciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opciones</em>'.
	 * @see encuesta2.Pregunta#getOpciones()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Opciones();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.Pregunta#getEnunciado <em>Enunciado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enunciado</em>'.
	 * @see encuesta2.Pregunta#getEnunciado()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Enunciado();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.Pregunta#getPrefijo <em>Prefijo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefijo</em>'.
	 * @see encuesta2.Pregunta#getPrefijo()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Prefijo();

	/**
	 * Returns the meta object for class '{@link encuesta2.Unica <em>Unica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unica</em>'.
	 * @see encuesta2.Unica
	 * @generated
	 */
	EClass getUnica();

	/**
	 * Returns the meta object for class '{@link encuesta2.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see encuesta2.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for class '{@link encuesta2.Abierta <em>Abierta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abierta</em>'.
	 * @see encuesta2.Abierta
	 * @generated
	 */
	EClass getAbierta();

	/**
	 * Returns the meta object for class '{@link encuesta2.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see encuesta2.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for class '{@link encuesta2.Navegacion <em>Navegacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navegacion</em>'.
	 * @see encuesta2.Navegacion
	 * @generated
	 */
	EClass getNavegacion();

	/**
	 * Returns the meta object for the reference '{@link encuesta2.Navegacion#getDesde <em>Desde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Desde</em>'.
	 * @see encuesta2.Navegacion#getDesde()
	 * @see #getNavegacion()
	 * @generated
	 */
	EReference getNavegacion_Desde();

	/**
	 * Returns the meta object for the reference '{@link encuesta2.Navegacion#getHacia <em>Hacia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hacia</em>'.
	 * @see encuesta2.Navegacion#getHacia()
	 * @see #getNavegacion()
	 * @generated
	 */
	EReference getNavegacion_Hacia();

	/**
	 * Returns the meta object for class '{@link encuesta2.OpcionRespuesta <em>Opcion Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opcion Respuesta</em>'.
	 * @see encuesta2.OpcionRespuesta
	 * @generated
	 */
	EClass getOpcionRespuesta();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.OpcionRespuesta#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see encuesta2.OpcionRespuesta#getValor()
	 * @see #getOpcionRespuesta()
	 * @generated
	 */
	EAttribute getOpcionRespuesta_Valor();

	/**
	 * Returns the meta object for class '{@link encuesta2.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see encuesta2.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the attribute '{@link encuesta2.Nodo#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see encuesta2.Nodo#getTexto()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_Texto();

	/**
	 * Returns the meta object for class '{@link encuesta2.NodoInicio <em>Nodo Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo Inicio</em>'.
	 * @see encuesta2.NodoInicio
	 * @generated
	 */
	EClass getNodoInicio();

	/**
	 * Returns the meta object for class '{@link encuesta2.NodoFin <em>Nodo Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo Fin</em>'.
	 * @see encuesta2.NodoFin
	 * @generated
	 */
	EClass getNodoFin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Encuesta2Factory getEncuesta2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link encuesta2.impl.EncuestaImpl <em>Encuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.EncuestaImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getEncuesta()
		 * @generated
		 */
		EClass ENCUESTA = eINSTANCE.getEncuesta();

		/**
		 * The meta object literal for the '<em><b>Modulos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCUESTA__MODULOS = eINSTANCE.getEncuesta_Modulos();

		/**
		 * The meta object literal for the '<em><b>Navegacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCUESTA__NAVEGACION = eINSTANCE.getEncuesta_Navegacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCUESTA__NOMBRE = eINSTANCE.getEncuesta_Nombre();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.ModuloImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '<em><b>Preguntas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__PREGUNTAS = eINSTANCE.getModulo_Preguntas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULO__NOMBRE = eINSTANCE.getModulo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__NODOS = eINSTANCE.getModulo_Nodos();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.PreguntaImpl <em>Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.PreguntaImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getPregunta()
		 * @generated
		 */
		EClass PREGUNTA = eINSTANCE.getPregunta();

		/**
		 * The meta object literal for the '<em><b>Opciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__OPCIONES = eINSTANCE.getPregunta_Opciones();

		/**
		 * The meta object literal for the '<em><b>Enunciado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__ENUNCIADO = eINSTANCE.getPregunta_Enunciado();

		/**
		 * The meta object literal for the '<em><b>Prefijo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__PREFIJO = eINSTANCE.getPregunta_Prefijo();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.UnicaImpl <em>Unica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.UnicaImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getUnica()
		 * @generated
		 */
		EClass UNICA = eINSTANCE.getUnica();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.MultipleImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.AbiertaImpl <em>Abierta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.AbiertaImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getAbierta()
		 * @generated
		 */
		EClass ABIERTA = eINSTANCE.getAbierta();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.ElementoImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.NavegacionImpl <em>Navegacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.NavegacionImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getNavegacion()
		 * @generated
		 */
		EClass NAVEGACION = eINSTANCE.getNavegacion();

		/**
		 * The meta object literal for the '<em><b>Desde</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGACION__DESDE = eINSTANCE.getNavegacion_Desde();

		/**
		 * The meta object literal for the '<em><b>Hacia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGACION__HACIA = eINSTANCE.getNavegacion_Hacia();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.OpcionRespuestaImpl <em>Opcion Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.OpcionRespuestaImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getOpcionRespuesta()
		 * @generated
		 */
		EClass OPCION_RESPUESTA = eINSTANCE.getOpcionRespuesta();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPCION_RESPUESTA__VALOR = eINSTANCE.getOpcionRespuesta_Valor();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.NodoImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__TEXTO = eINSTANCE.getNodo_Texto();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.NodoInicioImpl <em>Nodo Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.NodoInicioImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getNodoInicio()
		 * @generated
		 */
		EClass NODO_INICIO = eINSTANCE.getNodoInicio();

		/**
		 * The meta object literal for the '{@link encuesta2.impl.NodoFinImpl <em>Nodo Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see encuesta2.impl.NodoFinImpl
		 * @see encuesta2.impl.Encuesta2PackageImpl#getNodoFin()
		 * @generated
		 */
		EClass NODO_FIN = eINSTANCE.getNodoFin();

	}

} //Encuesta2Package
