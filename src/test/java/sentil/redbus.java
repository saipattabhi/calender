package sentil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	WebDriver driver;

	@Test
	public void rebus() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String date = "Dec 2022";
		String day = "12";

		driver.findElement(By.xpath("//*[@class=\"fl search-box date-box gtm-onwardCalendar\"]")).click();
		
	

		while (true) {

			String month = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"))
					.getText();

			if (month.equals(date)) {

				break;
			}

			else {

				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]")).click();
				
			
			}

		}
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[contains(text(),"+day+")]")).click();

	}
}
