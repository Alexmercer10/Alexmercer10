package Practicas_FullStack;

/*
 ¿Qué tienen en común estas fechas? Si lo ves bien, el valor numérico del día esta, formado por un
numero par y un numero impar.
Dado un numero D, indicar que tipo de día representa, según el siguiente criterio: si está formado
por un numero par y un numero impar (en cualquier orden) indicar que es una “Cruz de Dariel”,
caso contrario, indicaremos que es un “Día normal”
 */
public class Ejercicio3_IF_ELSE{
    
    public String DiaParoImpar(int D){
    
        String mensajero;
        
        if(D % 2 == 0){
            mensajero = "Dia Normal";
        }else{
            mensajero = "Cruz de Dariel";
        }
        
        return mensajero;
    }
}
