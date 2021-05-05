package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@PortalTest")
	public void beforeValidation(){
		System.out.println("Before Portal test...");
	}
	
	@After("@PortalTest")
	public void afterValidation(){
		System.out.println("Before Portal test...");
	}
	
	
}
