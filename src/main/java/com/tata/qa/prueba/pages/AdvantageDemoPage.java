package com.tata.qa.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageDemoPage {
	
	
	 public static final Target ICON_USER = Target.the("Icon User")
	            .locatedBy("//a[@id='hrefUserIcon']");
	 public static final Target CREATE_NEW_ACCOUNT = Target.the("Create new Account")
	            .locatedBy("//a[@class='create-new-account ng-scope']");
	 public static final Target MENU_CONTACT_US = Target.the("Menu Contact US")
	            .locatedBy("//li[@class='nav-li-Links']/a[contains(text(),'CONTACT US')]");

}
