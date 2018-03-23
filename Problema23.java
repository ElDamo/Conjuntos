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
public class Problema23 {
    
    public static void imprimeDeraIzq(int[]a , int n){
        if(n>0){
            System.out.println(a[n-1]);
            imprimeDeraIzq(a,n-1);
        }
    }
    
    public static void imprimeIzqaDer(int[]a , int n){
        if(n>0){
            imprimeIzqaDer(a,n-1);
            System.out.println(a[n-1]+""); 
        }
    }
    
    
    public static void main(String[] args) {
     int[] a = new int[3];
     String s,r;
     a[0]=1;
     a[1]=2;
     a[2]=3;
    imprimeDeraIzq(a,3);
    imprimeIzqaDer(a,3);
    }
}
