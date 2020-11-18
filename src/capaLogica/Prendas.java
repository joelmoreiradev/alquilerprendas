/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

import capaGrafica.Interfaz;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Alumno
 */
public class Prendas {
    
    // array donde se guardan los datos de las prendas.
    public static ArrayList <Prenda> listaPrendas = new ArrayList <Prenda>();
    
    // 
    public static ArrayList <Conjunto> listaConjuntos = new ArrayList <Conjunto>();
    
    public static ArrayList <Cliente> listaClientes = new ArrayList <Cliente>();
    
    // agrego los valores recibidos de la clase ingresarPrenda al arrayList
    public void agregarPrenda(String ta, String desc, String gen, String oc, String est, String tip){
     
        // agregar los parámetros recibidos del método en el array.
        listaPrendas.add(new Prenda(ta, desc, gen, oc, est, tip));
        
        
    }
    
    public void agregarConjunto(String item1, String item2){
     
        // agregar los parámetros recibidos del método en el array.
        listaConjuntos.add(new Conjunto(item1, item2));
        
        
    }
    
    public void agregarCliente(String name, String surname, String phone, String address, String dni){
    listaClientes.add(new Cliente(name, surname, phone, address, dni));
    }
    
    public String getDes(){
        return "La descripción es "+listaPrendas.get(0).getDescripcion(); 
    }
    
    
    public ArrayList<Prenda> getListaPrendas() {
     return new ArrayList<Prenda>(listaPrendas);
 }
    
    // quiero que este método retorne algun valor de una prenda,
    // y llamarlo desde Interfaz con el botón "actualizar".
    
    
    
   
    
    
    // método para cambiar el estado de la prenda
    public void editarPrenda(String est, int id){
        
        // agregar los parámetros recibidos del mètodo en el array.
        
        System.out.println(est);   
        
        for(int i = 0; i < listaPrendas.size(); i++){
            if(listaPrendas.get(i).getId() == id ){
                listaPrendas.get(i).setEstado(est);
            }
        }
        
    }
    
    public void eliminarPrenda(int id){
    
        for(int i = 0; i < listaPrendas.size(); i++){
            if(listaPrendas.get(i).getId() == id ){
                listaPrendas.remove(id);
            }
        }
    
    }
    
    public void armarConjunto(int id, int id2){
        
    }
    
    
    
}
