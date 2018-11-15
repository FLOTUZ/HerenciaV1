package herencia;


import java.util.Scanner;

public abstract class Empleado {
    private String nombre;
    private String puesto;
    private byte edad;


    public Empleado(Scanner flujo){
        nombre = flujo.next();
        puesto = flujo.next();
        edad = flujo.nextByte();
    }
    public String toString(){
        return nombre +"\t"+puesto +"\t" + edad + "\t";
    }
    public abstract float calcularSueldo();




}