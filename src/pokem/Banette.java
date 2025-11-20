package pokem;

import pokem.Shuppet;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Banette extends Shuppet {
    public Banette(String name, int level){
        super(name, level);
        //ThunderWave WillOWisp DreamEater ShadowClaw
        //типы и его базовые характеристики
        super.setType(Type.GHOST);
        super.setStats(64, 115, 65, 83, 63, 65);
        super.setMove(new ThunderWave(), new WillOWisp(), new DreamEater(), new ShadowClaw());
    }
}

