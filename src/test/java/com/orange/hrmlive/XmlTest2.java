package com.orange.hrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlTest2 {
	@Parameters({ "uname", "pass" })
	@Test
	public void paraTest2(String uname, String pass) {
		System.out.println("Opening Browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\jenkinsdemo\\myfirst.mavn.testngapp\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Loging in");
		driver.findElement(By.name(uname)).sendKeys("Admin");

		driver.findElement(By.id(pass)).sendKeys("admin123");

		driver.findElement(By.name("Submit")).click();

	}

}
