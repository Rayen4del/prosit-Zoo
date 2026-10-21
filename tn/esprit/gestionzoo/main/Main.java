package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

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
        // ===== Instruction 21 : constructeurs par défaut =====
        Aquatic a1 = new Aquatic();
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();
        System.out.println("Instanciation avec constructeurs par défaut OK");

        // ===== Instruction 22 : constructeurs paramétrés =====
        Aquatic a2 = new Aquatic("Fish", "Nemo", 2, false, "océan");
        Terrestrial t2 = new Terrestrial("Feline", "Simba", 5, true, 4);
        Dolphin d2 = new Dolphin("Delphinidae", "Flipper", 8, true, "mer", 45.5f);
        Penguin p2 = new Penguin("Spheniscidae", "Happy Feet", 3, true, "Antarctique", 120.0f);

        // ===== Instruction 23 : affichage avec toString =====
        System.out.println("\n--- toString ---");
        System.out.println(a2);
        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        // ===== Instruction 24 : appel de swim() =====
        System.out.println("\n--- swim() ---");
        a2.swim();          // This aquatic animal is swimming.
        d2.swim();          // This dolphin is swimming.
        p2.swim();          // This aquatic animal is swimming. (hérité de Aquatic)
    }
}