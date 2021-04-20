package POO_FullStack;

public class Ej3_UnicornioTron{
   // Atributos
   private int premio;
   private int cantFichas;
   private int numSecreto;
   // Metodo Constructor
   public Ej3_UnicornioTron(){
      premio = 10000;
      numSecreto = 1234;
      cantFichas = 0;
    }
    public String consultar(){
    String consultar;
       consultar = "El premio es: "+premio+ " bs ";
        return consultar;
    }
    public String Adivinar(int AdivinarNum){
        String res = ""; 
        if(cantFichas == 0){
          res = "porfavor compre fichas  nuevamente para adivinar el numero";
        }else if(AdivinarNum == numSecreto){
           res = "Felicidades adivinaste el numero secreto ganaste el premio"; 
        }else{
            res = "Error numero secreto incorrecto";
            cantFichas--;
      } 
        return res;
    }
    public int CompraFichas(int ficha){
         
        cantFichas = ficha;
   
        return cantFichas;
        
    }
    
    
}
