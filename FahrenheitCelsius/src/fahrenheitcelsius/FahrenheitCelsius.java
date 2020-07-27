
package fahrenheitcelsius;

import java.util.Scanner;

/**
 *
 * @author Smerlin
 */
public class FahrenheitCelsius {
   
    
  
  //Metodo que convierte de F a C
  public double calcularFaC(double f){
      final double celsius = ((f-32)*5)/9;
      return celsius;
  }
  //Metodo que convierte de C a F

  public double calcularCaF(double c){
      final double fahrenheit = ((c*9)/5)+32;
      return fahrenheit;
  }
    
  
  
}
