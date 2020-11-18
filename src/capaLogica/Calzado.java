/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author Alumno
 */
public class Calzado {
    
    // Variables donde se guardarán los datos ingresados desde la interfáz
    // talle, descripción, genero, ocasión, estado
    private int id2 = 0;
    private String talle;
    private String descripcion = "";
    private String genero;
    private String ocasion;
    private String estado = "";
    
    Calzado(String ta, String desc, String gen, String oc, String est){
        id2 = id2++;
        talle = ta;
        descripcion = desc;
        genero = gen;
        ocasion = oc;
        estado = est;
        
    }
    
    public int getId(){
        return this.id2;
    }
    
    public String getTalle(){
        return this.talle;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getOcasion(){
        return this.ocasion;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setId(int id2){
        this.id2 = id2;
    }
    
     public void setEstado(String estado){
        this.estado = estado;
    }
     
}
