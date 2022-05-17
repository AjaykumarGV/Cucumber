package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.sample.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun\\failed.txt",  glue="org.sample", dryRun=false,monochrome=true, strict=true,
plugin= {"rerun:rerun\\failed.txt"})
public class TestReRunner {

	@AfterClass
	
	public static void report() {
		

		JVMReport.generateReports(System.getProperty("user.dir") + "\\AllReports\\JsonReport\\facebook.json");

	}
}
