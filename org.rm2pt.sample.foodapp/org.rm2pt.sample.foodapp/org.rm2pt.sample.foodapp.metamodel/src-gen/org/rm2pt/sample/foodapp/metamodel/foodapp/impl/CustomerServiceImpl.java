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
import org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl#getRestaurantmanager <em>Restaurantmanager</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl#getDeliverydriver <em>Deliverydriver</em>}</li>
 *   <li>{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerServiceImpl extends UserImpl implements CustomerService {
	/**
	 * The cached value of the '{@link #getRestaurantmanager() <em>Restaurantmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestaurantmanager()
	 * @generated
	 * @ordered
	 */
	protected RestaurantManager restaurantmanager;
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
	protected CustomerServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoodappPackage.Literals.CUSTOMER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantManager getRestaurantmanager() {
		if (restaurantmanager != null && restaurantmanager.eIsProxy()) {
			InternalEObject oldRestaurantmanager = (InternalEObject) restaurantmanager;
			restaurantmanager = (RestaurantManager) eResolveProxy(oldRestaurantmanager);
			if (restaurantmanager != oldRestaurantmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER, oldRestaurantmanager,
							restaurantmanager));
			}
		}
		return restaurantmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantManager basicGetRestaurantmanager() {
		return restaurantmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestaurantmanager(RestaurantManager newRestaurantmanager, NotificationChain msgs) {
		RestaurantManager oldRestaurantmanager = restaurantmanager;
		restaurantmanager = newRestaurantmanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER, oldRestaurantmanager, newRestaurantmanager);
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
	public void setRestaurantmanager(RestaurantManager newRestaurantmanager) {
		if (newRestaurantmanager != restaurantmanager) {
			NotificationChain msgs = null;
			if (restaurantmanager != null)
				msgs = ((InternalEObject) restaurantmanager).eInverseRemove(this,
						FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE, RestaurantManager.class, msgs);
			if (newRestaurantmanager != null)
				msgs = ((InternalEObject) newRestaurantmanager).eInverseAdd(this,
						FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE, RestaurantManager.class, msgs);
			msgs = basicSetRestaurantmanager(newRestaurantmanager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER,
					newRestaurantmanager, newRestaurantmanager));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER, oldDeliverydriver, deliverydriver));
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
					FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER, oldDeliverydriver, newDeliverydriver);
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
				msgs = ((InternalEObject) deliverydriver).eInverseRemove(this,
						FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE, DeliveryDriver.class, msgs);
			if (newDeliverydriver != null)
				msgs = ((InternalEObject) newDeliverydriver).eInverseAdd(this,
						FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE, DeliveryDriver.class, msgs);
			msgs = basicSetDeliverydriver(newDeliverydriver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER,
					newDeliverydriver, newDeliverydriver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FoodappPackage.CUSTOMER_SERVICE__CUSTOMER,
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
					FoodappPackage.CUSTOMER_SERVICE__CUSTOMER, oldCustomer, newCustomer);
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
				msgs = ((InternalEObject) customer).eInverseRemove(this, FoodappPackage.CUSTOMER__CUSTOMERSERVICE,
						Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject) newCustomer).eInverseAdd(this, FoodappPackage.CUSTOMER__CUSTOMERSERVICE,
						Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoodappPackage.CUSTOMER_SERVICE__CUSTOMER,
					newCustomer, newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			if (restaurantmanager != null)
				msgs = ((InternalEObject) restaurantmanager).eInverseRemove(this,
						FoodappPackage.RESTAURANT_MANAGER__CUSTOMERSERVICE, RestaurantManager.class, msgs);
			return basicSetRestaurantmanager((RestaurantManager) otherEnd, msgs);
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			if (deliverydriver != null)
				msgs = ((InternalEObject) deliverydriver).eInverseRemove(this,
						FoodappPackage.DELIVERY_DRIVER__CUSTOMERSERVICE, DeliveryDriver.class, msgs);
			return basicSetDeliverydriver((DeliveryDriver) otherEnd, msgs);
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, FoodappPackage.CUSTOMER__CUSTOMERSERVICE,
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
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			return basicSetRestaurantmanager(null, msgs);
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			return basicSetDeliverydriver(null, msgs);
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
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
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			if (resolve)
				return getRestaurantmanager();
			return basicGetRestaurantmanager();
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			if (resolve)
				return getDeliverydriver();
			return basicGetDeliverydriver();
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
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
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			setRestaurantmanager((RestaurantManager) newValue);
			return;
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			setDeliverydriver((DeliveryDriver) newValue);
			return;
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
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
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			setRestaurantmanager((RestaurantManager) null);
			return;
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			setDeliverydriver((DeliveryDriver) null);
			return;
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
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
		case FoodappPackage.CUSTOMER_SERVICE__RESTAURANTMANAGER:
			return restaurantmanager != null;
		case FoodappPackage.CUSTOMER_SERVICE__DELIVERYDRIVER:
			return deliverydriver != null;
		case FoodappPackage.CUSTOMER_SERVICE__CUSTOMER:
			return customer != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerServiceImpl
