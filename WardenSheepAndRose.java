public abstract class WardenSheepAndRose extends Human implements InteractionsWithRose, InteractionsWithSheep{
    public WardenSheepAndRose(Atmosphere atmosphere, String name, int age) {
        super(atmosphere, name, age);
    }
    public Sound setMuzzleSheep(Sheep sheep, Muzzle muzzle) {
        return sheep.setMuzzle(muzzle);
    }
    public Sound seeSheep(Sheep sheep, WardenSheepAndRose warden) {
        return sheep.addWatcher(warden);
    }
    public void turnAwaySheep(Sheep sheep, WardenSheepAndRose warden) {
        sheep.removeWatcher(warden);
    }
    public boolean checkRoseArmor(Rose rose) {
        return rose.checkArmor();
    }
    public Sound sheepEatRose(Sheep sheep) {
        System.out.println("О нет, овца " + sheep.getName() + " чуть не съела розу!\nНадо её наказать");
        return sheep.moveJail();
    }
    public void setRoseArmor(Rose rose) {
        rose.setArmor();
    }
}
