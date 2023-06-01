package com.obsqura.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSample extends Base
{

	 @Test
	 public void testCase1()
	 {
		 System.out.println("TestCase1");
	 }
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("beforeTest");
	 }
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("afterTest");
	 }
	 
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("BEFORE METHOD");
	 }
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("AFTER METHOD");
	 }
	 
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("beforeClass");
	 }
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("afterClass");
	 }
	 @BeforeSuite
	 public void beforeSuite()
	 {
		 System.out.println("beforesuite");
	 }
	 @AfterSuite
	 public void afterSuite()
	 {
		 System.out.println("aftersuite");
	 }
	 
}
