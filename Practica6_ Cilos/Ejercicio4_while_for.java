package Practicas_FullStack;

/*
 El factorial de un numero N (n!) es la multiplicación de todos los números enteros positivos
menores o iguales que N.
Existe un caso especial el cual no cumple lo mencionado anteriormente, este caso es
cuando N es igual a cero. Para este caso (0! = 1)
 */
public class Ejercicio4_while_for{
    
    public String Factorial(int N){
    
       String mensajero;
       int contador = 1;
        
        for (int i = 1; i <=N; i++) {
            System.out.print(i + " * ");
            
            contador = contador*i;

        }
        mensajero = " = El factorial del numero es: "+contador;
        
    
        return  mensajero;
    }
}
