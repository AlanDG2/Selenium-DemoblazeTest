package runer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;*/


@RunWith(Cucumber.class)

@CucumberOptions(
        features= "src/test/java/Features",
        glue=("SeleniumGlueCode")

)

public class testrunner  {}

//public class testrunner  extends AbstractTestNGCucumberTests {}

