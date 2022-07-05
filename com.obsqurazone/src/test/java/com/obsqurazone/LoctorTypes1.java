package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorTypes1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement inputForm = driver.findElement(By.className("nav-link"));
		//inputForm.click();
		WebElement messageTextBox = driver.findElement(By.id("single-input-field"));
		 messageTextBox.sendKeys("hi");
		 WebElement showMessage = driver.findElement(By.id("button-one"));
		 showMessage.click();
		 WebElement youMessage = driver.findElement(By.className("my-2"));
		 String text = youMessage.getText();
		  System.out.println(text);
		  WebElement enterValueA = driver.findElement(By.cssSelector("input#value-a"));
		  enterValueA.sendKeys("20");
		  WebElement enterValueB = driver.findElement(By.cssSelector("input#value-b"));
		  enterValueB.sendKeys("30");
		 WebElement getTotal = driver.findElement(By.cssSelector("button#button-two"));
		 // WebElement getTotal = driver.findElement(By.linkText("Get Total"));
		  getTotal.click();
		  WebElement totalText = driver.findElement(By.id("message-two"));
		  String text1 =  totalText.getText();
		  System.out.println(text1);
		 
		  
		//driver.quit();
		

	}

}
