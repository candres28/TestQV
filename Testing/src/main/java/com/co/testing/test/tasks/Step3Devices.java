package com.co.testing.test.tasks;

import com.co.testing.test.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.testing.test.userinterfaces.SignUpStep2.INPUT;
import static com.co.testing.test.userinterfaces.SignUpStep3.*;

public class Step3Devices implements Task {
    private Data data;

    public Step3Devices(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COMPUTER)
                , Click.on(INPUT.of(data.getComputer()))
                , Click.on(VERSION)
                , Click.on(INPUT.of(data.getVersion()))
                , Click.on(LANGUAGES)
                , Click.on(INPUT.of(data.getLanguages()))
                , Click.on(MOBILE_DEVICE)
                , Click.on(INPUT.of(data.getMobile()))
                , Click.on(MODEL)
                , Click.on(INPUT.of(data.getModel()))
                , Click.on(SO)
                , Click.on(INPUT.of(data.getSo()))
                , Click.on(LAST_STEP)
        );
    }

    public static Step3Devices isRegistry(Data data) {
        return Tasks.instrumented(Step3Devices.class, data);
    }
}
