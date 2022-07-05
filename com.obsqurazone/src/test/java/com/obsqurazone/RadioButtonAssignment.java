package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement radioButtonDemo = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioButtonDemo.click();
		WebElement maleRadioButton = driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[1]"));
		maleRadioButton.click();
		boolean isselectedMale = maleRadioButton.isSelected();
		System.out.println(isselectedMale);
		WebElement showSelectedValue = driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[1]"));
		showSelectedValue.click();
		WebElement text = driver.findElement(By.id("message-one"));
		boolean displayText = text.isDisplayed();
		System.out.println(displayText);
		String showText = text.getText();
		System.out.println(showText);
	}

}
