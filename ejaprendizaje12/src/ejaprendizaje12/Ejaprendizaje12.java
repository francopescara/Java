/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejaprendizaje12;
import java.util.Scanner;
/**
 *
 * @author franco
 */
public class Ejaprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int cont=0;
       int cont1=0;
       boolean salir=false;
       do{System.out.println("ingresa secuencia");
           String secuencia=leer.nextLine();
           int longi=secuencia.length();
           if(longi<=5){
               
           }
           if ("X".equalsIgnoreCase(secuencia.substring(0,1)) && "O".equalsIgnoreCase(secuencia.substring(4,5))){
           cont=cont+1;
           }else{
                   cont1=cont1+1;
           }
               if ("&&&&&".equals(secuencia)){
          salir=true; 
           
           }
           
           }while(!salir);
    
            System.out.println("correcta"+cont);
            System.out.println("incorrecta"+cont1);
    }      
}         
        
  

        
