package prueba.movil.questions;

import static prueba.movil.userinterface.EjecutarOperacionesCalculadoraUi.TXT_RESULTADO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultado implements Question<String> {
    public static ValidarResultado deLaOperacion() {
        return new ValidarResultado();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_RESULTADO).viewedBy(actor).asString();
    }
}