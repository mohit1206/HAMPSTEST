package com.ctli.it.mobilestepdefination;

import com.ctli.it.steps.BookMyShowHomeSteps;
import com.ctli.it.steps.BookMyShowMobileSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class BookMyShowMobileStepDefination {
	@Steps
	BookMyShowMobileSteps bmsms;
	@Given("^click on coming Soon Icon On Book my home page$")
	public void click_on_coming_Soon_Icon_On_Book_my_home_page() throws Throwable {
	   bmsms.clickComingSoon();
	}
}
