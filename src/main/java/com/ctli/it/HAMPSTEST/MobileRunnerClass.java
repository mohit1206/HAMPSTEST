package com.ctli.it.HAMPSTEST;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctli.it.excel.ExcelUtils;
import com.ctli.it.library.Environment;
import com.ctli.it.library.TestEnvironment;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import com.ctli.it.HAMPSTEST.AppiumServerStart.*;

@TestEnvironment(Environment.ITV2)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Features",
tags =  {"@Appium"},glue = "com.ctli.it.StepDefination",plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"})
public class MobileRunnerClass {
	@BeforeClass
	public static void setEnvironment() {
	AppiumServerStart.startAppiumServer();
		ExcelUtils.setPropertiesValue();

		
//		STAFEnvironment.registerEnvironment(RunnerClass.class);
//		System.out.println("Ankit kumar singh6778");
//		Steps.initialize();
	}
}
