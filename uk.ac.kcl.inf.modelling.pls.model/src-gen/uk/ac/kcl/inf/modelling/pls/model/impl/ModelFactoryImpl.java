/**
 */
package uk.ac.kcl.inf.modelling.pls.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.modelling.pls.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
		case ModelPackage.PRODUCTION_LINE_MODEL:
			return createProductionLineModel();
		case ModelPackage.MACHINE:
			return createMachine();
		case ModelPackage.CONTAINER:
			return createContainer();
		case ModelPackage.PART:
			return createPart();
		case ModelPackage.CONVEYOR:
			return createConveyor();
		case ModelPackage.TRAY:
			return createTray();
		case ModelPackage.HAMMER:
			return createHammer();
		case ModelPackage.HEAD:
			return createHead();
		case ModelPackage.HANDLE:
			return createHandle();
		case ModelPackage.POLISHER:
			return createPolisher();
		case ModelPackage.ASSEMBLER:
			return createAssembler();
		case ModelPackage.GENERATOR:
			return createGenerator();
		case ModelPackage.GEN_HEAD:
			return createGenHead();
		case ModelPackage.GEN_HANDLE:
			return createGenHandle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineModel createProductionLineModel() {
		ProductionLineModelImpl productionLineModel = new ProductionLineModelImpl();
		return productionLineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uk.ac.kcl.inf.modelling.pls.model.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray createTray() {
		TrayImpl tray = new TrayImpl();
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hammer createHammer() {
		HammerImpl hammer = new HammerImpl();
		return hammer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handle createHandle() {
		HandleImpl handle = new HandleImpl();
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polisher createPolisher() {
		PolisherImpl polisher = new PolisherImpl();
		return polisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenHead createGenHead() {
		GenHeadImpl genHead = new GenHeadImpl();
		return genHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenHandle createGenHandle() {
		GenHandleImpl genHandle = new GenHandleImpl();
		return genHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
