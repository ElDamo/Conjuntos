/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package ejercicio.pkg10;



import java.util.Iterator;



/**

 *

 * @author DPEREZLAN

 */

public interface ConjuntoADT<T> extends Iterable<T>{

    public boolean contains(T dato);

    public boolean estaVacio();

    public boolean agrega(T dato);

    public T quita(T dato);

    public int getCardinalidad();

    public ConjuntoADT <T> union (ConjuntoADT<T> otro);

    public ConjuntoADT <T> interseccion (ConjuntoADT<T> otro);

    public Iterator <T> iterator();

    public String toString();

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro);

    public boolean equals(ConjuntoADT<T> otro);

}