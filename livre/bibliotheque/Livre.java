package bibliotheque;

/** 
 *  
 *  @author Amelie
 */
public class Livre {
  /* {author=Amelie
 }*/


  private int NumLivre;

  private String titre;

  private int nombreDePages;

  private Personne auteur;

  private static int dernierNum;

  public Livre(String titre, int nbpages, Personne auteur) {

  }

  public int getNumLivre() {
        return 0;
  }

  public String getTitre() {
        return "";
  }

  public int getNombreDePages() {
        return 0;
  }

  public Personne getAuteur() {
        Personne p = new Personne("", "", 0);
        return p;
  }

  public void setNumLivre(int numero) {

  }

  public void setTitre(String titre) {

  }

  public void setAuteur(Personne p) {

  }

  public void setNombreDePages(int nbPages) {

  }

  public String toString() {
        return "";
  }

}