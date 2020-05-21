package com.newtours.bookfligth.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\newtours\\bookfligtht\\pruebas\\features\\Login.feature",
glue="com.newtours.bookfligtht.pruebas.stepdefinitions",
snippets=SnippetType.CAMELCASE)

public class LogInRunner {

}
