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
public class ColaA <T> implements ColaADT<T>{
    private int inicio;
    private int fin;
    private T[] coleccion;
    private final int MAX=20;
    
    public ColaA(){
        coleccion=(T[]) new Object [MAX];
        inicio=-1;
        fin=-1;
    }

    public ColaA(int max) {
        inicio = -1;
        fin = -1;
        coleccion = (T[]) new Object [max];
    }
    
    public boolean estaVacia(){
        return inicio==-1;
    }
    
    public T primero(){
        T resul;
        if(!estaVacia())
            resul= coleccion[inicio];
        else
            resul=null;
        return resul;
    }
    
    public void agrega(T dato){
        if((fin+1)%coleccion.length==inicio)
            expande();
        fin=(fin+1)%coleccion.length;
        if(inicio==-1)
            inicio=0;
    }
    
    private void expande(){
        T[] nuevo=(T[]) new Object[coleccion.length*2];
        int j;
        j=0;
        for(int i=inicio;i<coleccion.length;i++){
            nuevo[j]=coleccion[i];
            j++;
        }
        for(int i=0;i<inicio;i++){
            nuevo[j]=coleccion[i];
            j++;
        }
        inicio=0;
        fin=j-1;
        coleccion=nuevo;
    }
    
    public T quita(){
        T resul;
        if(estaVacia())
            resul=null;
        else{
            resul=coleccion[inicio];
            if(inicio==fin){
                inicio=-1;
                fin=-1;
            }
            else
                inicio=(inicio+1)%coleccion.length;
        }
        return resul;
    }
    
}
