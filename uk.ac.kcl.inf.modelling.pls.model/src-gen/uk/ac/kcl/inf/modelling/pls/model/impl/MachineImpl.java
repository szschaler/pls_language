/**
 */
package uk.ac.kcl.inf.modelling.pls.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelling.pls.model.Conveyor;
import uk.ac.kcl.inf.modelling.pls.model.Machine;
import uk.ac.kcl.inf.modelling.pls.model.ModelPackage;
import uk.ac.kcl.inf.modelling.pls.model.Tray;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl#getOut <em>Out</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl#getIn <em>In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends NamedElementImpl implements Machine {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected Conveyor out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected Tray in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor getOut() {
		if (out != null && out.eIsProxy()) {
			InternalEObject oldOut = (InternalEObject) out;
			out = (Conveyor) eResolveProxy(oldOut);
			if (out != oldOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MACHINE__OUT, oldOut, out));
			}
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor basicGetOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(Conveyor newOut) {
		Conveyor oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MACHINE__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray getIn() {
		if (in != null && in.eIsProxy()) {
			InternalEObject oldIn = (InternalEObject) in;
			in = (Tray) eResolveProxy(oldIn);
			if (in != oldIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MACHINE__IN, oldIn, in));
			}
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray basicGetIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(Tray newIn) {
		Tray oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MACHINE__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.MACHINE__OUT:
			if (resolve)
				return getOut();
			return basicGetOut();
		case ModelPackage.MACHINE__IN:
			if (resolve)
				return getIn();
			return basicGetIn();
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
		case ModelPackage.MACHINE__OUT:
			setOut((Conveyor) newValue);
			return;
		case ModelPackage.MACHINE__IN:
			setIn((Tray) newValue);
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
		case ModelPackage.MACHINE__OUT:
			setOut((Conveyor) null);
			return;
		case ModelPackage.MACHINE__IN:
			setIn((Tray) null);
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
		case ModelPackage.MACHINE__OUT:
			return out != null;
		case ModelPackage.MACHINE__IN:
			return in != null;
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
