
package calcula2;

/**
 *
 * @author Daniel
 */
public class Logic {
    public static float realizaOperacion(Modelo mod) {
        float resultado = 0;
        switch (mod.getOperacion()) {
            case 1:
                resultado = mod.getNum1() + mod.getNum2();
                break;
            case 2:
                resultado = mod.getNum1() - mod.getNum2();
                break;
            case 3:
                resultado = mod.getNum1() * mod.getNum2();
                break;
            case 4:
                resultado = mod.getNum1() / mod.getNum2();
                break;
            case 5:
                System.exit(0);
                break;

        }
        mod.setResultado(resultado);
        return resultado;
    }

    
}
