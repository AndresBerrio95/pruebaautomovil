package prueba.movil.tasks;

import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.IGUAL;
import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.SELECCIONAR_NUMERO;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import prueba.movil.interactions.EscogerOperacion;
import prueba.movil.models.DatosDePrueba;

public class RealizarOperacion implements Task {

    private final List<DatosDePrueba> datosDePruebas;

    public RealizarOperacion(List<DatosDePrueba> dataOperations) {
        this.datosDePruebas = dataOperations;
    }

    public static RealizarOperacion enLaCalculadora(List<DatosDePrueba> datosDePrueba) {
        return Tasks.instrumented(RealizarOperacion.class, datosDePrueba);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_NUMERO.of(datosDePruebas.get(0).getPrimerNumero())),
                EscogerOperacion.aEjecutarEnLaAplicacion(datosDePruebas),
                Click.on(SELECCIONAR_NUMERO.of(datosDePruebas.get(0).getSegundoNumero())),
                Click.on(IGUAL));
    }
}