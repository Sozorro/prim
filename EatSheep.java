public class EatSheep {
    private boolean armor = false;
    private Atmosphere atmosphere;
    public EatSheep(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }
    public void setArmor() {
        armor = true;
    }
    public void removeArmor() {
        armor = false;
    }
    public boolean checkArmor() {
        return armor;
    }
}
