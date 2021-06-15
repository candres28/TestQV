package com.co.testing.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target SIGN_UP_JOIN = Target.the("button sign up join today")
            .locatedBy("//a[ @class='unauthenticated-nav-bar__sign-up']");
}
