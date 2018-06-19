/**
 */
package uk.ac.kcl.inf.modelling.pls.model;

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
 * @see uk.ac.kcl.inf.modelling.pls.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ProductionLineModelImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getProductionLineModel()
	 * @generated
	 */
	int PRODUCTION_LINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.NamedElementImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ContainerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.PartImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getPart()
	 * @generated
	 */
	int PART = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ConveyorImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARTS = CONTAINER__PARTS;

	/**
	 * The feature id for the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__TRAY = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.TrayImpl <em>Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.TrayImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getTray()
	 * @generated
	 */
	int TRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__PARTS = CONTAINER__PARTS;

	/**
	 * The number of structural features of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HammerImpl <em>Hammer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HammerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHammer()
	 * @generated
	 */
	int HAMMER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HeadImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HandleImpl <em>Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HandleImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHandle()
	 * @generated
	 */
	int HANDLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE__NAME = PART__NAME;

	/**
	 * The number of structural features of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.PolisherImpl <em>Polisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.PolisherImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getPolisher()
	 * @generated
	 */
	int POLISHER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.AssemblerImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GeneratorImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__IN = MACHINE__IN;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GenHeadImpl <em>Gen Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GenHeadImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenHead()
	 * @generated
	 */
	int GEN_HEAD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__NAME = GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__OUT = GENERATOR__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__IN = GENERATOR__IN;

	/**
	 * The number of structural features of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GenHandleImpl <em>Gen Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GenHandleImpl
	 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenHandle()
	 * @generated
	 */
	int GEN_HANDLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__NAME = GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__OUT = GENERATOR__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__IN = GENERATOR__IN;

	/**
	 * The number of structural features of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_OPERATION_COUNT = GENERATOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line Model</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.ProductionLineModel
	 * @generated
	 */
	EClass getProductionLineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.pls.model.ProductionLineModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.ProductionLineModel#getElements()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Elements();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.model.Machine#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Machine#getOut()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Out();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.model.Machine#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Machine#getIn()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_In();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.modelling.pls.model.Container#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parts</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Container#getParts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Parts();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.pls.model.Conveyor#getTray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Conveyor#getTray()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Tray();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Tray
	 * @generated
	 */
	EClass getTray();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Hammer <em>Hammer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hammer</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Hammer
	 * @generated
	 */
	EClass getHammer();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Handle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Handle
	 * @generated
	 */
	EClass getHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Polisher <em>Polisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polisher</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Polisher
	 * @generated
	 */
	EClass getPolisher();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.GenHead <em>Gen Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Head</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.GenHead
	 * @generated
	 */
	EClass getGenHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.GenHandle <em>Gen Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Handle</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.GenHandle
	 * @generated
	 */
	EClass getGenHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.pls.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.pls.model.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.modelling.pls.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ProductionLineModelImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getProductionLineModel()
		 * @generated
		 */
		EClass PRODUCTION_LINE_MODEL = eINSTANCE.getProductionLineModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__ELEMENTS = eINSTANCE.getProductionLineModel_Elements();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.MachineImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUT = eINSTANCE.getMachine_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__IN = eINSTANCE.getMachine_In();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ContainerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PARTS = eINSTANCE.getContainer_Parts();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.PartImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ConveyorImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Tray</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__TRAY = eINSTANCE.getConveyor_Tray();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.TrayImpl <em>Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.TrayImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getTray()
		 * @generated
		 */
		EClass TRAY = eINSTANCE.getTray();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HammerImpl <em>Hammer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HammerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHammer()
		 * @generated
		 */
		EClass HAMMER = eINSTANCE.getHammer();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HeadImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.HandleImpl <em>Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.HandleImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getHandle()
		 * @generated
		 */
		EClass HANDLE = eINSTANCE.getHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.PolisherImpl <em>Polisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.PolisherImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getPolisher()
		 * @generated
		 */
		EClass POLISHER = eINSTANCE.getPolisher();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.AssemblerImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GeneratorImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GenHeadImpl <em>Gen Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GenHeadImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenHead()
		 * @generated
		 */
		EClass GEN_HEAD = eINSTANCE.getGenHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.GenHandleImpl <em>Gen Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.GenHandleImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getGenHandle()
		 * @generated
		 */
		EClass GEN_HANDLE = eINSTANCE.getGenHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.pls.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.NamedElementImpl
		 * @see uk.ac.kcl.inf.modelling.pls.model.impl.ModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //ModelPackage
