package herencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("datos.txt");
        Scanner flujo = new Scanner(archivo);

        Empleado obj[]= new Empleado [5];
        for (byte i = 0; i < obj.length; i++) {
            String tipo = flujo.next();
            if (tipo.compareTo("Base")==0)  obj[i]=new EmpleadoBase(flujo);
            if (tipo.compareTo("Eventual")==0)  obj[i]= new EmpleadoEventual(flujo);
            else {  obj[i] = new EmpleadoEventualEspecializado(flujo);  }
        }

        for (int i = 0; i < obj.length ; i++) {
            String tipo = "Base";
            if (obj[i] instanceof EmpleadoEventualEspecializado)tipo="Especializado";
            else if (obj[i] instanceof EmpleadoEventual)tipo="Eventual";
            System.out.println("Empleado: "+tipo+ "\t"+obj[i]);


        }

        float mayor=0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].calcularSueldo()>mayor)
                mayor=obj[i].calcularSueldo();
        }

        for (int j = 0; j < obj.length; j++) {
            if (obj[j].calcularSueldo()==mayor)
                System.out.println("El empleado con sueldo mayor es: " +obj[j]);

        }
    }
}
