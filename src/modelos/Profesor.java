package modelos;

import java.util.ArrayList;

public class Profesor {

    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    private ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono,  int añosdeTrabajo, String facultad, double BonoFijo, ArrayList<Paralelo> paralelos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.añosdeTrabajo = añosdeTrabajo;
        this.facultad = facultad;
        this.BonoFijo = BonoFijo;
        this.paralelos = paralelos;
    }
    

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos = new ArrayList<>();
    }

    public void anadirParalelos(Paralelo p) {
        getParalelos().add(p);
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

 

    /**
     * @return the añosdeTrabajo
     */
    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    /**
     * @param añosdeTrabajo the añosdeTrabajo to set
     */
    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the BonoFijo
     */
    public double getBonoFijo() {
        return BonoFijo;
    }

    /**
     * @param BonoFijo the BonoFijo to set
     */
    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }

    /**
     * @return the paralelos
     */
    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    /**
     * @param paralelos the paralelos to set
     */
    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

}
