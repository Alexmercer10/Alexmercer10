package Practicas_FullStack;

/*
 Dado un número entero positivo N, indica la cantidad de dígitos que tiene ese número.
 */
public class Ejercicio1_while_for{
   
    public String DigitosDelNumero(int a){
    
        String mensajero;
        int contador= 0;
        while(a >=1){
            a = a / 10;
            contador++;
        }
        mensajero = "La cantidad de digitos que tiene el numero es: "+contador;
        return mensajero;
    }
}
