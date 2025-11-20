package attacks.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

public class WillOWisp extends StatusMove {
    /*
    При попадании цель загорается. 
    */
    public WillOWisp () {
        super(Type.FIRE, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.burn(p);
    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует способность Will-O-Wisp";
    }
}