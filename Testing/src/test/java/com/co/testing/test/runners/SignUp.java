package com.co.testing.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sign_up.feature"
        , snippets = SnippetType.CAMELCASE
        , glue = "com.co.testing.test.stepdefinitions")
public class SignUp {
}
