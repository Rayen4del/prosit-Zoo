public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean mammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=mammal;
    }
    // Méthode toString()
    @Override
    public String toString() {
        return "Animal{" + "family='" + family + '\'' + ", name='" + name + '\'' + ", age=" + age + ", isMammal=" + isMammal + '}';
    }
}

