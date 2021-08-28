package principal;
import static java.time.temporal.ChronoUnit.DAYS;
import alquiler.Alquiler;
import auto.Auto;
import cliente.Cliente;
import java.time.*;

public class Principal {


    public static void main(String[] args) {
        //LocalDate fecha1A = LocalDate.parse("2021-06-12");
        LocalDate fecha1A = LocalDate.parse("2021-07-15");
        LocalDate fecha2A = LocalDate.parse("2021-07-12");
        LocalDate fecha3A = LocalDate.parse("2021-07-14");
        LocalDate fecha4A = LocalDate.parse("2021-06-16");

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

/*
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        LocalDate fechafin = LocalDate.parse("2021/08/28");
        System.out.println(fechafin);
        long dias = DAYS.between(fechafin, fechaActual);
        System.out.println(dias);
        */
        
        //Alquiler valor1= new Alquiler(cliente1,auto1,'12/06/2021',48);
        //alquileres[0]=
        //LocalDate ahora = '12/06/2021';
        //System.out.println(ahora);
    }

}
