/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.provider;


import de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory;
import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.tu_bs.cs.isf.mbse.cvclipse.PersonalInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonalInformationItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalInformationItemProvider(AdapterFactory adapterFactory) {
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

			addTwitterPropertyDescriptor(object);
			addFirstnamePropertyDescriptor(object);
			addSurnamePropertyDescriptor(object);
			addBirthNamePropertyDescriptor(object);
			addBirthplacePropertyDescriptor(object);
			addStreetPropertyDescriptor(object);
			addCityPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addPhonePropertyDescriptor(object);
			addMobilePropertyDescriptor(object);
			addFaxPropertyDescriptor(object);
			addWebsitePropertyDescriptor(object);
			addGithubPropertyDescriptor(object);
			addLinkedInPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Twitter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTwitterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_twitter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_twitter_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__TWITTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Firstname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_firstname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_firstname_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__FIRSTNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Surname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSurnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_surname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_surname_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__SURNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Birth Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBirthNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_birthName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_birthName_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__BIRTH_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Birthplace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBirthplacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_birthplace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_birthplace_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__BIRTHPLACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Street feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStreetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_street_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_street_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__STREET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the City feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_city_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_city_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__CITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_email_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_phone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_phone_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__PHONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mobile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMobilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_mobile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_mobile_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__MOBILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_fax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_fax_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__FAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Website feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebsitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_website_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_website_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__WEBSITE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Github feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGithubPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_github_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_github_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__GITHUB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersonalInformation_linkedIn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersonalInformation_linkedIn_feature", "_UI_PersonalInformation_type"),
				 CvclipsePackage.Literals.PERSONAL_INFORMATION__LINKED_IN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CvclipsePackage.Literals.PERSONAL_INFORMATION__MARITAL_STATUS);
			childrenFeatures.add(CvclipsePackage.Literals.PERSONAL_INFORMATION__NATIONALITY);
			childrenFeatures.add(CvclipsePackage.Literals.PERSONAL_INFORMATION__BIRTHDATE);
			childrenFeatures.add(CvclipsePackage.Literals.PERSONAL_INFORMATION__COUNTRY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PersonalInformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PersonalInformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PersonalInformation personalInformation = (PersonalInformation) object;
		StringBuilder label = new StringBuilder();
		label.append("Personal Information: ");
		if(personalInformation.getFirstname()!=null) {
			label.append(personalInformation.getFirstname());
			label.append(" ");
		}
		if(personalInformation.getSurname()!=null) {
			label.append(personalInformation.getSurname());
		}
		
		return label.toString();
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

		switch (notification.getFeatureID(PersonalInformation.class)) {
			case CvclipsePackage.PERSONAL_INFORMATION__TWITTER:
			case CvclipsePackage.PERSONAL_INFORMATION__FIRSTNAME:
			case CvclipsePackage.PERSONAL_INFORMATION__SURNAME:
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTH_NAME:
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHPLACE:
			case CvclipsePackage.PERSONAL_INFORMATION__STREET:
			case CvclipsePackage.PERSONAL_INFORMATION__CITY:
			case CvclipsePackage.PERSONAL_INFORMATION__EMAIL:
			case CvclipsePackage.PERSONAL_INFORMATION__PHONE:
			case CvclipsePackage.PERSONAL_INFORMATION__MOBILE:
			case CvclipsePackage.PERSONAL_INFORMATION__FAX:
			case CvclipsePackage.PERSONAL_INFORMATION__WEBSITE:
			case CvclipsePackage.PERSONAL_INFORMATION__GITHUB:
			case CvclipsePackage.PERSONAL_INFORMATION__LINKED_IN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CvclipsePackage.PERSONAL_INFORMATION__MARITAL_STATUS:
			case CvclipsePackage.PERSONAL_INFORMATION__NATIONALITY:
			case CvclipsePackage.PERSONAL_INFORMATION__BIRTHDATE:
			case CvclipsePackage.PERSONAL_INFORMATION__COUNTRY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.PERSONAL_INFORMATION__MARITAL_STATUS,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.PERSONAL_INFORMATION__NATIONALITY,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.PERSONAL_INFORMATION__BIRTHDATE,
				 CvclipseFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.PERSONAL_INFORMATION__COUNTRY,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CvclipsePackage.Literals.PERSONAL_INFORMATION__MARITAL_STATUS ||
			childFeature == CvclipsePackage.Literals.PERSONAL_INFORMATION__NATIONALITY ||
			childFeature == CvclipsePackage.Literals.PERSONAL_INFORMATION__COUNTRY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CvclipseEditPlugin.INSTANCE;
	}

}
