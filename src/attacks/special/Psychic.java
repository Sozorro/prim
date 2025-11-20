package attacks.special;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;


public class Psychic extends SpecialMove {
    /*
    наносит урон и с вероятностью 10 % снижает специальную защиту цели на один уровень.
    */
    public Psychic () {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }
    
    @Override
    protected java.lang.String describe() {
        return "кастует способность Psychic";
    }
}