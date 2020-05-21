package com.newtours.bookfligtht.pruebas.stepdefinitions;

import java.util.List;

import com.newtours.bookfligth.pruebas.steps.LogInSteps;
import com.newtours.bookfligtht.pruebas.models.User;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogInStepDefinitions {
	
	@Steps
	LogInSteps loginSteps;

	@Given("^I want to write NewTours HomePage$")
	public void i_want_to_write_NewTours_HomePage() {
		loginSteps.abrirNavegadorEnNewTours();
	}


	@When("^I write my credentials$")
	public void i_write_my_credentials(List<User> listUser) {
		loginSteps.escribirUsuario(listUser.get(0).getUser());
		loginSteps.escribirClave(listUser.get(0).getPassword());
		loginSteps.clicEnBotonLogIn();
	}

	@Then("^I valida a text saying \"([^\"]*)\"$")
	public void i_valida_a_text_saying(String TextoEsperado) {
		loginSteps.validarTextoPresenteEnElMenu(TextoEsperado);
	}

	

}
