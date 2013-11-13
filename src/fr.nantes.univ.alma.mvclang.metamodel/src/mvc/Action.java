/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Action#getNextPage <em>Next Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(View)
	 * @see mvc.MvcPackage#getAction_NextPage()
	 * @model
	 * @generated
	 */
	View getNextPage();

	/**
	 * Sets the value of the '{@link mvc.Action#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(View value);

} // Action
