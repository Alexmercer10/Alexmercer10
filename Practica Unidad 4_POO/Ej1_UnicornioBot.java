package POO_FullStack;

/*

 */
public class Ej1_UnicornioBot{
     
    // atributos
    private String nombreUsuario;
    private String camvNom;

    //Metodo Constructor
    public Ej1_UnicornioBot(){
        nombreUsuario = "" ;
        camvNom = "";
    }
    public String saludar(String nombre){
        
        nombreUsuario = "Hola saludos: " +nombre;
       
        return nombreUsuario;
        
    }
    
    public String CambiarNombre(String nuevoNombre){
       
        camvNom= "Su nuevo nombre cambiado es "+nuevoNombre;
       
        return camvNom;
        
    }
}
