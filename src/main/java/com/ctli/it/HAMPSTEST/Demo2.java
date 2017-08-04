package com.ctli.it.HAMPSTEST;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Demo2 {
	WebDriver driver;
	AppiumDriverLocalService appiumService;
	String appiumServiceUrl;
	String appiumInstallationDir = "C:/Program Files (x86)";

@Test
public void test()
{
	File classPathRoot = new File(System.getProperty("user.dir"));
//	appiumService = AppiumDriverLocalService.buildDefaultService();
//	appiumService.start();
//    appiumServiceUrl = appiumService.getUrl().toString();
//    System.out.println("Appium Service Address : - "+ appiumServiceUrl);
	
	/*appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(appiumInstallationDir + File.separator + "Appium" + File.separator + "node.exe")).withAppiumJS(new File(appiumInstallationDir + File.separator + "Appium" + File.separator+ "node_modules" + File.separator + "appium" + File.separator + "bin" + File.separator + "appium.js")).withLogFile(new File(new File(classPathRoot, File.separator + "log"), "androidLog.txt")));
	appiumService.start();
	appiumServiceUrl = appiumService.getUrl().toString();*/
	Runtime runtime = Runtime.getRuntime();
	try {
		runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
		Thread.sleep(10000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
