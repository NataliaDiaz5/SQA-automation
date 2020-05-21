package com.newtours.bookfligth.pruebas.pageobjects;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class RegisterPageObject extends PageObject{	
	
		
		By btnRegister = By.xpath("//a[text()='REGISTER']");
		By txtFirstName = By.name("firstName");
		By txtLastName = By.name("lastName");
	    By txtPhone = By.name("phone");
		By txtEmail=By.name("userName");
		By txtAddress=By.name("address1");
		By txtCity=By.name("city");
		By txtState=By.name("state");
		By txtPostalCode=By.name("postalCode");
		By SelectCountry = By.name("country");
		By txtUserName=By.name("email");
		By txtPassword=By.name("password");
		By txtConfirmPassword=By.name("confirmPassword");
		By btnSubmit = By.name("register");
		By btnSingOff = By.xpath("//a[contains(text(),'SIGN-OFF')]");
		
		public final By getBtnRegister() {
			return btnRegister;
		}
		public final By getTxtFirstName() {
			return txtFirstName;
		}
		public final By getTxtLastName() {
			return txtLastName;
		}
		public final By getTxtPhone() {
			return txtPhone;
		}
		public final By getTxtEmail() {
			return txtEmail;
		}
		public final By getTxtAddress() {
			return txtAddress;
		}
		public final By getTxtCity() {
			return txtCity;
		}
		public final By getTxtState() {
			return txtState;
		}
		public final By getTxtPostalCode() {
			return txtPostalCode;
		}
		public final By getSelectCountry() {
			return SelectCountry;
		}
		public final By getTxtUserName() {
			return txtUserName;
		}
		public final By getTxtPassword() {
			return txtPassword;
		}
		public final By getTxtConfirmPassword() {
			return txtConfirmPassword;
		}
		public final By getBtnSubmit() {
			return btnSubmit;
		}
		public final By getBtnSingOff() {
			return btnSingOff;
		}
		
		
		
		

}


