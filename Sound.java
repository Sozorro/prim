public class Sound {

    public static void main(String[] args) {
        //double x = 3;
        int x, y, z;
        x = y = z = 2;
        char c = 65535;
        c += 100;
        System.out.println(c);
    }
    Emotion emotion = Emotion.neitral;
    Sound(Emotion emotion){
        this.emotion = emotion;
    }
    
    public Sound maskSound(Emotion emotion) {
        this.emotion = emotion;
        return this;
    }
    public Emotion changeSound() {
        this.emotion = emotion;
        return HairSound();
    }
    public Emotion HairSound() {
        System.out.println("Настроение звёзд говорит, что все под настроением" + emotion);
        return emotion;
    }
}
class Prim {

}
