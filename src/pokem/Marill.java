package pokem;

import pokem.Azurill;
import ru.ifmo.se.pokemon.Type;
import attacks.status.*;
import attacks.physical.*;
import attacks.special.*;

public class Marill extends Azurill {
    public Marill(String name, int level){
        super(name, level);
        // Facade WorkUp Present
        //типы и его базовые характеристики
        super.setType(Type.WATER, Type.FAIRY);
        super.setStats(70, 20, 50, 20, 50, 40);
        super.setMove(new Facade(), new WorkUp(), new Present());
    }
}

