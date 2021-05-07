package com.tata.qa.prueba.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/advantage_demo.feature", 
snippets = SnippetType.CAMELCASE,
glue = "com.tata.qa.prueba.steps_definitions"
 ,tags = "@todo"
)

public class AdvantageDemoRunner {

}
