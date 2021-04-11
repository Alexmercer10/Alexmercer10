package Practicas_FullStack;

/*
Dado un número entero positivo N, indicar si es, un número primo o un número
compuesto.
Un número se considera primo cuando tiene, únicamente, dos divisores distintos, siendo
estos: el número uno y el propio número N.
Por otro lado, se considera numero compuesto a cualquier numero natural que tenga algún
divisor más, aparte del 1 y el propio N.
 */
public class Ejercicio2_while_for{
    
    public String sampleMethod(int N){
        
        String mensajero;
        int contador = 0;
        
          for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                contador++;
            }
        }
        
        if (contador == 2) {
            mensajero = "El numero "+N+ " es primo";
        }else{
            mensajero = "El numero "+N+ " no es primo";
        }
        
    
       
        return mensajero;
    }
}
