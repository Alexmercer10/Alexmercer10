package Practicas_FullStack;

/*
2.- Edriel está de compras en el supermercado, en su lista de compras está escrito, 
comprar dos jugos naturales.
La tienda vende tres tipos de jugo natural, por el precio de a, b y c pesos. respectivamente.
Por motivos de planificación económica, Edriel no puede darse el lujo de pagar demasiado
por los jugos, por tanto, debe elegir los dos jugos que den un precio total mínimo.
Encuentra el precio total mínimo de dos jugos diferentes.
 */
public class Ejercicio2_If_Else{
   
    public String CompraJugos(int a, int b, int c){
    
        String mensajero;
       
        if((a > 0 && a <= 100) && (b > 0 && b <= 100) && (c > 0 && c <= 1000)){
            System.out.println("El programa se esta ejecutando.....");
        }else{
           System.out.println("Error del programa, puede que el numero que ingreso sea menor o mayor a los q se propuso"); 
        }
        if((a > b && a > c) ){
            mensajero = "Los jugos comprados son: "+ b +" y "+ c;        
        }else{
          if((b > a && b > c)){
            mensajero = "Los jugos comprados son: "+ a +" y "+ c;            
        }else{
          if((c > a && c > b) ){
            mensajero = "Los jugos comprados son: "+ a +" y "+ b;            
        }
        else{
            mensajero = "....";
         }
      } 
    }
         
        return mensajero;
    }
}
