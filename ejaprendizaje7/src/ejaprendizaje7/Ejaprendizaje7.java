/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejaprendizaje7;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String frase;
      String frase2;
      frase2 = "eureka";
        System.out.println("ingresa frase");
        frase=leer.nextLine();
        if(frase.equals(frase2)){
            System.out.println("correcto");
            }else{
                System.out.println("incorrecta");
            }
        }
    }
    

