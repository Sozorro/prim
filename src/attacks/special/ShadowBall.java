package attacks.special;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;

public class ShadowBall extends SpecialMove {
    /*
    наносит урон и с вероятностью 20 % снижает специальную защиту цели на один уровень.
    */
    public ShadowBall () {
        super(Type.GHOST, 80, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.2){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }
    @Override
    protected java.lang.String describe() {
        return "кастует способность Shadow Ball";
    }

}