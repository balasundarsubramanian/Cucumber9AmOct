package com.pomanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageobj.Hotelbookingpom;
import com.pageobj.Loginpom;

public class PageObjectManager {

	public WebDriver driver;

	private Loginpom login;
	private Hotelbookingpom hotel;
	
	public Loginpom getLogin() {
		
		login = new Loginpom(driver);
		
		return login;
	}
	public Hotelbookingpom getHotel() {
		return hotel;
	}
	
	public PageObjectManager(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	
	

}
