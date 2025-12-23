import enums.Color;
import heroes.Prince;
import heroes.Rose;
import heroes.Sheep;
import heroes.Storyteller;
import items.Atmosphere;

public class Main {

   public static void main(String[] args) {
      Atmosphere atmosphere = new Atmosphere();
      Storyteller storyteller = Storyteller.getStoryteller("Bob");
      Prince prince = new Prince(atmosphere, "mini", 18);
      Sheep sheep = new Sheep(atmosphere, "Dolly");
      Rose rose = new Rose(atmosphere, Color.RED);
      new Rose(atmosphere, Color.RED);
      prince.seeSheep(sheep, prince);
      System.out.println();
      sheep.eat(rose);
      prince.turnAwaySheep(sheep, prince);
      System.out.println();
      sheep.eat(rose);
      System.out.println();
      sheep.eat(rose);
   }
}
