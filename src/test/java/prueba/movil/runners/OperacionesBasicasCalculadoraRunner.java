package prueba.movil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/operacionescalculadora.feature",
    glue = "prueba.movil.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class OperacionesBasicasCalculadoraRunner {

}
