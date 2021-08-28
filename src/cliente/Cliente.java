
package cliente;
//import java.util.*;
public class Cliente {
    private String Cedula;
    private int Edad;
    private String Nombre;
    
   public Cliente(String Cedula,int Edad,String Nombre){
       this.Cedula=Cedula;
       this.Edad=Edad;
       this.Nombre=Nombre;
   }

    public String getCedula() {
        return Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public String getNombre() {
        return Nombre;
    }
   
   
}
