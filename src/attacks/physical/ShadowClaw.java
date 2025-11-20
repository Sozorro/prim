package attacks.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public class ShadowClaw extends PhysicalMove {
    /*
    имеет повышенный шанс критического удара (1⁄8 вместо 1⁄24).
    */
    public ShadowClaw () {
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (Math.random() < 1/8){
            return 2.0;
        }
        return 1.0;
    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует способность Shadow Claw";
    }
}