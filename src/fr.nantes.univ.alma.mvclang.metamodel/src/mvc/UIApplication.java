/**
 */
package mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.UIApplication#getPages <em>Pages</em>}</li>
 *   <li>{@link mvc.UIApplication#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getUIApplication()
 * @model
 * @generated
 */
public interface UIApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see mvc.MvcPackage#getUIApplication_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getPages();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see mvc.MvcPackage#getUIApplication_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

} // UIApplication
