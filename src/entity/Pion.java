/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Adm
 */
public class Pion {
    private boolean _libre;
    private char _couleur;
    
    public Pion() {
        this._libre = true;
    }
    
    /**
     * @return the libre
     */
    public boolean isLibre() {
        return _libre;
    }

    /**
     * @param libre the libre to set
     */
    public void setLibre(boolean _libre) {
        this._libre = _libre;
    }
    
    /**
     * @return the couleur
     */
    public char getCouleur() {
        return _couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(char couleur) {
        this._couleur = couleur;
    }
    
}
