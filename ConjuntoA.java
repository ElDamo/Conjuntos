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

public class ConjuntoA<T> implements ConjuntoADT<T>{

    private T[] conjunto;

    private int cardinalidad;

    private final int MAX=50;

    

    public ConjuntoA(){

        conjunto=(T[]) new Object[MAX];

        cardinalidad=0;

    }

    public ConjuntoA(int max){

        conjunto=(T[]) new Object[max];

        cardinalidad=0;

    }

    

    public boolean estaVacio(){

        return cardinalidad==0;

    }

    

    public T quita(T dato){

        T resul;

        int i;

        resul= null;

        i=0;

        while(i<cardinalidad && !dato.equals(conjunto[i]))

            i++;

        if(i<cardinalidad){

            resul=conjunto[i];

            conjunto[i]=conjunto[cardinalidad-1];

            conjunto[cardinalidad-1]=null;

            cardinalidad--;

        }

        return resul;

    }

    public Iterator<T> iterator(){

        return new IteradorArreglo(conjunto, cardinalidad);

    }

    //Hacer 

    public boolean contains (T dato){

        boolean resp=false;

        Iterator<T> it= this.iterator();

        while(it.hasNext() && !resp)

            resp=it.next().equals(dato);

        return resp;

    }

    

    private void expandCapacity(){

        T nuevo[]= (T[]) new Object[conjunto.length*2];//este por 2 depende de lo que sea que haga el problema

        for(int i=0;i<=cardinalidad;i++)//for(int i=0,i<colec.length;i++) 

            nuevo[i]=conjunto[i];

        conjunto=nuevo;

        }

    

    public boolean agrega(T dato){

        boolean resp;

        resp=contains(dato);

        if(!resp){

            if(cardinalidad>=conjunto.length)

                expandCapacity();

        this.conjunto[cardinalidad]=dato;

        cardinalidad++;

        }

        else 

            resp=false;

        return resp;

    }
    

    

    public int getCardinalidad(){

    return this.cardinalidad;    

    }

    

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro){

        int i;

        ConjuntoADT<T> nuevo = new ConjuntoA(otro.getCardinalidad());

        for(i=0;i<nuevo.getCardinalidad();i++)

            if(this.contains(conjunto[i])&& otro.contains(conjunto[i]))

                nuevo.agrega(conjunto[i]);

        return nuevo;

    }

    

    public ConjuntoADT<T> union(ConjuntoADT<T> otro){

        int i,e;

        ConjuntoADT<T> nuevo = new ConjuntoA(otro.getCardinalidad());
        for(i=0;i<nuevo.getCardinalidad();i++){
            nuevo.agrega(otro.iterator().next());
        for(e=0;i<nuevo.getCardinalidad();e++)
            nuevo.agrega(this.iterator().next());
        }
        return nuevo;

    }

    

    

    public String toString(){

        int i;

        StringBuilder sb = new StringBuilder();

        for(i=0;i<cardinalidad;i++)

            sb.append(this.conjunto[i]);

        return sb.toString();

    }

    @Override
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro) {
       

        ConjuntoADT<T> nuevo = new ConjuntoA(cardinalidad);

        for(int i=0;i<cardinalidad;i++){

            if(!otro.contains(conjunto[i]))

                nuevo.agrega(conjunto[i]);

        }

        return nuevo;
    }
    
    public boolean equals(ConjuntoADT<T> otro){
        boolean resp=true;
        if(this!=otro || (cardinalidad==0 && otro.getCardinalidad()==0)){
            if(otro != null){
          if(cardinalidad == otro.getCardinalidad()){
              int i=0;
              while(i<cardinalidad && !resp){
                  if(otro.contains(conjunto[i]))
                      i++;
                  else
                      resp=false;
              }
          }
          else
              resp=false;
        }
        else
            resp=false;   
        }
        return resp;
    }
    
    public ConjuntoADT <T> interseccionr (ConjuntoADT<T> otro){
        ConjuntoADT<T> nuevo = new ConjuntoA(otro.getCardinalidad());
        Iterator<T> it= otro.iterator();
        return interseccionr(nuevo);
    }
    
    public ConjuntoADT <T> unionr (ConjuntoADT<T> otro){
        ConjuntoADT<T> nuevo = null;
        if(otro!=null){
            nuevo= new ConjuntoA();
            unionr(nuevo,iterator());
            unionr(nuevo,otro.iterator());
        }
        return nuevo;
    }
    
    public void unionr (ConjuntoADT<T> otro,Iterator<T> it){
        if(it.hasNext()){
            otro.agrega(it.next());
            unionr(otro, it);
        }
    }
        
    public ConjuntoADT <T> diferenciar (ConjuntoADT<T> otro){
        ConjuntoADT<T> nuevo = new ConjuntoA(otro.getCardinalidad());
        Iterator<T> it= otro.iterator();
        return interseccionr(nuevo);
    }
}
