/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.ModelProperty#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getModelProperty()
 * @model
 * @generated
 */
public interface ModelProperty extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mvc.Model#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see mvc.MvcPackage#getModelProperty_Model()
	 * @see mvc.Model#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link mvc.ModelProperty#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // ModelProperty
