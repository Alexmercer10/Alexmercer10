package Practicas_FullStack;

/*
Se dice que dos números N y M son novios (casi amigos) cuando cada uno de ellos es igual a
la suma de sus divisores propios, menos uno (-1). Por ejemplo 48 y 75 son novios (casi
amigos) ya que:
Los divisores propios de 75: (1 + 3 + 5 + 15 + 25) – 1 = 48
Los divisores propios de 48: (1 + 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24) – 1 = 75.
Dado dos números enteros N y M, indicar si son números novios(casi amigos) o no.
 */
public class Ejercicio14_while_for{
    
    public String MumCasiAmigos(int N , int M){
    
        String res;
        
        if(N != M){
            
            int sumDivNum1 = sumatoriaDiv(N);
            int sumDivNum2 = sumatoriaDiv(M);
            int suma = N+M+1;
            
            if(sumDivNum1 == sumDivNum2 && sumDivNum1 == suma){
                res = "Si son novios(casi amigos)";
            }else{
                res = "No son novios";
            }
        }else{
            res = "Los numeros son iguales, no puede verificarse";  
        }
        return res;
    }
    
        private int sumatoriaDiv(int num){
            int res = 0;
            for(int i = 1; i <= num; i++){
            if(num%i == 0){
                 res = res+i;
            }
        }
        return res;
    }
}

