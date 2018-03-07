
package primerparcialedfebrero2016;

/**
 *
 * @author sguardatb
 */
public class Yogurt extends ProductoLácteo{
    private int ingredAdicionales;

    public Yogurt() {
    }

    public Yogurt(int ingredAdicionales, String nombre, double precio, double presentación, int mesVencimiento) {
        super(nombre, precio, presentación, mesVencimiento);
        this.ingredAdicionales = ingredAdicionales;
    }

    public int getIngredAdicionales() {
        return ingredAdicionales;
    }

    @Override
    public String toString() {
        return super.toString() + "\nYogurt con " + ingredAdicionales + " ingredientes adicionales";
    }
    
}
