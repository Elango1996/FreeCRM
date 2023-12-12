package com.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Starts {
	public static  WebDriver driver;
	public static void Inti() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Augray\\Project-workspace\\FreeCRM\\ChromdeDriver\\chromedriver.exe");
		WebDriver driver	=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");

		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elangovanjeeva10@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@123");
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
		System.out.println("Test passed 1");
	}
		
		
		
		
//	}
}
