package com.ctli.it.StepDefination;

import com.ctli.it.steps.BookMyShowHomeSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BookMyPageStepDefination {
	@Steps
	BookMyShowHomeSteps bmsp;
	
	@Given("^User is at home page \"([^\"]*)\" of book my trip\\.$")
	public void user_is_at_home_page_of_book_my_trip(String arg1) throws Throwable {
		bmsp.homePage(arg1);
	}

	
	
	@Given("^User is at home page of book my trip\\.$")
	public void user_is_at_home_page_of_book_my_trip() throws Throwable {
//		bmsp.homePage();
	}

	@And("^I select the city as Bangalore$")
	public void i_select_the_city_as_Bangalore() throws Throwable {
		bmsp.click_citys();
	}

	@Then("^I verify the city appear on book my trip as bangalore$")
	public void i_verify_the_city_appear_on_book_my_trip_as_bangalore() throws Throwable {
		bmsp.verif_City();
	}
	
	@Given("^I select the top three movie from list$")
	public void i_select_the_top_three_movie_from_list() throws Throwable {
	   bmsp.topMovieText();
	}
	
	@Then("^I click on Sunil grover Show$")
	public void i_click_on_Sunil_grover_Show() throws Throwable {
	    bmsp.click_SunilGrover();
	}

}
