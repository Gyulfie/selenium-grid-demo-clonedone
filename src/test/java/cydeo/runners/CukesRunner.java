package cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json" ,
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"
                },
        features = "src/test/resources/features",
        glue = "cydeo/steps",
        publish = true
)
public class CukesRunner {}

/* How to run your project locally ?

    - RUN
        - CukesRunner
        - Maven
    - Java
    - Git
        - Push || Pull
        - Make a collabration

 */


















