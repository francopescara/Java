/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejaprendizaje11;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        boolean salir=false;
        System.out.println("ingrese un numero positivo");
        num1=leer.nextInt();
        System.out.println("ingrese un numero positivo");
        num2=leer.nextInt();
        while (!salir) {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.println("Eliga opcion:");
            
            System.out.println("ingrese numero");
            opcion=leer.nextInt();
                
            switch(opcion){
                
            
                case 1:
                    System.out.println(num1+num2);
                    break;
                    case 2:
                    System.out.println(num1-num2);
                    break;
                    case 3:
                    System.out.println(num1*num2);
                    break;
                    case 4:
                    System.out.println(num1%num2);
                    break;
                    case 5:
                   salir=true;
                    break;
            }      
        }          
    }        
}                
                
        
    

