
package Examen;

import java.io.Serializable;


public class Empleado implements Serializable{
    private String nombre;
    private String paterno;
    private long seguroSocial;
    private float sueldoBase;
    private int horasExtras;
    
    public Empleado(String nombre, String paterno, long seguroSocial, float sueldoBase, int horasExtras){;
    this.nombre=nombre;
    this.paterno=paterno;
    this.seguroSocial=seguroSocial;
    this.sueldoBase=sueldoBase;
    this.horasExtras=horasExtras;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public long getSeguroSocial() {
        return seguroSocial;
    }

    public void setSeguroSocial(long seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}