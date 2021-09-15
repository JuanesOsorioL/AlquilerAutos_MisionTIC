package alquiler;

import static java.time.temporal.ChronoUnit.DAYS;
import java.util.*;
import java.time.*;
import cliente.Cliente;
import auto.Auto;

public class Alquiler {

    private Cliente Cliente;
    private Auto Auto;
    private LocalDate Fecha;
    private int HorasAlquiler;

    public Alquiler(Cliente Cliente, Auto Auto, LocalDate Fecha, int HorasAlquiler) {
        this.Cliente = Cliente;
        this.Auto = Auto;
        this.Fecha = Fecha;
        this.HorasAlquiler = HorasAlquiler;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public Auto getAuto() {
        return Auto;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public int getHorasAlquiler() {
        return HorasAlquiler;
    }

    //public double CalcularCosto(boolean aplicaDescuento ){
    public int CalcularCosto(boolean aplicaDescuento ){
        //double total=0;
        int total=0;
        if (aplicaDescuento) {
            int valor=HorasAlquiler*5000;
            int descuento= ((2*valor)/100);
            total=valor-descuento;
        }else{
            total=HorasAlquiler*5000;
        }
        return total;
    }
    
    
    public int ObtenerDescuento(Alquiler[] alquileres) {
       int horasAcumuladas = 0;
        if (Auto.SePuedeRentar()) {
            for (int i = 0; i < alquileres.length; i++) {
                if (Cliente.getCedula().equals(alquileres[i].Cliente.getCedula())) {
                    long dias = DAYS.between(alquileres[i].Fecha, Fecha);
                    if (dias >= 0 && dias <= 30) {
                            horasAcumuladas = horasAcumuladas + alquileres[i].getHorasAlquiler();
                        }
                }
            }
        } else {
            return 0;
        }
        int retornar;
        horasAcumuladas=horasAcumuladas+getHorasAlquiler();
        System.out.println("horas son "+horasAcumuladas);
        if (horasAcumuladas < 20) {
            retornar = 0;
        } else if (horasAcumuladas >= 20 && horasAcumuladas <= 50) {
            retornar = 2;
        } else {
            retornar = 5;
        }
        return retornar;
          
    }
    
    ///reto 5
    public boolean PuedeAlquilar(Alquiler[] historial,Cliente Cliente){
        String cedula=Cliente.getCedula();
        int contador=0;
        for (int i = 0; i < historial.length; i++) {
            String cedulaHistorial=historial[i].Cliente.getCedula();
            if (cedula==cedulaHistorial){
                contador++;
            }
        }
        return contador<3;
    }
    
    
}
