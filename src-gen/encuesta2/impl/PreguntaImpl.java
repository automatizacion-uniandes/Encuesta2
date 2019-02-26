/**
 */
package encuesta2.impl;

import encuesta2.Encuesta2Package;
import encuesta2.OpcionRespuesta;
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
 * An implementation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.impl.PreguntaImpl#getOpciones <em>Opciones</em>}</li>
 *   <li>{@link encuesta2.impl.PreguntaImpl#getEnunciado <em>Enunciado</em>}</li>
 *   <li>{@link encuesta2.impl.PreguntaImpl#getPrefijo <em>Prefijo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PreguntaImpl extends ElementoImpl implements Pregunta {
	/**
	 * The cached value of the '{@link #getOpciones() <em>Opciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpciones()
	 * @generated
	 * @ordered
	 */
	protected EList<OpcionRespuesta> opciones;

	/**
	 * The default value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUNCIADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnunciado() <em>Enunciado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnunciado()
	 * @generated
	 * @ordered
	 */
	protected String enunciado = ENUNCIADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefijo() <em>Prefijo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefijo()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIJO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefijo() <em>Prefijo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefijo()
	 * @generated
	 * @ordered
	 */
	protected String prefijo = PREFIJO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encuesta2Package.Literals.PREGUNTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpcionRespuesta> getOpciones() {
		if (opciones == null) {
			opciones = new EObjectContainmentEList<OpcionRespuesta>(OpcionRespuesta.class, this,
					Encuesta2Package.PREGUNTA__OPCIONES);
		}
		return opciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnunciado(String newEnunciado) {
		String oldEnunciado = enunciado;
		enunciado = newEnunciado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.PREGUNTA__ENUNCIADO, oldEnunciado,
					enunciado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefijo() {
		return prefijo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefijo(String newPrefijo) {
		String oldPrefijo = prefijo;
		prefijo = newPrefijo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.PREGUNTA__PREFIJO, oldPrefijo,
					prefijo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Encuesta2Package.PREGUNTA__OPCIONES:
			return ((InternalEList<?>) getOpciones()).basicRemove(otherEnd, msgs);
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
		case Encuesta2Package.PREGUNTA__OPCIONES:
			return getOpciones();
		case Encuesta2Package.PREGUNTA__ENUNCIADO:
			return getEnunciado();
		case Encuesta2Package.PREGUNTA__PREFIJO:
			return getPrefijo();
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
		case Encuesta2Package.PREGUNTA__OPCIONES:
			getOpciones().clear();
			getOpciones().addAll((Collection<? extends OpcionRespuesta>) newValue);
			return;
		case Encuesta2Package.PREGUNTA__ENUNCIADO:
			setEnunciado((String) newValue);
			return;
		case Encuesta2Package.PREGUNTA__PREFIJO:
			setPrefijo((String) newValue);
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
		case Encuesta2Package.PREGUNTA__OPCIONES:
			getOpciones().clear();
			return;
		case Encuesta2Package.PREGUNTA__ENUNCIADO:
			setEnunciado(ENUNCIADO_EDEFAULT);
			return;
		case Encuesta2Package.PREGUNTA__PREFIJO:
			setPrefijo(PREFIJO_EDEFAULT);
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
		case Encuesta2Package.PREGUNTA__OPCIONES:
			return opciones != null && !opciones.isEmpty();
		case Encuesta2Package.PREGUNTA__ENUNCIADO:
			return ENUNCIADO_EDEFAULT == null ? enunciado != null : !ENUNCIADO_EDEFAULT.equals(enunciado);
		case Encuesta2Package.PREGUNTA__PREFIJO:
			return PREFIJO_EDEFAULT == null ? prefijo != null : !PREFIJO_EDEFAULT.equals(prefijo);
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
		result.append(" (enunciado: ");
		result.append(enunciado);
		result.append(", prefijo: ");
		result.append(prefijo);
		result.append(')');
		return result.toString();
	}

} //PreguntaImpl
