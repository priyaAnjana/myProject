package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputForm = driver.findElement(By.xpath("(//a[contains(@class,'nav-link')])[2]"));
		inputForm.click();
		WebElement checkBoxDemo = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkBoxDemo.click();
		WebElement selectAllButton = driver.findElement(By.id("button-two"));
		selectAllButton.click();
		WebElement checkFirst = driver.findElement(By.id("check-box-one"));
		boolean isSelectCheckFirst = checkFirst.isSelected();
		System.out.println(isSelectCheckFirst );
		WebElement checkTwo = driver.findElement(By.id("check-box-two"));
		boolean isSelectCheckTwo = checkTwo.isSelected();
		System.out.println(isSelectCheckTwo);
		WebElement checkThree = driver.findElement(By.id("check-box-three"));
		boolean isSelectCheckThree = checkThree.isSelected();
		System.out.println(isSelectCheckThree);
		WebElement checkFour = driver.findElement(By.id("check-box-four"));
		boolean isSelectCheckFour = checkFour.isSelected();
		System.out.println(isSelectCheckFour);
	}
}
