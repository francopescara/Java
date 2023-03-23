/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicioaprendizaje.pkg1;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejercicioaprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
       int suma;
        System.out.println("ingrese un numero");
        num1=leer.nextInt();
        System.out.println("ingrese un numero");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma de los numeros es : " +suma);
        
    }
    
}
