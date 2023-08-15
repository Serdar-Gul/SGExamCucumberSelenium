package com.devbook.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/devbook/stepDefinitions",
        dryRun = false,
        tags = "@navigation"
)
public class CukesRunner{
}
