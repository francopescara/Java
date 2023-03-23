/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
    Scanner leer = new Scanner(System.in);
    int numeros, suma = 0 ;
    do{
        System.out.println("ingrese sus numeros");
        numeros = leer.nextInt();
          suma=suma+numeros
            
    }while(numeros !=0);{
        System.out.println("se capturo el numero cero");
    }
        System.out.println("la suma de los numero es: " + suma);
    }
    
}
