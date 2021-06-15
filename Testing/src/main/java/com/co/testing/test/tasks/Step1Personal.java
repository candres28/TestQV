package com.co.testing.test.tasks;

import com.co.testing.test.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.testing.test.userinterfaces.SignUpStep1.*;

public class Step1Personal implements Task {

    private Data data;

    public Step1Personal(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getFirstName()).into(FIRST_NAME)
                , Enter.theValue(data.getLastName()).into(LAST_NAME)
                , Enter.theValue(data.getEmail()).into(EMAIL)
                , SelectFromOptions.byVisibleText(data.getMonth()).from(BIRTH_MONTH)
                , SelectFromOptions.byVisibleText(data.getDay()).from(BIRTH_DAY)
                , SelectFromOptions.byVisibleText(data.getYear()).from(BIRTH_YEAR)
                , Click.on(NEXT_LOCATION)
        );
    }

    public static Step1Personal toAccess(Data data) {
        return Tasks.instrumented(Step1Personal.class, data);
    }
}
