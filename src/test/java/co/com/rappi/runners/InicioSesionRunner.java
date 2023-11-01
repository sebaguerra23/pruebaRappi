package co.com.rappi.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(

        features = "src/test/resources/features/InicioSesion.feature",
        glue = "co.com.rappi.stedDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class InicioSesionRunner {
}
