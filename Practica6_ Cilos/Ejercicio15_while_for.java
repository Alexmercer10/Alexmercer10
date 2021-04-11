package Practicas_FullStack;

/*
 Al ver que existen tantos tipos de números, Dariel decidido crear una clasificación propia.
Es así que creo “los números unicornio”.
Un número, es “unicornio”, si el corazón del numero es múltiplo de tres.
El corazón de un numero depende de la cantidad de dígitos que tenga.
Si tiene una cantidad par de dígitos, el corazón estará compuesto por los dos dígitos del
centro, caso contrario, el corazón estará compuesto por el único digito del centro.
Decidió crear esta clasificación en honor a sus únicos amigos que lo acompañan en esta
travesía la cual los mortales llaman vida.
Dado un numero entero N, indicar si es, o no, un numero Unicornio.
 */
public class Ejercicio15_while_for{
    
    public String NumUnicornio(int N){
      String res;
      int cantDig = cantidadDigitos(N);
      int cont = 0;
      
      if(cantDig % 2 == 0){
        cont = (cantDig/2)-1;
      }else{
          cont = (cantDig/2);
        }
        for(int i = 0; i > cont; i++){
            N = N /10;
        }
        int corazon;
        if(cantDig % 2 == 0){
         corazon =N%100;
      }else{
          corazon =N%10;
        }
        
        if (corazon % 3 == 0){
          res = "Si es un numero Unicornio";  
        }else{
           res = "No es un numero UNicornio"; 
        }
      return res;
    }
        private int cantidadDigitos(int num){
            int res = 0;
            while(num>0){
                res++;
                num = num/10;
            }
        
        return res;
    }
}
