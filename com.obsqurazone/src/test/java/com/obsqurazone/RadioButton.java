package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement radioButtonDemo = driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]"));
		radioButtonDemo.click();
		WebElement femaleRadioBt = driver.findElement(By.id("inlineRadio2"));
		femaleRadioBt.click();
		boolean radioBt= femaleRadioBt.isSelected();
		System.out.println(radioBt);
		WebElement radioFemaleText = driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
		String female = radioFemaleText.getText();
		System.out.println(female);
		boolean femaleTextPresent = radioFemaleText.isDisplayed();
		System.out.println(femaleTextPresent);
		//driver.close();

	}

}
