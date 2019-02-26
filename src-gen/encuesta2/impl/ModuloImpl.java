/**
 */
package encuesta2.impl;

import encuesta2.Encuesta2Package;
import encuesta2.Modulo;
import encuesta2.Nodo;
import encuesta2.Pregunta;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.impl.ModuloImpl#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link encuesta2.impl.ModuloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link encuesta2.impl.ModuloImpl#getNodos <em>Nodos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuloImpl extends ElementoImpl implements Modulo {
	/**
	 * The cached value of the '{@link #getPreguntas() <em>Preguntas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntas;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodos() <em>Nodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodo> nodos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encuesta2Package.Literals.MODULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pregunta> getPreguntas() {
		if (preguntas == null) {
			preguntas = new EObjectContainmentEList<Pregunta>(Pregunta.class, this, Encuesta2Package.MODULO__PREGUNTAS);
		}
		return preguntas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.MODULO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nodo> getNodos() {
		if (nodos == null) {
			nodos = new EObjectContainmentEList<Nodo>(Nodo.class, this, Encuesta2Package.MODULO__NODOS);
		}
		return nodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Encuesta2Package.MODULO__PREGUNTAS:
			return ((InternalEList<?>) getPreguntas()).basicRemove(otherEnd, msgs);
		case Encuesta2Package.MODULO__NODOS:
			return ((InternalEList<?>) getNodos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Encuesta2Package.MODULO__PREGUNTAS:
			return getPreguntas();
		case Encuesta2Package.MODULO__NOMBRE:
			return getNombre();
		case Encuesta2Package.MODULO__NODOS:
			return getNodos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Encuesta2Package.MODULO__PREGUNTAS:
			getPreguntas().clear();
			getPreguntas().addAll((Collection<? extends Pregunta>) newValue);
			return;
		case Encuesta2Package.MODULO__NOMBRE:
			setNombre((String) newValue);
			return;
		case Encuesta2Package.MODULO__NODOS:
			getNodos().clear();
			getNodos().addAll((Collection<? extends Nodo>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Encuesta2Package.MODULO__PREGUNTAS:
			getPreguntas().clear();
			return;
		case Encuesta2Package.MODULO__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case Encuesta2Package.MODULO__NODOS:
			getNodos().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Encuesta2Package.MODULO__PREGUNTAS:
			return preguntas != null && !preguntas.isEmpty();
		case Encuesta2Package.MODULO__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case Encuesta2Package.MODULO__NODOS:
			return nodos != null && !nodos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ModuloImpl
