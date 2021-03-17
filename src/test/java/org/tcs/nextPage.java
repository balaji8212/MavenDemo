package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class nextPage extends LibGlobal {
	public nextPage() {
	PageFactory.initElements(driver, this); 
	}
	@CacheLookup
    @FindBys({
    	@FindBy(id="location"),
    	@FindBy(xpath="(//select[@class='search_combobox'][1])")
    })
    private WebElement dropDow;
    @CacheLookup
    @FindBys({
    	@FindBy(id="hotels"),
    	@FindBy(name="hotels")
    })
    private WebElement dropDow1;
    @CacheLookup
    @FindBys({
    	@FindBy(id="room_type"),
    	@FindBy(name="room_type")
    })
    private WebElement dropDow2;
    @CacheLookup
    @FindBys({
    	@FindBy(id="room_nos"),
    	@FindBy(name="room_nos")
    })
    private WebElement dropDow3;
    @CacheLookup
    @FindBys({
    	@FindBy(id="datepick_in"),
    	@FindBy(name="datepick_in")
    })
   private WebElement dateIn;
    @CacheLookup
    @FindBys({
    	@FindBy(id="datepick_out"),
    	@FindBy(name="datepick_out")
    })
   private WebElement dateOut;
    @CacheLookup
    @FindBys({
    	@FindBy(id="adult_room"),
    	@FindBy(name="adult_room")
    })
   private WebElement person;
    @CacheLookup
    @FindBys({
    	@FindBy(id="child_room"),
    	@FindBy(name="child_room")
    })
   private WebElement child;
    @CacheLookup
    @FindBys({
    	@FindBy(id="submit"),
    	@FindBy(name="submit")
    })
   private WebElement btnSearch;
    public WebElement getDropDow() {
		return dropDow;
	}
	public WebElement getDropDow1() {
		return dropDow1;
	}
	public WebElement getDropDow2() {
		return dropDow2;
	}
	public WebElement getDropDow3() {
		return dropDow3;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getPerson() {
		return person;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
		

}
