package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep1 {

    public static final Target FIRST_NAME = Target.the("input first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("input last name")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("input email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("select birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY = Target.the("select birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("select birth year")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION = Target.the("button next location")
            .locatedBy("//span[text()='Next: Location']");

}
