/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejaprendizaje6;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
        System.out.println("ingrese numero");
        num=leer.nextInt();
        if(num%2==0){
            System.out.println("es un numero par");
           } else{
                    System.out.println("es un numero impar");
                    }
        }
    }
    

