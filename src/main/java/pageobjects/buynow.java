package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buynow {
	

	WebDriver driver;
	
	
	public buynow(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	
	WebElement buy;
	
	
	public WebElement sold()
	{
		
		return buy;
	}
	
	
	
	

}
