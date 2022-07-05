package com.obsqurazone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnmtTablePagination {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//a[contains(@href,'table-pagination.php')]"));
		table.click();
		//WebElement previous = driver.findElement(By.id("dtBasicExample_previous"));
		WebElement next = driver.findElement(By.xpath("//a[text()='Next']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", next);
		WebElement pagination3 = driver.findElement(By.xpath("(//a[contains(@class,'page-link')])[4]"));
		pagination3.click();
		WebElement nameBrendenWanger = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[8]//td[1]"));
		String name = nameBrendenWanger.getText();
		System.out.println(name);


	}

}
