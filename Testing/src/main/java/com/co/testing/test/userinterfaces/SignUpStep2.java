package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep2 {

    public static final Target CITY = Target.the("input city")
            .located(By.id("city"));

    public static final Target ZIP = Target.the("input zip")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target.the("select country")
            .located(By.name("countryId"));

    public static final Target INPUT = Target.the("input {0}")
            .locatedBy("//div[text()='{0}']");

    public static final Target NEXT_DEVICES = Target.the("button next devices")
            .locatedBy("//span[text()='Next: Devices']");
}
