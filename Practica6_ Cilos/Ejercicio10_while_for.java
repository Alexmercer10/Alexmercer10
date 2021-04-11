package Practicas_FullStack;

/*
Ahora que ya sabemos transformar números en notación decimal a números en notación
binaria, veamos algo interesante sobre estos.
Un número en notación binaria puede ser un “Numero Malvado” o un “Numero Odioso”.
Esto dependerá de cuantos 1’s haya en su composición.
 */
public class Ejercicio10_while_for{
    
    public String NumMalvado_Odioso(int N){
    
        String res;
        int numBinario = convertirDecimalABinario(N);
        int contador = 0;
        while(numBinario>0){
            int dig = numBinario%10;
            if(dig== 1){
                contador++;
            }
            numBinario= numBinario/10;
        }
        if(contador%2 == 0){
           res = "Es un Numero Malvado";
        }else{
            res = "Es un Numero Odioso";
        }
        return res;
    }   
    private int convertirDecimalABinario(int N){
        int binario = 0;
        int base = 10; 
        int exp = 0;
        while(N>0){
            int digBin = N %2;
            binario = (digBin*(int)Math.pow(base,exp))+binario;
            exp++; 
            N = N/2;
        }
        
        return binario;
    }
}
