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
class TestLivre {
  public static void main(String[] args) {
        Livre l1 = new Livre("Toto", "Titre 1");
        Livre l2 = new Livre("Titi", "Titre 2");
        l1.setNbPages(-2);
        l2.setNbPages(3);
        System.out.println("Le nombre total de pages est "+ (l1.getNbPages()+l2.getNbPages()));
  }
}

