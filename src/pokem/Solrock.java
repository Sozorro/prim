package pokem;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Solrock extends Pokemon {

    public Solrock(String name, int level){
        super(name, level);
        //типы и его базовые характеристики ShadowBall StoneEdge Psychic Tackle
        super.setType(Type.ROCK, Type.PSYCHIC);
        super.setStats(90, 95, 85, 55, 65, 70);
        super.setMove(new ShadowBall(), new StoneEdge(), new Psychic(), new Tackle());
    }
}

