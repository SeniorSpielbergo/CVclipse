/**
 */
package de.tu_bs.cs.isf.mbse.cvclipse.provider;


import de.tu_bs.cs.isf.mbse.cvclipse.CvclipseFactory;
import de.tu_bs.cs.isf.mbse.cvclipse.CvclipsePackage;
import de.tu_bs.cs.isf.mbse.cvclipse.Letter;

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
 * This is the item provider adapter for a {@link de.tu_bs.cs.isf.mbse.cvclipse.Letter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LetterItemProvider
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
	public LetterItemProvider(AdapterFactory adapterFactory) {
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

			addRecipientCompanyPropertyDescriptor(object);
			addRecipientStreetPropertyDescriptor(object);
			addRecipientCityPropertyDescriptor(object);
			addRecipientCountryPropertyDescriptor(object);
			addRecipientAttentionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Recipient Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecipientCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Letter_recipientCompany_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Letter_recipientCompany_feature", "_UI_Letter_type"),
				 CvclipsePackage.Literals.LETTER__RECIPIENT_COMPANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recipient Street feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecipientStreetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Letter_recipientStreet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Letter_recipientStreet_feature", "_UI_Letter_type"),
				 CvclipsePackage.Literals.LETTER__RECIPIENT_STREET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recipient City feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecipientCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Letter_recipientCity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Letter_recipientCity_feature", "_UI_Letter_type"),
				 CvclipsePackage.Literals.LETTER__RECIPIENT_CITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recipient Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecipientCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Letter_recipientCountry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Letter_recipientCountry_feature", "_UI_Letter_type"),
				 CvclipsePackage.Literals.LETTER__RECIPIENT_COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recipient Attention feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecipientAttentionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Letter_recipientAttention_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Letter_recipientAttention_feature", "_UI_Letter_type"),
				 CvclipsePackage.Literals.LETTER__RECIPIENT_ATTENTION,
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
			childrenFeatures.add(CvclipsePackage.Literals.LETTER__OPENING);
			childrenFeatures.add(CvclipsePackage.Literals.LETTER__CLOSING);
			childrenFeatures.add(CvclipsePackage.Literals.LETTER__ENCLOSURE);
			childrenFeatures.add(CvclipsePackage.Literals.LETTER__TEXT);
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
	 * This returns Letter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Letter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Letter)object).getRecipientCompany();
		return label == null || label.length() == 0 ?
			getString("_UI_Letter_type") :
			getString("_UI_Letter_type") + " " + label;
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

		switch (notification.getFeatureID(Letter.class)) {
			case CvclipsePackage.LETTER__RECIPIENT_COMPANY:
			case CvclipsePackage.LETTER__RECIPIENT_STREET:
			case CvclipsePackage.LETTER__RECIPIENT_CITY:
			case CvclipsePackage.LETTER__RECIPIENT_COUNTRY:
			case CvclipsePackage.LETTER__RECIPIENT_ATTENTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CvclipsePackage.LETTER__OPENING:
			case CvclipsePackage.LETTER__CLOSING:
			case CvclipsePackage.LETTER__ENCLOSURE:
			case CvclipsePackage.LETTER__TEXT:
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
				(CvclipsePackage.Literals.LETTER__OPENING,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.LETTER__CLOSING,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.LETTER__ENCLOSURE,
				 CvclipseFactory.eINSTANCE.create(CvclipsePackage.Literals.LANGUAGE_TO_TEXT_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CvclipsePackage.Literals.LETTER__TEXT,
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
			childFeature == CvclipsePackage.Literals.LETTER__OPENING ||
			childFeature == CvclipsePackage.Literals.LETTER__CLOSING ||
			childFeature == CvclipsePackage.Literals.LETTER__ENCLOSURE ||
			childFeature == CvclipsePackage.Literals.LETTER__TEXT;

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
		return cvclipseEditPlugin.INSTANCE;
	}

}
