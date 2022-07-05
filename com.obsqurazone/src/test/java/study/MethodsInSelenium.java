package study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInSelenium {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/index.php");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	String sourceCode = driver.getPageSource();
	System.out.println(sourceCode);
	driver.close(); // driver.quite();
	
	}

}
