package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p = new Persona();
        System.out.println("_________________________");
        System.out.print("Nombre = ");
        p.setNombre(leer.next());
        System.out.print("Edad = ");
        p.setEdad(leer.nextInt());

        do {
            System.out.print("Sexo = ");
            p.setSexo(leer.next());
        } while (!p.getSexo().equals("h") && !p.getSexo().equals("m") && !p.getSexo().equals("o"));

        System.out.print("Peso = ");
        p.setPeso(leer.nextDouble());
        System.out.print("Altura = ");
        p.setAltura(leer.nextDouble());

        return p;
    }

    public int calcularIMC(Persona p) {

        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        int analizarIMC;
        if (imc < 20) {
            analizarIMC = -1;
            System.out.println("Debajo del peso ideal");
        } else {
            if (imc >= 20 && imc <= 25) {
                analizarIMC = 0;
                System.out.println("peso ideal");
            } else {
                analizarIMC = 1;
                System.out.println("arriba del peso ideal");
            }
        }
        return analizarIMC;
    }

    public boolean esMayorDeEdad(Persona p) {

        boolean mayorDeEdad = false;

        if (p.getEdad() >= 18) {

            mayorDeEdad = true;
            System.out.println("Es Mayor de edad");
            return mayorDeEdad;

        }else{
            System.out.println("Es Menor de edad");
        return mayorDeEdad;
        }
        
        
    }
}
