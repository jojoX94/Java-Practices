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

  // Modificateur
    public void setNbPages(int n) {
        nbPages = n;
    }

    public static void main(String[] args) {
        Livre l1 = new Livre("John", "Titre 1");
        Livre l2 = new Livre("Marie", "Titre 2");

        System.out.println("L'auteur du livre Titre 1 est "+ l1.getAuteur());
        System.out.println("L'auteur du livre Titre 2 est "+ l2.getAuteur());
    }

}