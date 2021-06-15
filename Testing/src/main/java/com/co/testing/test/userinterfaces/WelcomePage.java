package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {

    public static final Target MESSAGE = Target.the("message welcome page")
            .locatedBy("//div[@class='image-box-header']");
}
