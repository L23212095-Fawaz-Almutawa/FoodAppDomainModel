/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappFactory
 * @model kind="package"
 * @generated
 */
public interface FoodappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "foodapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rm2pt.com/foodapp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "foodapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoodappPackage eINSTANCE = org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserBaseImpl <em>User Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserBaseImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getUserBase()
	 * @generated
	 */
	int USER_BASE = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE__USERS = 0;

	/**
	 * The number of structural features of the '<em>User Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 2;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHONE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 4;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl <em>Customer Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getCustomerService()
	 * @generated
	 */
	int CUSTOMER_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Restaurantmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__RESTAURANTMANAGER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__DELIVERYDRIVER = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE__CUSTOMER = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Customer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Customer Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SERVICE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl <em>Delivery Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getDeliveryDriver()
	 * @generated
	 */
	int DELIVERY_DRIVER = 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Vehicle Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__VEHICLE_NUMBER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__VEHICLE_TYPE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__CUSTOMERSERVICE = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER__CUSTOMER = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delivery Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Delivery Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DRIVER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl <em>Restaurant Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getRestaurantManager()
	 * @generated
	 */
	int RESTAURANT_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cuisine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__CUISINE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER__CUSTOMERSERVICE = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Restaurant Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Restaurant Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MANAGER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Customerservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMERSERVICE = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deliverydriver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DELIVERYDRIVER = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase <em>User Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Base</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase
	 * @generated
	 */
	EClass getUserBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase#getUsers()
	 * @see #getUserBase()
	 * @generated
	 */
	EReference getUserBase_Users();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User#getPhoneNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService <em>Customer Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Service</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService
	 * @generated
	 */
	EClass getCustomerService();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager <em>Restaurantmanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Restaurantmanager</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getRestaurantmanager()
	 * @see #getCustomerService()
	 * @generated
	 */
	EReference getCustomerService_Restaurantmanager();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver <em>Deliverydriver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverydriver</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getDeliverydriver()
	 * @see #getCustomerService()
	 * @generated
	 */
	EReference getCustomerService_Deliverydriver();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService#getCustomer()
	 * @see #getCustomerService()
	 * @generated
	 */
	EReference getCustomerService_Customer();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver <em>Delivery Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Driver</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver
	 * @generated
	 */
	EClass getDeliveryDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleNumber <em>Vehicle Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Number</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleNumber()
	 * @see #getDeliveryDriver()
	 * @generated
	 */
	EAttribute getDeliveryDriver_VehicleNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getVehicleType()
	 * @see #getDeliveryDriver()
	 * @generated
	 */
	EAttribute getDeliveryDriver_VehicleType();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customerservice</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomerservice()
	 * @see #getDeliveryDriver()
	 * @generated
	 */
	EReference getDeliveryDriver_Customerservice();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver#getCustomer()
	 * @see #getDeliveryDriver()
	 * @generated
	 */
	EReference getDeliveryDriver_Customer();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager <em>Restaurant Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant Manager</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager
	 * @generated
	 */
	EClass getRestaurantManager();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getAddress()
	 * @see #getRestaurantManager()
	 * @generated
	 */
	EAttribute getRestaurantManager_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCuisine <em>Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cuisine</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCuisine()
	 * @see #getRestaurantManager()
	 * @generated
	 */
	EAttribute getRestaurantManager_Cuisine();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customerservice</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager#getCustomerservice()
	 * @see #getRestaurantManager()
	 * @generated
	 */
	EReference getRestaurantManager_Customerservice();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice <em>Customerservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customerservice</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getCustomerservice()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Customerservice();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver <em>Deliverydriver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverydriver</em>'.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer#getDeliverydriver()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Deliverydriver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoodappFactory getFoodappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserBaseImpl <em>User Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserBaseImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getUserBase()
		 * @generated
		 */
		EClass USER_BASE = eINSTANCE.getUserBase();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_BASE__USERS = eINSTANCE.getUserBase_Users();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.UserImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHONE_NUMBER = eINSTANCE.getUser_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl <em>Customer Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerServiceImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getCustomerService()
		 * @generated
		 */
		EClass CUSTOMER_SERVICE = eINSTANCE.getCustomerService();

		/**
		 * The meta object literal for the '<em><b>Restaurantmanager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SERVICE__RESTAURANTMANAGER = eINSTANCE.getCustomerService_Restaurantmanager();

		/**
		 * The meta object literal for the '<em><b>Deliverydriver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SERVICE__DELIVERYDRIVER = eINSTANCE.getCustomerService_Deliverydriver();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_SERVICE__CUSTOMER = eINSTANCE.getCustomerService_Customer();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl <em>Delivery Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.DeliveryDriverImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getDeliveryDriver()
		 * @generated
		 */
		EClass DELIVERY_DRIVER = eINSTANCE.getDeliveryDriver();

		/**
		 * The meta object literal for the '<em><b>Vehicle Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_DRIVER__VEHICLE_NUMBER = eINSTANCE.getDeliveryDriver_VehicleNumber();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_DRIVER__VEHICLE_TYPE = eINSTANCE.getDeliveryDriver_VehicleType();

		/**
		 * The meta object literal for the '<em><b>Customerservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_DRIVER__CUSTOMERSERVICE = eINSTANCE.getDeliveryDriver_Customerservice();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_DRIVER__CUSTOMER = eINSTANCE.getDeliveryDriver_Customer();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl <em>Restaurant Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.RestaurantManagerImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getRestaurantManager()
		 * @generated
		 */
		EClass RESTAURANT_MANAGER = eINSTANCE.getRestaurantManager();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_MANAGER__ADDRESS = eINSTANCE.getRestaurantManager_Address();

		/**
		 * The meta object literal for the '<em><b>Cuisine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_MANAGER__CUISINE = eINSTANCE.getRestaurantManager_Cuisine();

		/**
		 * The meta object literal for the '<em><b>Customerservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT_MANAGER__CUSTOMERSERVICE = eINSTANCE.getRestaurantManager_Customerservice();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.CustomerImpl
		 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.impl.FoodappPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Customerservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CUSTOMERSERVICE = eINSTANCE.getCustomer_Customerservice();

		/**
		 * The meta object literal for the '<em><b>Deliverydriver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__DELIVERYDRIVER = eINSTANCE.getCustomer_Deliverydriver();

	}

} //FoodappPackage
