package com.tata.qa.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	 public static final Target USER_NAME = Target.the("User Name")
	            .locatedBy("//input[@name='username']");
	 public static final Target PASSWORD = Target.the("Password")
	            .locatedBy("//input[@name='password']");
	 public static final Target SIGN_IN = Target.the("Sign In")
	            .locatedBy("//button[@id='sign_in_btnundefined']");
	 
	 

}
