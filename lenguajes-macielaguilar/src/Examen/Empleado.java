
package Examen;

import java.io.Serializable;


public class Empleado implements Serializable{
    String nombre;
    String paterno;
    long seguroSocial;
    float sueldoBase;
    int horasExtras;
    
    public Empleado(String nombre, String paterno, long seguroSocial, float sueldoBase, int horasExtras){;
    this.nombre=nombre;
    this.paterno=paterno;
    this.seguroSocial=seguroSocial;
    this.sueldoBase=sueldoBase;
    this.horasExtras=horasExtras;
}
}