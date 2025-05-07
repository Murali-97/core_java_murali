package newpackage;

public class class1 {

	
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Example usage: Open a website
        driver.get("https://www.google.com");
        
        // Close the browser
        driver.quit();
	
}
