package Practicas_FullStack;

/*
 Tenemos un gotero que deja caer gotas de agua durante X segundos. Las gotas caen a una
velocidad de 1 ml. por segundo.
El gotero contiene inicialmente G ml. de agua.
¿Cuántos ml. de agua quedaran en el gotero después de X segundos?
 */
public class Ejercicio10_Imple_Metodos{
  
    public int sampleMethod(int G, int X){
    
        int res = G - X;
        return res;
    }
}
