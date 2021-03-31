package Practicas_FullStack;

/*
 Dentro del mundo de los números hay unos cuantos que están en “crecimiento”, son aquellos donde su
digito anterior siempre es menor o igual al digito siguiente (leer de izquierda a derecha). Por ejemplo 569
es un numero en “crecimiento”, en cambio 684 no lo es.
Dado un numero entero N de 3 dígitos indicar si está en crecimiento o no.
 */
public class Ejercicio10_IF_ELSE{
    
    public String Creciente_noCreciente(int N){
    
        String mensajero;
        int Unidad = (N%100) % 10; // saca la unidad del numero
        
        if(N < 100 && N > 999){
            System.out.println("Error... Porfavor ingrese un numero de 3 digitos");
        }else{
            System.out.println("Excelente el Programa se esta ejecutando ");
        }
        
        if(Unidad == 9){
            mensajero = "El numero esta creciendo";
        }else{
            mensajero = "NO esta creciendo";
        }
        return mensajero;
    }
}
