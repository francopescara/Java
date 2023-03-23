/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejaprendeizaje5;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendeizaje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;
        double base=2,triple=3;
        double resultado1,resultado2;
        System.out.println("ingrese un numero entero");
        numero=leer.nextDouble();
        numero=Math.sqrt(2);
        resultado1=Math.pow(numero,base);
          resultado2=Math.pow(numero,triple);
          System.out.println("el doble del numero es : "+resultado1);
          System.out.println("el triple del numero es : "+resultado2);
          System.out.println("la raiz cuadrada es : "+numero);
    
}
}