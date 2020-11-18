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
public class Prenda {
    
    // Variables donde se guardarán los datos ingresados desde la interfáz
    // talle, descripción, genero, ocasión, estado
    private int id = 0;
    private String talle;
    private String descripcion = "";
    private String genero;
    private String ocasion;
    private String estado = "";
    private String tipo = "";
    
    Prenda(String ta, String desc, String gen, String oc, String est, String tip){
        id = id++;
        talle = ta;
        descripcion = desc;
        genero = gen;
        ocasion = oc;
        estado = est;
        tipo = tip;
        
    }

    Prenda(String est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId(){
        return this.id;
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
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
     
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    
}
