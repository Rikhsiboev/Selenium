package com.bob_r.Cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",// for report plugin
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"   // failed test
        },
        features = "src/test/resources/features",    // from where text languages
        glue = "com/bob_r/Cucumber/step_definitions", // from where source code
        dryRun = true, // save in history
//        tags = "@wip"  // separate by tag my test in future files
        tags ="@One",
        publish = true
)
public class CokesRunner {

}
