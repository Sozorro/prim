package heroes;

import enums.Sound;
import interfaces.SoundLivingCreatures;

public class We extends Human implements SoundLivingCreatures {
    private static We we;

    private We(String name) {
        super(null, name, 0);
    }
    public static We we(String name) {
        if (we == null) {
            we = new We(name);
            return we;
        }
        else {
            System.out.println("Мы уже в истории");
            return we;
        }
    }
    public void ask(Prince prince, Sheep sheep, Rose rosa) {
        System.out.println("Ещё не готово, зайдите позже");
    }

    @Override
    public void say(String s) {
        System.out.println("Ещё не готово, зайдите позже");
    }
    @Override
    public void makeSound(Sound sound) {
        System.out.println("Ещё не готово, зайдите позже");
    }
}
