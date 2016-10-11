/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpVehicule;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import tpOption.Option;
import static tpVehicule.Marque.RENO;

/**
 *
 * @author Admin
 */
public class Lagouna extends Vehicule{

    public String nom = "Lagouna";
    public double prix = 2000.00;
    public Marque nomMarque = RENO;
    
    

   
    public void getNom(String nom) {
        this.nom = nom;
    }

    public void getPrix(double prix) {
        this.prix = prix;
    }
    

    
   @Override
     public String toString(){
//         String result ="";
//         ListIterator<Option> iterator = getOptions().listIterator();
//         while(iterator.hasNext()){
//             result += (iterator.next());
//            result += ", ";
//         }
         
       return "+ Voiture " +nomMarque+ " : " +nom+ " Moteur " +prix+  "$" + " les options choisis sont " +options+ " .";
  }
}
