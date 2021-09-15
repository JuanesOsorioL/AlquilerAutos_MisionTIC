package principal;
import static java.time.temporal.ChronoUnit.DAYS;
import alquiler.Alquiler;
import auto.Auto;
import cliente.Cliente;
import java.time.*;

public class Principal {


    public static void main(String[] args) {
        
        //datos prueba vector historial
        /*
        LocalDate fecha1A = LocalDate.parse("2021-06-12");
        LocalDate fecha2A = LocalDate.parse("2021-07-12");
        LocalDate fecha3A = LocalDate.parse("2021-07-14");
        LocalDate fecha4A = LocalDate.parse("2021-07-16");

        Auto auto1=new Auto("DBZ645",2,true);
        Auto auto2=new Auto("DBZ645",2,false);
        
        Cliente cliente1=new Cliente("1020419235",32,"juan");
        Cliente cliente2=new Cliente("43428059",58,"nohemy");
        Cliente cliente3=new Cliente("1022148614",13,"mafe");
        
        Alquiler alquileres [];
        alquileres= new Alquiler [5];
        alquileres[0]= new Alquiler(cliente1, auto1, fecha1A, 48);
        alquileres[1]= new Alquiler(cliente2, auto1, fecha2A, 30);
        alquileres[2]= new Alquiler(cliente1, auto1, fecha3A, 25);
        alquileres[3]= new Alquiler(cliente3, auto1, fecha3A, 12);
        alquileres[4]= new Alquiler(cliente1, auto1, fecha4A, 8);
        
        
        //datos prueba
        
        LocalDate fecha1 = LocalDate.parse("2021-08-19");
        LocalDate fecha2 = LocalDate.parse("2021-07-19");
        */
        
        /*
        /////////reto2
        Alquiler prueba=new Alquiler(cliente1,auto1,fecha1,8);
        System.out.println(prueba.ObtenerDescuento(alquileres));
        ///////////
        Alquiler prueba1=new Alquiler(cliente1,auto2,fecha2,8);
        System.out.println(prueba1.ObtenerDescuento(alquileres));
        ////////
        Alquiler prueba2=new Alquiler(cliente1,auto1,fecha2,26);
        System.out.println(prueba2.ObtenerDescuento(alquileres));
        ////////
        Alquiler prueba3=new Alquiler(cliente2,auto1,fecha2,12);
        System.out.println(prueba3.ObtenerDescuento(alquileres));
        ////////
        */
      
        //reto3
        
        /*
        //////parte1
        Alquiler prueba4=new Alquiler(cliente1,auto1,fecha1,8);
        System.out.println(prueba4.CalcularCosto(true));
        //////
        Alquiler prueba5=new Alquiler(cliente1,auto1,fecha1,8);
        System.out.println(prueba5.CalcularCosto(false));
        //////
        Alquiler prueba6=new Alquiler(cliente1,auto1,fecha1,124);
        System.out.println(prueba6.CalcularCosto(true));
        //////parte2
        Alquiler prueba7=new Alquiler(cliente1,auto1,fecha2,26);
        System.out.println(prueba7.ObtenerDescuento(alquileres));
        ////////
        Alquiler prueba8=new Alquiler(cliente2,auto1,fecha2,12);
        System.out.println(prueba8.ObtenerDescuento(alquileres));
        ////////
        */
        
        
        //reto 5
        /// clientes
        Cliente juan=new Cliente("1015143634",23,"juan");
        Cliente mateo=new Cliente("1364726437",33,"Mateo");
        Cliente ana=new Cliente("9685432432",43,"Ana");
        Cliente alfredo=new Cliente("4567987652",50,"Alfredo");
        Cliente gloria=new Cliente("5468978655",58,"Gloria");
        //////
        Cliente camila=new Cliente("9078968512",58,"Camila");
        Cliente liliana=new Cliente("847534654",38,"Liliana");
        Cliente mario=new Cliente("0896756443",23,"Mario");
        //////
        LocalDate fechaprueba = LocalDate.parse("2021-07-16");
        Auto autoprueba=new Auto("DBZ645",2,true);
        int numero=30;
        //////
        Alquiler Historial [];
        Historial= new Alquiler [7];
        Historial[0]= new Alquiler(juan, autoprueba, fechaprueba, numero);
        Historial[1]= new Alquiler(mateo, autoprueba, fechaprueba, numero);
        Historial[2]= new Alquiler(ana, autoprueba, fechaprueba, numero);
        Historial[3]= new Alquiler(juan, autoprueba, fechaprueba, numero);
        Historial[4]= new Alquiler(alfredo, autoprueba, fechaprueba, numero);
        Historial[5]= new Alquiler(gloria, autoprueba, fechaprueba, numero);
        Historial[6]= new Alquiler(juan, autoprueba, fechaprueba, numero);
        
        //prueba 1
        Alquiler prueba1=new Alquiler(juan,autoprueba,fechaprueba,numero);
        System.out.println(prueba1.PuedeAlquilar(Historial, juan));
        //////
        
        //prueba 2
        Historial[0]= new Alquiler(camila, autoprueba, fechaprueba, numero);
        Historial[1]= new Alquiler(mateo, autoprueba, fechaprueba, numero);
        Historial[2]= new Alquiler(ana, autoprueba, fechaprueba, numero);
        Historial[3]= new Alquiler(liliana, autoprueba, fechaprueba, numero);
        Historial[4]= new Alquiler(alfredo, autoprueba, fechaprueba, numero);
        Historial[5]= new Alquiler(gloria, autoprueba, fechaprueba, numero);
        Historial[6]= new Alquiler(mario, autoprueba, fechaprueba, numero);
        /////
        Alquiler prueba2=new Alquiler(juan,autoprueba,fechaprueba,numero);
        System.out.println(prueba2.PuedeAlquilar(Historial, juan));
        //////
        
        
    }

}
