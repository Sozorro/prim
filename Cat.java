public class Cat {
    private boolean armor = false;
    public void setArmor() {
        armor = true;
    }
    public boolean fire() {
        if (armor == false) {
            return true;
        }
        else return false;
    }
    
}
