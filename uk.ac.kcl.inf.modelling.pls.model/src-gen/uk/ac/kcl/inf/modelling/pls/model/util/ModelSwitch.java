/**
 */
package uk.ac.kcl.inf.modelling.pls.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.modelling.pls.model.*;

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
 * @see uk.ac.kcl.inf.modelling.pls.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
		case ModelPackage.PRODUCTION_LINE_MODEL: {
			ProductionLineModel productionLineModel = (ProductionLineModel) theEObject;
			T result = caseProductionLineModel(productionLineModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MACHINE: {
			Machine machine = (Machine) theEObject;
			T result = caseMachine(machine);
			if (result == null)
				result = caseNamedElement(machine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseNamedElement(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PART: {
			Part part = (Part) theEObject;
			T result = casePart(part);
			if (result == null)
				result = caseNamedElement(part);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.CONVEYOR: {
			Conveyor conveyor = (Conveyor) theEObject;
			T result = caseConveyor(conveyor);
			if (result == null)
				result = caseContainer(conveyor);
			if (result == null)
				result = caseNamedElement(conveyor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.TRAY: {
			Tray tray = (Tray) theEObject;
			T result = caseTray(tray);
			if (result == null)
				result = caseContainer(tray);
			if (result == null)
				result = caseNamedElement(tray);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.HAMMER: {
			Hammer hammer = (Hammer) theEObject;
			T result = caseHammer(hammer);
			if (result == null)
				result = casePart(hammer);
			if (result == null)
				result = caseNamedElement(hammer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.HEAD: {
			Head head = (Head) theEObject;
			T result = caseHead(head);
			if (result == null)
				result = casePart(head);
			if (result == null)
				result = caseNamedElement(head);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.HANDLE: {
			Handle handle = (Handle) theEObject;
			T result = caseHandle(handle);
			if (result == null)
				result = casePart(handle);
			if (result == null)
				result = caseNamedElement(handle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.POLISHER: {
			Polisher polisher = (Polisher) theEObject;
			T result = casePolisher(polisher);
			if (result == null)
				result = caseMachine(polisher);
			if (result == null)
				result = caseNamedElement(polisher);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.ASSEMBLER: {
			Assembler assembler = (Assembler) theEObject;
			T result = caseAssembler(assembler);
			if (result == null)
				result = caseMachine(assembler);
			if (result == null)
				result = caseNamedElement(assembler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GENERATOR: {
			Generator generator = (Generator) theEObject;
			T result = caseGenerator(generator);
			if (result == null)
				result = caseMachine(generator);
			if (result == null)
				result = caseNamedElement(generator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GEN_HEAD: {
			GenHead genHead = (GenHead) theEObject;
			T result = caseGenHead(genHead);
			if (result == null)
				result = caseGenerator(genHead);
			if (result == null)
				result = caseMachine(genHead);
			if (result == null)
				result = caseNamedElement(genHead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.GEN_HANDLE: {
			GenHandle genHandle = (GenHandle) theEObject;
			T result = caseGenHandle(genHandle);
			if (result == null)
				result = caseGenerator(genHandle);
			if (result == null)
				result = caseMachine(genHandle);
			if (result == null)
				result = caseNamedElement(genHandle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Line Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Line Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionLineModel(ProductionLineModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTray(Tray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hammer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hammer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHammer(Hammer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHead(Head object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandle(Handle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolisher(Polisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembler(Assembler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerator(Generator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenHead(GenHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenHandle(GenHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //ModelSwitch
