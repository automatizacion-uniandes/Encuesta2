/**
 */
package encuesta2.impl;

import encuesta2.Elemento;
import encuesta2.Encuesta2Package;
import encuesta2.Navegacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navegacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link encuesta2.impl.NavegacionImpl#getDesde <em>Desde</em>}</li>
 *   <li>{@link encuesta2.impl.NavegacionImpl#getHacia <em>Hacia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavegacionImpl extends MinimalEObjectImpl.Container implements Navegacion {
	/**
	 * The cached value of the '{@link #getDesde() <em>Desde</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesde()
	 * @generated
	 * @ordered
	 */
	protected Elemento desde;

	/**
	 * The cached value of the '{@link #getHacia() <em>Hacia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHacia()
	 * @generated
	 * @ordered
	 */
	protected Elemento hacia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavegacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Encuesta2Package.Literals.NAVEGACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getDesde() {
		if (desde != null && desde.eIsProxy()) {
			InternalEObject oldDesde = (InternalEObject) desde;
			desde = (Elemento) eResolveProxy(oldDesde);
			if (desde != oldDesde) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Encuesta2Package.NAVEGACION__DESDE,
							oldDesde, desde));
			}
		}
		return desde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetDesde() {
		return desde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesde(Elemento newDesde) {
		Elemento oldDesde = desde;
		desde = newDesde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.NAVEGACION__DESDE, oldDesde, desde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getHacia() {
		if (hacia != null && hacia.eIsProxy()) {
			InternalEObject oldHacia = (InternalEObject) hacia;
			hacia = (Elemento) eResolveProxy(oldHacia);
			if (hacia != oldHacia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Encuesta2Package.NAVEGACION__HACIA,
							oldHacia, hacia));
			}
		}
		return hacia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetHacia() {
		return hacia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHacia(Elemento newHacia) {
		Elemento oldHacia = hacia;
		hacia = newHacia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Encuesta2Package.NAVEGACION__HACIA, oldHacia, hacia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Encuesta2Package.NAVEGACION__DESDE:
			if (resolve)
				return getDesde();
			return basicGetDesde();
		case Encuesta2Package.NAVEGACION__HACIA:
			if (resolve)
				return getHacia();
			return basicGetHacia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Encuesta2Package.NAVEGACION__DESDE:
			setDesde((Elemento) newValue);
			return;
		case Encuesta2Package.NAVEGACION__HACIA:
			setHacia((Elemento) newValue);
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
		case Encuesta2Package.NAVEGACION__DESDE:
			setDesde((Elemento) null);
			return;
		case Encuesta2Package.NAVEGACION__HACIA:
			setHacia((Elemento) null);
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
		case Encuesta2Package.NAVEGACION__DESDE:
			return desde != null;
		case Encuesta2Package.NAVEGACION__HACIA:
			return hacia != null;
		}
		return super.eIsSet(featureID);
	}

} //NavegacionImpl
