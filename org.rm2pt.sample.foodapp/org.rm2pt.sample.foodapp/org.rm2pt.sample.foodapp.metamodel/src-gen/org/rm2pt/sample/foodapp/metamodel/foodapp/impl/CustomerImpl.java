/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.rm2pt.sample.foodapp.metamodel.foodapp.Customer;
import org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService;
import org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver;
import org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl#getDeliverydriver <em>Deliverydriver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerservice() <em>Customerservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerservice()
	 * @generated
	 * @ordered
	 */
	protected CustomerService customerservice;

	/**
	 * The cached value of the '{@link #getDeliverydriver() <em>Deliverydriver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverydriver()
	 * @generated
	 * @ordered
	 */
	protected DeliveryDriver deliverydriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodappPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerService getCustomerservice() {
		if (customerservice != null && customerservice.eIsProxy()) {
			InternalEObject oldCustomerservice = (InternalEObject) customerservice;
			customerservice = (CustomerService) eResolveProxy(oldCustomerservice);
			if (customerservice != oldCustomerservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodappPackage.CUSTOMER__CUSTOMERSERVICE,
							oldCustomerservice, customerservice));
			}
		}
		return customerservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerService basicGetCustomerservice() {
		return customerservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerservice(CustomerService newCustomerservice, NotificationChain msgs) {
		CustomerService oldCustomerservice = customerservice;
		customerservice = newCustomerservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FoodappPackage.CUSTOMER__CUSTOMERSERVICE, oldCustomerservice, newCustomerservice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerservice(CustomerService newCustomerservice) {
		if (newCustomerservice != customerservice) {
			NotificationChain msgs = null;
			if (customerservice != null)
				msgs = ((InternalEObject) customerservice).eInverseRemove(this,
						FoodappPackage.CUSTOMER_SERVICE__CUSTOMER, CustomerService.class, msgs);
			if (newCustomerservice != null)
				msgs = ((InternalEObject) newCustomerservice).eInverseAdd(this,
						FoodappPackage.CUSTOMER_SERVICE__CUSTOMER, CustomerService.class, msgs);
			msgs = basicSetCustomerservice(newCustomerservice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER__CUSTOMERSERVICE,
					newCustomerservice, newCustomerservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryDriver getDeliverydriver() {
		if (deliverydriver != null && deliverydriver.eIsProxy()) {
			InternalEObject oldDeliverydriver = (InternalEObject) deliverydriver;
			deliverydriver = (DeliveryDriver) eResolveProxy(oldDeliverydriver);
			if (deliverydriver != oldDeliverydriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodappPackage.CUSTOMER__DELIVERYDRIVER,
							oldDeliverydriver, deliverydriver));
			}
		}
		return deliverydriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryDriver basicGetDeliverydriver() {
		return deliverydriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverydriver(DeliveryDriver newDeliverydriver, NotificationChain msgs) {
		DeliveryDriver oldDeliverydriver = deliverydriver;
		deliverydriver = newDeliverydriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FoodappPackage.CUSTOMER__DELIVERYDRIVER, oldDeliverydriver, newDeliverydriver);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverydriver(DeliveryDriver newDeliverydriver) {
		if (newDeliverydriver != deliverydriver) {
			NotificationChain msgs = null;
			if (deliverydriver != null)
				msgs = ((InternalEObject) deliverydriver).eInverseRemove(this, FoodappPackage.DELIVERY_DRIVER__CUSTOMER,
						DeliveryDriver.class, msgs);
			if (newDeliverydriver != null)
				msgs = ((InternalEObject) newDeliverydriver).eInverseAdd(this, FoodappPackage.DELIVERY_DRIVER__CUSTOMER,
						DeliveryDriver.class, msgs);
			msgs = basicSetDeliverydriver(newDeliverydriver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER__DELIVERYDRIVER,
					newDeliverydriver, newDeliverydriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			if (customerservice != null)
				msgs = ((InternalEObject) customerservice).eInverseRemove(this,
						FoodappPackage.CUSTOMER_SERVICE__CUSTOMER, CustomerService.class, msgs);
			return basicSetCustomerservice((CustomerService) otherEnd, msgs);
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			if (deliverydriver != null)
				msgs = ((InternalEObject) deliverydriver).eInverseRemove(this, FoodappPackage.DELIVERY_DRIVER__CUSTOMER,
						DeliveryDriver.class, msgs);
			return basicSetDeliverydriver((DeliveryDriver) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			return basicSetCustomerservice(null, msgs);
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			return basicSetDeliverydriver(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__ADDRESS:
			return getAddress();
		case FoodappPackage.CUSTOMER__EMAIL:
			return getEmail();
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			if (resolve)
				return getCustomerservice();
			return basicGetCustomerservice();
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			if (resolve)
				return getDeliverydriver();
			return basicGetDeliverydriver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__ADDRESS:
			setAddress((String) newValue);
			return;
		case FoodappPackage.CUSTOMER__EMAIL:
			setEmail((String) newValue);
			return;
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) newValue);
			return;
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			setDeliverydriver((DeliveryDriver) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case FoodappPackage.CUSTOMER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) null);
			return;
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			setDeliverydriver((DeliveryDriver) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case FoodappPackage.CUSTOMER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case FoodappPackage.CUSTOMER__CUSTOMERSERVICE:
			return customerservice != null;
		case FoodappPackage.CUSTOMER__DELIVERYDRIVER:
			return deliverydriver != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
