package com.tata.qa.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage {
	
	
	 public static final Target USER_NAME = Target.the("User Name")
	            .locatedBy("//input[@name='usernameRegisterPage']");
	 public static final Target EMAIL = Target.the("Email")
	            .locatedBy("//input[@name='emailRegisterPage']");
	 public static final Target PASSWORD = Target.the("Password")
	            .locatedBy("//input[@name='passwordRegisterPage']");
	 public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
	            .locatedBy("//input[@name='confirm_passwordRegisterPage']");
	 public static final Target FIRST_NAME = Target.the("First Name")
	            .locatedBy("//input[@name='first_nameRegisterPage']");
	 public static final Target LAST_NAME = Target.the("Last Name")
	            .locatedBy("//input[@name='last_nameRegisterPage']");
	 public static final Target PHONE_NUMBER = Target.the("Phone Number")
	            .locatedBy("//input[@name='phone_numberRegisterPage']");
	 public static final Target SELECT_COUNTRY = Target.the("Select Country")
	            .locatedBy("//select[@name='countryListboxRegisterPage']");
	 public static final Target CITY = Target.the("City")
	            .locatedBy("//input[@name='cityRegisterPage']");
	 public static final Target ADDRESS = Target.the("Address")
	            .locatedBy("//input[@name='addressRegisterPage']");
	 public static final Target STATE_PROVINCE_REGION = Target.the("State Province")
	            .locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
	 public static final Target POSTAL_CODE = Target.the("Postal Code")
	            .locatedBy("//input[@name='postal_codeRegisterPage']");
	 public static final Target AGREE = Target.the("Agree")
	            .locatedBy("//input[@name='i_agree']");
	 public static final Target BUTTON_REGISTER = Target.the("Button Register")
	            .locatedBy("//button[@id='register_btnundefined']");
	 public static final Target ACCOUNT_NAME = Target.the("Account Name")
	            .locatedBy("//a[@id='menuUserLink']//span");
	 
	 

}
