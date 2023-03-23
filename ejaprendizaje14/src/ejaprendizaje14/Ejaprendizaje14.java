/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejaprendizaje14;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de euros");
        double euros=leer.nextInt();
        double retornolibras=libras(euros),retornoyenes=yenes(euros),retornodolares=dolares(euros);
        System.out.println("el cambio de euros a libras es : "+retornolibras);
        System.out.println("el cambio de euros a yenes es : "+retornoyenes);
        System.out.println("el cambio de euros a dolares es : "+retornodolares);
    }
    

public static double libras(double euros){
double libras;    
libras=euros*0.86/1;
return libras;
}
public static double yenes(double euros){
double yenes;    
yenes=euros*129.852/1;
return yenes;
}
public static double dolares(double euros){
double dolares;    
dolares=euros*1.28611/1;
return dolares;
}
}