/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgarage;

import tpVehicule.Vehicule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Garage {
    
    List<Vehicule> voitures = new ArrayList<Vehicule>();
    
    protected void addVoiture(Vehicule voit){
        List<Vehicule> voitures = new ArrayList<>();
        voitures.add(voit);
    }
}
