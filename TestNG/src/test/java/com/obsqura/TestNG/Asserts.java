package com.obsqura.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts extends Base
{
	@Test
	public void assertEqualsSample()
	{
		String input="Jyothy";
		String expectedmessage="Your Message : "+input;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputtextfield.sendKeys(input);
		WebElement showmessagebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebtn.click();
		String showmessagebtntxt= driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		System.out.println(showmessagebtntxt);
		
		
		assertEquals(expectedmessage,showmessagebtntxt,"Message generated is not same as the entered value in single input textfield");
		
	}
	@Test
	public void assertNotEqualsSample()
	{
		String expectedValue="123";
		String actualValue="23";
		assertNotEquals(expectedValue,actualValue,"expected and actual values are same");
		
	}
	@Test
	public void assertTrueSample()
	{
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean singleinputtextfieldisdisplayed=singleinputtextfield.isDisplayed();
		assertTrue(singleinputtextfieldisdisplayed,"single input textfield is not displayed");
	}
	
	@Test
	public void verifyTheShowmessageButtonColor()
	{
		String expectedValue="rgba(0, 123, 255, 1)";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualValue= showMessageButton.getCssValue("background-color");
		assertEquals(expectedValue,actualValue,"Show message button color is not same as expected");
	}
	
	@Test
	public void verifyTheShowmessageButtonWidth()
	{
		int expectedValue=136;
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		Dimension showMessageButtonSize = showMessageButton.getSize();
	    int actualValue = showMessageButtonSize.getWidth();
		assertEquals(expectedValue,actualValue,"Show message button width is not same as expected");
	}
	@Test
	public void verifyWhetherTheGettotalbuttonIsDisplayed()
	{
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getTotalButtonIsDisplayed=getTotalButton.isDisplayed();
		assertTrue(getTotalButtonIsDisplayed, "get total button is not displayed");
	}
	@Test
	public void assertFalseSample()
	{
		boolean flag=true;
		assertFalse(flag,"flag is true");
	}
	@Test
	public void assertNull()
	{
	
		String value= null;
		Assert.assertNull(value,"value is not null");
	}

}
