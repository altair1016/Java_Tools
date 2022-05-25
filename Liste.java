/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class Liste {
    private Noeud testa;
    
    public Liste()
    {
        testa = null;
    }
    
    public void aggiungiPrimo(int valore)
    {
        this.testa.valeur = valore; 
        this.testa.prochain = null;
    }
    
    public void aggiungi(int valore)
    {
        
    }
}
