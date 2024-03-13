package com.tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tendable.pages.BaseClass;
import com.tendable.pages.ContactPage;
import com.tendable.pages.ErrorMsgPage;

public class ErrorTest extends BaseClass {

	@Test
	public void test_error_01() throws InterruptedException, IOException
	{
		ErrorMsgPage obj = PageFactory.initElements(driver, ErrorMsgPage.class);
		obj.check_error();
		
	}
}
