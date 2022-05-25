/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class Noeud {
    Noeud prochain;
    int valeur; 
    public Noeud(Noeud adresse, int element)
    {
       this.prochain = adresse;
       this.valeur = element;
    }
}
