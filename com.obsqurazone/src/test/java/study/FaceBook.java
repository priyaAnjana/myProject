package study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement emailaddress = driver.findElement(By.xpath("//*[@id='email']"));
		emailaddress.sendKeys("ppppppp@gmail.com");
		
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("qqqqqqqqqq");
		//WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		//loginbutton.click();
		WebElement forgotbutton = driver.findElement(By.className("_97w4"));
		forgotbutton.click();
		//driver.close();
		//driver.quit();

	}

}
