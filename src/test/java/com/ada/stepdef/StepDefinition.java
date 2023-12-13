package com.ada.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.ada.runner.Runner;
import com.config.ConfigurationReader;
import com.pageobj.Hotelbookingpom;
import com.pageobj.Loginpom;
import com.pomanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

  public WebDriver driver =Runner.driver;

	
	
	PageObjectManager p = new PageObjectManager(driver);
	
	ConfigurationReader c ;
	

	@Given("user Launch The Url Of The Adactin")
	public void user_launch_the_url_of_the_adactin() throws IOException  {
		c= new ConfigurationReader();
		
		  getUrl(c.geturl());
       

	}

	@When("user Enter The Username in Username Field")
	public void user_enter_the_username_in_username_field() {
		

		inputValue(p.getLogin().getUser(),c.getUser());

	}

	@When("user Enter The Password in Password Field")
	public void user_enter_the_password_in_password_field() {
		inputValue(p.getLogin().getPass(),c.getpass());
	}

	@Then("user Should Click The login and it will navigate to hotel booking page")
	public void user_should_click_the_login_and_it_will_navigate_to_hotel_booking_page() {

		clickOnElement(p.getLogin().getLogin());
		//dropdownSelect(p.getLocation."Melbourne"

	}

}
