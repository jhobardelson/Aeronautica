package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class FlowTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a transparencia
        actor.attemptsTo(Click.on(LINK_TRANSPARENCIA));

        //Se dirige a presuspuesto
        actor.attemptsTo(Scroll.to(LINK_PRESUPUESTO));
        actor.attemptsTo(Click.on(LINK_PRESUPUESTO));

        //Se difige a estados finacieros
        actor.attemptsTo(Open.relativeUrl("https://www.aerocivil.gov.co/atencion/presupuesto"));
        actor.attemptsTo(Click.on(LINK_ESTADOS_FINANCIEROS));
        //actor.attemptsTo(SendKeys.of(Keys.CONTROL + Keys.TAB));

        //Se dirige a balances
        actor.attemptsTo(Click.on(LINK_BALANCES));

        //Se dirige al PDF
        actor.attemptsTo(Click.on(LINK_PDF));

        //abre el link del pdf
        actor.attemptsTo(Open.relativeUrl("https://www.aerocivil.gov.co/atencion/presupuesto/Estados%20Financieros/Estado%20de%20Situaci%C3%B3n%20Financiera%20a%2031%20de%20diciembre%20de%202021.pdf"));

    }

    public static FlowTask flowTask() {
        return instrumented(FlowTask.class);
    }
}
