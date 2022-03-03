
package Main;

import Entidades.Persona;
import Servicio.Servicio;


public class Main {

    
    public static void main(String[] args) {
    
        Servicio servicio = new Servicio();
       
        System.out.println("Persona 1");
        Persona p1 = servicio.crearPersona();
        int imc1 = servicio.calcularIMC(p1);
        System.out.println(imc1);
        boolean peso1 = servicio.esMayorDeEdad(p1);
        
        System.out.println("");
        System.out.println("Persona 2");
        Persona p2 = servicio.crearPersona();
        int imc2 = servicio.calcularIMC(p2);
        System.out.println(imc2);
        boolean peso2 = servicio.esMayorDeEdad(p2);
        
        System.out.println("");
        System.out.println("Persona 3");
        Persona p3 = servicio.crearPersona();
        int imc3 = servicio.calcularIMC(p3);
        System.out.println(imc3);
        boolean peso3 = servicio.esMayorDeEdad(p3);
        
        System.out.println("");
        System.out.println("Persona 4");
        Persona p4 = servicio.crearPersona();
        int imc4 = servicio.calcularIMC(p4);
        System.out.println(imc4);
        System.out.println("");
        boolean peso4 = servicio.esMayorDeEdad(p4);
        
        
        //Arreglar
        System.out.println("__________Promedio de IMC__________");
        double porcentajeIMC = (imc1 + imc2 + imc3 + imc4)/4;
        System.out.println("ES = " + porcentajeIMC);
        
        
        System.out.println("__________Promedio Edad__________");
        double promedioEdad = (p1.getEdad() + p2.getEdad() + p3.getEdad() + p4.getEdad())/4;
        System.out.println("ES = " + promedioEdad);
        
    }
    
}
