package Practicas_FullStack;

/*
 La UnicornioApp es una red social nueva, entre sus particularidades, están el control sobre
la cantidad de personas que un usuario puede seguir.
Como máximo, un usuario puede seguir 3x (el número de usuarios que te siguen)
Actualmente una cantidad A de usuarios te están siguiendo y estás siguiendo a B usuarios.
Como máximo, ¿cuántos usuarios adicionales puedes seguir ahora?
 */
public class Ejercicio9_Imple_Metodos{
    
    public int sampleMethod(int A, int B){
    
        int UnsAdicional = (A*3)-B;
        return UnsAdicional;
    }
}
