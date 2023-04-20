package sentil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datatable {

	WebDriver driver;

	@Test
	public void datatable() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	String urlpage = driver.getCurrentUrl();
	
	System.out.println("URL of pageis" +urlpage);

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"countries\"]//tr//td[h3]"));

		System.out.println(elements.size());

		Assert.assertEquals(elements.size(), 5);
		
		for (WebElement dq : elements) {

			String headings = dq.getText();

			System.out.println(headings);

		}

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"countries\"]//tr"));

		System.out.println(rows.size());

		System.out.println("------------------------------------------");

		List<WebElement> data = driver.findElements(By.xpath("//*[@id=\"countries\"]//tr//td"));
		
		
		boolean status=false;

		for (WebElement icon : data) {

			String cell = icon.getText();
        
			System.out.println(cell);
		
			if(cell.contains("Euro"))
			{
				status=true;
				break;
			}
			
			

		}

		
		Assert.assertTrue(status);
		
		driver.quit();

	}

}
