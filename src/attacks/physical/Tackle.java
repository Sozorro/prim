package attacks.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Tackle extends PhysicalMove {
    /*
    наносит урон без каких-либо дополнительных эффектов.
    */
    public Tackle () {
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected java.lang.String describe() {
        return "кастует способность Tackle";
    }
}
