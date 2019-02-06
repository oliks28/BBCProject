package com.bbc.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"}
				, glue= {"com.bbc.stepDefinitions"}
				, plugin= {
						"pretty",
						"html:target/cucumber-default-reports",
						"json:target/cucumber.json"
				}
				
				, monochrome =true
				)

public class TestRunner {

}
