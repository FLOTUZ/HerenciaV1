package herencia;

import java.util.Scanner;

public class EmpleadoBase extends Empleado{
    private float sueldoBase;
    private byte faltas;
    public float calcularSueldo(){
        return sueldoBase - sueldoBase/6 * faltas;
    }

    public EmpleadoBase(){

    }
    public EmpleadoBase(Scanner flujo){
        super(flujo);
        sueldoBase = flujo.nextFloat();
        faltas = flujo.nextByte();
    }
    public String toString(){
        return super.toString() + sueldoBase +"\t"+faltas +"\t"+this.calcularSueldo();
    }
}
