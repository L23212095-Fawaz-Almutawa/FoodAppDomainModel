/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.rm2pt.sample.foodapp.metamodel.foodapp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage
 * @generated
 */
public class FoodappAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FoodappPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodappAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FoodappPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodappSwitch<Adapter> modelSwitch = new FoodappSwitch<Adapter>() {
		@Override
		public Adapter caseUserBase(UserBase object) {
			return createUserBaseAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseCustomerService(CustomerService object) {
			return createCustomerServiceAdapter();
		}

		@Override
		public Adapter caseDeliveryDriver(DeliveryDriver object) {
			return createDeliveryDriverAdapter();
		}

		@Override
		public Adapter caseRestaurantManager(RestaurantManager object) {
			return createRestaurantManagerAdapter();
		}

		@Override
		public Adapter caseCustomer(Customer object) {
			return createCustomerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase <em>User Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.UserBase
	 * @generated
	 */
	public Adapter createUserBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService <em>Customer Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService
	 * @generated
	 */
	public Adapter createCustomerServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver <em>Delivery Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.DeliveryDriver
	 * @generated
	 */
	public Adapter createDeliveryDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager <em>Restaurant Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.RestaurantManager
	 * @generated
	 */
	public Adapter createRestaurantManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.foodapp.metamodel.foodapp.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.foodapp.metamodel.foodapp.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FoodappAdapterFactory
