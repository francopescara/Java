/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **/
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,n2,n3,n4;
        System.out.println("Ingrese 4 numeros ");
     n = leer.nextInt();
     n2 = leer.nextInt();
     n3 = leer.nextInt();
     n4 = leer.nextInt();
 
    if (n<=20) {
         System.out.print(n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");
 
 
    } System.out.println(" ");
    if (n2<=20) {
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    }System.out.println(" ");
    if (n3<=20) {
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
 
    }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    } System.out.println(" ");
    if (n4<=20) {
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
 
    }
    }else {
        System.out.print("El numero ingresado es invalido");
 
    }
 
 
 
    System.out.println(" ");
    }
    
}
