package Practicas_FullStack;
/*
Calcula la circunferencia de un círculo de radio R
La fórmula para calcular la circunferencia es Diámetro*pi.
Para pi=3.14159
 */
public class Ejercicio3_Imple_Metodos{
    
    public double sampleMethod(int R){
    
        int diametro = 2;
        double res = diametro * ((int)Math.PI) * R;
        
        return res;
    }
}
