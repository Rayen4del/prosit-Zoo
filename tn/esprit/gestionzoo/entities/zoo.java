package tn.esprit.gestionzoo.entities;

public class zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrcages = 25;
    int animalCount = 0;
    public zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrcages];
    }
    //getters
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }

    public int getNbrcages() {
        return nbrcages;
    }
    public Animal[] getAnimals(){
        return animals;
    }
    //setters
    public void setName(String name){
        if(name==null || name.trim().isEmpty()){
            System.out.println("Erreur le nom du zoo ne peut pas étre vide");
            this.name="Nom par defaut";
        }else {
            this.name=name;
        }
    }
    public void setCity(String city){
        this.city=city;
    }

    public void display() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de Cages : " + nbrcages);
    }
    @Override
    public String toString() {
        return "Zoo{" + "name='" + name + '\'' + ", city='" + city + '\''
                + ", nbrCages=" + nbrcages + ", animalCount=" + animalCount + '}';
    }
    public boolean addAnimal(Animal animal) {
        if (animal == null) return false;
        if (isZooFull()) return false;
        if (searchAnimal(animal) != -1) return false;
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }
    public void displayAnimals() {
        System.out.println("Animaux de " + name + " (" + animalCount + ") :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("  " + i + " -> " + animals[i]);
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
    public boolean isZooFull() {
        return animalCount >= nbrcages;
    }
    public static zoo comparerZoo(zoo z1, zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }
}