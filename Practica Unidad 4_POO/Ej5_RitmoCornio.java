package POO_FullStack;


public class Ej5_RitmoCornio{
     // Atributos
    private int canciones;
    private boolean estadoCancionPaus;
    private String NomCancion1, NomCancion2, NomCancion3;
    
    // Metodo Constructor
    public Ej5_RitmoCornio(){
        canciones = 3;
        estadoCancionPaus = true;  //false ---> pause , true ---> reproduccir
        NomCancion1 = "Cartoon - On & On";
        NomCancion2 = "Carl Storm – With You In The Morning";
        NomCancion3 = "Constellation ";
    }
    public String EstadoCancion(){
        String res;
        if(estadoCancionPaus){
            res = "La canción esta en pause"; 
        }else{
            res = "La canción esta en reproducción";   
        } 
        return res;
    }
    public boolean reproducir(boolean reprodCancion){
        
        if(estadoCancionPaus == reprodCancion){
             System.out.println("Reproduciste la cancion");
             estadoCancionPaus = false;
        }else{ 
            System.out.println("La cancion ya esta en reproduccion");
            estadoCancionPaus = false;
        }
        return estadoCancionPaus;
    }
    public boolean pausar(boolean pausar){
        
        if(estadoCancionPaus =! pausar){
               estadoCancionPaus = true;
               System.out.println("Pausaste la cancion");
        }else{
            System.out.println("La canción ya esta en pause");
            estadoCancionPaus = true;
        }
        return estadoCancionPaus;
    }
    public String NombreCanción(int cancion){
        String res = "";
        if(cancion > 0 && cancion <= 3){
            if(cancion == 1){
                res = "El nombre de la cancion es: " +NomCancion1;
            }else if(cancion == 2){
                res = "El nombre de la cancion es: "+NomCancion2;
            }else if(cancion == 3){
                res = "El nombre de la cancion es: "+NomCancion3;
            }
        }else{
            res = "No existe esa cancion";
        }
        return res;
    }


}
