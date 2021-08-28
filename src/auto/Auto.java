
package auto;
//import java.util.*;
public class Auto {
    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;
    
   public Auto(String Placa,int DiasDesdeUltimoMantenimiento,boolean TieneSeguro){
       this.Placa=Placa;
       this.DiasDesdeUltimoMantenimiento=DiasDesdeUltimoMantenimiento;
       this.TieneSeguro=TieneSeguro;
   }
   

    public boolean NecesitaMantenimiento(){
        if (DiasDesdeUltimoMantenimiento>20) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean SePuedeRentar(){
        if (TieneSeguro) {
            if(!NecesitaMantenimiento()) {
                return true;   
            }else{return false;}
        }else{return false;}
    }
}
