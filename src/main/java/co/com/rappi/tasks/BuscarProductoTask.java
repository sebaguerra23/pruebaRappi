package co.com.rappi.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.rappi.ui.BuscarProductoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BuscarProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs( T actor ) {

        actor.attemptsTo(

                WaitUntil.the(  TXT_BUSCAR_PRODUCTO_1, isClickable() ).forNoMoreThan( 30 ).seconds(),
                Click.on( TXT_BUSCAR_PRODUCTO_1 ),
                Enter.theValue( "Queso" ).into(  TXT_BUSCAR_PRODUCTO ).thenHit( Keys.ENTER )

        );
    }

    public static Performable on(){

        return Tasks.instrumented( BuscarProductoTask.class );
    }
}
