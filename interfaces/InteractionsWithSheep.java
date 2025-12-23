package interfaces;

import enums.Sound;
import heroes.Sheep;
import heroes.WardenSheepAndRose;
import items.Muzzle;

public interface InteractionsWithSheep {
    public Sound setMuzzleSheep(Sheep sheep, Muzzle muzzle);
    public Sound seeSheep(Sheep sheep, WardenSheepAndRose warden);
    public void turnAwaySheep(Sheep sheep, WardenSheepAndRose warden);
}
