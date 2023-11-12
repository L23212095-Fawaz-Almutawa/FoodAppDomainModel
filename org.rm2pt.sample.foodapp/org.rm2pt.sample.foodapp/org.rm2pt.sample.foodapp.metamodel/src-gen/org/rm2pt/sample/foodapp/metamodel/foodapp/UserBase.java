/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getUserBase()
 * @model
 * @generated
 */
public interface UserBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.foodapp.metamodel.foodapp.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getUserBase_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // UserBase
