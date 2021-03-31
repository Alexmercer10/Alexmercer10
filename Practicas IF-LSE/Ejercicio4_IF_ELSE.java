package Practicas_FullStack;

/*
3.-Los semáforos juegan un papel muy importante dentro la ciudad, es conocido por todos, que los semáforos
tienen 3 estados, un estado “rojo” donde no se puede pasar, un estado “amarillo” el cual indica que debes
detenerte, un estado “verde” que significa que puedes pasar.

 */
public class Ejercicio4_IF_ELSE{
     //rojo ---> 0
    //amarillo --> 1
    //verde ---> 2
    public String Semaforos(int estado, int nVeces ){
        
    int estadoFinal=-1;
    
        if(estado==0){
            //rojo
            if(nVeces%3==0){
                estadoFinal=0;
            }else if(nVeces%3==1){
                estadoFinal=2;
            }else{
                estadoFinal=1;
            }
        }else if(estado==1){
            //amarillo
            if(nVeces%3==0){
                estadoFinal=1;
            }else if(nVeces%3==1){
                estadoFinal=0;
            }else{
                estadoFinal=2;
            }
        }else if(estado==2){
            //verde
            if(nVeces%3==0){
                estadoFinal=2;
            }else if(nVeces%3==1){
                estadoFinal=1;
            }else{
                estadoFinal=0;
            }
        }
        
        return dimeColor(estadoFinal);
    }
    
    public String dimeColor(int num){
        String res="";
        if(num==0){
            res="rojo";
        }else if(num==1){
            res="amarillo";
        }else if(num==2){
            res="verde";
        }
        
        return res;    
    }
}
