/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpVehicule;

import tpOption.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Admin
 */
 public abstract class Vehicule {

    public double prix;
    public String nom;
    Marque nomMarque;
    List<Option> options = new ArrayList<Option>();

   
public Vehicule(){
    
}

    public Marque getMarque() {

        return nomMarque;
    }

    public List<Option> getOptions() {
        
        return options;
    }

    public double getPrix() {
        return prix;
    }
    
    public void addOption(Option opt){
         
        options.add(opt);
        
    }      
  
        public String toString(){ 
   
       return "+ Voiture " +nomMarque+ " : " +nom+ " Moteur " +prix+  "$" + " les options choisis sont " +options+ " .";
   }
}
