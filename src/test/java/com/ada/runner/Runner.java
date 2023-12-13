package com.ada.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\balas\\eclipse-workspace\\Cucumber9AmOct\\src\\test\\java\\com\\ada\\feature\\Adactin.feature",
glue="com.ada.stepdef")

public class Runner extends BaseClass {
	
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() {
		
		driver= browserLaunch("chrome");
	}
	 
	
	 
	 
	 
	 
	
	
	
	

}
