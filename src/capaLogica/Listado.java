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
public class Listado {
    
    private int id = 0;
    private String talle;
    private String descripcion = "";
    private String genero;
    private String ocasion;
    private String estado = "";
    private String tipo = "";
    

    public Listado(String ta, String desc, String gen, String oc, String est, String tip) {
        id = id++;
        talle = ta;
        descripcion = desc;
        genero = gen;
        ocasion = oc;
        estado = est;
        tipo = tip;
    }

    public Listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getId(){
        return this.id;
    
    }
    
    public String getTalle(){
        return this.talle;
    }
    
    public String getDesc(){
        return this.descripcion;
    }
    
    // setters
    
    public void setDesc(String d){
        this.descripcion = d;
    }
    
    
    
}
