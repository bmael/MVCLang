/**
 */
package mvc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Model#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link mvc.Model#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see mvc.MvcPackage#getModel_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.ModelProperty}.
	 * It is bidirectional and its opposite is '{@link mvc.ModelProperty#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see mvc.MvcPackage#getModel_Properties()
	 * @see mvc.ModelProperty#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<ModelProperty> getProperties();

} // Model
