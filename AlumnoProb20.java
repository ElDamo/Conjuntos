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
public  abstract class AlumnoProb20 {
    private String carrera;
    private int edad;
    private int [] calificaciones;

    public AlumnoProb20() {
        calificaciones = new int[30];
    }

    public AlumnoProb20(String carrera,int edad) {
        this();
        this.carrera = carrera;
        this.edad=edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }
    
    public double calcularPromedio(){
        int i,suma=0;
        for(i=0;i<calificaciones.length;i++)
            suma=suma+calificaciones[i];
        return suma/calificaciones.length;
    }
    
    
}
