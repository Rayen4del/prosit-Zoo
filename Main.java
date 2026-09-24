public class Main {
    public  static void main(String[] args) {
        ZooManagment Zoo = new ZooManagment();
        Animal lion=new Animal("Felyne","Felix_2",5, true);
        Animal Elephant=new Animal("Elephant","Khabib",10, true);
        Animal serpent=new Animal("Serpent","Noodle",2, false);
        zoo myzoo=new zoo("Belvedére","Tunis", 20);
        myzoo.animals[0]=lion;
        myzoo.animals[1]=Elephant;
        myzoo.animals[2]=serpent;
        myzoo.display();
        //methode 1 system.out.println(myzoo)
        System.out.println(myzoo);
        //on remarque un retour de la reférence de zoo dans la mémoire et pas nos variables
        //methode 2 avec toString()
        System.out.println(myzoo.toString());
        //On remarque un affichage correct
        // Afficher directement un animal
        System.out.println(lion);
        System.out.println(Elephant);
        System.out.println(serpent);
        Zoo.insertion();
        System.out.println(
                "Le zoo " + Zoo.zooName +
                        " comporte : " + Zoo.nbrCage + " cages"
        );
    }
}

