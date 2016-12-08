/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Pion;

/**
 *
 * @author Adm
 */
public class Plateau {

    private int _longeur;
    private int _largeur;
    private Pion _tab[][];
    
public void affichage () {
    System.out.println("-----------------");
    for(int i = 0; i < this._longeur; i++){
        for(int j = 0; j < this._largeur; j++){
            System.out.print("|" + this._tab[i][j].getCouleur());
        }
        System.out.println("|\n" + "-----------------");
    }
}

        
    public Plateau(){
        this._longeur = 5;
        this._largeur = 5;
        
        this._tab = new Pion[_longeur][_largeur];
        
        for(int i = 0; i < this._longeur; i++){
            for(int j = 0; j < this._largeur; j++){
                this._tab[i][j].setCouleur(' ');
                
                // Initialisation des Sorties, représenté par le caractère S
                if((i == 0 && j == 0) || (i == 0 && j == (this._largeur - 1)) 
                    || (i == (this._longeur - 1) && j == 0) 
                    || (i == (this._longeur - 1) && j == (this._largeur -1))){
                    
                    this._tab[i][j].setCouleur('S');
                    this._tab[i][j].setLibre(false);
                }
                    
                // Initialisation du Personnel, représenté par le caractère P
                if((i == 0 && j == 1) || (i == (this._longeur -1) && j == 1) 
                    || (i == 0 && j == (this._largeur - 2)) 
                    || (i == (this._longeur -1) && j == (this._largeur - 2))){
                    
                    this._tab[i][j].setCouleur('P');
                    this._tab[i][j].setLibre(false);
                }
                    
            }
        } 
        
    }
    
    public Plateau(int x, int y){
        this._longeur = x;
        this._largeur = y;
        
        this._tab = new Pion[_longeur][_largeur];
        
        for(int i = 0; i < this._longeur; i++){
            
            for(int j = 0; j < this._largeur; j++){
                this._tab[i][j] = new Pion();
                this._tab[i][j].setCouleur(' ');
                
                // Initialisation des Sorties, représenté par le caractère S
                if((i == 0 && j == 0) || (i == 0 && j == (this._largeur - 1)) 
                    || (i == (this._longeur - 1) && j == 0) 
                    || (i == (this._longeur - 1) && j == (this._largeur -1))){
                    
                    this._tab[i][j].setCouleur('S');
                    this._tab[i][j].setLibre(false);
                }
                    
                // Initialisation du Personnel, représenté par le caractère P
                if((i == 0 && j == 1) || (i == (this._longeur -1) && j == 1) 
                    || (i == 0 && j == (this._largeur - 2)) 
                    || (i == (this._longeur -1) && j == (this._largeur - 2))){
                    
                    this._tab[i][j].setCouleur('P');
                    this._tab[i][j].setLibre(false);
                }
                    
            }
        } 
    }
    
    /**
     * @return the _longeur
     */
    public int getLongeur() {
        return _longeur;
    }

    /**
     * @param _longeur the _longeur to set
     */
    public void setLongeur(int _longeur) {
        this._longeur = _longeur;
    }

    /**
     * @return the _largeur
     */
    public int getLargeur() {
        return _largeur;
    }

    /**
     * @param _largeur the _largeur to set
     */
    public void setLargeur(int _largeur) {
        this._largeur = _largeur;
    }

    /**
     * @return the _tab
     */
    public Pion[][] getTab() {
        return _tab;
    }

    /**
     * @param _tab the _tab to set
     */
    public void setTab(Pion[][] _tab) {
        this._tab = _tab;
    }
    
    public Pion getPion(int _x, int _y){
        return this._tab[_x][_y];
    }
    
    public void setPion(int _x, int _y, char couleur){
        this._tab[_x][_y].setCouleur(couleur);
    }
}
