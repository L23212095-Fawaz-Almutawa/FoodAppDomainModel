/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver <em>Deliverydriver</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomer_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomer_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Customerservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customerservice</em>' reference.
	 * @see #setCustomerservice(CustomerService)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomer_Customerservice()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	CustomerService getCustomerservice();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice <em>Customerservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customerservice</em>' reference.
	 * @see #getCustomerservice()
	 * @generated
	 */
	void setCustomerservice(CustomerService value);

	/**
	 * Returns the value of the '<em><b>Deliverydriver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverydriver</em>' reference.
	 * @see #setDeliverydriver(DeliveryDriver)
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage#getCustomer_Deliverydriver()
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	DeliveryDriver getDeliverydriver();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver <em>Deliverydriver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverydriver</em>' reference.
	 * @see #getDeliverydriver()
	 * @generated
	 */
	void setDeliverydriver(DeliveryDriver value);

} // Customer
