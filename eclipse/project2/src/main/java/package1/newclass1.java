package package1;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newclass1 {
    browserlaunch b = new browserlaunch();

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser = sc.next();

        // Get WebDriver instance from browserlaunch
        WebDriver driver = b.launch(browser);

        driver.manage().window().maximize();
        driver.get("https://dev.snaplocalapp.com/admin/login");

        // Perform login
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin@cmoon.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("cmoon@123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        // Pass the WebDriver instance to userclass
        userclass u = new userclass(driver);
        u.user();

        //driver.quit(); // Ensure the browser is closed after execution
    }

    public static void main(String[] args) {
        newclass1 n = new newclass1();
        n.login();
    }
}
