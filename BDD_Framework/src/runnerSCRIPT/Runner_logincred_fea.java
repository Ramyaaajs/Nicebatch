package runnerSCRIPT;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/loginSCRipt/login_cred.feature"},
glue={"step_Defination"},plugin= {"html:target/cucumberReoprt1.html"})

public class Runner_logincred_fea
{
	
}
