/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 *
 * @author DPEREZLAN
 */
public class IteradorArreglo <T> implements Iterator <T>{
    private T[] coleccion;
    private int total;
    private int actual;
    
    public IteradorArreglo(T[] coleccion, int total){
        this.coleccion=coleccion;
        this.total=total;
        this.actual=0;
    }
        public boolean hasNext(){
        return actual<total;
    }
    
    public T next(){
        if(hasNext()){
            T resul;
            resul=coleccion[actual];
            actual++;
            return resul;
        }
        else throw new NoSuchElementException();
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
