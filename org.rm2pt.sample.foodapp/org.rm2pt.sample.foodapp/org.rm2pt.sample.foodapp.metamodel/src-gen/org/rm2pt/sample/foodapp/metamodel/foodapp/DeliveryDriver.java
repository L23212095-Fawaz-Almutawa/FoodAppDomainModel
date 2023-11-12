/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleNumber <em>Vehicle Number</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getDeliveryDriver()
 * @model
 * @generated
 */
public interface DeliveryDriver extends User {
	/**
	 * Returns the value of the '<em><b>Vehicle Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Number</em>' attribute.
	 * @see #setVehicleNumber(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getDeliveryDriver_VehicleNumber()
	 * @model
	 * @generated
	 */
	String getVehicleNumber();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleNumber <em>Vehicle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Number</em>' attribute.
	 * @see #getVehicleNumber()
	 * @generated
	 */
	void setVehicleNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see #setVehicleType(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getDeliveryDriver_VehicleType()
	 * @model
	 * @generated
	 */
	String getVehicleType();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(String value);

	/**
	 * Returns the value of the '<em><b>Customerservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver <em>Deliverydriver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customerservice</em>' reference.
	 * @see #setCustomerservice(CustomerService)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getDeliveryDriver_Customerservice()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver
	 * @model opposite="deliverydriver"
	 * @generated
	 */
	CustomerService getCustomerservice();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice <em>Customerservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customerservice</em>' reference.
	 * @see #getCustomerservice()
	 * @generated
	 */
	void setCustomerservice(CustomerService value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver <em>Deliverydriver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getDeliveryDriver_Customer()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver
	 * @model opposite="deliverydriver"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

} // DeliveryDriver
