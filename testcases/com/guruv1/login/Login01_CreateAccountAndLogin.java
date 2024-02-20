package com.guruv1.login;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login01_CreateAccountAndLogin {

	WebDriver driver;
	String email, user, password;

	@BeforeClass
	public void beforeClass() {
		email = randomEmail();
	}

	@Test
	public void TC01_CreateAnAcount() {
	}

	@Test
	public void TC02_Login() {
		Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	}

	@AfterClass
	public void afterClass() {
	}

	public String randomEmail() {
		Random random = new Random();
		int number = random.nextInt(999999);
		String randomEmail = "automation" + number + "@gmail.com";
		return randomEmail;
	}

}
