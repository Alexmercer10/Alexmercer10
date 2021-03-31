package Practicas_FullStack;

/*
El día más importante de una persona es cuando esta cumple un año más de vida, se
realizan fiestas...eventos con el fin de pasarla bien, etc.
Resulta que se está realizando una invitación de cumpleaños y se tiene la fecha del evento,
la cual está escrito bajo el siguiente formato DD/MM/AAAA (día, mes, año). Yo quisiera
tener la fecha de manera literal, por ejemplo:
Si la fecha del evento es: 6/7/1995 escrito de manera literal seria 6 de julio de 1995.
 */
public class Ejercicio8_IF_ELSE{
   
    public String FechaLiteral(int D, int M, int A){
    
        String mensajero;
        
        if(M == 1){
            mensajero = D+" de Enero de "+A;
        }else if(M == 2){
            mensajero = D+" de Febrero de "+A;
        }else if(M == 3){
            mensajero = D+" de Marzo de "+A;
        }else if(M == 4){
            mensajero = D+" de Abril de "+A;
        }else if(M == 5){
            mensajero = D+" de Mayo de "+A;
        }else if(M == 6){
            mensajero = D+" de Junio de "+A;
        }else if(M == 7){
            mensajero = D+" de Julio de "+A;
        }else if(M == 8){
            mensajero = D+" de Agosto de "+A;
        }else if(M == 9){
            mensajero = D+" de Septiembre de "+A;
        }else if(M == 10){
            mensajero = D+" de Octubre de "+A;
        }else if(M == 11){
            mensajero = D+" de Noviembre de "+A;
        }else if(M == 12){
            mensajero = D+" de Diciembre de "+A;
        }else{
             mensajero = "Ya no hay mas numeros...";  
        }

        return mensajero;
    }
}
