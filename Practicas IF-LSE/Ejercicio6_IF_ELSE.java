package Practicas_FullStack;

/*
Existe una familia de 5 personas... padre, madre y 3 hijos. Lo que pasa es que la señora de
casa, tiene problemas para recordar la edad de cada hijo y por ello no tiene bien claro quién
es el mayor, quien está en medio y quien es el menor.
Tu tarea es ayudarle, para ello debes tener en cuenta que cada hijo tiene un nombre S y
una edad N.
Se te pide que indiques quien de los 3 es el mayor, quien es el menor y quien es el
hermano del medio.
 */
public class Ejercicio6_IF_ELSE{
   
    public String EdadHijos(int S1, int N1,int S2, int N2, int S3, int N3){
    
        String mensajero;
        
        if((N1 > N2 && N1 > N3) || (N2 < N1 && N2 > N3) || (N3 < N1 && N3 < N2)  ){
            mensajero = "El mayor es : "+ S1 + N1 + "El medio es : "+S2 + N2 + "El menor es : "+ S3 + N3;
        }else{
           if((N2 > N1 && N2 > N3) ){           
            mensajero = "El mayor es : "+S2 + N2;
        }else
        if((N3 > N1 && N3 > N2) ){          
            mensajero = "El mayor es : "+S3 + N3;
        }else
           mensajero = ".";
        }
        
        return mensajero;
    }
}
