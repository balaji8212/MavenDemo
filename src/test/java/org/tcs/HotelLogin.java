package org.tcs;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

	public class HotelLogin extends LibGlobal {
	public HotelLogin() {
	PageFactory.initElements(driver, this);
	}
	    @FindBy(id="username")
		private WebElement txtUserName;
	    @CacheLookup
	    @FindAll({
	    	@FindBy(id="password"),
	    	@FindBy(xpath="(//input[@class='login_input'])[2]}")})
		private WebElement txtPass;
	    @CacheLookup
	    @FindAll({
	    	@FindBy(id="login"),
	    	@FindBy(name="login")
	    })
		private WebElement btnLogin;
	    
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
		
}
