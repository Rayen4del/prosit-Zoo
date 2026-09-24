public class zoo {
    Animal[] animals=new Animal[25];
    String name;
    String city;
    int nbrcages;
    public zoo(String name, String city, int nbrcages){
        this.name=name;
        this.city=city;
        this.nbrcages=nbrcages;
    }
    public void display(){
        System.out.println("Nom du zoo" + name);
        System.out.println("Ville du zoo" + city);
        System.out.println("Nombre de Cages" + nbrcages);
    }
    //methode toString()
    @Override
    public String toString() { return "Zoo{" + "name='" + name + '\'' + ", city='" + city + '\'' + ", nbrCages=" + nbrcages + '}'; }
}
