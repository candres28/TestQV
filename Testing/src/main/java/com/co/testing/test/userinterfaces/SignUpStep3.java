package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpStep3 {

    public static final Target INPUT = Target.the("input {0}")
            .locatedBy("//div[text()='{0}']");

    public static final Target COMPUTER = Target.the("select computer")
            .located(By.name("osId"));

    public static final Target VERSION = Target.the("select version")
            .located(By.name("osVersionId"));

    public static final Target LANGUAGES = Target.the("select languages")
            .located(By.name("osLanguageId"));

    public static final Target MOBILE_DEVICE = Target.the("mobile device")
            .located(By.name("handsetMakerId"));

    public static final Target MODEL = Target.the("model")
            .located(By.name("handsetModelId"));

    public static final Target SO = Target.the("SO")
            .located(By.name("handsetOSId"));

    public static final Target LAST_STEP = Target.the("button next last step")
            .locatedBy("//span[text()='Next: Last Step']");
}
