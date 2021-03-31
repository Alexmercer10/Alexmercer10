package Practicas_FullStack;
/*
1.- Se da un número entero positivo N de tres dígitos. Determina si N es un número capicúa.
Un número capicúa es un número entero que se lee igual, ya sea de izquierda a derecha o
de derecha a izquierda.
 */
public class Ejercicio1_IF_ELSE{
    
    
    public int NumCapicua(int N){

        int unidad, decena, centena;
        
        
        centena = N / 100;
        decena = (N % 100) / 10;
        unidad = (N % 100) % 10;
        
        if(centena == unidad){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
        
        return  N;
    }
}
