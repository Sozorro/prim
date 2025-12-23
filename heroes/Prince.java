package heroes;

import enums.Sound;
import interfaces.SoundLivingCreatures;
import items.Atmosphere;


public class Prince extends WardenSheepAndRose  implements SoundLivingCreatures {
    public Prince(Atmosphere atmosphere, String name, int age) {
        super(atmosphere, name, age);
    }
    @Override
    public void say(String s) {
        System.out.println("Ещё не готово, зайдите позже");
    }
    @Override
    //
    public void makeSound(Sound sound) {
        System.out.println("Ещё не готово, зайдите позже");
    }
    //
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prince) || o == null) return false;
        Prince t = (Prince) o;
        return name == t.getName() && age == t.getAge();
    }
    
}
