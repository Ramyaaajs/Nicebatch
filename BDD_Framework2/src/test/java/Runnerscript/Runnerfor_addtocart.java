package Runnerscript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/src/test/java/end_to_end_sccenorios/addtocart.feature"},
glue={"step_Defination"},plugin= {"html:target/cucumberReoprt2.html"})

public class Runnerfor_addtocart 
{

}
