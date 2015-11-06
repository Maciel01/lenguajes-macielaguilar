
package Examen;

import java.io.Serializable;

public class Nomina implements Serializable {
    private Empleado empleado;
    private Departamento departamento;

    public Nomina() {
    }
    
    public Nomina(Empleado empleado, Departamento departamento){
        this.empleado=empleado;
        this.departamento=departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
