package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slidebar {
	
WebDriver driver;


public slidebar(WebDriver driver)
{
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
}
@FindBy(xpath = "//div[@class='_31Kbhn _28DFQy']")	

WebElement startpoint;


@FindBy(xpath = "//div[text()='SONY W820 80 cm (32 inch) HD Ready LED Smart Android TV']")

WebElement sonytv;

public WebElement startpoint()
{
	
	return startpoint;
}
	
public WebElement sonytv()
{
	
	return sonytv;
}
	
	
	
	

}
