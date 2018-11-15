package herencia;

import java.util.Scanner;

public class EmpleadoEventualEspecializado extends EmpleadoEventual implements Conductas {

    public EmpleadoEventualEspecializado () {

    }

    public EmpleadoEventualEspecializado (Scanner flujo){
        super (flujo);
        this.pagoHora=pagoHora*1.50f;
    }


}