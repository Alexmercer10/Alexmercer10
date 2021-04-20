package POO_FullStack;

/*

 */
public class Ej8_DracoCornio{
     // Atributos
    private int cX,cY,intentos;

    // Metodo Constructor
    public Ej8_DracoCornio(){
        intentos=3;
        //Numero aleatorios de 0 a 10
        cX= (int)(Math.random()*11);
        cY= (int)(Math.random()*11);
    }
    // 7 , 7 --> 0     // Parametros
    public String jugar(int x, int y){
        String res="";
        int distX= Math.abs(cX-x);
        int distY= Math.abs(cY-y);
        
        if(intentos>0){
            if(distX==0 && distY==0){
                res="Felicidades ganaste el Juego :) ";
            }else{
                intentos--;
                if(distX>2){
                    res=res+"X esta lejos";
                }else{
                    res=res+"X esta cerca";
                }

                if(distY>2){
                    res=res+"Y esta lejos";
                }else{
                    res=res+"Y esta cerca";
                }
            }
        }else{
            res="Perdiste :( Saluda a los megalodones";
        }
        return res;
    }
    
    public void reiniciar(){
        intentos=3;
        cX= (int)(Math.random()*11);
        cY= (int)(Math.random()*11);
    }
}
