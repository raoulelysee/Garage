/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpOption;

import tpOption.Option;

/**
 *
 * @author Admin
 */
public class SiegeChauffant implements Option{

    private double prix = 200.00;
    private String nom = "Siege chauffant";
    
    public SiegeChauffant() {
        this.prix = prix;
        this.nom = nom;
    }
    
    public double getPrix(){
        return 375.00;
    }
    public String ToString(){
        return nom+" ("+prix+"),";
    }
}
