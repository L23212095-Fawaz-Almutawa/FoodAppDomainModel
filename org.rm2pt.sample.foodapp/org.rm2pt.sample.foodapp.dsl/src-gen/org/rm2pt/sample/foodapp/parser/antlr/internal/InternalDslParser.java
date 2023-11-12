package org.rm2pt.sample.foodapp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.rm2pt.sample.foodapp.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UserBase'", "'{'", "'users'", "','", "'}'", "'-'", "'CustomerService'", "'username'", "'password'", "'id'", "'phoneNumber'", "'restaurantmanager'", "'deliverydriver'", "'customer'", "'DeliveryDriver'", "'vehicleNumber'", "'vehicleType'", "'customerservice'", "'RestaurantManager'", "'address'", "'cuisine'", "'Customer'", "'email'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UserBase";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUserBase"
    // InternalDsl.g:64:1: entryRuleUserBase returns [EObject current=null] : iv_ruleUserBase= ruleUserBase EOF ;
    public final EObject entryRuleUserBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserBase = null;


        try {
            // InternalDsl.g:64:49: (iv_ruleUserBase= ruleUserBase EOF )
            // InternalDsl.g:65:2: iv_ruleUserBase= ruleUserBase EOF
            {
             newCompositeNode(grammarAccess.getUserBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserBase=ruleUserBase();

            state._fsp--;

             current =iv_ruleUserBase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserBase"


    // $ANTLR start "ruleUserBase"
    // InternalDsl.g:71:1: ruleUserBase returns [EObject current=null] : ( () otherlv_1= 'UserBase' otherlv_2= '{' (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleUserBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_users_5_0 = null;

        EObject lv_users_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'UserBase' otherlv_2= '{' (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'UserBase' otherlv_2= '{' (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'UserBase' otherlv_2= '{' (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'UserBase' otherlv_2= '{' (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserBaseAccess().getUserBaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUserBaseAccess().getUserBaseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUserBaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:94:3: (otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:95:4: otherlv_3= 'users' otherlv_4= '{' ( (lv_users_5_0= ruleUser ) ) (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserBaseAccess().getUsersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserBaseAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalDsl.g:103:4: ( (lv_users_5_0= ruleUser ) )
                    // InternalDsl.g:104:5: (lv_users_5_0= ruleUser )
                    {
                    // InternalDsl.g:104:5: (lv_users_5_0= ruleUser )
                    // InternalDsl.g:105:6: lv_users_5_0= ruleUser
                    {

                    						newCompositeNode(grammarAccess.getUserBaseAccess().getUsersUserParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_users_5_0=ruleUser();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserBaseRule());
                    						}
                    						add(
                    							current,
                    							"users",
                    							lv_users_5_0,
                    							"org.rm2pt.sample.foodapp.Dsl.User");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:122:4: (otherlv_6= ',' ( (lv_users_7_0= ruleUser ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:123:5: otherlv_6= ',' ( (lv_users_7_0= ruleUser ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUserBaseAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:127:5: ( (lv_users_7_0= ruleUser ) )
                    	    // InternalDsl.g:128:6: (lv_users_7_0= ruleUser )
                    	    {
                    	    // InternalDsl.g:128:6: (lv_users_7_0= ruleUser )
                    	    // InternalDsl.g:129:7: lv_users_7_0= ruleUser
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserBaseAccess().getUsersUserParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_users_7_0=ruleUser();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserBaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"users",
                    	    								lv_users_7_0,
                    	    								"org.rm2pt.sample.foodapp.Dsl.User");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getUserBaseAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getUserBaseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserBase"


    // $ANTLR start "entryRuleUser"
    // InternalDsl.g:160:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalDsl.g:160:45: (iv_ruleUser= ruleUser EOF )
            // InternalDsl.g:161:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalDsl.g:167:1: ruleUser returns [EObject current=null] : (this_CustomerService_0= ruleCustomerService | this_DeliveryDriver_1= ruleDeliveryDriver | this_RestaurantManager_2= ruleRestaurantManager | this_Customer_3= ruleCustomer ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        EObject this_CustomerService_0 = null;

        EObject this_DeliveryDriver_1 = null;

        EObject this_RestaurantManager_2 = null;

        EObject this_Customer_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:173:2: ( (this_CustomerService_0= ruleCustomerService | this_DeliveryDriver_1= ruleDeliveryDriver | this_RestaurantManager_2= ruleRestaurantManager | this_Customer_3= ruleCustomer ) )
            // InternalDsl.g:174:2: (this_CustomerService_0= ruleCustomerService | this_DeliveryDriver_1= ruleDeliveryDriver | this_RestaurantManager_2= ruleRestaurantManager | this_Customer_3= ruleCustomer )
            {
            // InternalDsl.g:174:2: (this_CustomerService_0= ruleCustomerService | this_DeliveryDriver_1= ruleDeliveryDriver | this_RestaurantManager_2= ruleRestaurantManager | this_Customer_3= ruleCustomer )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 32:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:175:3: this_CustomerService_0= ruleCustomerService
                    {

                    			newCompositeNode(grammarAccess.getUserAccess().getCustomerServiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomerService_0=ruleCustomerService();

                    state._fsp--;


                    			current = this_CustomerService_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:184:3: this_DeliveryDriver_1= ruleDeliveryDriver
                    {

                    			newCompositeNode(grammarAccess.getUserAccess().getDeliveryDriverParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeliveryDriver_1=ruleDeliveryDriver();

                    state._fsp--;


                    			current = this_DeliveryDriver_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:193:3: this_RestaurantManager_2= ruleRestaurantManager
                    {

                    			newCompositeNode(grammarAccess.getUserAccess().getRestaurantManagerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestaurantManager_2=ruleRestaurantManager();

                    state._fsp--;


                    			current = this_RestaurantManager_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:202:3: this_Customer_3= ruleCustomer
                    {

                    			newCompositeNode(grammarAccess.getUserAccess().getCustomerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Customer_3=ruleCustomer();

                    state._fsp--;


                    			current = this_Customer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:214:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:214:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:215:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:221:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:227:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:228:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:228:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:229:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:237:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:248:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:248:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:249:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:255:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:261:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:263:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:263:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:264:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCustomerService"
    // InternalDsl.g:281:1: entryRuleCustomerService returns [EObject current=null] : iv_ruleCustomerService= ruleCustomerService EOF ;
    public final EObject entryRuleCustomerService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomerService = null;


        try {
            // InternalDsl.g:281:56: (iv_ruleCustomerService= ruleCustomerService EOF )
            // InternalDsl.g:282:2: iv_ruleCustomerService= ruleCustomerService EOF
            {
             newCompositeNode(grammarAccess.getCustomerServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomerService=ruleCustomerService();

            state._fsp--;

             current =iv_ruleCustomerService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomerService"


    // $ANTLR start "ruleCustomerService"
    // InternalDsl.g:288:1: ruleCustomerService returns [EObject current=null] : ( () otherlv_1= 'CustomerService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )? (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )? (otherlv_16= 'customer' ( ( ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleCustomerService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_phoneNumber_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:294:2: ( ( () otherlv_1= 'CustomerService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )? (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )? (otherlv_16= 'customer' ( ( ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalDsl.g:295:2: ( () otherlv_1= 'CustomerService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )? (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )? (otherlv_16= 'customer' ( ( ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalDsl.g:295:2: ( () otherlv_1= 'CustomerService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )? (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )? (otherlv_16= 'customer' ( ( ruleEString ) ) )? otherlv_18= '}' )
            // InternalDsl.g:296:3: () otherlv_1= 'CustomerService' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )? (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )? (otherlv_16= 'customer' ( ( ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalDsl.g:296:3: ()
            // InternalDsl.g:297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomerServiceAccess().getCustomerServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomerServiceAccess().getCustomerServiceKeyword_1());
            		
            // InternalDsl.g:307:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:308:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:308:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:309:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.foodapp.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerServiceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:330:3: (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:331:4: otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomerServiceAccess().getUsernameKeyword_4_0());
                    			
                    // InternalDsl.g:335:4: ( (lv_username_5_0= ruleEString ) )
                    // InternalDsl.g:336:5: (lv_username_5_0= ruleEString )
                    {
                    // InternalDsl.g:336:5: (lv_username_5_0= ruleEString )
                    // InternalDsl.g:337:6: lv_username_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getUsernameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerServiceRule());
                    						}
                    						set(
                    							current,
                    							"username",
                    							lv_username_5_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:355:3: (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:356:4: otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomerServiceAccess().getPasswordKeyword_5_0());
                    			
                    // InternalDsl.g:360:4: ( (lv_password_7_0= ruleEString ) )
                    // InternalDsl.g:361:5: (lv_password_7_0= ruleEString )
                    {
                    // InternalDsl.g:361:5: (lv_password_7_0= ruleEString )
                    // InternalDsl.g:362:6: lv_password_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerServiceRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_7_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:380:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:381:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustomerServiceAccess().getIdKeyword_6_0());
                    			
                    // InternalDsl.g:385:4: ( (lv_id_9_0= ruleEInt ) )
                    // InternalDsl.g:386:5: (lv_id_9_0= ruleEInt )
                    {
                    // InternalDsl.g:386:5: (lv_id_9_0= ruleEInt )
                    // InternalDsl.g:387:6: lv_id_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getIdEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_id_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerServiceRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:405:3: (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:406:4: otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getCustomerServiceAccess().getPhoneNumberKeyword_7_0());
                    			
                    // InternalDsl.g:410:4: ( (lv_phoneNumber_11_0= ruleEString ) )
                    // InternalDsl.g:411:5: (lv_phoneNumber_11_0= ruleEString )
                    {
                    // InternalDsl.g:411:5: (lv_phoneNumber_11_0= ruleEString )
                    // InternalDsl.g:412:6: lv_phoneNumber_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getPhoneNumberEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_phoneNumber_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerServiceRule());
                    						}
                    						set(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_11_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:430:3: (otherlv_12= 'restaurantmanager' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:431:4: otherlv_12= 'restaurantmanager' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getCustomerServiceAccess().getRestaurantmanagerKeyword_8_0());
                    			
                    // InternalDsl.g:435:4: ( ( ruleEString ) )
                    // InternalDsl.g:436:5: ( ruleEString )
                    {
                    // InternalDsl.g:436:5: ( ruleEString )
                    // InternalDsl.g:437:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getRestaurantmanagerRestaurantManagerCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:452:3: (otherlv_14= 'deliverydriver' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:453:4: otherlv_14= 'deliverydriver' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getCustomerServiceAccess().getDeliverydriverKeyword_9_0());
                    			
                    // InternalDsl.g:457:4: ( ( ruleEString ) )
                    // InternalDsl.g:458:5: ( ruleEString )
                    {
                    // InternalDsl.g:458:5: ( ruleEString )
                    // InternalDsl.g:459:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getDeliverydriverDeliveryDriverCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:474:3: (otherlv_16= 'customer' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:475:4: otherlv_16= 'customer' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCustomerServiceAccess().getCustomerKeyword_10_0());
                    			
                    // InternalDsl.g:479:4: ( ( ruleEString ) )
                    // InternalDsl.g:480:5: ( ruleEString )
                    {
                    // InternalDsl.g:480:5: ( ruleEString )
                    // InternalDsl.g:481:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerServiceAccess().getCustomerCustomerCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCustomerServiceAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomerService"


    // $ANTLR start "entryRuleDeliveryDriver"
    // InternalDsl.g:504:1: entryRuleDeliveryDriver returns [EObject current=null] : iv_ruleDeliveryDriver= ruleDeliveryDriver EOF ;
    public final EObject entryRuleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryDriver = null;


        try {
            // InternalDsl.g:504:55: (iv_ruleDeliveryDriver= ruleDeliveryDriver EOF )
            // InternalDsl.g:505:2: iv_ruleDeliveryDriver= ruleDeliveryDriver EOF
            {
             newCompositeNode(grammarAccess.getDeliveryDriverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryDriver=ruleDeliveryDriver();

            state._fsp--;

             current =iv_ruleDeliveryDriver; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeliveryDriver"


    // $ANTLR start "ruleDeliveryDriver"
    // InternalDsl.g:511:1: ruleDeliveryDriver returns [EObject current=null] : ( () otherlv_1= 'DeliveryDriver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )? (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'customer' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleDeliveryDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_phoneNumber_11_0 = null;

        AntlrDatatypeRuleToken lv_vehicleNumber_13_0 = null;

        AntlrDatatypeRuleToken lv_vehicleType_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:517:2: ( ( () otherlv_1= 'DeliveryDriver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )? (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'customer' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalDsl.g:518:2: ( () otherlv_1= 'DeliveryDriver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )? (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'customer' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalDsl.g:518:2: ( () otherlv_1= 'DeliveryDriver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )? (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'customer' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalDsl.g:519:3: () otherlv_1= 'DeliveryDriver' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )? (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'customer' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalDsl.g:519:3: ()
            // InternalDsl.g:520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeliveryDriverAccess().getDeliveryDriverAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeliveryDriverAccess().getDeliveryDriverKeyword_1());
            		
            // InternalDsl.g:530:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:531:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:531:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:532:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeliveryDriverAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.foodapp.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryDriverAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:553:3: (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:554:4: otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeliveryDriverAccess().getUsernameKeyword_4_0());
                    			
                    // InternalDsl.g:558:4: ( (lv_username_5_0= ruleEString ) )
                    // InternalDsl.g:559:5: (lv_username_5_0= ruleEString )
                    {
                    // InternalDsl.g:559:5: (lv_username_5_0= ruleEString )
                    // InternalDsl.g:560:6: lv_username_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getUsernameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"username",
                    							lv_username_5_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:578:3: (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:579:4: otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeliveryDriverAccess().getPasswordKeyword_5_0());
                    			
                    // InternalDsl.g:583:4: ( (lv_password_7_0= ruleEString ) )
                    // InternalDsl.g:584:5: (lv_password_7_0= ruleEString )
                    {
                    // InternalDsl.g:584:5: (lv_password_7_0= ruleEString )
                    // InternalDsl.g:585:6: lv_password_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_7_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:603:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:604:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeliveryDriverAccess().getIdKeyword_6_0());
                    			
                    // InternalDsl.g:608:4: ( (lv_id_9_0= ruleEInt ) )
                    // InternalDsl.g:609:5: (lv_id_9_0= ruleEInt )
                    {
                    // InternalDsl.g:609:5: (lv_id_9_0= ruleEInt )
                    // InternalDsl.g:610:6: lv_id_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getIdEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_id_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:628:3: (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:629:4: otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeliveryDriverAccess().getPhoneNumberKeyword_7_0());
                    			
                    // InternalDsl.g:633:4: ( (lv_phoneNumber_11_0= ruleEString ) )
                    // InternalDsl.g:634:5: (lv_phoneNumber_11_0= ruleEString )
                    {
                    // InternalDsl.g:634:5: (lv_phoneNumber_11_0= ruleEString )
                    // InternalDsl.g:635:6: lv_phoneNumber_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getPhoneNumberEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_phoneNumber_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_11_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:653:3: (otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:654:4: otherlv_12= 'vehicleNumber' ( (lv_vehicleNumber_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeliveryDriverAccess().getVehicleNumberKeyword_8_0());
                    			
                    // InternalDsl.g:658:4: ( (lv_vehicleNumber_13_0= ruleEString ) )
                    // InternalDsl.g:659:5: (lv_vehicleNumber_13_0= ruleEString )
                    {
                    // InternalDsl.g:659:5: (lv_vehicleNumber_13_0= ruleEString )
                    // InternalDsl.g:660:6: lv_vehicleNumber_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getVehicleNumberEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_vehicleNumber_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"vehicleNumber",
                    							lv_vehicleNumber_13_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:678:3: (otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:679:4: otherlv_14= 'vehicleType' ( (lv_vehicleType_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeliveryDriverAccess().getVehicleTypeKeyword_9_0());
                    			
                    // InternalDsl.g:683:4: ( (lv_vehicleType_15_0= ruleEString ) )
                    // InternalDsl.g:684:5: (lv_vehicleType_15_0= ruleEString )
                    {
                    // InternalDsl.g:684:5: (lv_vehicleType_15_0= ruleEString )
                    // InternalDsl.g:685:6: lv_vehicleType_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getVehicleTypeEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_vehicleType_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeliveryDriverRule());
                    						}
                    						set(
                    							current,
                    							"vehicleType",
                    							lv_vehicleType_15_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:703:3: (otherlv_16= 'customerservice' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:704:4: otherlv_16= 'customerservice' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getDeliveryDriverAccess().getCustomerserviceKeyword_10_0());
                    			
                    // InternalDsl.g:708:4: ( ( ruleEString ) )
                    // InternalDsl.g:709:5: ( ruleEString )
                    {
                    // InternalDsl.g:709:5: ( ruleEString )
                    // InternalDsl.g:710:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryDriverRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getCustomerserviceCustomerServiceCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:725:3: (otherlv_18= 'customer' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:726:4: otherlv_18= 'customer' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getDeliveryDriverAccess().getCustomerKeyword_11_0());
                    			
                    // InternalDsl.g:730:4: ( ( ruleEString ) )
                    // InternalDsl.g:731:5: ( ruleEString )
                    {
                    // InternalDsl.g:731:5: ( ruleEString )
                    // InternalDsl.g:732:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryDriverRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeliveryDriverAccess().getCustomerCustomerCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getDeliveryDriverAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeliveryDriver"


    // $ANTLR start "entryRuleRestaurantManager"
    // InternalDsl.g:755:1: entryRuleRestaurantManager returns [EObject current=null] : iv_ruleRestaurantManager= ruleRestaurantManager EOF ;
    public final EObject entryRuleRestaurantManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurantManager = null;


        try {
            // InternalDsl.g:755:58: (iv_ruleRestaurantManager= ruleRestaurantManager EOF )
            // InternalDsl.g:756:2: iv_ruleRestaurantManager= ruleRestaurantManager EOF
            {
             newCompositeNode(grammarAccess.getRestaurantManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestaurantManager=ruleRestaurantManager();

            state._fsp--;

             current =iv_ruleRestaurantManager; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestaurantManager"


    // $ANTLR start "ruleRestaurantManager"
    // InternalDsl.g:762:1: ruleRestaurantManager returns [EObject current=null] : ( () otherlv_1= 'RestaurantManager' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleRestaurantManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_phoneNumber_11_0 = null;

        AntlrDatatypeRuleToken lv_address_13_0 = null;

        AntlrDatatypeRuleToken lv_cuisine_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:768:2: ( ( () otherlv_1= 'RestaurantManager' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalDsl.g:769:2: ( () otherlv_1= 'RestaurantManager' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalDsl.g:769:2: ( () otherlv_1= 'RestaurantManager' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? otherlv_18= '}' )
            // InternalDsl.g:770:3: () otherlv_1= 'RestaurantManager' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalDsl.g:770:3: ()
            // InternalDsl.g:771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestaurantManagerAccess().getRestaurantManagerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRestaurantManagerAccess().getRestaurantManagerKeyword_1());
            		
            // InternalDsl.g:781:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:782:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:782:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:783:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRestaurantManagerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.foodapp.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRestaurantManagerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:804:3: (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:805:4: otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRestaurantManagerAccess().getUsernameKeyword_4_0());
                    			
                    // InternalDsl.g:809:4: ( (lv_username_5_0= ruleEString ) )
                    // InternalDsl.g:810:5: (lv_username_5_0= ruleEString )
                    {
                    // InternalDsl.g:810:5: (lv_username_5_0= ruleEString )
                    // InternalDsl.g:811:6: lv_username_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getUsernameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"username",
                    							lv_username_5_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:829:3: (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:830:4: otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRestaurantManagerAccess().getPasswordKeyword_5_0());
                    			
                    // InternalDsl.g:834:4: ( (lv_password_7_0= ruleEString ) )
                    // InternalDsl.g:835:5: (lv_password_7_0= ruleEString )
                    {
                    // InternalDsl.g:835:5: (lv_password_7_0= ruleEString )
                    // InternalDsl.g:836:6: lv_password_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_7_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:854:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:855:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getRestaurantManagerAccess().getIdKeyword_6_0());
                    			
                    // InternalDsl.g:859:4: ( (lv_id_9_0= ruleEInt ) )
                    // InternalDsl.g:860:5: (lv_id_9_0= ruleEInt )
                    {
                    // InternalDsl.g:860:5: (lv_id_9_0= ruleEInt )
                    // InternalDsl.g:861:6: lv_id_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getIdEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_id_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:879:3: (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:880:4: otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRestaurantManagerAccess().getPhoneNumberKeyword_7_0());
                    			
                    // InternalDsl.g:884:4: ( (lv_phoneNumber_11_0= ruleEString ) )
                    // InternalDsl.g:885:5: (lv_phoneNumber_11_0= ruleEString )
                    {
                    // InternalDsl.g:885:5: (lv_phoneNumber_11_0= ruleEString )
                    // InternalDsl.g:886:6: lv_phoneNumber_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getPhoneNumberEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_phoneNumber_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_11_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:904:3: (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:905:4: otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getRestaurantManagerAccess().getAddressKeyword_8_0());
                    			
                    // InternalDsl.g:909:4: ( (lv_address_13_0= ruleEString ) )
                    // InternalDsl.g:910:5: (lv_address_13_0= ruleEString )
                    {
                    // InternalDsl.g:910:5: (lv_address_13_0= ruleEString )
                    // InternalDsl.g:911:6: lv_address_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getAddressEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_address_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_13_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:929:3: (otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:930:4: otherlv_14= 'cuisine' ( (lv_cuisine_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRestaurantManagerAccess().getCuisineKeyword_9_0());
                    			
                    // InternalDsl.g:934:4: ( (lv_cuisine_15_0= ruleEString ) )
                    // InternalDsl.g:935:5: (lv_cuisine_15_0= ruleEString )
                    {
                    // InternalDsl.g:935:5: (lv_cuisine_15_0= ruleEString )
                    // InternalDsl.g:936:6: lv_cuisine_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getCuisineEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_cuisine_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestaurantManagerRule());
                    						}
                    						set(
                    							current,
                    							"cuisine",
                    							lv_cuisine_15_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:954:3: (otherlv_16= 'customerservice' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:955:4: otherlv_16= 'customerservice' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getRestaurantManagerAccess().getCustomerserviceKeyword_10_0());
                    			
                    // InternalDsl.g:959:4: ( ( ruleEString ) )
                    // InternalDsl.g:960:5: ( ruleEString )
                    {
                    // InternalDsl.g:960:5: ( ruleEString )
                    // InternalDsl.g:961:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRestaurantManagerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRestaurantManagerAccess().getCustomerserviceCustomerServiceCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRestaurantManagerAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestaurantManager"


    // $ANTLR start "entryRuleCustomer"
    // InternalDsl.g:984:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalDsl.g:984:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalDsl.g:985:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalDsl.g:991:1: ruleCustomer returns [EObject current=null] : ( () otherlv_1= 'Customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_username_5_0 = null;

        AntlrDatatypeRuleToken lv_password_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_phoneNumber_11_0 = null;

        AntlrDatatypeRuleToken lv_address_13_0 = null;

        AntlrDatatypeRuleToken lv_email_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:997:2: ( ( () otherlv_1= 'Customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalDsl.g:998:2: ( () otherlv_1= 'Customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalDsl.g:998:2: ( () otherlv_1= 'Customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalDsl.g:999:3: () otherlv_1= 'Customer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )? (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )? (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )? (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )? (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )? (otherlv_16= 'customerservice' ( ( ruleEString ) ) )? (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalDsl.g:999:3: ()
            // InternalDsl.g:1000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomerAccess().getCustomerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomerAccess().getCustomerKeyword_1());
            		
            // InternalDsl.g:1010:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:1011:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:1011:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:1012:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.foodapp.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1033:3: (otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1034:4: otherlv_4= 'username' ( (lv_username_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getUsernameKeyword_4_0());
                    			
                    // InternalDsl.g:1038:4: ( (lv_username_5_0= ruleEString ) )
                    // InternalDsl.g:1039:5: (lv_username_5_0= ruleEString )
                    {
                    // InternalDsl.g:1039:5: (lv_username_5_0= ruleEString )
                    // InternalDsl.g:1040:6: lv_username_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getUsernameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_username_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"username",
                    							lv_username_5_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1058:3: (otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1059:4: otherlv_6= 'password' ( (lv_password_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getPasswordKeyword_5_0());
                    			
                    // InternalDsl.g:1063:4: ( (lv_password_7_0= ruleEString ) )
                    // InternalDsl.g:1064:5: (lv_password_7_0= ruleEString )
                    {
                    // InternalDsl.g:1064:5: (lv_password_7_0= ruleEString )
                    // InternalDsl.g:1065:6: lv_password_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_password_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_7_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1083:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1084:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getCustomerAccess().getIdKeyword_6_0());
                    			
                    // InternalDsl.g:1088:4: ( (lv_id_9_0= ruleEInt ) )
                    // InternalDsl.g:1089:5: (lv_id_9_0= ruleEInt )
                    {
                    // InternalDsl.g:1089:5: (lv_id_9_0= ruleEInt )
                    // InternalDsl.g:1090:6: lv_id_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getIdEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_id_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1108:3: (otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1109:4: otherlv_10= 'phoneNumber' ( (lv_phoneNumber_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getCustomerAccess().getPhoneNumberKeyword_7_0());
                    			
                    // InternalDsl.g:1113:4: ( (lv_phoneNumber_11_0= ruleEString ) )
                    // InternalDsl.g:1114:5: (lv_phoneNumber_11_0= ruleEString )
                    {
                    // InternalDsl.g:1114:5: (lv_phoneNumber_11_0= ruleEString )
                    // InternalDsl.g:1115:6: lv_phoneNumber_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getPhoneNumberEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_phoneNumber_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"phoneNumber",
                    							lv_phoneNumber_11_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1133:3: (otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1134:4: otherlv_12= 'address' ( (lv_address_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getCustomerAccess().getAddressKeyword_8_0());
                    			
                    // InternalDsl.g:1138:4: ( (lv_address_13_0= ruleEString ) )
                    // InternalDsl.g:1139:5: (lv_address_13_0= ruleEString )
                    {
                    // InternalDsl.g:1139:5: (lv_address_13_0= ruleEString )
                    // InternalDsl.g:1140:6: lv_address_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getAddressEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_address_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_13_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1158:3: (otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1159:4: otherlv_14= 'email' ( (lv_email_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getCustomerAccess().getEmailKeyword_9_0());
                    			
                    // InternalDsl.g:1163:4: ( (lv_email_15_0= ruleEString ) )
                    // InternalDsl.g:1164:5: (lv_email_15_0= ruleEString )
                    {
                    // InternalDsl.g:1164:5: (lv_email_15_0= ruleEString )
                    // InternalDsl.g:1165:6: lv_email_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_email_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"email",
                    							lv_email_15_0,
                    							"org.rm2pt.sample.foodapp.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1183:3: (otherlv_16= 'customerservice' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1184:4: otherlv_16= 'customerservice' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCustomerAccess().getCustomerserviceKeyword_10_0());
                    			
                    // InternalDsl.g:1188:4: ( ( ruleEString ) )
                    // InternalDsl.g:1189:5: ( ruleEString )
                    {
                    // InternalDsl.g:1189:5: ( ruleEString )
                    // InternalDsl.g:1190:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerAccess().getCustomerserviceCustomerServiceCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1205:3: (otherlv_18= 'deliverydriver' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1206:4: otherlv_18= 'deliverydriver' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getCustomerAccess().getDeliverydriverKeyword_11_0());
                    			
                    // InternalDsl.g:1210:4: ( ( ruleEString ) )
                    // InternalDsl.g:1211:5: ( ruleEString )
                    {
                    // InternalDsl.g:1211:5: ( ruleEString )
                    // InternalDsl.g:1212:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerAccess().getDeliverydriverDeliveryDriverCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000122020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001FC8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F88000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F08000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E08000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001D3C8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001D388000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001D308000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001D208000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001D008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000019008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000011008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000D03C8000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000D0388000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000D0308000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000D0208000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000D0008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000090008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000250BC8000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000250B88000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000250B08000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000250A08000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000250808000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000210808000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010808000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000808000L});

}