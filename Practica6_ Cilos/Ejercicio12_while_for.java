package Practicas_FullStack;

/*
La división es una de las operaciones aritméticas más conocidas y estamos acostumbrados a
calcularla de manera directa, sin embargo, hoy recordaremos cual es la idea de una
división, explicada de manera clásica.

 */
public class Ejercicio12_while_for{
   
    public String sampleMethod(int N , int M){
    
        String res;
        int contador = 0;
        for (int i = N; i >= 1; i = (i - M)) {

            System.out.println(i + " - " + M+ " = " + (i - M));
            contador++;
            if ((i-M) < M) {
                break;
                
            }
        }
        res = "Las veces restadas son : " + contador;
   
        return  res;
    }
}
