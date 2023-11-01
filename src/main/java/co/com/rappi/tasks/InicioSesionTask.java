package co.com.rappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.rappi.ui.InicioSesionUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InicioSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs( T actor ) {

        actor.attemptsTo(
                Click.on( BTN_REGISTRARME),
                Click.on( BTN_YA_TENGO_UNA ),
                Click.on( BTN_CONTINUAR_CORREO ),
                Enter.theValue( "sebapro0205@gmail.com" ).into( TXT_CORREO_ELECTRONICO ),
                WaitUntil.the( BTN_CONTINUAR, isClickable() ).forNoMoreThan( 30 ).seconds(),
                Click.on( BTN_CONTINUAR )

        );
        try {
            Thread.sleep( 15000 );
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
        actor.attemptsTo(
           Click.on( BTN_VERIFICAR )
        );
    }

    public static Performable on(){

        return Tasks.instrumented( InicioSesionTask.class );
    }
}
