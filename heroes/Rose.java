package heroes;

import enums.Color;
import enums.Sound;
import interfaces.SoundLivingCreatures;
import items.Atmosphere;
import items.EatSheep;

public class Rose extends EatSheep implements SoundLivingCreatures{
    private Color color;
    public Rose(Atmosphere atmosphere, Color color) {
        super(atmosphere);
        this.color = color;
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
