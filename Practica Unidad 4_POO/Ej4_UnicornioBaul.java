package POO_FullStack;

/*
 
 */
public class Ej4_UnicornioBaul{
    // Atributos
    private int claveBaul;
    private boolean estaAbierto;
    
    //Metodo Constructor
    public Ej4_UnicornioBaul(int clave){
        claveBaul = 1111;
        estaAbierto = false;
    }
    // Metodo
    public String abrir(int clave){
        String res;
        // ! negación
        if(!estaAbierto){
            // cerrado
            if(clave==claveBaul){
                res = "clave correcta";
                estaAbierto = true;
            }else{
                res = "clave incorrecta";
            }
        }else{
            res ="El baul ya esta abierto";
        }
        return res;
    }
    public String cerrar(){
        String res;
        if(estaAbierto){
            // Si esta abierto debemos cerrarlo
            estaAbierto= false;
            res = "cerraste el baul";
        }else{
            res = "Ya esta abierto el baul"; 
        }
        return res;
    }
    public String cambiarClave(int nuevaClave){
         String res = "Introduce un numero nuevo de 4 digitos";
         if(estaAbierto){
             if(cantDig(nuevaClave)==4){
             claveBaul= nuevaClave;
             res = "cambiaste de clave";
          }
        }else{
            res = "necesitas abrir el baul primero";
        }
         
         return res;  
    }
    
    // metodo de cambiarClave
    private int cantDig(int n){
        int contador= 0;
        while(n>0){
            contador++;
            n = n /10;
        }
        return contador;
    }
}
