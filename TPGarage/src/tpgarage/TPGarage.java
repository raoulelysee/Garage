/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgarage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import tpOption.BarreDeToit;
import tpOption.SiegeChauffant;
import tpVehicule.Lagouna;
import tpVehicule.Vehicule;

/**
 *
 * @author Admin
 */
public class TPGarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicule A1 = new Lagouna(); 
A1.addOption(new BarreDeToit(120, "Barre"));
A1.addOption(new SiegeChauffant());

        System.out.println(A1);

    }
    
}
