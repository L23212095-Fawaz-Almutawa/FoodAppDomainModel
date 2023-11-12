/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rm2pt.sample.foodapp.metamodel.foodapp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoodappFactoryImpl extends EFactoryImpl implements FoodappFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FoodappFactory init() {
		try {
			FoodappFactory theFoodappFactory = (FoodappFactory) EPackage.Registry.INSTANCE
					.getEFactory(FoodappPackage.eNS_URI);
			if (theFoodappFactory != null) {
				return theFoodappFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FoodappFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodappFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FoodappPackage.USER_BASE:
			return createUserBase();
		case FoodappPackage.CUSTOMER_SERVICE:
			return createCustomerService();
		case FoodappPackage.DELIVERY_DRIVER:
			return createDeliveryDriver();
		case FoodappPackage.RESTAURANT_MANAGER:
			return createRestaurantManager();
		case FoodappPackage.CUSTOMER:
			return createCustomer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserBase createUserBase() {
		UserBaseImpl userBase = new UserBaseImpl();
		return userBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerService createCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryDriver createDeliveryDriver() {
		DeliveryDriverImpl deliveryDriver = new DeliveryDriverImpl();
		return deliveryDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantManager createRestaurantManager() {
		RestaurantManagerImpl restaurantManager = new RestaurantManagerImpl();
		return restaurantManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodappPackage getFoodappPackage() {
		return (FoodappPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FoodappPackage getPackage() {
		return FoodappPackage.eINSTANCE;
	}

} //FoodappFactoryImpl
