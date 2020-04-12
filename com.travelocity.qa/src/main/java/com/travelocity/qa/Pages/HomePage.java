package com.travelocity.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travelocity.qa.Base.DriverScript;

public class HomePage extends DriverScript {
	
	//************************ Page Elements ******************************************************//
	
		@FindBy(xpath="//a[@id='header-logo']") WebElement mainLogo;
		
		//header menu links
		@FindBy(xpath=" //a[@id='primary-header-package']") WebElement headerVacationPackage;
		@FindBy(xpath="//a[@id='primary-header-hotel']") WebElement headerHotel;
		@FindBy(xpath="//a[@id='primary-header-car']") WebElement headerCar;
		@FindBy(xpath="//a[@id='primary-header-flight']") WebElement headerFlight;
		@FindBy(xpath="//a[@id='primary-header-cruise']") WebElement headerCruise;
		@FindBy(xpath="//a[@id='primary-header-activity']") WebElement headerActivity;
		@FindBy(xpath="//a[@id='primary-header-tripsforme']") WebElement headerTripForMe;
		@FindBy(xpath="//a[@id='primary-header-discover']") WebElement headerDiscover;
		@FindBy(xpath="//a[@id='primary-header-vacationRental']") WebElement headerVacationRental;
		@FindBy(xpath="//a[@id='primary-header-deals']") WebElement headerDeals;
		@FindBy(xpath="//a[@id='primary-header-inspired']") WebElement headerInspired;
		@FindBy(xpath="//a[@id='primary-header-mobile']") WebElement headerMobile;
		
	//************************  Element Initialization ******************************************************//	
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
	//************************  Page Action Elements ******************************************************//	
		
		//function- verify if main logo is present or not
		public boolean verifyLogoPresent() {
			
			return mainLogo.isDisplayed();
		}
		

		//function- fetcg page title
		public String verifyTitle() {
			
			return driver.getTitle();
			
		}
		
		
		//function- click on menu link-HeaderVacationPackage
		public void clickHeaderVacationPackage(){

			headerVacationPackage.click();
		}
		
		//function- click on menu link-headerHotel
		public void clickHeaderHotel(){

			headerHotel.click();
		}
		
		//function- click on menu link-headerCar
		public void clickHeaderCar(){

			headerCar.click();
		}
		
		

}
