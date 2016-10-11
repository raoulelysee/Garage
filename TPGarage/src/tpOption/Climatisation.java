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
public class Climatisation implements Option{

    private double prix;
    private String nomOption;
    
    public Climatisation() {
        this.prix = 525.00;
        this.nomOption = "Climatisation";
    }
    
    
//    @Override
//    public double getPrix(){
//        return 525.00;
//    }

    @Override
    public double getPrix() {
        return 1500.00; //To change body of generated methods, choose Tools | Templates.
    }

}
