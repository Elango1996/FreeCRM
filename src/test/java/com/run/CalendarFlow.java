package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalendarFlow  {

	public static  WebDriver driver;
	
	public static void Action() {
		
		WebElement calendarHover = driver.findElement(By.xpath("//span[contains(text(),'Calendar')]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(calendarHover).perform();
		
	}
	



}
