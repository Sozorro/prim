public class Muzzle {
    private Belt belt = null;
    private Color color;
    public Muzzle(Color color) {
        this.color = color;
    }
    public Color setColour(Color color) {
        this.color = color;
        return color;
    }
    public Color getColour() {
        return color;
    }
    public Muzzle setBelt(Belt belt) {
        this.belt = belt;
        return this;
    }
}
