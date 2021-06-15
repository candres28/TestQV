package com.co.testing.test.tasks;

import com.co.testing.test.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.testing.test.userinterfaces.SignUpStep2.*;

public class Step2Address implements Task {

    private Data data;

    public Step2Address(Data data) {
        this.data = data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(CITY)
                , Clear.field(ZIP)
                , Enter.theValue(data.getCity()).into(CITY)
                , Enter.theValue(data.getZip()).into(ZIP)
                , Click.on(COUNTRY)
                , Click.on(INPUT.of(data.getCountry()))
                , Click.on(NEXT_DEVICES)
        );
    }
    public static Step2Address isFor(Data data) {
        return Tasks.instrumented(Step2Address.class, data);
    }
}
