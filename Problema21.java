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
public class Problema21 {
    
    
    public static String reporteAlumnosInglésyFrancés(ConjuntoADT ingles, ConjuntoADT frances){
        return ingles.interseccion(frances).toString();
    }
    
    public static int numAlumnosSoloIngles(ConjuntoADT ingles, ConjuntoADT frances, ConjuntoADT otros){
        return ingles.diferencia(otros).diferencia(frances).getCardinalidad();
    }
    
    public static String alumnos3oMasIdiomas(ConjuntoADT ingles, ConjuntoADT frances, ConjuntoADT otros){
        return ingles.interseccion(otros).interseccion(frances).toString();
    }
}
