package Practicas_FullStack;

/*
Dado un número natural N, indicar si es, o no, un número narcisista.
Un número narcisista es aquel que es igual a la suma de sus dígitos elevados a la potencia
de su número de cifras. Por ejemplo 153 es un numero narcisista ya que 1^3+5^3+3^3 = 153
 */
public class Ejercicio7_while_for{
  
    public String NumNarcisita(int num){
    
        String mensajero = "";
        int p;
        int unidad, decena, centena, elevCubo;
       
            centena = num /100;
            decena = (num % 100) / 10;
            unidad = (num % 100) % 10;
     
            elevCubo = (int) Math.pow(centena, 3) + (int) Math.pow(decena, 3) + (int) Math.pow(unidad, 3) ;
            
         
            if (num > 0) {
                
                if (num == elevCubo) {
                    mensajero = "Es numero narcisista";
                }else{
                    mensajero = "Es un numero normal ";
                }
                
            } else {
                System.out.println("El numero es incorrecto ingrese un numero mayo a 0");
            }
        
        return  mensajero;
    }
}
