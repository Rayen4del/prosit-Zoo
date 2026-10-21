package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.zoo;
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felyne", "Felix_2", 5, true);
        Animal elephant = new Animal("Elephant", "Khabib", 10, true);
        Animal serpent = new Animal("Serpent", "Noodle", 2, false);
        zoo myzoo = new zoo("Belvedére", "Tunis");
        zoo zoo2 = new zoo("Safari", "Hammamet");
        System.out.println("Ajout lion : " + myzoo.addAnimal(lion));
        System.out.println("Ajout elephant : " + myzoo.addAnimal(elephant));
        System.out.println("Ajout serpent : " + myzoo.addAnimal(serpent));
        myzoo.display();
        System.out.println(myzoo);
        myzoo.displayAnimals();
        System.out.println("Indice du lion : " + myzoo.searchAnimal(lion));
        Animal lionCopie = new Animal("Felyne", "Felix_2", 5, true);
        System.out.println("Indice de lionCopie : " + myzoo.searchAnimal(lionCopie));
        System.out.println("Ajout doublon : " + myzoo.addAnimal(lionCopie)); // false
        for (int i = 0; i < 30; i++) {
            if (!zoo2.addAnimal(new Animal("Famille", "Animal" + i, i, true))) {
                System.out.println("Animal" + i + " refusé (zoo plein)");
            }
        }
        System.out.println("zoo2 plein ? " + zoo2.isZooFull());
        System.out.println("Suppression serpent : " + myzoo.removeAnimal(serpent));
        System.out.println("Suppression serpent (2e fois) : " + myzoo.removeAnimal(serpent));
        myzoo.displayAnimals();
        System.out.println("Plus grand zoo : " + zoo.comparerZoo(myzoo, zoo2));
    }
}