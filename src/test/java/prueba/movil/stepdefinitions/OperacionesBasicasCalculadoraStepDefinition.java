package prueba.movil.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import prueba.movil.models.DatosDePrueba;
import prueba.movil.questions.ValidarResultado;
import prueba.movil.tasks.RealizarOperacion;

public class OperacionesBasicasCalculadoraStepDefinition {

  @Dado("^que el usuario hace uso de la calculadora de un movil$")
  public void queElUsuarioHaceUsoDeLaCalculadoraDeUnMovil() {
    setTheStage(new OnlineCast());
    theActorCalled("El usuario");
  }

  @Cuando("^decide realizar una de las operaciones basicas$")
  public void decideRealizarUnaDeLasPperacionesBasicas(List<DatosDePrueba> datosDePrueba) {
    theActorInTheSpotlight().attemptsTo(
        RealizarOperacion.enLaCalculadora(datosDePrueba));
  }

  @Entonces("^podria validar el resultado exacto de cada operacion$")
  public void podriaValidarElResultadoExactoDeCadaOperacion(List<DatosDePrueba> datosDePrueba) {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(
        ValidarResultado.deLaOperacion(), Matchers.equalTo(datosDePrueba.get(0).getResultado())));
  }

}
