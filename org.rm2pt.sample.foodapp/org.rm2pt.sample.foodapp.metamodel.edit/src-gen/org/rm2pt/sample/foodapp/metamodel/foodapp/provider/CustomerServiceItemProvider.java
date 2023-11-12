/**
 */
package org.rm2pt.sample.foodapp.metamodel.foodapp.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService;
import org.rm2pt.sample.foodapp.metamodel.foodapp.FoodappPackage;

/**
 * This is the item provider adapter for a {@link org.rm2pt.sample.foodapp.metamodel.foodapp.CustomerService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerServiceItemProvider extends UserItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerServiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRestaurantmanagerPropertyDescriptor(object);
			addDeliverydriverPropertyDescriptor(object);
			addCustomerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Restaurantmanager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestaurantmanagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CustomerService_restaurantmanager_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CustomerService_restaurantmanager_feature",
						"_UI_CustomerService_type"),
				FoodappPackage.Literals.CUSTOMER_SERVICE__RESTAURANTMANAGER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Deliverydriver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeliverydriverPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CustomerService_deliverydriver_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CustomerService_deliverydriver_feature",
								"_UI_CustomerService_type"),
						FoodappPackage.Literals.CUSTOMER_SERVICE__DELIVERYDRIVER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Customer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CustomerService_customer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CustomerService_customer_feature",
								"_UI_CustomerService_type"),
						FoodappPackage.Literals.CUSTOMER_SERVICE__CUSTOMER, true, false, true, null, null, null));
	}

	/**
	 * This returns CustomerService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomerService"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CustomerService) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CustomerService_type")
				: getString("_UI_CustomerService_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
