package herencia;

import java.util.Scanner;

public class EmpleadoEventual extends Empleado implements Conductas{
    protected byte horas;
    protected float pagoHora;
    public float calcularSueldo(){
        return horas*pagoHora;
    }

    public EmpleadoEventual(){

    }
    public EmpleadoEventual(Scanner flujo){
        super(flujo);
        horas = flujo.nextByte();
        pagoHora = flujo.nextFloat();
    }
    public String toString(){
        return super.toString() + horas +"\t"+ pagoHora +"\t"+ this.calcularSueldo();
    }

}
