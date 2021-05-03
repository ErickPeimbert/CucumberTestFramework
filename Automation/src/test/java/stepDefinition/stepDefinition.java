package stepDefinition;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition {
	
	
	//BACKGROUND STEPS:
	 	@Given("^validate the Browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("Background running: Validating the browser...");
	    }

	 	@When("^browser is trigered$")
	    public void browser_is_trigered() throws Throwable {
	    	System.out.println("Background running: The browser is trigered...");
	    }
	 	
	 	
	 	@Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	 		System.out.println("Background running: The browser is started...");
	    }

	    
	
	
	
	
	
	
	
	// Stepdefinition file matches with Tagname and description

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //code to get the user into the landing page
    	System.out.println("user is in the landing page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in successful");
    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
      System.out.println(strArg1);
      System.out.println(strArg2);
    }
    
    @When("^User loging with the following details$")
    public void user_loging_with_the_following_details(DataTable data) throws Throwable {
        List<String> obj = data.asList();
        
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
     
    }
    //This is for the EXAMPLE datatable (parametrized cucumber)
    @When("^Users can login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
      System.out.println(username);
      System.out.println(password);
    }
    
    @And("^Cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }



    @Then("^Homepage is populated$")
    public void homepge_is_populated() throws Throwable {
    	System.out.println("Validated homepage");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Validated homepage");
    	
    }
    
    
    //Third Example
    

}

