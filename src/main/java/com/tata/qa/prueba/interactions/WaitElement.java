package com.tata.qa.prueba.interactions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class WaitElement implements Interaction {

	private Target target;
	private String state;

	public WaitElement(Target target, String state) {
		this.target = target;
		this.state = state;
	}

	@Override
	@Step("{0} waits the #target until is #state")
	public <T extends Actor> void performAs(T actor) {

		switch (state) {
		case "Visible":
			waitAs(actor).until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
			break;
		case "Invisible":
			waitAs(actor).until(ExpectedConditions.invisibilityOf(target.resolveFor(actor)));
			break;
		case "Enabled":
			waitAs(actor).until(ExpectedConditions.elementToBeClickable(target.resolveFor(actor)));
			break;
		default:
			break;
		}
	}

	private WebDriverWait waitAs(Actor actor) {
		return new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), 35);
	}

	public static WaitElement untilAppears(Target target) {
		return Tasks.instrumented(WaitElement.class, target, "Visible");
	}

	public static WaitElement untilDisappears(Target target) {
		return Tasks.instrumented(WaitElement.class, target, "Invisible");
	}

	public static WaitElement untilBeEnabled(Target target) {
		return Tasks.instrumented(WaitElement.class, target, "Enabled");
	}
}
