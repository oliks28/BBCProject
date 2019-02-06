package com.bbc.stepDefinitions;

import com.bbc.pages.MenuPage;
import com.bbc.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuPageSteps extends BaseClass {

	MenuPage menupage;
	@Given("User is  opens the chrome browser and enter the BBC site URL")
	public void user_is_opens_the_chrome_browser_and_enter_the_BBC_site_URL() {
		setup();
	}

	@Given("User navigates to the BBC home page")
	public void user_navigates_to_the_BBC_home_page() {
	  
	}

	@When("User verified the number of menu items present on the BBC site Home Page")
	public void user_verified_the_number_of_menu_items_present_on_the_BBC_site_Home_Page() {
		menupage.validateLinks();
	}

	

	@Then("User exit from the application")
	public void user_exit_from_the_application() {
	   
	}
}
