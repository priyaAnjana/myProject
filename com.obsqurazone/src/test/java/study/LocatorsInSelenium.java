package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		//WebElement progressBar = driver.findElement(By.id("progress-bars"));// locate using id attribute
		//progressBar.click();
		//WebElement progressBar = driver.findElement(By.cssSelector("a#progress-bars"));
		//progressBar.click();
		WebElement inputForm = driver.findElement(By.xpath("(//*[contains(@class,'nav-link')])[2]"));
		inputForm.click();
		WebElement selectInput = driver.findElement(By.xpath("//a[text()='Select Input']"));
		selectInput.click();
		WebElement drop = driver.findElement(By.cssSelector("select#single-input-field"));
		drop.click();
		Select select = new Select(drop);
		select.selectByIndex(1);
		
		
	}

}
