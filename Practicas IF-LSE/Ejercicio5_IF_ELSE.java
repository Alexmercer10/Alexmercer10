package Practicas_FullStack;

/*
 El mundo de los números es inmenso, existen números pares, impares, primos, etc.
En este caso vamos a enfocarnos en un grupo particular de números al cual llamaremos
“parientes”, se dice que dos números son “parientes” cuando al menos uno de ellos, es
múltiplo del otro.
Por ejemplo 8 y 4 “son parientes”, si bien 4 no es múltiplo de 8. el numero 8 si es múltiplo
de 4. Por otra parte, por ejemplo, 9 y 5 “no son parientes”.
Dados dos números, A y B, indicar si estos son o no, números parientes.
 */
public class Ejercicio5_IF_ELSE{
        
    public String NumParientes(int A, int B){
    
        String mensajero;

        if((A % B == 0) && (A % B == 0)){
            mensajero = "Los numeros ingresados son parientes ";
        }else{
            mensajero = "Los numeros no son parientes";
        }
        
        return mensajero;
    }
}
