/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import entity.Plateau;
import entity.Passager;

/**
 *
 * @author THIAM
 */
public class Initialisation {
    private Plateau grille;
    private Passager passager[];
    
    
    public Initialisation(){
        int nbPassager = 10;
        int nbLigne = 5;
        int nbColonne = 8;
        
        grille = new Plateau(nbLigne, nbColonne);
        passager = new Passager[nbPassager];
        
        int countPassagerInit = 0;
        for(int i = 1; i < nbColonne - 1; i++){
            passager[countPassagerInit] = new Passager();
            
            /*if( passager[countPassagerInit].initialisation(grille, 1, i) ) {
                grille.setPion(i, i, 'A');
                countPassagerInit++;
            }*/
            
        }
        
    }
    
    public void start(){
        
        
        
    
        grille.affichage();
        
    }
    
    
}
