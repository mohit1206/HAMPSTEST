package com.ctli.it.HAMPSTEST;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctli.it.excel.ExcelUtils;
import com.ctli.it.library.Environment;
import com.ctli.it.library.STAFEnvironment;
import com.ctli.it.library.Steps;
import com.ctli.it.library.TestEnvironment;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@TestEnvironment(Environment.ITV2)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Features",
tags =  {"@MakeyMyTrp"},glue = "com.ctli.it.StepDefination",plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"})
public class RunnerClass {
	@BeforeClass
	public static void setEnvironment() {
		ExcelUtils.setPropertiesValue();
//		STAFEnvironment.registerEnvironment(RunnerClass.class);
//		System.out.println("Ankit kumar singh6778");
//		Steps.initialize();
	}
	
	
}
