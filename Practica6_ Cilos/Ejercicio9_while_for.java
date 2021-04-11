package Practicas_FullStack;

/*
 Dado un número natural N, en notación decimal (base 10), se te pide transformarlo a un
número en notación binaria (base2).
 */
public class Ejercicio9_while_for{
    
    public String sampleMethod(int N){
    
        String mensajero;
        
        int resultado=0;
        int multi = 1;
        while(N > 0){
            int dig = N%2;
            resultado = dig*multi+resultado;
            multi= multi*10;
            N = N/2;
            
        }
        mensajero = "la notación binaria en base 2 es: "+resultado;
        return  mensajero;
    }
}
