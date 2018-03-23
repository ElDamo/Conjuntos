
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
public class ArregloGenerico<T> {
    
    private Object[] arr;
    private int cont;

    public ArregloGenerico() {
        arr = (T[]) new Object[10];
        cont = 0 ;
    }
    
    public int busqueda(T dato,int n){
        if(cont<0){
            if(arr[n-1].equals(dato)){
                return n-1;
            }else{
                return busqueda(dato,n-1);
            }
            
        }else{
            return -1;
        }
    }
    
    public int busqueda(T dato){
        if(dato!=null && cont>0)
            return busqueda(dato,cont);
        else
            return -1;
    }
    
    public int eliminaOcurrencias(T dato){
        return eliminaOcurrencias(dato,0,0);
    }
          
    private int eliminaOcurrencias(T dato, int tot, int i){
        if(i==cont)
            return cont;
        else{
            if(arr[i].equals(dato)){
                arr[i]=arr[cont-1];
                arr[cont-1]=null;
                cont=cont-1;
                tot++;
            }
            else
                i=i+1;
                return eliminaOcurrencias(dato,cont,i);
        }
    }
    
    public static void main(String[] args) {
               
    }

}
