package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
    @FindBy(xpath="//*[@id='side-menu']/li[6]/a")
    WebElement systemEle;
    @FindBy(xpath="//*[@id='side-menu']/li[6]/ul/li[6]/a")
    WebElement returnsEle;
    @FindBy(xpath="//*[@id='side-menu']/li[6]/ul/li[6]/ul/li[1]/a")
    WebElement returnStatusesEle;
    @FindBy(xpath="//input[@type='search']")
    WebElement searchReturnStatusEle;
    @FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr/td[2]")
    WebElement searchElement;
    @FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr/td")
    WebElement noRecordEle;
	
	
	public AdminPage(WebDriver driver,WebDriverWait wait)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}
	public void clickOnSystem()
	{
		systemEle.click();
	}
	public void clickOnReturns()
	{
		returnsEle.click();
	}
	public void clickOnReturnStatus()
	{
		returnStatusesEle.click();
	}
public void searchReturnStatus(String searchElemnt)
{
	searchReturnStatusEle.sendKeys(searchElemnt);
	
}
public void searchVerification(String searchel)
{
	if(driver.getPageSource().contains("No matching records found"))
	{
		System.out.println("Return Status is not present");
	}
	else
	{
		Assert.assertTrue(searchElement.getText().contains(searchel));
		System.out.println("Return Status record is present");
	}
	
}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
