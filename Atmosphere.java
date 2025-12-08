import java.util.ArrayList;

public class Atmosphere {
    private int time = 0;
    private Star stars = Star.getStar(this, false);
    private Sun sun = Sun.getSun(this, true);
    private ArrayList<Human> humans = new ArrayList<>();
    private ArrayList<Prince> princes = new ArrayList<>();
    private ArrayList<Sheep> sheeps = new ArrayList<>();
    private ArrayList<Rose> roses = new ArrayList<>();
    private ArrayList<Body> bodies = new ArrayList<>();

    public ArrayList<Body> skipTime(int n) {
        ArrayList<Body> dead = new ArrayList<>();
        time += n;
        if(n % 2 != 0) {
            changeTimeDay();
        }
        for (int i = 0; i < humans.size(); ++i){
            int age = humans.get(i).addAge(n);
            if(age >= 90) {
                if(humans.get(i) instanceof Prince) {
                    System.out.println("К сожалению, принц сегодня скончался");
                }
                Body newBody = new Body(humans.get(i).getAtmosphere(), humans.get(i).getName(), humans.get(i).getAge());
                humans.remove(humans.get(i));
                dead.add(newBody);
                bodies.add(newBody);
            }
            else {
                humans.get(i).updateEmotion(Emotion.NEUTRAL);
            }
        }
        return dead;
    }
    public Body removeHumans(Human human) {
        Body newBody = new Body(human.getAtmosphere(), human.getName(), human.getAge());
        humans.remove(human);
        bodies.add(newBody);
        return newBody;
    }
    public void whoIsLive() {
        System.out.println("Сейчас в живых:");
        for (int i = 0; i < humans.size(); ++i){
            if(humans.get(i) instanceof Prince) {
                System.out.print("Принц ");
            }
            System.out.printf("%s %d лет%n", humans.get(i).getName(), humans.get(i).getAge());
        }
        int n = sheeps.size() % 100;
        System.out.print(sheeps.size() + ((n ==  1 ? "барашек: " : ((n < 5 || (n >= 20 && n % 10 == 0)) ? "барашка: " : "барашков: "))));
        for (int i = 0; i < sheeps.size(); ++i){
            System.out.print(sheeps.get(i).getName() + ", ");
        }
        System.out.println();
        n = roses.size() % 100;
        System.out.print(roses.size() + ((n ==  1 ? "роза" : ((n < 5 || (n >= 20 && n % 10 == 0)) ? "розы" : "роз"))));
    }
    public CelestialObjects getCelestialObjectsNow() {
        if (stars.checkInSky()) {
            System.out.println("Сейчас ночь, на небе звёзды");
            return stars;
        }
        System.out.println("Сейчас день, на небе солнце");
        return sun;
    }
    public Sound changeTimeDay() {
        if (stars.checkInSky()) {
            System.out.println("Наступил день, на небе взошло солнце");
            sun.move();
            return stars.move();
        }
        else {
            System.out.println("Наступила ночь, на небе появились звёзды");
            stars.move();
            return sun.move();
        }

    }

    public void addPrince(Prince prince) {
        princes.add(prince);
    }
    public void addRose(Rose rose) {
        roses.add(rose);
    }
    public void addSheep(Sheep sheep) {
        sheeps.add(sheep);
    }
    public void addHuman(Human human) {
        humans.add(human);
    }
    public void addBody(Body body) {
        bodies.add(body);
    }

    public ArrayList<Prince> getPrinces() {
        return princes;
    }
    public ArrayList<Rose> getRoses() {
        return roses;
    }
    public ArrayList<Sheep> getSheeps() {
        return sheeps;
    }
    public ArrayList<Human> getHumans() {
        return humans;
    }
    public ArrayList<Body> getBodies() {
        return bodies;
    }
    public CelestialObjects getSun() {
        return sun;
    }
    public CelestialObjects getStars() {
        return stars;
    }


}
