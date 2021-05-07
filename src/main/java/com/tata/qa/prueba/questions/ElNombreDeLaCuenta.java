package com.tata.qa.prueba.questions;

import com.tata.qa.prueba.pages.CreateAccountPage;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElNombreDeLaCuenta implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		Serenity.takeScreenshot();
		return Text.of(CreateAccountPage.ACCOUNT_NAME).viewedBy(actor).asString();

	}

	public static ElNombreDeLaCuenta es() {
		return new ElNombreDeLaCuenta();
	}

}
