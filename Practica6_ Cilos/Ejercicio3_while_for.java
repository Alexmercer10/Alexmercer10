package Practicas_FullStack;

/*
Dariel tiene un alter ego, el cual se llama Danilo. Son dos personalidades totalmente
opuestas, como si uno fuera la personalidad invertida del otro. Dariel observo que esto
también puede pasar en los números.
Dado un numero entero N, indicar el numero que resulta de invertir N.
 */
public class Ejercicio3_while_for{
    
    public int Invertir (int N){
    
        int res = 0;
        
        while(N > 0 ){
            int dig = N%10;
            res = (res*10)+dig;
            N = N/10;
        }
        
        return res;
    }
}
