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
public class Problema22 {
    
    public static int sumaArreglo(int[] a, int tam){
        if(tam==0)
            return 0;
        else
            return a[tam-1]+sumaArreglo(a,tam-1);
    }
    public static void main(String[] args) {
         int [] a= new int[5];
         a[0]=1;
         a[1]=2;
         a[2]=3;
         a[3]=4;
         a[4]=5;
         System.out.println(sumaArreglo(a,a.length));
    }
}
