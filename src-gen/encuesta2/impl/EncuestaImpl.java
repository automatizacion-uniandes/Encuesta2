/**
 */
package encuesta2.impl;

import encuesta2.Encuesta;
import encuesta2.Encuesta2Package;
import encuesta2.Modulo;
import encuesta2.Navegacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.impl.EncuestaImpl#getModulos <em>Modulos</em>}</li>
 *   <li>{@link encuesta2.impl.EncuestaImpl#getNavegacion <em>Navegacion</em>}</li>
 *   <li>{@link encuesta2.impl.EncuestaImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncuestaImpl extends MinimalEObjectImpl.Container implements Encuesta {
	/**
	 * The cached value of the '{@link #getModulos() <em>Modulos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulos()
	 * @generated
	 * @ordered
	 */
	protected EList<Modulo> modulos;

	/**
	 * The cached value of the '{@link #getNavegacion() <em>Navegacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Navegacion> navegacion;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encuesta2Package.Literals.ENCUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modulo> getModulos() {
		if (modulos == null) {
			modulos = new EObjectContainmentEList<Modulo>(Modulo.class, this, Encuesta2Package.ENCUESTA__MODULOS);
		}
		return modulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Navegacion> getNavegacion() {
		if (navegacion == null) {
			navegacion = new EObjectContainmentEList<Navegacion>(Navegacion.class, this,
					Encuesta2Package.ENCUESTA__NAVEGACION);
		}
		return navegacion;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.ENCUESTA__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Encuesta2Package.ENCUESTA__MODULOS:
			return ((InternalEList<?>) getModulos()).basicRemove(otherEnd, msgs);
		case Encuesta2Package.ENCUESTA__NAVEGACION:
			return ((InternalEList<?>) getNavegacion()).basicRemove(otherEnd, msgs);
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
		case Encuesta2Package.ENCUESTA__MODULOS:
			return getModulos();
		case Encuesta2Package.ENCUESTA__NAVEGACION:
			return getNavegacion();
		case Encuesta2Package.ENCUESTA__NOMBRE:
			return getNombre();
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
		case Encuesta2Package.ENCUESTA__MODULOS:
			getModulos().clear();
			getModulos().addAll((Collection<? extends Modulo>) newValue);
			return;
		case Encuesta2Package.ENCUESTA__NAVEGACION:
			getNavegacion().clear();
			getNavegacion().addAll((Collection<? extends Navegacion>) newValue);
			return;
		case Encuesta2Package.ENCUESTA__NOMBRE:
			setNombre((String) newValue);
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
		case Encuesta2Package.ENCUESTA__MODULOS:
			getModulos().clear();
			return;
		case Encuesta2Package.ENCUESTA__NAVEGACION:
			getNavegacion().clear();
			return;
		case Encuesta2Package.ENCUESTA__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
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
		case Encuesta2Package.ENCUESTA__MODULOS:
			return modulos != null && !modulos.isEmpty();
		case Encuesta2Package.ENCUESTA__NAVEGACION:
			return navegacion != null && !navegacion.isEmpty();
		case Encuesta2Package.ENCUESTA__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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

} //EncuestaImpl
