/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.sample.foodapp.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.rm2pt.sample.foodapp.ide.contentassist.antlr.internal.InternalDslParser;
import org.rm2pt.sample.foodapp.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUserAccess().getAlternatives(), "rule__User__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getUserBaseAccess().getGroup(), "rule__UserBase__Group__0");
			builder.put(grammarAccess.getUserBaseAccess().getGroup_3(), "rule__UserBase__Group_3__0");
			builder.put(grammarAccess.getUserBaseAccess().getGroup_3_3(), "rule__UserBase__Group_3_3__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup(), "rule__CustomerService__Group__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_4(), "rule__CustomerService__Group_4__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_5(), "rule__CustomerService__Group_5__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_6(), "rule__CustomerService__Group_6__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_7(), "rule__CustomerService__Group_7__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_8(), "rule__CustomerService__Group_8__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_9(), "rule__CustomerService__Group_9__0");
			builder.put(grammarAccess.getCustomerServiceAccess().getGroup_10(), "rule__CustomerService__Group_10__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup(), "rule__DeliveryDriver__Group__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_4(), "rule__DeliveryDriver__Group_4__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_5(), "rule__DeliveryDriver__Group_5__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_6(), "rule__DeliveryDriver__Group_6__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_7(), "rule__DeliveryDriver__Group_7__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_8(), "rule__DeliveryDriver__Group_8__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_9(), "rule__DeliveryDriver__Group_9__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_10(), "rule__DeliveryDriver__Group_10__0");
			builder.put(grammarAccess.getDeliveryDriverAccess().getGroup_11(), "rule__DeliveryDriver__Group_11__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup(), "rule__RestaurantManager__Group__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_4(), "rule__RestaurantManager__Group_4__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_5(), "rule__RestaurantManager__Group_5__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_6(), "rule__RestaurantManager__Group_6__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_7(), "rule__RestaurantManager__Group_7__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_8(), "rule__RestaurantManager__Group_8__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_9(), "rule__RestaurantManager__Group_9__0");
			builder.put(grammarAccess.getRestaurantManagerAccess().getGroup_10(), "rule__RestaurantManager__Group_10__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_4(), "rule__Customer__Group_4__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_5(), "rule__Customer__Group_5__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_6(), "rule__Customer__Group_6__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_7(), "rule__Customer__Group_7__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_8(), "rule__Customer__Group_8__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_9(), "rule__Customer__Group_9__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_10(), "rule__Customer__Group_10__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_11(), "rule__Customer__Group_11__0");
			builder.put(grammarAccess.getUserBaseAccess().getUsersAssignment_3_2(), "rule__UserBase__UsersAssignment_3_2");
			builder.put(grammarAccess.getUserBaseAccess().getUsersAssignment_3_3_1(), "rule__UserBase__UsersAssignment_3_3_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getNameAssignment_2(), "rule__CustomerService__NameAssignment_2");
			builder.put(grammarAccess.getCustomerServiceAccess().getUsernameAssignment_4_1(), "rule__CustomerService__UsernameAssignment_4_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getPasswordAssignment_5_1(), "rule__CustomerService__PasswordAssignment_5_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getIdAssignment_6_1(), "rule__CustomerService__IdAssignment_6_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getPhoneNumberAssignment_7_1(), "rule__CustomerService__PhoneNumberAssignment_7_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getRestaurantmanagerAssignment_8_1(), "rule__CustomerService__RestaurantmanagerAssignment_8_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getDeliverydriverAssignment_9_1(), "rule__CustomerService__DeliverydriverAssignment_9_1");
			builder.put(grammarAccess.getCustomerServiceAccess().getCustomerAssignment_10_1(), "rule__CustomerService__CustomerAssignment_10_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getNameAssignment_2(), "rule__DeliveryDriver__NameAssignment_2");
			builder.put(grammarAccess.getDeliveryDriverAccess().getUsernameAssignment_4_1(), "rule__DeliveryDriver__UsernameAssignment_4_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getPasswordAssignment_5_1(), "rule__DeliveryDriver__PasswordAssignment_5_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getIdAssignment_6_1(), "rule__DeliveryDriver__IdAssignment_6_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getPhoneNumberAssignment_7_1(), "rule__DeliveryDriver__PhoneNumberAssignment_7_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getVehicleNumberAssignment_8_1(), "rule__DeliveryDriver__VehicleNumberAssignment_8_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getVehicleTypeAssignment_9_1(), "rule__DeliveryDriver__VehicleTypeAssignment_9_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getCustomerserviceAssignment_10_1(), "rule__DeliveryDriver__CustomerserviceAssignment_10_1");
			builder.put(grammarAccess.getDeliveryDriverAccess().getCustomerAssignment_11_1(), "rule__DeliveryDriver__CustomerAssignment_11_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getNameAssignment_2(), "rule__RestaurantManager__NameAssignment_2");
			builder.put(grammarAccess.getRestaurantManagerAccess().getUsernameAssignment_4_1(), "rule__RestaurantManager__UsernameAssignment_4_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getPasswordAssignment_5_1(), "rule__RestaurantManager__PasswordAssignment_5_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getIdAssignment_6_1(), "rule__RestaurantManager__IdAssignment_6_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getPhoneNumberAssignment_7_1(), "rule__RestaurantManager__PhoneNumberAssignment_7_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getAddressAssignment_8_1(), "rule__RestaurantManager__AddressAssignment_8_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getCuisineAssignment_9_1(), "rule__RestaurantManager__CuisineAssignment_9_1");
			builder.put(grammarAccess.getRestaurantManagerAccess().getCustomerserviceAssignment_10_1(), "rule__RestaurantManager__CustomerserviceAssignment_10_1");
			builder.put(grammarAccess.getCustomerAccess().getNameAssignment_2(), "rule__Customer__NameAssignment_2");
			builder.put(grammarAccess.getCustomerAccess().getUsernameAssignment_4_1(), "rule__Customer__UsernameAssignment_4_1");
			builder.put(grammarAccess.getCustomerAccess().getPasswordAssignment_5_1(), "rule__Customer__PasswordAssignment_5_1");
			builder.put(grammarAccess.getCustomerAccess().getIdAssignment_6_1(), "rule__Customer__IdAssignment_6_1");
			builder.put(grammarAccess.getCustomerAccess().getPhoneNumberAssignment_7_1(), "rule__Customer__PhoneNumberAssignment_7_1");
			builder.put(grammarAccess.getCustomerAccess().getAddressAssignment_8_1(), "rule__Customer__AddressAssignment_8_1");
			builder.put(grammarAccess.getCustomerAccess().getEmailAssignment_9_1(), "rule__Customer__EmailAssignment_9_1");
			builder.put(grammarAccess.getCustomerAccess().getCustomerserviceAssignment_10_1(), "rule__Customer__CustomerserviceAssignment_10_1");
			builder.put(grammarAccess.getCustomerAccess().getDeliverydriverAssignment_11_1(), "rule__Customer__DeliverydriverAssignment_11_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
