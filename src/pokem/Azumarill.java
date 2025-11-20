package pokem;

import pokem.Marill;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Azumarill extends Marill {
    public Azumarill(String name, int level){
        super(name, level);
        // Facade WorkUp Present DefenseCurl
        //типы и его базовые характеристики
        super.setType(Type.WATER, Type.FAIRY);
        super.setStats(100, 50, 80, 60, 80, 50);
        super.setMove(new Facade(), new WorkUp(), new Present(), new DefenseCurl());
    }
}

