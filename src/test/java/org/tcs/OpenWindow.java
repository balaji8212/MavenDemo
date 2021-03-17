package org.tcs;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	public class OpenWindow extends LibGlobal{
		
		public static void main(String[] args) {
			
			browserConfigur();
			browserLaunch("https://adactinhotelapp.com/");
			WebElement txtusename = driver.findElement(By.id("username"));
			txtusename.sendKeys("harishdurai123");
			WebElement txtpass = driver.findElement(By.id("password"));
			txtpass.sendKeys("12345678909");
			WebElement btnclick = driver.findElement(By.name("login"));
			btnclick.click();
			 nextPage b=new nextPage();
				dropDowndeSelectByIndex(b.getDropDow(), 3);
				dropDowndeSelectByIndex(b.getDropDow1(), 3);
				dropDowndeSelectByIndex(b.getDropDow2(), 2);
				dropDowndeSelectByIndex(b.getDropDow3(), 1);
		}

	}


