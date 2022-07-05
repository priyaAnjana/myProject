package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgmtSimpleFormDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		/*enterValueA.sendKeys("30");
		WebElement enterValueB = driver.findElement(By.id("value-b"));
		enterValueB.sendKeys("35");
		WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
		getTotalButton.click();
		WebElement totalAB = driver.findElement(By.id("message-two"));
		String text = totalAB.getText();
		System.out.println(text);*/

	}

}
