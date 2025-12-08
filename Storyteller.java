import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Storyteller extends Human implements SoundLivingCreatures {
    private static Storyteller storyteller;

    private Storyteller(String name) {
        super(null, name, 0);
    }
    @Override
    public void say(String s) {
        System.out.println(s);
    }
    @Override
    public void makeSound(Sound sound) {
        if(sound == Sound.SCREAM) {
            System.out.println("ААААААА");
        }
    /*
    SCREAM, //крик
    VIBRATION,
    BELS, //колокола/бубенцы
    NEUTRAL,
    LAUGH, //смех
    CRY, //плач
    AGGRESSION,
    SLURPING //чавканье
    */
    }

    public static Storyteller getStoryteller(String name) {
        if (storyteller == null) {
            storyteller = new Storyteller(name);
            return storyteller;
        }
        else {
            System.out.println("В истории уже есть рассказчик - " + name);
            return storyteller;
        }
    }
    public Muzzle paintBelt(Muzzle muzzle, Color color) {
        muzzle = muzzle.setBelt(new Belt(color));
        return muzzle;
    }
    public Muzzle paintMuzzle(Color color) {
        if (this.emotion == Emotion.CRY) {
            System.out.println("Я плакал, поэтому слёзы заливали тетрадь и размывали рисунок");
            return null;
        }
        if (this.emotion == Emotion.FUN) {
            Color[] list = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.WHITE, Color.BROWN};
            Color col = list[new Random().nextInt(list.length)];
            System.out.println("У меня хорошее настроение, поэтому хочу сегодня взять " + col.name() + " карандаш");
            return new Muzzle(col);
        }
        return new Muzzle(color);
    }
    public void goToFrends(Frends frends) {
        if (atmosphere.getBodies().size() == 0) {
            this.emotion = Emotion.SOLACE; //утешение
            System.out.println("Всё хорошо, я просто устал...");
        }
        else {
            this.emotion = Emotion.CRY;
            System.out.println("Он не вернулся на свою планету, его больше нет...");
        }
    }
}
