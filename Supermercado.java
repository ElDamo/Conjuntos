
package primerparcialedfebrero2016;

/**
 *
 * @author sguardatb
 */
public class Supermercado {
    private String nombre, dirección;
    private ColaA<ProductoLácteo> inventario;
    private final int MAX = 50;
    

    public Supermercado() {
        inventario = new ColaA(MAX);
    }

    public Supermercado(String nombre, String dirección) {
        this();
        this.nombre = nombre;
        this.dirección = dirección;
    }
    
   /**
    * Programa el alta de los productos
    */
    
    /**
     * Programa el método solicitado para probar si hay productos
     * que venzan en un cierto mes.
     * verifVencimiento() 
     */
    
    
    
    /**
     * Programa el método solicitado para calcular el total de
     * kilos en existencia de un cierto tipo de queso.
     * calculaKilosQuesoPorTipo() 
     */
}
