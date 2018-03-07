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
public class EscuelaProblema20 {
    
    private String nombre;
    private String direccion;
    private ConjuntoADT<AlumnoProb20> licenciados;
    private ConjuntoADT<AlumnoProb20> ingenieros;

    public EscuelaProblema20() {
        licenciados=new ConjuntoA<AlumnoProb20>();
        ingenieros=new ConjuntoA<AlumnoProb20>();
    }

    public EscuelaProblema20(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void altaAlumno(AlumnoProb20 ese){
        try{
            if(ese.getCarrera()=="ingenieria")
            ingenieros.agrega(ese);
        else
            if(ese.getCarrera()=="licenciatura")
                licenciados.agrega(ese);
        }catch(Exception e){
            System.out.println("Esa carrera no es válida");
        }
    }
    
    public void bajaAlumno(AlumnoProb20 ese){
        try{
            if(ese.getCarrera()=="ingenieria")
            ingenieros.quita(ese);
        else
            if(ese.getCarrera()=="licenciatura")
                licenciados.quita(ese);
        }catch(Exception e){
            System.out.println("Esa carrera no es válida");
        }
    }
        
    public String todoslosAlumnos(){
        return licenciados.union(ingenieros).toString();
    }
    
    public String ingenierosLicenciados(){
        return licenciados.interseccion(ingenieros).toString();
    }
    
    public String ingenierosoLicenciados(){
        return licenciados.union(ingenieros).diferencia(licenciados.interseccion(ingenieros)).toString();
    }
    
    public double promedioIngenieros(){
        double suma=0;
        suma= suma+ ingenieros.iterator().next().calcularPromedio();
        return suma/ingenieros.getCardinalidad();
    }
    
    public int licenciadosmayores(int mayoriae){
        int suma=0;
        if(licenciados.iterator().next().getEdad()>=mayoriae)
            suma++;
        return suma;
    }
    
    
    
    
    
    
        
        
    
    
    
    
    
    
    
}
