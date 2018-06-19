/**
 */
package uk.ac.kcl.inf.modelling.pls.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.pls.model.ProductionLineModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.pls.model.ModelPackage#getProductionLineModel()
 * @model
 * @generated
 */
public interface ProductionLineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.pls.model.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.pls.model.ModelPackage#getProductionLineModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getElements();

} // ProductionLineModel
