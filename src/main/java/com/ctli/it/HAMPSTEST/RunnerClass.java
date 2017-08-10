package com.ctli.it.HAMPSTEST;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ctli.it.excel.ExcelUtils;
import com.ctli.it.library.Environment;
import com.ctli.it.library.STAFEnvironment;
import com.ctli.it.library.Steps;
import com.ctli.it.library.TestEnvironment;
import com.ctli.it.pages.ExtendingPage;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@TestEnvironment(Environment.ITV1)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Features",
tags =  {"@MakeyMyTrp"},glue = "com.ctli.it.StepDefination",plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"})
public class RunnerClass {
	@BeforeClass
	public static void setEnvironment() {
		ExcelUtils.setPropertiesValue();
		//HashMap  hm=new HashMap();
		

	}
	
	
}
