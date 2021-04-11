package Practicas_FullStack;

/*
Una de las formas mas comunes de relacionamiento social es la amistad, tener un amigo o
amiga debe ser muy bonito.
Pues bien, esto también ocurre con los números. Se dice que dos números A y B,
respectivamente, son amigos si: la suma de divisores propios de A da como resultado el
valor de B y la suma de divisores propios de B da como resultado el valor de A.
Por ejemplo: 220 y 284 son amigos ya que:
Los divisores propios de 220: 1+2+4+5+10+11+20+22+44+55+110 = 284
Los divisores propios de 284: 1+2+4+71+142 = 220
Dados dos números naturales A y B indicar si son amigos o no.
 */
public class Ejercicio13_while_for{
    
    public String Amigos(int n1 , int n2){
    
        String mensajero = "";
        int i, suma = 0; 
        for ( i = 1; i < n1; i++) {
            if (n1 % i ==0 ) {
                suma = suma + i;
                
            }
        }
        
        if (suma == n2) {
            suma = 0;
            for ( i = 1; i < n2; i++) {
                if (n2 % i == 0) {
                    suma = suma + i;
                }
            }
            
           if (suma == n1) {
            mensajero = "Los numeros son amigos ";  
        }else{
            mensajero = "Los numeros no son amigos ";
            
        }
            
        }else{
            mensajero = "No son amigos";
        
        }
   
    
        
        
        return mensajero;
    }
}
