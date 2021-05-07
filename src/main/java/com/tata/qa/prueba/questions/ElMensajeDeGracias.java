package com.tata.qa.prueba.questions;

import com.tata.qa.prueba.pages.ContactUsPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensajeDeGracias implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		Serenity.takeScreenshot();
		return Text.of(ContactUsPage.MENSAJE_GRACIAS_POR_CONTACTARNOS).viewedBy(actor).asString();
	}
	
	public static ElMensajeDeGracias es() {
		return new ElMensajeDeGracias();
	}

}
