package Practicas_FullStack;

/*
Se tienen tres números enteros de un solo digito a, b y c correspondientemente.
Organizaremos los números en el orden bca, formando así un nuevo número entero.
Tu tarea es: Encontrar la manera de formar un número entero usando los valores de a, b y c
cumpliendo el orden indicado.
 */
public class Ejemplo5_Imple_Metodos{
   
    public int CrearNumero(int a, int b, int c){
    
        int res= b*100+(c*10+a);
        return res; 
    }
   
}
