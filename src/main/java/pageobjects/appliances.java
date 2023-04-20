package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class appliances {
	
	
	
	WebDriver driver;
	
	public appliances(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//div[text()='Appliances']")
	
	WebElement items;
	
	
	@FindBy(xpath = "//a[text()='Televisions']")
	WebElement televisions;
	
	@FindBy(xpath = "//a[text()='24-32 Inch']")
	WebElement inches;
	
	public WebElement applianceicon()
	{
		
		return items;
		
	}
	
	
	public WebElement televisi()
	{
		
		return televisions;
	}
	public WebElement size()
	{
		
		
		return inches;
	}

}
