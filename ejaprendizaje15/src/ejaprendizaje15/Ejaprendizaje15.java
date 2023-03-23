/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejaprendizaje15;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje15 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[]vector=new int[100];
        for(int i = 0;i<100;i++){
            vector[i]=i+1;
        
        }
        System.out.println("mostrar los numeros");
        for(int i=0;i<100;i++)
            System.out.println(vector[i]);
    }
    
}
