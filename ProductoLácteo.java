
package primerparcialedfebrero2016;

/**
 *
 * @author sguardatb
 */
public class ProductoLácteo {
    private String marca;
    private double precio;
    private double presentación; // Dada en gramos
    private int mesVencimiento; // 1-eneero, 2-febrero, etc.

    public ProductoLácteo() {
    }

    public ProductoLácteo(String marca, double precio, double presentación, int mesVencimiento) {
        this.marca = marca;
        this.precio = precio;
        this.presentación = presentación;
        this.mesVencimiento = mesVencimiento;
    }

    public int getMesVencimiento() {
        return mesVencimiento;
    }
    
    public double getPresentación() {
        return presentación;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\n Marca= " + marca + ", precio= " + precio + ", presentación= " + presentación + ", mes de vencimiento= " + mesVencimiento;
    }   
}
