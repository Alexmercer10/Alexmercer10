package Practicas_FullStack;

/*
 Se dice que los números son infinitos...pueden seguir creciendo y creciendo...cada vez con
más dígitos...pero ¿Cuál es limite actual? ¿Cuál es la esquirla de un número?
Dado un numero entero N debes indicar el primer digito de este número (leer de izquierda
a derecha). Asumir que el número de entrada siempre será un numero con 3 dígitos.
 */
public class Ejercicio7_IF_ELSE{

    public String sampleMethod(int N){
    
        String mensajero;
       
        if(N < 100 && N > 999){
            mensajero = "Erro del programa ingrese un numero de 3 digitos";
        }else{
            mensajero = "La esquirla de un número es: "+ N / 100;
            
        }
      
        
        return mensajero;
    }
}
