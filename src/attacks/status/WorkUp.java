package attacks.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

public class WorkUp extends StatusMove {
    /*
    повышает силу атаки и специальную силу атаки пользователя на один уровень. 
    */
    public WorkUp () {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK , 1);
        p.setMod(Stat.SPECIAL_ATTACK , 1);
    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует усиливающую способность Work Up";
    }
}