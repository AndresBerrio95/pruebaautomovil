package prueba.movil.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EjecutarOperacionesCalculadoraUi {
    public static final Target SELECCIONAR_NUMERO = Target.the("Seleccionar boton a operar en la calculadora").locatedBy("//*[@resource-id='com.android.calculator2:id/digit_{0}']");
    public static final Target OPERADOR_SUMA = Target.the("Seleccionar el operador de suma").located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_add']"));
    public static final Target OPERADOR_RESTA = Target.the("Seleccionr el operador de resta").located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_sub']"));
    public static final Target OPERADOR_MULTIPLICACION = Target.the("Seleccionar el operaador de multiplicacion").located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_mul']"));
    public static final Target OPERADOR_DIVISION = Target.the("Seleccionar el operador de división").located(By.xpath("//*[@resource-id='com.android.calculator2:id/op_div']"));
    public static final Target IGUAL = Target.the("Campo igual para obtener resultado de la operacion").located(By.xpath("//*[@resource-id='com.android.calculator2:id/eq']"));
    public static final Target TXT_RESULTADO = Target.the("Resultado de la operacion").located(By.xpath("//*[@resource-id='com.android.calculator2:id/result']"));

    private EjecutarOperacionesCalculadoraUi() {
    }
}