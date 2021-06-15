package com.co.testing.test.tasks;

import com.co.testing.test.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.testing.test.userinterfaces.SignUpStep4.*;

public class Step4Password implements Task {
    private Data data;

    public Step4Password(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getPassword()).into(PASSWORD)
                , Enter.theValue(data.getPassword()).into(CONFIRM_PASSWORD)
                , Click.on(CONFIRM_TERMS)
                , Click.on(CONFIRM_PRIVACY)
                , Click.on(NEXT));
    }

    public static Step4Password isFinal(Data data) {
        return Tasks.instrumented(Step4Password.class, data);
    }
}
