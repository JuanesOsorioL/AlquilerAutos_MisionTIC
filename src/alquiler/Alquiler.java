package alquiler;

import static java.time.temporal.ChronoUnit.DAYS;
//import java.time.format.DateTimeFormatter;
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

    public int ObtenerDescuento(Alquiler[] alquileres) {
       // LocalDate fechaActual = LocalDate.now();
       int horasAcumuladas = 0;
        if (Auto.SePuedeRentar()) {
            
            for (int i = 0; i < alquileres.length; i++) {
                if (Cliente.getCedula().equals(alquileres[i].Cliente.getCedula())) {
                   // System.out.println("entra");
                  //  System.out.println(alquileres[i].Fecha);
                   // System.out.println(Fecha);
                    long dias = DAYS.between(alquileres[i].Fecha, Fecha);
                    //System.out.println(dias);
                    if (dias >= 0 && dias <= 30) {
                      //  System.out.println("entra");
                            horasAcumuladas = horasAcumuladas + alquileres[i].getHorasAlquiler();
                        }
                }
            }
        } else {
            //System.out.println("entra");
            return 0;
           
        }
        int retornar;
        if (horasAcumuladas == 0) {
            retornar = 0;
        } else if (horasAcumuladas >= 20 && horasAcumuladas <= 50) {
            retornar = 2;
        } else {
            retornar = 5;
        }
        return retornar;
        
        
        ////////////////////////////
        /*
        int horasAcumuladas = 0;
        if (Auto.SePuedeRentar()) {
            LocalDate fechaActual = LocalDate.now();
            //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

            for (int i = 0; i < alquileres.length; i++) {
                if (Cliente.getCedula().equals(alquileres[i].Cliente.getCedula())) {
                    LocalDate fechaArray = LocalDate.of(alquileres[i].Fecha.getYear(), alquileres[i].Fecha.getDayOfMonth(), alquileres[i].Fecha.getMonthValue());
                    long dias = DAYS.between(fechaArray, fechaActual);
                    if (dias >= 0 && dias <= 30) {
                        horasAcumuladas = horasAcumuladas + alquileres[i].getHorasAlquiler();
                    }
                }
            }

            /* 
            //forma mia:
            LocalDate fechaActual = LocalDate.now();
            int diaArreglo, mesArreglo,diasMesAnterior, horasAcumuladas = 0;//, contador = 0;
            int mesActual = fechaActual.getMonthValue();
            int diaActual = fechaActual.getDayOfMonth();
            //boolean control = true;
            for (int i = 0; i < alquileres.length; i++) {
                if (Cliente.getCedula().equals(alquileres[i].Cliente.getCedula())) {
                    diaArreglo = alquileres[i].Fecha.getDayOfMonth();
                    mesArreglo = alquileres[i].Fecha.getMonthValue();
                    if (mesActual == mesArreglo) {
                        if (diaActual >= diaArreglo) {
                            horasAcumuladas = horasAcumuladas + alquileres[i].getHorasAlquiler();
                        }
                    } else if ((mesActual) - 1 == mesArreglo) {
                        diasMesAnterior = diasDelMes((mesActual) - 1);
                        if (diaActual <= diaArreglo && diaArreglo <= diasMesAnterior) {
                            horasAcumuladas = horasAcumuladas + alquileres[i].getHorasAlquiler();
                        }
                    }
                }
            }
             /////
        } else {
            return 0;
        }
        int retornar;
        if (horasAcumuladas == 0) {
            retornar = 0;
        } else if (horasAcumuladas >= 20 && horasAcumuladas <= 50) {
            retornar = 2;
        } else {
            retornar = 5;
        }
        return retornar;
        */
        
    }
    /*
    private static int comparar(int mes) {
        return 1;
    }

    private static int diasDelMes(int mes) {
        int mesAnterior = 0;
        switch (mes) {
            case 2:
                mesAnterior = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                mesAnterior = 30;
                break;
            default:
                mesAnterior = 31;
                break;
        }

        return mesAnterior;
    }
     */
}
