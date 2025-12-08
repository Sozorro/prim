import java.util.ArrayList;

public class Sheep  implements SoundLivingCreatures{
    private Atmosphere atmosphere;
    private Muzzle muzzle = null;
    private ArrayList<WardenSheepAndRose> watcher = new ArrayList<>();
    private Sound nowSound = Sound.NEUTRAL;
    private String name;

    public Sheep(Atmosphere atmosphere, String name) {
        if (name == "") {
            throw new NullArgument("Недопустимое имя для Sheep");
        }
        this.atmosphere = atmosphere;
        this.name = name;
    }

    @Override
    public void say(String s) {
        if (s == "") {
            throw new NullArgument("Недопустимое имя озвучивания");
        }
        System.out.println("бееееее");
    }
    @Override
    public void makeSound(Sound sound) {
        if (sound == null) {
            throw new NullArgument("Недопустимый звук озвучивания");
        }
        System.out.println("Овца издаёт звук: " + sound.name());
    }

    public Sound moveJail() { //Jail - тюрьма
        nowSound = Sound.AGGRESSION;
        makeSound(nowSound);
        return nowSound;
    }
    public Sound setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
        nowSound = Sound.AGGRESSION;
        makeSound(nowSound);
        return nowSound;
    }
    public Muzzle checkMuzzle() {
        makeSound(nowSound);
        return muzzle;
    }
    public Sound eat(EatSheep food) {
        if (food == null) {
            throw new NullArgument("Передано null в место еды, попробуйте другой объект");
        }
        if (food instanceof Rose && watcher.size() != 0) {
            for(int i = 0; i < watcher.size(); ++i) {
                watcher.get(i).sheepEatRose(this);
            }
            return nowSound;
        }
        food = null;
        nowSound = Sound.SLURPING;
        makeSound(nowSound);
        return nowSound;
    }
    public Sound addWatcher(WardenSheepAndRose warden) {
        watcher.add(warden);
        makeSound(nowSound);
        return nowSound;
    }
    public void removeWatcher(WardenSheepAndRose warden) {
        watcher.remove(warden);
    }
    public Sound walk() {
        nowSound = Sound.NEUTRAL;
        makeSound(nowSound);
        return nowSound;
    }
    public Sound checkSound() {
        makeSound(nowSound);
        return nowSound;
    }
    public String getName() {
        return name;
    }
}
