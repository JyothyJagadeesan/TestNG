package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends Base
{
    @Test
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement simpleAlertClickMeButton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		simpleAlertClickMeButton.click();
		driver.switchTo().alert().accept();
	}
}