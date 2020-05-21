package com.newtours.bookfligtht.pruebas.stepdefinitions;
import java.util.List;
import com.newtours.bookfligth.pruebas.steps.RegisterSteps;
import com.newtours.bookfligtht.pruebas.models.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStepDefinitions {
	
	@Steps
	RegisterSteps registerSteps;
	
@Given("^I want to register a new user in NewTours HomePage$")
	public void I_want_to_register_a_new_user_in_NewTours_HomePage() {
		registerSteps.abrirNavegadorEnNewTours();
	}

	
	@When("^I create a new register$")
	public void i_create_a_new_register(List<Register> listUser) {
		
		registerSteps.clickEnEnlace();
		registerSteps.writeFirstName(listUser.get(0).getFirstName());
		registerSteps.writeLastName(listUser.get(0).getLastName());
		registerSteps.writePhone(listUser.get(0).getPhone());
		registerSteps.writeEmail(listUser.get(0).getEmail());
		registerSteps.writeAddress(listUser.get(0).getAddress());
		registerSteps.writeCity(listUser.get(0).getCity());
		registerSteps.writeState(listUser.get(0).getState());
		registerSteps.writePostalCode(listUser.get(0).getPostalCode());
		registerSteps.selectCountry();
		registerSteps.writeUserName(listUser.get(0).getUserName());
		registerSteps.writePassword(listUser.get(0).getPassword());
		registerSteps.writeConfirmPassword(listUser.get(0).getConfirmPassword());
		
		registerSteps.clicEnSubmit();
	}


	@Then("^I validate a text saying \"([^\"]*)\"$")
	public void i_validate_a_text_saying(String TextoEsperado) {
		registerSteps.validarTextoPresenteEnElMenu(TextoEsperado);
	}
}
