package Practicas_FullStack;

/*
Dado un número natural N, indicar el número que se forma de juntar su primer digito, con
el ultimo digito, pero, de manera cambiada.
 */
public class Ejercicio8_while_for{
    
    public int Transformar(int N){
    
        int res = 0;
        
        if(N < 10){
            res = N;
        }else{
           int ultimDigito = N%10;
           
           while(N>=10){ 
               N = N/10;
               
            }
            res = (N*10)+ultimDigito;
        }
        
        return res;
    }
}
