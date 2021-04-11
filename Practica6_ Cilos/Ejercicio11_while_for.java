package Practicas_FullStack;

/*
La multiplicación es una de las operaciones aritméticas mas conocidas y estamos
acostumbrados a calcularla de manera directa, sin embargo, hoy recordaremos cual es la
idea de una multiplicación, explicada de manera clásica.
 */
public class Ejercicio11_while_for{
    
    public String OperAritmetica(int N , int M){
    
        String mensajero;
        int sumVecesNum = 0;
         
        for (int i = 1; i <= N; i++) {
           
            sumVecesNum = sumVecesNum + M;
        }
        mensajero = "La suma de todo sus factores es: "+sumVecesNum;
    
        return  mensajero;
    }
}
