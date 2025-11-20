package pokem;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Shuppet extends Pokemon {
    public Shuppet(String name, int level){
        super(name, level);
        //ThunderWave WillOWisp DreamEater
        super.setType(Type.GHOST);
        super.setStats(44, 75, 35, 63, 33, 45);
        super.setMove(new ThunderWave(), new WillOWisp(), new DreamEater());
    }
}

