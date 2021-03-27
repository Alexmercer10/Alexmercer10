package Practicas_FullStack;
/*
Hoy es un día muy ajetreado en las oficinas de UnicornioRecursivo SRL.
Se ha encargado al asistente de planta que imprima un documento de N páginas, pero
usando el anverso y reverso de las hojas. Es decir que en cada hoja se pueden imprimir dos
páginas de un documento.
Dicho esto, ¿cuántas hojas se necesitarán para imprimir todo un documento de N paginas?
 
 */
public class Ejercicio4_Imple_Metodos{
    
    public int sampleMethod(int N){
    
        int Numpag = N / 2;
        System.out.print("El numero de paginas impresas amberso y reverso es: "+Numpag);
        return Numpag;
    }
}
