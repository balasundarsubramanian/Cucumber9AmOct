package com.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpom {

	// @FindBy
	// PageFactory --> initElements

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement user; //private variable

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	

	public Loginpom(WebDriver d) { //parameterized constructor
		driver = d;
		PageFactory.initElements(driver, this);

	}
}
