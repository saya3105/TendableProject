package com.tendable.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {
	
	@FindBy(xpath = "//header/div/div/a[1]")
	WebElement contact_tab;
	
	@FindBy(xpath = "//button[text()=\"Contact\"]")
	WebElement marketing_btn;
	
	@FindBy(id = "form-input-fullName")
	WebElement fname_txt;
	
	
	@FindBy(id = "form-input-organisationName")
	WebElement organisation_txt;
	
	@FindBy(id ="form-input-cellPhone")
	WebElement phonenum_txt;
	
	
	@FindBy(id ="form-input-email")
	WebElement email_txt;
	
	
	@FindBy(id ="form-input-jobRole")
	WebElement jobrole;
	
	
	/*@FindBy(id ="form-input-message")
	WebElement msg_txt;*/
	
	
	@FindBy(xpath ="//input[@id=\"form-input-consentAgreed-0\"]")
	WebElement iagree_btn;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submit_btn;
	
	
	
	
	public void test_contact() {
		contact_tab.click();
	}
	
	public void select_marketing() {
		marketing_btn.click();
	}
	
	public void fillmarketingform() throws InterruptedException
	{
		fname_txt.sendKeys("Sayali");
		organisation_txt.sendKeys("Abcd");
		phonenum_txt.sendKeys("9898989898");
		email_txt.sendKeys("s@gmail.com");
		
		Select s = new Select(jobrole);
		s.selectByIndex(2);
		
		//msg_txt.sendKeys("Hello .. ");
		
		
		Thread.sleep(2000);
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(iagree_btn).click().build().perform();
		Thread.sleep(2000);
		submit_btn.click();
		
		
		
		
		
		
		
		
		
	}

}
