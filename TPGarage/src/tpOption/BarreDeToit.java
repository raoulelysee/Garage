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
public class BarreDeToit implements Option{

    public double prix = 200.00;
    public String nom = "Barre de toit";
    
    public BarreDeToit(){
        this.prix = prix;
        this.nom = nom;
        
    }
    public BarreDeToit(double prix, String nom){
        this.prix = prix;
        this.nom = nom;
    }
    @Override
    public double getPrix() {
        return prix;
    }
    
    public void setPrix(double prix){
        this.prix = prix;
    }
    
    public String ToString(){
        String quoi = nom+" ("+prix+"),";
        return quoi;
    }
}
