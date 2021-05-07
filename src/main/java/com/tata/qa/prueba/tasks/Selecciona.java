package com.tata.qa.prueba.tasks;

import com.tata.qa.prueba.interactions.Esperar;
import com.tata.qa.prueba.pages.ProductosPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Selecciona implements Task {

	@Override
	@Step("{0} selecciona producto para comprar")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(ProductosPage.PRODUCTO_CATEGORIA_SPEAKERS));
		actor.attemptsTo(Click.on(ProductosPage.PRODUCTO_SELECCIONADO));
		Serenity.takeScreenshot();
		actor.attemptsTo(Click.on(ProductosPage.AGREGAR_AL_CARRITO));
		actor.attemptsTo(Click.on(ProductosPage.BOTON_CHECKOUT));
		Serenity.takeScreenshot();
		actor.attemptsTo(Click.on(ProductosPage.BOTON_NEXT));
		Serenity.takeScreenshot();
		if(!ProductosPage.TIPO_PAGO.resolveFor(actor).isSelected()) {
			actor.attemptsTo(Click.on(ProductosPage.TIPO_PAGO));
		}
		actor.attemptsTo(Enter.theValue("user123").into(ProductosPage.SAFEPAY_USERNAME));
		actor.attemptsTo(Enter.theValue("Pass123").into(ProductosPage.SAFEPAY_PASSWORD));
		actor.attemptsTo(Click.on(ProductosPage.BUTTON_PAY_NOW));
		Serenity.takeScreenshot();
		actor.attemptsTo(Esperar.por(2000));

		
		
	}
	
	public static Selecciona producto() {
		return Tasks.instrumented(Selecciona.class );
	}

}
