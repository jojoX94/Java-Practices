public class TestLivre {
    public static void main(String[] args) {
          Livre l1 = new Livre("Toto", "Titre 1");
          Livre l2 = new Livre("Titi", "Titre 2");
          l1.setNbPages(-2);
          l2.setNbPages(3);
          System.out.println("Le nombre total de pages est "+ (l1.getNbPages()+l2.getNbPages()));
    }
}