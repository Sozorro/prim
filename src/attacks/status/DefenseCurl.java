package attacks.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

public class DefenseCurl extends StatusMove {
    /*
    повышает защиту пользователя на 1 уровень.
    */
    public DefenseCurl () {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует способность Defense Curl";
    }
}