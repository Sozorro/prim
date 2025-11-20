package attacks.special;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
public class DreamEater extends SpecialMove {
    /*
    наносит урон только если цель спит
    пользователь восстанавливает 50 % потерянного здоровья.
    */
    public DreamEater () {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if(def.getCondition() == Status.SLEEP) super.applyOppDamage(def, damage);
        else System.out.println(def.toString() + " не спит, способность не наносит урон");
    }

    protected void applySelfEffects(Pokemon p) {
        int hp = (int) (p.getStat(Stat.HP) - p.getHP());
        p.setMod(Stat.HP, hp == 1 ? -1 : -hp/2);
    }

    @Override
    protected java.lang.String describe(){
        return "кастует способность Dream Eater";
    }
    /*
    урон психического типа
    действует если цель спит
    наносит урон и +50% от атаки восстанавливает себе хп
    если 1 ед урона, то восст 1 ед здоровья
    
    protected int val;
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if(def.getCondition() == Status.SLEEP) val = (int) Math.round(damage);
        else System.out.println("Цель не спит, способность не наносит урон");
        super.applyOppDamage(def, val);
        //Effect.sleep(def);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        super.applySelfDamage(att, damage);
        att.setMod(Stat.HP, -(val == 1 ? 1 : val / 2));
        val = 0;
    }

    @Override
    protected java.lang.String describe(){
        return "кастует способность Dream Eater";
    }*/
    
    
}