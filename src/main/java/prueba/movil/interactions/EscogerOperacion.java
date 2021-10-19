package prueba.movil.interactions;

import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.OPERADOR_MULTIPLICACION;
import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.OPERADOR_DIVISION;
import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.OPERADOR_RESTA;
import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.OPERADOR_SUMA;
import static prueba.movil.utils.Constantes.DIVISION;
import static prueba.movil.utils.Constantes.MULTIPLICACION;
import static prueba.movil.utils.Constantes.RESTA;
import static prueba.movil.utils.Constantes.SUMA;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import prueba.movil.exceptions.NoExisteOperadorException;
import prueba.movil.models.DatosDePrueba;

public class EscogerOperacion implements Interaction {
    private final List<DatosDePrueba> datosDePrueba;

    public EscogerOperacion(List<DatosDePrueba> datosDePrueba) {
        this.datosDePrueba = datosDePrueba;
    }

    public static EscogerOperacion aEjecutarEnLaAplicacion(List<DatosDePrueba> datosDePrueba) {
        return Tasks.instrumented(EscogerOperacion.class, datosDePrueba);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (datosDePrueba.get(0).getOperacion()) {
            case SUMA:
                actor.attemptsTo(
                        Click.on(OPERADOR_SUMA));
                break;
            case RESTA:
                actor.attemptsTo(
                        Click.on(OPERADOR_RESTA));
                break;
            case MULTIPLICACION:
                actor.attemptsTo(
                        Click.on(OPERADOR_MULTIPLICACION));
                break;
            case DIVISION:
                actor.attemptsTo(
                        Click.on(OPERADOR_DIVISION));
                break;
            default:
                throw new NoExisteOperadorException(datosDePrueba.get(0).getOperacion());
        }
    }
}