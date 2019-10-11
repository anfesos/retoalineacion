package co.com.accenture.vivacolombia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reserva_vuelo.feature",
        glue = "co.com.accenture.vivacolombia.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ReservaVuelo {
}
