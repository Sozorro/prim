package items;

import enums.Color;

public class Belt {
    private Color color;
    public Belt(Color color) {
        this.color = color;
    }
    public Color setColour(Color color) {
        this.color = color;
        return color;
    }
    public Color getColour() {
        return color;
    }
}
