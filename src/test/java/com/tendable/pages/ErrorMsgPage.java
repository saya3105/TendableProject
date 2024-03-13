package com.tendable.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ErrorMsgPage {

	@FindBy(xpath = "//div[@class=\"page-text-inner\"]/h3")
	WebElement errormsg;

	public void check_error() throws IOException {
		
		String actualmsg = errormsg.getText();
		String expectedmsg = "Sorry, there was an error submitting the form. Please try again.";
		
		if (actualmsg.equals("Sorry! We didn't find any matching results for ''")) {
			
			Assert.assertEquals(actualmsg, expectedmsg);
		} else {
			
			WebElement errromsg = BaseClass.driver.findElement(By.xpath("//div[@class=\"ff-form-errors\"]/p"));
			String erromsgtext = errormsg.getText();
			if(erromsgtext.equals(expectedmsg))
			{
				Assert.assertTrue(true);
			}

		}

	}

}
