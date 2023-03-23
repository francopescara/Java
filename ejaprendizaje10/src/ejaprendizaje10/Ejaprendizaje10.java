/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejaprendizaje10;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor;
        int num;
        int suma = 0;
       valor=4;
       do{
           System.out.println("ingrese numeros");
           num=leer.nextInt();
           suma=num+suma;
                   
       }while (suma<valor);
        System.out.println("la suma final es : "+suma);
    }
    
}
