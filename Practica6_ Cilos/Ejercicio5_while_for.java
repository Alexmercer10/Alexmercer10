package Practicas_FullStack;

/*
 Dentro la suma conocemos como acarreo a lo que “se lleva” cuando sumamos 2 números.

Dado dos números enteros positivos A y B respectivamente, calcular e indicar la cantidad
de acarreos que resulta de efectuar la suma entre ambos números.
 */
public class Ejercicio5_while_for{
    
    public String sampleMethod(int A , int B){
    
        String mensajero="";
        int contador = 0;
        int acarreo=0;
        
        while(A>0 || B>0){
        int sum=0;
        int dig1 = A%10;
        int dig2 = B%10;
               
        if((dig1+dig2+acarreo)>9){
            // acarreo 1
            contador++;
            acarreo=1;
        }else{
            // acarreo 0
            acarreo = 0;
        }
        // eliminacion de digitos
        A = A/10;
        B = B/10;
        mensajero = "Los acarreos son: "+contador;
    }
        return mensajero;
    }
}
