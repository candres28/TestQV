package com.co.testing.test.tasks;

import com.co.testing.test.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUpJoin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.SIGN_UP_JOIN));
    }

    public static SignUpJoin is() {
        return Tasks.instrumented(SignUpJoin.class);
    }
}
