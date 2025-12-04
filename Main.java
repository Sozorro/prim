public class Main {
    public static void main(String[] args) {
        Storyteller storyteller = new Storyteller();
        storyteller.setAtmosphere(new Atmosphere());
        storyteller.printAtmosphere();
        Storyteller storyteller2 = new Storyteller();
        storyteller2.setAtmosphere(storyteller.atmosphere);
        storyteller2.printAtmosphere();
        //Animal.eat();
        //Dog animal = new Dog();
        Animal.eat();
    }
}
abstract class Animal  {
    static void eat(){
        System.out.println("Животное ест");
    }
    void makeSound();
}
abstract class Dog extends Animal {
   
}

class Human {
    protected Atmosphere atmosphere;
    /*protected void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }*/
}
class Atmosphere {
    Atmosphere() {
        System.out.println(this);
    }
}
class Storyteller extends Human {
    public void printAtmosphere() {
        System.out.println(atmosphere);
    }
    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }
}