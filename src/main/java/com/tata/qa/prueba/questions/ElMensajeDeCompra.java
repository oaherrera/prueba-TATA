package com.tata.qa.prueba.questions;

import com.tata.qa.prueba.pages.ProductosPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensajeDeCompra implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		Serenity.takeScreenshot();
		return Text.of(ProductosPage.MENSAJE_ORDEN_EXITOSA).viewedBy(actor).asString();
	}
	
	public static ElMensajeDeCompra es() {
		return new ElMensajeDeCompra();
	}

}
