/*
  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejaprendizaje.pkg17;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector= new int [10];
        int d1,d2,d3,d4,d5;
        d1=0;
      
        for(int i=0;i<10;i++){
             int  aleatorio=(int)(Math.random()*100000+1);
            vector[i]=aleatorio;
            do{
            vector[i]=vector[i]/10;
                d1=d1+1;    
        }while(vector[i]>=1);
            
        
         
       
       
            }
            
                      System.out.println("mostrar los numeros");
        for(int i=0;i<10;i++)
        System.out.println(vector[i]);
        System.out.println(d1);
        }
        
 }
        
       
    

