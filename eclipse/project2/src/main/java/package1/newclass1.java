package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // Auto-setup driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//  driver.manage().timeouts().implicitlyWait(10, null);
		driver.get("https://dev.snaplocalapp.com/admin/login");
		// driver.quit();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin@cmoon.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("cmoon@123");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.quit();


	}

}
