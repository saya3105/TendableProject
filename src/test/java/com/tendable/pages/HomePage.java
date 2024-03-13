package com.tendable.pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

public class HomePage {
	
	
	@FindBy(xpath= "//nav/ul/li[1]/a")
	WebElement ourStory_tab;
	
	@FindBy(xpath= "//a[text()=\"Our Solution\"]")
	WebElement oursolution_tab;
	
	
	@FindBy(xpath= "//a[text()=\"Why Tendable?\"]")
	WebElement whytendable_tab;
	
	@FindBy(xpath= "//a[text()=\"About Us\"]")
	WebElement aboutus_tab;
	
	
	@FindBy(xpath = "//header/div/div/a[3]")
	WebElement requestDemo_tab;
	
	
	
	public void test_ourStory()
	{
		ourStory_tab.click();
	}
	
	public void test_ourSolution()
	{
		oursolution_tab.click();
	}
	
	public void test_whytendeble()
	{
		whytendable_tab.click();
	}
	public boolean test_aboutus()
	{
		boolean value = aboutus_tab.isEnabled();
		return value;
	}
	
	public boolean test_requestDemo()
	{
		boolean value = requestDemo_tab.isDisplayed();
		return value;
	}
	
	
	
}
