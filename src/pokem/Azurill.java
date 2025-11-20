package pokem;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Azurill extends Pokemon {
    public Azurill(String name, int level){
        super(name, level);
        //Facade WorkUp
        //типы и его базовые характеристики
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(50, 20, 40, 20, 40, 20);
        super.setMove(new Facade(), new WorkUp());
    }
}

