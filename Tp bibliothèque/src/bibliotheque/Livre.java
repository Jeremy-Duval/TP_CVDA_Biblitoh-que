package bibliotheque;

/**
 * Classe Livre
 * @author Jérémy Duval
 * @version  Java 8
 */
public class Livre {

    private int numLivre;

    private String titre;

    private int nombreDePages;

    private Personne auteur;

    private static int dernierNum = -1;
    
    /**
     * Création d'un livre.
     * @param titre : String : nom du livre
     * @param nbPages : int : nombre de pages
     * @param auteur : Personne : personne ayant écrie le perso
     */
    public Livre(String titre, int nbPages, Personne auteur) {
        this.titre = titre;
        this.nombreDePages = nbPages;
        this.auteur = auteur;
        this.setNumLivre(getNumSuivant());
    }

    public int getNumLivre() {
        return this.numLivre;
    }

    public String getTitre() {
        return this.titre;
    }

    public int getNombreDePages() {
        return this.nombreDePages;
    }

    public Personne getAuteur() {
        return this.auteur;
    }

    private int getNumSuivant() {
        dernierNum++;
        return this.dernierNum;
    }

    private void setNumLivre(int numero) {
        this.numLivre = numero;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(Personne p) {
        this.auteur = p;
    }

    public void setNombreDePages(int nbPages) {
        this.nombreDePages = nbPages;
    }

    public String toString() {
        return this.getTitre() + ", " + this.getAuteur().getPrenom() + " " + this.getAuteur().getNom() + ", " + this.getNombreDePages() + "p.";
    }

}
