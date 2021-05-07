package com.tata.qa.prueba.tasks;


import com.tata.qa.prueba.interactions.Esperar;
import com.tata.qa.prueba.pages.AdvantageDemoPage;
import com.tata.qa.prueba.pages.LoginPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class RealizaLogin implements Task {
	
	
	private String user;
	private String password;
	
	
	public RealizaLogin(String user) {
		this.user = user;
	}

	@Override
	@Step("{0} Login Advantage Demo")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AdvantageDemoPage.ICON_USER));
		actor.attemptsTo(Enter.theValue(user).into(LoginPage.USER_NAME),
				Enter.theValue(password).into(LoginPage.PASSWORD));
		actor.attemptsTo(Esperar.por(1000));
		Serenity.takeScreenshot();
		actor.attemptsTo(Click.on(LoginPage.SIGN_IN));
		actor.attemptsTo(Esperar.por(1000));
		
	}
	public static RealizaLogin withUser(String user) {
		return Tasks.instrumented(RealizaLogin.class, user);
	}

	public RealizaLogin andPassword(String password) {
		this.password = password;
		return this;
	}
	

}
