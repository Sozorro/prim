import ru.ifmo.se.pokemon.Battle;
import pokem.*;

public class Main {
    public static void main(String[] args) {
        Solrock solrock = new Solrock("Боб", 35);
        Shuppet shuppet = new Shuppet("Тоша", 82);
        Banette banette = new Banette("Арсений", 82);
        Azurill azurill = new Azurill("Катрина", 25);
        Marill marill = new Marill("Миша", 25);
        Azumarill azumarill = new Azumarill("Саша", 25);
        
        Battle b = new Battle();
        b.addAlly(solrock);
        b.addAlly(banette);
        b.addAlly(marill);
        b.addFoe(shuppet);
        b.addFoe(azurill);
        b.addFoe(azumarill);
        b.go();
    }
}