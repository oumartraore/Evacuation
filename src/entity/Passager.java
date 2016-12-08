/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Pion;
import entity.Plateau;

/**
 *
 * @author Adm
 */
public class Passager extends Pion {
    
    
    public Passager(){
        
    }
 
    public boolean initialisation (Plateau grille, int _x, int _y) {
        if(! grille.getPion(_x, _y).isLibre()){
            return false;
        }
            
        return true;
    }
            
    public void rechercherPersonnel(){
       
    }
    
}
