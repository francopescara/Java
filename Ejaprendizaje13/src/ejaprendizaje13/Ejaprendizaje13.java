/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package ejaprendizaje13;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad");
        int num=leer.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=0;i<num-2;i++){
            System.out.print("*");
            for(int j=0;j<num-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<num;i++){
            System.out.print("*");
        }
    }   
    
}
