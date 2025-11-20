package attacks.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;

public class ThunderWave extends StatusMove {
    /*
    парализует противника. 
    */
    public ThunderWave () {
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует способность Thunder Wave";
    }
}