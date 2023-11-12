/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService;
import org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage;
import org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl#getCuisine <em>Cuisine</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl#getCustomerservice <em>Customerservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestaurantManagerImpl extends UserImpl implements RestaurantManager {
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
	 * The default value of the '{@link #getCuisine() <em>Cuisine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuisine()
	 * @generated
	 * @ordered
	 */
	protected static final String CUISINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuisine() <em>Cuisine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuisine()
	 * @generated
	 * @ordered
	 */
	protected String cuisine = CUISINE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodappPackage.Literals.RESTAURANT_MANAGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.RESTAURANT_MANAGER__ADDRESS,
					oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCuisine() {
		return cuisine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCuisine(String newCuisine) {
		String oldCuisine = cuisine;
		cuisine = newCuisine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.RESTAURANT_MANAGER__CUISINE,
					oldCuisine, cuisine));
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
							FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE, oldCustomerservice, customerservice));
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
					FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE, oldCustomerservice, newCustomerservice);
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
						FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER, CustomerService.class, msgs);
			if (newCustomerservice != null)
				msgs = ((InternalEObject) newCustomerservice).eInverseAdd(this,
						FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER, CustomerService.class, msgs);
			msgs = basicSetCustomerservice(newCustomerservice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE,
					newCustomerservice, newCustomerservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			if (customerservice != null)
				msgs = ((InternalEObject) customerservice).eInverseRemove(this,
						FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER, CustomerService.class, msgs);
			return basicSetCustomerservice((CustomerService) otherEnd, msgs);
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
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			return basicSetCustomerservice(null, msgs);
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
		case FoodappPackage.RESTAURANT_MANAGER__ADDRESS:
			return getAddress();
		case FoodappPackage.RESTAURANT_MANAGER__CUISINE:
			return getCuisine();
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			if (resolve)
				return getCustomerservice();
			return basicGetCustomerservice();
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
		case FoodappPackage.RESTAURANT_MANAGER__ADDRESS:
			setAddress((String) newValue);
			return;
		case FoodappPackage.RESTAURANT_MANAGER__CUISINE:
			setCuisine((String) newValue);
			return;
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) newValue);
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
		case FoodappPackage.RESTAURANT_MANAGER__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case FoodappPackage.RESTAURANT_MANAGER__CUISINE:
			setCuisine(CUISINE_EDEFAULT);
			return;
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			setCustomerservice((CustomerService) null);
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
		case FoodappPackage.RESTAURANT_MANAGER__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case FoodappPackage.RESTAURANT_MANAGER__CUISINE:
			return CUISINE_EDEFAULT == null ? cuisine != null : !CUISINE_EDEFAULT.equals(cuisine);
		case FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE:
			return customerservice != null;
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
		result.append(", cuisine: ");
		result.append(cuisine);
		result.append(')');
		return result.toString();
	}

} //RestaurantManagerImpl
