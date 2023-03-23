/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicioaprendizaje2;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Ejercicioaprendizaje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println(nombre);
    }

}
