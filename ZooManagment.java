import java.util.Scanner;
public class ZooManagment {
    int nbrCage;
    String zooName;
    public void insertion() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez le nom de votre Zoo");
            zooName = sc.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("Le nom du Zoo ne peut pas être vide");
            }
        } while (zooName.isEmpty());
        do {
            System.out.println("Entrez le nombre de cages dans le zoo");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier valide");
                sc.next();
                System.out.println("Entrez le nombre de cages dans le zoo");
            }
            nbrCage = sc.nextInt();
            if (nbrCage <= 0) {
                System.out.println("Le nombre de cages doit être positif");
            }
        } while (nbrCage <= 0);
    }
}
