
package model;


public class Direccion {
    private String calle;
    private String colonia;
    private String municipio;

    public Direccion() {
    }
/**
 * Este constructor sirve para crear una direccion.
 * @param calle este parametro es el valor de la calle.
 * @param colonia este parametro es el valor de la colonia.
 * @param municipio este parametro es el valor de municipio. 
 */
    public Direccion(String calle, String colonia, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
    }

    /**
     * @return este metodo te regresa el valor que tiene el atributo calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle en este metodo debes de poner dentro del parentasis el valor
     * que desees que tenga la calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}