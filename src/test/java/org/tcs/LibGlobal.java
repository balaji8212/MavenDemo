package org.tcs;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class LibGlobal {

		static WebDriver driver;

		public static void browserConfigur() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Mevan\\driver\\chromedriver.exe");
			driver =new ChromeDriver();
	      
		}
		public static void browserLaunch(String url) {
	          driver.get(url);
		}
		
		public static void type(WebElement element, String value) {
			
			element.sendKeys(value);
			
	}
		public static void press(WebElement element) {
			element.click();
		}
		public static void close() {
			driver.close();
	}
		public static void dropDownSelectByIndex(WebElement element,int index) {
	     Select s = new Select(element);
	     s.selectByIndex(index);
		}
		public static void dropDownSelectByVisibleTxt(WebElement element,String txt) {
		     Select s = new Select(element);
		     s.selectByVisibleText(txt);
			}
		public static void dropDownSelectByValue(WebElement element,String value) {
		     Select s = new Select(element);
		     s.selectByVisibleText(value);
			}
		public static void dropDowndeSelectByValue(WebElement element,String value) {
		     Select s = new Select(element);
		     s.selectByVisibleText(value);
			}
		public static void dropDowndeSelectByVisibleTxt(WebElement element,String txt) {
		     Select s = new Select(element);
		     s.selectByVisibleText(txt);
			}
		public static void dropDowndeSelectByIndex(WebElement element,int index) {
		     Select s = new Select(element);
		     s.selectByIndex(index);
			}
//		public static void isMultiple(WebElement element) {
//			 Select s = new Select(element);
//	         boolean multiple = s.isMultiple();
//		}
//		public static void getAllSelected(WebElement element) {
//			 Select s = new Select(element);
//	         List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		}
//		public static void getFristSelected(WebElement element) {
//			 Select s = new Select(element);
//			 WebElement element2 = s.getFirstSelectedOption();
//			 
//		}
//		public static void getOptions(WebElement element) {
//			Select s = new Select(element);
//			List<WebElement> options = s.getOptions();
//		} 
		
		
		
		
		
		
	}

