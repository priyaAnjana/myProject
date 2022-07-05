package com.obsqurazone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssgmtJQuerySelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JITHIN NAIR\\eclipse-workspace\\com.obsqurazone\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement inputForm =  driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		inputForm.click();
		WebElement jquerySelect2 = driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
		jquerySelect2.click();
		WebElement  statesDropDown = driver.findElement(By.xpath("(//select[contains(@class,'js-states form-control ')])[1]"));
		statesDropDown.click();
		//WebElement textBox = driver.findElement(By.cssSelector("input.select2-search__field"));
		Select select = new Select(statesDropDown);
		select.selectByIndex(2);




	}

}
