package Practicas_FullStack;

/*
Un Año Bisiesto es un año que contiene un día extra. Tiene 366 días en lugar de los 365 normales. Para que
un anio sea bisiesto debe cumplir ciertas condiciones, las cuales se explica en la imagen de abajo.
 */
public class Ejercicio9_IF_ELSE{
    
    public String NumBisiesto(int A){
    
        String mensajero;
        
        if((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0)){
            mensajero = "Es un año bisiesto";
        }else{
            mensajero = "No es bosiesto";
        }
        
        return mensajero;
    }
}
