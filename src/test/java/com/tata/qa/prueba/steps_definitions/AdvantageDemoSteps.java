package com.tata.qa.prueba.steps_definitions;

import com.tata.qa.prueba.drivers.OwnWebDriver;
import com.tata.qa.prueba.questions.ElMensajeDeCompra;
import com.tata.qa.prueba.questions.ElMensajeDeGracias;
import com.tata.qa.prueba.questions.ElNombreDeLaCuenta;
import com.tata.qa.prueba.tasks.DiligenciarFormulario;
import com.tata.qa.prueba.tasks.RealizaLogin;
import com.tata.qa.prueba.tasks.RegistrarseCon;
import com.tata.qa.prueba.tasks.Selecciona;
import com.tata.qa.prueba.utils.Selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class AdvantageDemoSteps {

	@Given("^que abro la aplicacion$")
	public void queAbroLaAplicacion() {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("Oscar");
		theActorInTheSpotlight()
				.can(BrowseTheWeb.with(OwnWebDriver.withChrome().setURL(Selenium.parameters().getProperty("url"))));

	}

	@When("^ingreso a la opcion de crear cuenta y diligencio los datos$")
	public void ingresoALaOpcionDeCrearCuentaYDiligencioLosDatos() {
		theActorInTheSpotlight().attemptsTo(RegistrarseCon.datos());

	}

	@Then("^el sistema muestra la cuenta como (.*)$")
	public void elSistemaMuestraLaCuentaHaSidoCreadaCorrectramente(String nombreCuenta) {
		theActorInTheSpotlight().should(seeThat(ElNombreDeLaCuenta.es(),
				equalTo(nombreCuenta)));
	}
	
	@When("^Ingreso con usuario (.*) y password (.*)$")
	public void IngresoConUsuarioYPassword(String user, String pass) {
		theActorInTheSpotlight().attemptsTo(RealizaLogin.withUser(user).andPassword(pass));

	}
	
	@When("^selecciono un producto para comprar$")
	public void seleccionoUnProductoParaComprar() {
		theActorInTheSpotlight().attemptsTo(Selecciona.producto());

	}
	@Then("^el sistema muestra mensaje (.*)$")
	public void elSistemaMuestraMensajeThankYouForBuyingWithAdvantage(String msjCompraExitosa) {
		theActorInTheSpotlight().should(seeThat(ElMensajeDeCompra.es(),
				equalTo(msjCompraExitosa)));
	}
	
	@When("^dliligencio el formulario de contacto$")
	public void dliligencioElFormularioDeContacto() {
		theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.deContacto());

	}
	
	@Then("^el sistema me muestra el mansaje (.*)$")
	public void elSistemaMeMuestraElMansajeThankYouForContactingAdvantageSupport(String msjGracias) {
		theActorInTheSpotlight().should(seeThat(ElMensajeDeGracias.es(),
				equalTo(msjGracias)));
	}

}
