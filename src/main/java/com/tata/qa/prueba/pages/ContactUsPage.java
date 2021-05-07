package com.tata.qa.prueba.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ContactUsPage {
	
	 public static final Target SELECT_DEVICE_CATEGORY = Target.the("Select Device")
	            .locatedBy("//select[@name='categoryListboxContactUs']");
	 public static final Target SELECT_SUB_CATEGORY = Target.the("Select Sub Category")
	            .locatedBy("//select[@name='productListboxContactUs']");
	 public static final Target EMAIL = Target.the("Email")
	            .locatedBy("//input[@name='emailContactUs']");
	 public static final Target MENSAJE = Target.the("Mensaje")
	            .locatedBy("//textarea[@name='subjectTextareaContactUs']");
	 public static final Target BUTTON_SEND = Target.the("Button Send")
	            .locatedBy("//button[@id='send_btnundefined']");
	 public static final Target MENSAJE_GRACIAS_POR_CONTACTARNOS = Target.the("Mensaje Gracias")
	            .locatedBy("//div[@id='registerSuccessCover']//div//p");

}
