package interfaces;

import enums.Sound;
import heroes.Rose;
import heroes.Sheep;

public interface InteractionsWithRose {    
    public Sound sheepEatRose(Sheep sheep);
    public void setRoseArmor(Rose rose);
    public boolean checkRoseArmor(Rose rose);
}
