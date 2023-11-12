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
 * An implementation of the model object '<em><b>Delivery Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl#getVehicleNumber <em>Vehicle Number</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl#getCustomerservice <em>Customerservice</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryDriverImpl extends UserImpl implements DeliveryDriver {
	/**
	 * The default value of the '{@link #getVehicleNumber() <em>Vehicle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleNumber() <em>Vehicle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleNumber()
	 * @generated
	 * @ordered
	 */
	protected String vehicleNumber = VEHICLE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected String vehicleType = VEHICLE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryDriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodappPackage.Literals.DELIVERY_DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleNumber(String newVehicleNumber) {
		String oldVehicleNumber = vehicleNumber;
		vehicleNumber = newVehicleNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.DELIVERY_DRIVER__VEHICLE_NUMBER,
					oldVehicleNumber, vehicleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleType(String newVehicleType) {
		String oldVehicleType = vehicleType;
		vehicleType = newVehicleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.DELIVERY_DRIVER__VEHICLE_TYPE,
					oldVehicleType, vehicleType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE, oldCustomerservice, customerservice));
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
					FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE, oldCustomerservice, newCustomerservice);
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
						FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER, CustomerService.class, msgs);
			if (newCustomerservice != null)
				msgs = ((InternalEObject) newCustomerservice).eInverseAdd(this,
						FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER, CustomerService.class, msgs);
			msgs = basicSetCustomerservice(newCustomerservice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE,
					newCustomerservice, newCustomerservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodappPackage.DELIVERY_DRIVER__CUSTOMER,
							oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FoodappPackage.DELIVERY_DRIVER__CUSTOMER, oldCustomer, newCustomer);
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
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, FoodappPackage.CUSTOMER__DELIVERYDRIVER,
						Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject) newCustomer).eInverseAdd(this, FoodappPackage.CUSTOMER__DELIVERYDRIVER,
						Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.DELIVERY_DRIVER__CUSTOMER, newCustomer,
					newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			if (customerservice != null)
				msgs = ((InternalEObject) customerservice).eInverseRemove(this,
						FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER, CustomerService.class, msgs);
			return basicSetCustomerservice((CustomerService) otherEnd, msgs);
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, FoodappPackage.CUSTOMER__DELIVERYDRIVER,
						Customer.class, msgs);
			return basicSetCustomer((Customer) otherEnd, msgs);
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
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			return basicSetCustomerservice(null, msgs);
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			return basicSetCustomer(null, msgs);
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
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_NUMBER:
			return getVehicleNumber();
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_TYPE:
			return getVehicleType();
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			if (resolve)
				return getCustomerservice();
			return basicGetCustomerservice();
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
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
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_NUMBER:
			setVehicleNumber((String) newValue);
			return;
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_TYPE:
			setVehicleType((String) newValue);
			return;
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) newValue);
			return;
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			setCustomer((Customer) newValue);
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
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_NUMBER:
			setVehicleNumber(VEHICLE_NUMBER_EDEFAULT);
			return;
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_TYPE:
			setVehicleType(VEHICLE_TYPE_EDEFAULT);
			return;
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) null);
			return;
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			setCustomer((Customer) null);
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
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_NUMBER:
			return VEHICLE_NUMBER_EDEFAULT == null ? vehicleNumber != null
					: !VEHICLE_NUMBER_EDEFAULT.equals(vehicleNumber);
		case FoodappPackage.DELIVERY_DRIVER__VEHICLE_TYPE:
			return VEHICLE_TYPE_EDEFAULT == null ? vehicleType != null : !VEHICLE_TYPE_EDEFAULT.equals(vehicleType);
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE:
			return customerservice != null;
		case FoodappPackage.DELIVERY_DRIVER__CUSTOMER:
			return customer != null;
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
		result.append(" (vehicleNumber: ");
		result.append(vehicleNumber);
		result.append(", vehicleType: ");
		result.append(vehicleType);
		result.append(')');
		return result.toString();
	}

} //DeliveryDriverImpl
