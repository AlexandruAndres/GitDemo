import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods close get
		//Firefox- FirefoxDriver ->methods close get
		//Safari SafariDriver ->methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		// chromedriver.exe-> Chrome browser
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\chrome driver.exe");
		
		//webdriver.chrome.driver-> value of path 
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Lunch
		//geckodriver
		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver" , "G:\\gecko driver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();	
		
		
	}

}
