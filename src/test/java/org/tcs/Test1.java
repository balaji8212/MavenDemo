package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@Test
private void tc1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Mevan\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test (dataProvider="dataForm")
	private void tc2(String email,String pass) {
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement findElement = driver.findElement(By.name("login"));		
		findElement.click();
		

	}
	@DataProvider(name="dataForm")
	public Object [][] data(){
		return new Object[][] {
			{"balaji","1638895"},	
			{"allen","3782739"},		
		{"ajith","289488"}
		};
	}
}
		
		
		 
	


