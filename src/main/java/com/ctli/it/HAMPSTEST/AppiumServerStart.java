package com.ctli.it.HAMPSTEST;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import static com.ctli.it.HAMPSTEST.Property.*;
import static io.appium.java_client.service.local.AppiumDriverLocalService.buildService;

import java.io.File;
import java.util.Properties;

public final class AppiumServerStart {
	  private final static AppiumDriverLocalService service;

	    static {
		//System.out.println(APPIUM_HOST +"    "+ APPIUM_PORT + "     " + APPIUM_LOG_LEVEL + "     " + GeneralServerFlag.LOG_LEVEL );
	    	System.out.println(System.getProperty("webdriver.driver")+"Ankit");
		
	        service = buildService(new AppiumServiceBuilder().
	        	                                     withIPAddress("127.0.0.1").
	        	                                     usingPort(Integer.parseInt("4723"))
	        	       .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
	                       .withArgument(GeneralServerFlag.LOG_LEVEL, "info"));
	    }

	    public static void startAppiumServer() {
		try{
	                 service.start();
		}catch(Exception e){
		    e.printStackTrace();
		}
}}
