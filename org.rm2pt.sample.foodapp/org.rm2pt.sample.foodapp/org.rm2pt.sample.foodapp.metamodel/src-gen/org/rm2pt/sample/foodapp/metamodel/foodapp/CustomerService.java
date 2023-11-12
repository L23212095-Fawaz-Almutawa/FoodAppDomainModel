/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager <em>Restaurantmanager</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver <em>Deliverydriver</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomerService()
 * @model
 * @generated
 */
public interface CustomerService extends User {

	/**
	 * Returns the value of the '<em><b>Restaurantmanager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restaurantmanager</em>' reference.
	 * @see #setRestaurantmanager(RestaurantManager)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomerService_Restaurantmanager()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice
	 * @model opposite="customerservice"
	 * @generated
	 */
	RestaurantManager getRestaurantmanager();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager <em>Restaurantmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restaurantmanager</em>' reference.
	 * @see #getRestaurantmanager()
	 * @generated
	 */
	void setRestaurantmanager(RestaurantManager value);

	/**
	 * Returns the value of the '<em><b>Deliverydriver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverydriver</em>' reference.
	 * @see #setDeliverydriver(DeliveryDriver)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomerService_Deliverydriver()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice
	 * @model opposite="customerservice"
	 * @generated
	 */
	DeliveryDriver getDeliverydriver();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver <em>Deliverydriver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverydriver</em>' reference.
	 * @see #getDeliverydriver()
	 * @generated
	 */
	void setDeliverydriver(DeliveryDriver value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomerService_Customer()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice
	 * @model opposite="customerservice"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);
} // CustomerService
