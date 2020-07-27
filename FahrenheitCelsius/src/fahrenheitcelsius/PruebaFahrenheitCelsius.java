
package fahrenheitcelsius;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Smerlin
 */
public class PruebaFahrenheitCelsius {
    public static void main (String [] args){
        /*
        Declaro una variable scanner para leer 
        el dato, una booleana para hacer un menu, y 
        un byte para lo mismo, ademas de declarar dos variables tipo double para
        almacenar el dato del usuario, y un objeto de FahrenheitCelsius para poder
        utilizar sus metodos
        */
        Scanner s = new Scanner(System.in); double f,c; FahrenheitCelsius fc = new FahrenheitCelsius();
        boolean salir = false; byte opcion; int cock;
        
        /*
        Primero, hago un bucle while para decirle: mientras "salir" tenga un valor diferente
        al que ya tiene que es falso entonces ejecutame esto. Esto lo hice para que luego como hice un
        menu para poder salir del bucle
        */
        
        while(!salir){
           System.out.println("Bienvenido al conversor de Fahrenheit a Celsius y viceversa");
           System.out.println("Ahora bien, presiona 1 si quieres convertir de Fahrenheit a Celsius");
           System.out.println("O mas bien, 2 si quieres convertir de Celsius a Fahrenheit");
           System.out.println("Si quieres salir solo presiona 3");
            /*
           Aqui tenemos un try and catch que lo utilice para agarrar una excepcion, en este caso seria
           que no me ingresen valores no numericos o fuera de lo que acepta un byte
           */
           try{
               opcion=s.nextByte();
               
               /*
               Aqui un switch que hago para que en caso de que el valor de opcion sea 1
               me lea el dato del usuario y recurriendo al metodo ya hecho, me convierta
               de Fahrenheit a Celsius, en caso de que sea 2 de Celsius a Fahrenheit  y en caso de 
               que sea 3 acabe el programa
               */
               switch(opcion){
                   
                   case 1:
                       System.out.println("Ingrese el valor");
                       f= s.nextDouble();
                       System.out.println("El resultado es " + fc.calcularFaC(f)+ " Celsius");
                       break;
                       
                   case 2:
                         System.out.println("Ingrese el valor");
                         c= s.nextDouble();
                         System.out.println("El resultado es " + fc.calcularCaF(c)+ " Fahrenheit");
                         break;
                   case 3:
                       salir = true;
                       break;
                           
                   
               }
               
               
               
               
           }catch(InputMismatchException e){
               System.out.println("Creo que eso no es un numero, por favor solo ingresa numeros");
               s.next();
           }
        }
        
        
        
        
        
        
        
        
        
    }
}
