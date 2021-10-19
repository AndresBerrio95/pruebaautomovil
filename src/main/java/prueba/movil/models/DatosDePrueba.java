package prueba.movil.models;

public class DatosDePrueba {

    private final String primerNumero;
    private final String segundoNumero;
    private final String operacion;
    private final String resultado;

    public DatosDePrueba(String primerNumero, String segundoNumero, String operacion,
        String resultado) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
        this.operacion = operacion;
        this.resultado = resultado;
    }

    public String getPrimerNumero() {
        return primerNumero;
    }

    public String getSegundoNumero() {
        return segundoNumero;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getResultado() {
        return resultado;
    }
}