/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejaprendizaje16;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
    
      System.out.println("ingrese un numero a buscar");
        int num=leer.nextInt(),cont;
        int[]vector=new int[10];
        cont=0;
        for(int i=0;i<10;i++){
            int  aleatorio=(int)((Math.random()*10)+1);
            vector[i]=aleatorio;
                    if (vector[i]==num){
                        cont=cont+1;
                    }
        }
        int posicion=0;
        for(int i=0;i<10;i++){
            if(num==vector[i]){
                posicion=i;
            }
        }
        
            
        
        
        if(cont==0){
            System.out.println("no se encontro el numero");
        }else{
            System.out.println(" el numero a buscar :" +num+ " se en encuentra en la posicion " +posicion+ " y se repite : " +cont);
        }
        
            
           System.out.println("mostrar los numeros");
        for(int i=0;i<10;i++)
        System.out.println(vector[i]);
        
        
            
        
    }
    
}
