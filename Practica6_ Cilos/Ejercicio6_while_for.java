package Practicas_FullStack;

/*
Se dice “Numero Perfecto” a todo número natural N, que es igual a la suma de sus divisores
propios (es decir, todos sus divisores excepto el propio número). Por ejemplo, 6 es un
número perfecto ya que sus divisores propios son 1, 2, y 3 cumpliendo así que: 1+2+3=6.
¿Pero... que pasa con aquellos números cuya suma de divisores propios es mayor o menor
que el propio número?
 */
public class Ejercicio6_while_for{
    
    public String NumPerfecto(int N){
    
        String mensajero ="";
        int suma= 0;
        
        for(int i=1 ; i<N; i++){
            if(N%i==0){
             suma= suma+i;
            }if(suma == N){
             mensajero = "El numero " + N + " Es perfecto";   
            }else{
              mensajero  = "El numero " + N + " no es perfecto";  
            }
            
        }
        return mensajero;
    }
}
