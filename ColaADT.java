/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

/**
 *
 * @author DPEREZLAN
 */
public interface ColaADT <T> {
    
    public void agrega(T dato);
    public T quita();
    public boolean estaVacia();
    public T primero();
    
}
