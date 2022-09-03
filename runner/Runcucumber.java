package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import stepDef.ProjectSpecificMethod;

@CucumberOptions(features="src/test/java/features/login.feature" ,glue={"stepDef", "hooks"} ,monochrome = true , publish = true, tags = "@Smoke")

public class Runcucumber extends ProjectSpecificMethod {
	
	

}
