package runner;

import org.junit.runner.RunWith;

import gherkin.lexer.Tr;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/Features/LoginTest.feature",glue={"stepDefinition"})
public class LoginTestRunner {

}
