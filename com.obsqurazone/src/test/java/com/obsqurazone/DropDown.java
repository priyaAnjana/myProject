package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement selectForm = driver.findElement(By.xpath("//*[text()='Select Input']"));
		selectForm.click();
		WebElement selectColor= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		selectColor.click();
		Select select = new Select(selectColor);
		//select.selectByIndex(3);
	select.selectByValue("Yellow");
		//select.selectByVisibleText("Green");
	
		
		
	}

}
