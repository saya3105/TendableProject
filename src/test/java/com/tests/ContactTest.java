package com.tests;

import org.openqa.selenium.devtools.v114.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tendable.pages.BaseClass;
import com.tendable.pages.ContactPage;

public class ContactTest extends BaseClass{
	
	@Test
	public void test_contact_marketing_form() throws InterruptedException
	{
		ContactPage obj = PageFactory.initElements(driver, ContactPage.class);
		obj.test_contact();
		obj.select_marketing();
		obj.fillmarketingform();
		Thread.sleep(3000);
	}

}
