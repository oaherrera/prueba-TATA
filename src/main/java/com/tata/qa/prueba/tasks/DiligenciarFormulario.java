package com.tata.qa.prueba.tasks;

import com.tata.qa.prueba.interactions.Esperar;
import com.tata.qa.prueba.interactions.WaitElement;
import com.tata.qa.prueba.pages.AdvantageDemoPage;
import com.tata.qa.prueba.pages.ContactUsPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class DiligenciarFormulario implements Task {

	@Override
	@Step("{0} Diligencia el formulario de contacto")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AdvantageDemoPage.MENU_CONTACT_US));
		actor.attemptsTo(SelectFromOptions.byVisibleText("Laptops").from(ContactUsPage.SELECT_DEVICE_CATEGORY));
		actor.attemptsTo(SelectFromOptions.byVisibleText("HP Chromebook 14 G1(ES)").from(ContactUsPage.SELECT_SUB_CATEGORY));
		actor.attemptsTo(Enter.theValue("correo@gmail.com").into(ContactUsPage.EMAIL));
		Serenity.takeScreenshot();
		actor.attemptsTo(Enter.theValue("espero que haya pasado esta prueba!!").into(ContactUsPage.MENSAJE));
		actor.attemptsTo(Esperar.por(1000));
		actor.attemptsTo(WaitElement.untilBeEnabled(ContactUsPage.BUTTON_SEND));
		actor.attemptsTo(Click.on(ContactUsPage.BUTTON_SEND));
		Serenity.takeScreenshot();
		actor.attemptsTo(Esperar.por(1000));
		
		
	}
	
	public static DiligenciarFormulario deContacto() {
		return Tasks.instrumented(DiligenciarFormulario.class);
	}

}
