package com.newtours.bookfligth.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class LogInPageObject extends PageObject{
	
	By txtUsuario = By.name("userName");	
	By txtPassword = By.name("password");
	By btbLogin = By.name("login");
	By btnSingOff = By.xpath("//a[contains(text(),'SIGN-OFF')]");
	
	public final By getTxtUsuario() {
		return txtUsuario;
	}
	public final By getTxtPassword() {
		return txtPassword;
	}
	public final By getBtbLogin() {
		return btbLogin;
	}
	public final By getBtnSingOff() {
		return btnSingOff;
	}

	
	
}
