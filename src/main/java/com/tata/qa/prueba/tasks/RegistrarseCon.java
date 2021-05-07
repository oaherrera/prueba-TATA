package com.tata.qa.prueba.tasks;

import com.tata.qa.prueba.interactions.Esperar;
import com.tata.qa.prueba.pages.AdvantageDemoPage;
import com.tata.qa.prueba.pages.CreateAccountPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class RegistrarseCon implements Task{
	
	
	private String userName = "oscaher";
	private String email = "oscar@gmail.com";
	private String password = "Oscar123";
	private String confirmPassword = "Oscar123";
	private String firstName = "Oscar";
	private String lastName = "Herrera";
	private String phoneNumber = "3214125510";
	private String country = "Colombia";
	private String city = "Bogotá";
	private String address = "calle 157A - 92 - 06";
	private String state = "Bogotá";
	private String codePostal = "11001";
	

	@Override
	@Step("{0} se registra en la aplicación")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(AdvantageDemoPage.ICON_USER));
		actor.attemptsTo(JavaScriptClick.on(AdvantageDemoPage.CREATE_NEW_ACCOUNT));
		actor.attemptsTo(Enter.theValue(userName).into(CreateAccountPage.USER_NAME));
		actor.attemptsTo(Enter.theValue(email).into(CreateAccountPage.EMAIL));
		actor.attemptsTo(Enter.theValue(password).into(CreateAccountPage.PASSWORD));
		Serenity.takeScreenshot();
		actor.attemptsTo(Enter.theValue(confirmPassword).into(CreateAccountPage.CONFIRM_PASSWORD));
		actor.attemptsTo(Enter.theValue(firstName).into(CreateAccountPage.FIRST_NAME));
		Serenity.takeScreenshot();
		actor.attemptsTo(Enter.theValue(lastName).into(CreateAccountPage.LAST_NAME));
		actor.attemptsTo(Enter.theValue(phoneNumber).into(CreateAccountPage.PHONE_NUMBER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(country).from(CreateAccountPage.SELECT_COUNTRY));
		actor.attemptsTo(Enter.theValue(city).into(CreateAccountPage.CITY));
		actor.attemptsTo(Enter.theValue(address).into(CreateAccountPage.ADDRESS));
		Serenity.takeScreenshot();
		actor.attemptsTo(Enter.theValue(state).into(CreateAccountPage.STATE_PROVINCE_REGION));
		actor.attemptsTo(Enter.theValue(codePostal).into(CreateAccountPage.POSTAL_CODE));
		actor.attemptsTo(Click.on(CreateAccountPage.AGREE));
		actor.attemptsTo(Esperar.por(1000));
		actor.attemptsTo(Click.on(CreateAccountPage.BUTTON_REGISTER));
		Serenity.takeScreenshot();
		
	}
	
	public static RegistrarseCon datos() {
		return Tasks.instrumented(RegistrarseCon.class );
	}

}
