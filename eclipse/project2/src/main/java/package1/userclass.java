package package1;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userclass {
	private WebDriver driver;

	// Constructor to accept WebDriver instance
	public userclass(WebDriver driver) {
		this.driver = driver;
	}
	//  @Ignore
	//@Test
	public void user() {
		// Perform actions using the WebDriver instanc

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()= \"Manage Users \"]")).click();
		driver.findElement(By.xpath("//span[text()= \"All Users\"]")).click();    	
//		driver.findElement(By.xpath("//input[@name=\"from_date\"]")).sendKeys("04-May-2025");  
//
//		driver.findElement(By.xpath("//input[@name=\"to_date\"]")).sendKeys("08-May-2025");
//
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}


	public void pagination() throws InterruptedException {
		// Perform actions related to pagination
	
		 while (true) {
		        // Perform actions on the current page
		        System.out.println("Processing current page...");

		        Thread.sleep(2000);

		        // Check if the "Next" button exists and is displayed
		        WebElement nextbutton;
		        try {
		            nextbutton = driver.findElement(By.xpath("//a[@rel=\"next\"]"));
		            if (nextbutton.isDisplayed() && nextbutton.isEnabled()) {
		                nextbutton.click(); // Go to the next page
		            } else {
		                break; // Exit the loop if "Next" is not enabled
		            }
		        } catch (org.openqa.selenium.NoSuchElementException e) {
		            System.out.println("No 'Next' button found. Exiting pagination.");
		            break; // Exit the loop if the "Next" button is not found
		        }
		
	}

	}	
}
