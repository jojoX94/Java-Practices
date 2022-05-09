public class Livre {
  // Variables d'instance
  private String titre, auteur;
  private int nbPages;

// Constructeur
  public Livre(String unAuteur, String unTitre) {
      auteur = unAuteur;
      titre = unTitre;
  }

// Accesseur
  public String getAuteur() {
      return auteur;
  }

  public String getTitre() {
      return titre;
  }

  public int getNbPages() {
      return nbPages;
  }

// Modificateur
  public void setTitre(String t) {
      titre = t;
  }

  public void setAuteur(String a) {
      auteur = a;
  }

  public void setNbPages(int n) {
      if(n > 0) {
        nbPages = n;
        return;
      }
      System.out.println("Erreur - Le nombre passe en parametre au livre "+ titre + " doit etre positive");
  }
}