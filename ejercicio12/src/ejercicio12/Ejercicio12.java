/**EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("ingrese un numero");
        num1=leer.nextInt();
        System.out.println("ingrese un numero");
        num2=leer.nextInt();
        System.out.println(  esmultiplo(num1,num2) );
        
        }
    
 public static boolean esmultiplo(int num1,int num2){
 
	if (num1%num2==0)
            
		return true;
        else
		return false;
}


