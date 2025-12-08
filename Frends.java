import java.util.ArrayList;

public class Frends {
    private ArrayList<Human> humans = new ArrayList<Human>();
    public Atmosphere atmosphere;
    public Frends(Atmosphere atmosphere) {
        //this.atmosphere = atmosphere;
    }
    public Atmosphere getAtmosphere() {
        return atmosphere;
    }
    public void addFrends(Human human) {
        humans.add(human);
    }
    public void removeFrends(Human human) {
        humans.remove(human);
    }
    public void removeAllFrends(Human human) {
        humans.clear();
    }
    public ArrayList<Human> getContent() {
        return humans;
    }  
    public void mergeFrends(Frends frends) {
        ArrayList<Human> humans = frends.getContent();
        for(int i = 0; i < humans.size(); ++i) {
            this.humans.add(humans.get(i));
        }
    }    
    public void mergeFrends(Human[] frends) {
        for(int i = 0; i < frends.length; ++i) {
            this.humans.add(frends[i]);
        }
    } 
}
