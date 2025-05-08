package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class userclass {
    private WebDriver driver;

    // Constructor to accept WebDriver instance
    public userclass(WebDriver driver) {
        this.driver = driver;
    }

    public void user() {
        // Perform actions using the WebDriver instanc
    
    	driver.manage().window().maximize();
    //	driver.findElement(By.xpath("//span[text()=\"Manage Users\"]")).click();
    	driver.findElement(By.xpath("//span[text()= \"Manage Users \"]")).click();
    	driver.findElement(By.xpath("//span[text()= \"All Users\"]")).click();
    //	driver.findElement(By.cssSelector("[name=\"mobile\"]")).sendKeys("9951771659");
    	
    driver.findElement(By.xpath("//input[@name=\"from_date\"]")).sendKeys("04-May-2025");  
    
    driver.findElement(By.xpath("//input[@name=\"to_date\"]")).sendKeys("08-May-2025");
    
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }


	
}
