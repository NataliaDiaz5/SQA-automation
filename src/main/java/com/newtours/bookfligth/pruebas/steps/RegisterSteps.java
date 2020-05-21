package com.newtours.bookfligth.pruebas.steps;


import com.newtours.bookfligth.pruebas.pageobjects.RegisterPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class RegisterSteps extends KrakenWeb {
	
	RegisterPageObject registerPOM = new RegisterPageObject();

	
	public void abrirNavegadorEnNewTours() {
		
		configuracionesIniciales();
		abrirNavegadorEn(registerPOM);
		
		
	}
	
public void clickEnEnlace() {
		
		click(registerPOM.getBtnRegister());
				
	}

	public void writeFirstName(String FirstName) {
		escribirTexto(registerPOM.getTxtFirstName(), FirstName);
	
	}
	public void writeLastName(String LastName) {
		escribirTexto(registerPOM.getTxtLastName(), LastName);
	
	}
	public void writePhone(String Phone) {
		escribirTexto(registerPOM.getTxtPhone(), Phone);
	
	}
	public void writeEmail(String Email) {
		escribirTexto(registerPOM.getTxtEmail(), Email);
	
	}
	public void writeAddress(String Address) {
		escribirTexto(registerPOM.getTxtAddress(), Address);
	
	}
	public void writeCity(String City) {
		escribirTexto(registerPOM.getTxtCity(), City);
	
	}
	public void writeState(String state) {
		escribirTexto(registerPOM.getTxtState(), state);
	
	}
	public void writePostalCode(String PostalCode) {
		escribirTexto(registerPOM.getTxtPostalCode(), PostalCode);
	
	}
	public void selectCountry() {
		registerPOM.getSelectCountry();
	
	}
	public void writeUserName(String UserName) {
		escribirTexto(registerPOM.getTxtUserName(), UserName);
	
	}
	public void writePassword(String Password) {
		escribirTexto(registerPOM.getTxtPassword(), Password);
	
	}
	
	public void writeConfirmPassword(String ConfirmPassword) {
		escribirTexto(registerPOM.getTxtConfirmPassword(), ConfirmPassword);
	
	}
	

    public void clicEnSubmit() {
	click(registerPOM.getBtnSubmit());
	
    }
    
    public void validarTextoPresenteEnElMenu(String TextoEsperado) {
    	validarIgual(registerPOM.getBtnSingOff(), TextoEsperado);
    }

}
