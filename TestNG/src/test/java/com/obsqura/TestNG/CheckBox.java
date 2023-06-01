package com.obsqura.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base
{
    @Test
	public void checkbox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
		boolean checkboxIsSelected= checkbox.isSelected();
	}

}
