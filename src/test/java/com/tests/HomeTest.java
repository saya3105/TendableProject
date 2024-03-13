package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tendable.pages.BaseClass;
import com.tendable.pages.HomePage;

public class HomeTest extends BaseClass {

	
	@Test
	public void test_ourstory_01() {

		HomePage obj = PageFactory.initElements(driver, HomePage.class);
		obj.test_ourStory();
		String storyurl = driver.getCurrentUrl();
		Assert.assertEquals(storyurl, "https://www.tendable.com/our-story");
	}

	@Test
	public void test_ourSolution_02() {

		HomePage obj = PageFactory.initElements(driver, HomePage.class);
		obj.test_ourSolution();
		String storyurl = driver.getCurrentUrl();
		Assert.assertEquals(storyurl, "https://www.tendable.com/our-solution");
	}

	@Test
	public void test_whytendeble_03() {

		HomePage obj = PageFactory.initElements(driver, HomePage.class);
		obj.test_whytendeble();
		String storyurl = driver.getCurrentUrl();
		Assert.assertEquals(storyurl, "https://www.tendable.com/why-tendable");
	}

	@Test
	public void test_aboutus_04() {

		HomePage obj = PageFactory.initElements(driver, HomePage.class);
		boolean value = obj.test_aboutus();
		Assert.assertTrue(value, "About Us Button is not working");

	}
	@Test
	public void test_requestDemo_05() {

		HomePage obj = PageFactory.initElements(driver, HomePage.class);
		boolean value = obj.test_requestDemo();
		Assert.assertTrue(value);
	}

}
