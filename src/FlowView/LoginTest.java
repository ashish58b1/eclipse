package FlowView;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://fv3test.azurewebsites.net/login");
	
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("userName")).sendKeys("flname1");
		driver.findElement(By.id("userPassword")).sendKeys("Temp~1");
		driver.findElement(By.id("userPassword")).sendKeys("Temp~1");
		driver.findElement(By.xpath("//div[@class='pull-right login-button']")).click();

	}

}
