package attacks.physical;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Facade extends PhysicalMove {
    /*
    наносит урон и поражает с удвоенной силой (140), если пользователь обожжён, отравлен или парализован. 
    */
    public Facade () {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if(att.getCondition() == Status.BURN || att.getCondition() == Status.PARALYZE || att.getCondition() == Status.POISON) {
            power = 140;
            System.out.printf("%s Находится в состоянии %s, поэтому сила %s увеличена до 140 \n", def.toString(), def.getCondition(), att.toString());

        }
        else if (power == 140) {
            power = 70;
        }
        return super.calcBaseDamage(att, def);
    }

    @Override
    protected java.lang.String describe(){
        return "кастует способность Facade";
    }
}