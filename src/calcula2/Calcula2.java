
package calcula2;

/**
 *
 * @author Daniel
 */
public class Calcula2 {

    
    public static void main(String[] args) {
             Modelo mod = new Modelo();
        Vista vis = new Vista();
        Logic log = new Logic();
        vis.introducir(mod);
        log.realizaOperacion(mod);
        vis.imprimir(mod);
        
    }
    
}
    
    

