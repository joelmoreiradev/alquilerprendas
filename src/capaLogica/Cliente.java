/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author joelmoreira31
 */
public class Cliente {
    
    // nombre apellido telefono direccion cedula
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String cedula;
    
    Cliente(String name, String surname, String phone, String address, String dni){
        nombre = name;
        apellido = surname;
        telefono = phone;
        direccion = address;
        cedula = dni;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public String getApellido () {
        return apellido;
    }
    
    public String getTelefono () {
        return telefono;
    }
    
    public String getDireccion () {
        return direccion;
    }
    
    public String getCedula () {
        return cedula;
    }
    
    public void setNombre(String name){
        this.nombre = name;
    }
    
    public void setApellido(String surname){
        this.apellido = surname;
    }
    
    public void setTelefono(String phone){
        this.telefono = phone;
    }
    
    public void setDireccion(String address){
        this.direccion = address;
    }
    
    public void setCedula(String dni){
        this.cedula = dni;
    }
}
