/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCuisine <em>Cuisine</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice <em>Customerservice</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getRestaurantManager()
 * @model
 * @generated
 */
public interface RestaurantManager extends User {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getRestaurantManager_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Cuisine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuisine</em>' attribute.
	 * @see #setCuisine(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getRestaurantManager_Cuisine()
	 * @model
	 * @generated
	 */
	String getCuisine();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCuisine <em>Cuisine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cuisine</em>' attribute.
	 * @see #getCuisine()
	 * @generated
	 */
	void setCuisine(String value);

	/**
	 * Returns the value of the '<em><b>Customerservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager <em>Restaurantmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customerservice</em>' reference.
	 * @see #setCustomerservice(CustomerService)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getRestaurantManager_Customerservice()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager
	 * @model opposite="restaurantmanager"
	 * @generated
	 */
	CustomerService getCustomerservice();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice <em>Customerservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customerservice</em>' reference.
	 * @see #getCustomerservice()
	 * @generated
	 */
	void setCustomerservice(CustomerService value);

} // RestaurantManager
