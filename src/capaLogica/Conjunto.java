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
public class Conjunto {
    
    private String item1;
    private String item2;
    
    Conjunto(String itm1, String itm2){
        item1 = itm1;
        item2 = itm2;
    }
    
    public String getItem1 () {
        return item1;
    }
    
    public String getItem2 () {
        return item2;
    }
    
    public void setItem1(String item1){
        this.item1 = item1;
    }
    
    public void setItem2(String item2){
        this.item2 = item2;
    }
}
