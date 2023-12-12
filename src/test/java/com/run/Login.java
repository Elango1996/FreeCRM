package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	  public static  WebDriver driver;
	@Test(priority = 0)
	public static void crtCredentials() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Augray\\Project-workspace\\FreeCRM\\ChromdeDriver\\chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		System.out.println("Test passed1  2");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("elangovanjeeva10@gmail.com");
		System.out.println("Test passed2  2");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(3000);
		System.out.println("Test passed1  2");
	}
		@Test(priority = 1)
	public static  void incrtCredentials() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Augray\\Project-workspace\\FreeCRM\\ChromdeDriver\\chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elangovanjeeva10@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Test passed2 3");
		Thread.sleep(3000);

	}

		@Test(priority = 2)
	public void forgotButton() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Augray\\Project-workspace\\FreeCRM\\ChromdeDriver\\chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		WebElement forgotEmailField = driver.findElement(By.xpath("//input[@type='email']"));
		forgotEmailField.sendKeys("tempmail.gmail.com");
		Thread.sleep(5000);
		forgotEmailField.clear();
//		driver.navigate().back();
		System.out.println("Test passed3  4");

//		CalendarFlow cf=new CalendarFlow();
//		cf.Action();

	}


}
