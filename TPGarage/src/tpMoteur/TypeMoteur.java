/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpMoteur;

/**
 *
 * @author Admin
 */
public enum TypeMoteur {
    
        DIESEL ("Diesel"),
        ESSENCE ("Essence"),
        HYBRIDE ("Hybride"),
        ELECTRIQUE("Electrique");
        
    private String moteurType;
    
    private TypeMoteur(String moteur){
        this.moteurType = moteur;
    }
      
    public String ToString(){
        return moteurType;
    }
}
