package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;
    public Animal(){

    }
    public Animal(String family, String name, int age, boolean mammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = mammal;
    }
    //getters
    public String getFamily(){
        return family;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isMammal(){
        return isMammal;
    }
    //setters
    public void setFamily(String family){
        this.family=family;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Erreur: l'age de l'animale ne peut pas etre négatif");
            this.age=0;
        }else{
            this.age=age;
        }
    }
    public void setMammal(boolean isMammal){
        this.isMammal=isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" + "family='" + family + '\'' + ", name='" + name + '\''
                + ", age=" + age + ", isMammal=" + isMammal + '}';
    }
}