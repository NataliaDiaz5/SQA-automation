package com.newtours.bookfligth.pruebas.steps;

import com.newtours.bookfligth.pruebas.pageobjects.LogInPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class LogInSteps extends KrakenWeb{

	LogInPageObject logInPOM = new LogInPageObject();
	
	public void abrirNavegadorEnNewTours() {
		
		configuracionesIniciales();
		abrirNavegadorEn(logInPOM);
		
		
	}
	
	public void escribirUsuario(String usuario) {
		
		escribirTexto(logInPOM.getTxtUsuario(), usuario);
		
	}

	public void escribirClave(String clave) {
		escribirTexto(logInPOM.getTxtPassword(), clave);
	
	}

    public void clicEnBotonLogIn() {
	click(logInPOM.getBtbLogin());
	
    }
    
    public void validarTextoPresenteEnElMenu(String TextoEsperado) {
    	validarIgual(logInPOM.getBtnSingOff(), TextoEsperado);
    }
}