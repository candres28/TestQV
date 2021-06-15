package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep4 {

    public static final Target PASSWORD = Target.the("input password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("input confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CONFIRM_TERMS = Target.the("check confirm terms")
            .locatedBy("(//span[@class='checkmark signup-consent__checkbox error'])[1]");

    public static final Target CONFIRM_PRIVACY = Target.the("check confirm privacy")
            .locatedBy("//span[@class='checkmark signup-consent__checkbox error']");

    public static final Target NEXT = Target.the("button next complete setup")
            .locatedBy(" //span[text()='Complete Setup']");
}
