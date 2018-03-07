
package primerparcialedfebrero2016;

/**
 *
 * @author sguardatb
 */
public class Queso extends ProductoLácteo{
    private String tipo;

    public Queso() {
    }

    public Queso(String tipo, String nombre, double precio, double presentación, int mesVencimiento) {
        super(nombre, precio, presentación, mesVencimiento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQueso " + "tipo= " + tipo;
    }
}
