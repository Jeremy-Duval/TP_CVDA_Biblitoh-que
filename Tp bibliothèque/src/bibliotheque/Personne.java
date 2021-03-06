/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 * Classe Personne
 * @author Jérémy Duval
 * @version  Java 8
 */
public class Personne {
    private int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissancePersonne;
    private static int dernierNumero = 0;
    
    /**
     * Création d'une personne. 
     * @param nom : String : nom de la personne
     * @param prenom : String : prenom de la personne
     * @param date : int : date de naissance de la personne
     */
    public Personne(String nom, String prenom, int date){
        this.setNumPers();
        this.nomPers = nom;
        this.prenomPers = prenom;
        this.anNaissancePersonne = date;
    }
    /**
     * Renvoie le numero de personne
     * @return numeroPers : int : numero de la personne
     * @author Jérémy Duval
     * @version  Java 8
     */
    public int getNumero(){
        return this.numeroPers;
    }
    /**
     * Renvoie le nom de la personne
     * @return nomPers : String : nom de la personne
     * @author Jérémy Duval
     * @version  Java 8
     */
    public String getNom(){
        return this.nomPers;
    }
    /**
     * Renvoie le prénom de la personne
     * @return prenomPers : String : prénom de la personne
     * @author Jérémy Duval
     * @version  Java 8
     */
    public String getPrenom(){
        return this.prenomPers;
    }
    
    public int getAnNaissance() {
        return this.anNaissancePersonne;
    }
    /**
     * Renvoie le dernier numero de personne
     * @return dernierNumero : int : renvoi le dernier numero de personne
     * @author Jérémy Duval
     * @version  Java 8
     */
    public int getDernierNumero(){
        return dernierNumero; 
    }
    
    /**************************************************************************/
    
    /**
     * Change le numero de personne 
     * @author Jérémy Duval
     * @version  Java 8
     */
    public void setNumPers(){
        dernierNumero = getDernierNumero()+1;
        this.numeroPers = this.getDernierNumero();
    }
    /**
     * Change le nom de personne
     * @param nom : String : nouveau nom de personne 
     * @author Jérémy Duval
     * @version  Java 8
     */
    public void setNomPers(String nom) {
        this.nomPers = nom;
    }
    /**
     * Change le prenom de personne
     * @param prenom : String : nouveau prenom de personne 
     * @author Jérémy Duval
     * @version  Java 8
     */
    public void setPrenomPers(String prenom) {
        this.prenomPers = prenom;
    }
    /**
     * Change l'année de naissance
     * @param annee : int : nouvelle année de naissance
     * @author Jérémy Duval
     * @version  Java 8
     */
    public void setAnNaissance(int annee) {
        this.anNaissancePersonne = annee;
    }
    
    /**************************************************************************/
    
    /**
     * Redéfinition de toString()
     * @return String : les informations de la personne
     * @author Jérémy Duval
     * @version  Java 8
     */
    @Override
    public String toString(){
        return this.nomPers + ", " + this.prenomPers + ", " + this.anNaissancePersonne;
    }
}
