import java.util.Objects;

public abstract class Human implements Observer {
    protected String name;
    protected int age;
    protected Emotion emotion = Emotion.NEUTRAL;
    protected Atmosphere atmosphere;
    
    public Human(Atmosphere atmosphere, String name, int age) {
        this.atmosphere = atmosphere;
        this.name = name;
        this.age = age;
    }
    @Override
    public void updateEmotion(Emotion emotion) {
        this.emotion = emotion;
    }
    public int addAge(int n) {
        age += n;
        return age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Atmosphere getAtmosphere() {
        return atmosphere;
    }
    public Emotion getEmotion() {
        return emotion;
    }
    @Override
    public String toString() {
        return String.format("Human { %n name = %s, age = %d} %n", name, age);
    }
}
