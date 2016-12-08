/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import engine.Initialisation;

/**
 *
 * @author Adm
 */
public class Engine {
    public Engine(){
        
    }
    
    public void start(){
        Initialisation jeu = new Initialisation();
        
        jeu.start();
    }
}
