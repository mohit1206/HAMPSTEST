package com.ctli.it.HAMPSTEST;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctli.it.excel.ExcelUtils;
import com.ctli.it.library.Environment;
import com.ctli.it.library.TestEnvironment;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@TestEnvironment(Environment.ITV1)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Features",
tags =  {"@Appium"},glue = "com.ctli.it.mobilestepefination",plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"})
public class MobileRunnerClass {
	@BeforeClass
	public static void setEnvironment() {
		ExcelUtils.setPropertiesValue();
		AppiumServerStarting.appiumStart();
//		STAFEnvironment.registerEnvironment(RunnerClass.class);
//		Steps.initialize();
	}
}
