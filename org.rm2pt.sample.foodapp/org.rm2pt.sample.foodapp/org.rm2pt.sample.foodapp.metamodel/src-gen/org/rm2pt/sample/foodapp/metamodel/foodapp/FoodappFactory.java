/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage
 * @generated
 */
public interface FoodappFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoodappFactory eINSTANCE = org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Base</em>'.
	 * @generated
	 */
	UserBase createUserBase();

	/**
	 * Returns a new object of class '<em>Customer Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Service</em>'.
	 * @generated
	 */
	CustomerService createCustomerService();

	/**
	 * Returns a new object of class '<em>Delivery Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Driver</em>'.
	 * @generated
	 */
	DeliveryDriver createDeliveryDriver();

	/**
	 * Returns a new object of class '<em>Restaurant Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant Manager</em>'.
	 * @generated
	 */
	RestaurantManager createRestaurantManager();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FoodappPackage getFoodappPackage();

} //FoodappFactory
