package com.page_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) 
	{
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver, 15);
	}
	
	public abstract String getPageTitle();
	
	public abstract String getPageURL();
	
	public void getObject() {
		
	}
	
	
}
