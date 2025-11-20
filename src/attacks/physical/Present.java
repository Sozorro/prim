package attacks.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Present extends PhysicalMove {
    //С вероятностями: 40, 30, 10, 20 кастует Damage: 40, 80, 120 или Heal 1/4 of the target's max HP соответственно
    public Present () {
        super(Type.NORMAL, 0, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        double r = Math.random();
        if(r < 0.1) {
            super.applyOppDamage(def, 120/70);
        }
        else if(r < 0.3) {
            super.applyOppDamage(def, 0);
            int hp = (int) (def.getHP() + def.getStat(Stat.HP)/4);
            def.setMod(Stat.HP, (int) (hp - (hp % def.getStat(Stat.HP))));
        }
        else if(r < 0.6) {
            super.applyOppDamage(def, 80/70);
        }
        else{
            super.applyOppDamage(def, 40/70);
        }
        super.applyOppDamage(def, damage);
    }
    @Override
    protected java.lang.String describe() {
        return "кастует способность Present";
    }

}