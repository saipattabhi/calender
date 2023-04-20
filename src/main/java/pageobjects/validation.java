package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validation {
	
	
	WebDriver driver;
	
	
	public validation(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath ="//button[text()='Accept & Continue']")
	
	WebElement acceptcontinue;
	
	public WebElement accept()
	{
		
		return acceptcontinue;
	}
	
	
	
	
	
	
	

}
