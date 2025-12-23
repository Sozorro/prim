package items;

import java.util.ArrayList;
import java.util.Objects;

import enums.Sound;
import interfaces.Observer;

public abstract class CelestialObjects {
    protected boolean inSky = false;
    protected Atmosphere atmosphere;
    protected static ArrayList<Observer> observers = new ArrayList<>();
    abstract Sound move();

    protected CelestialObjects(Atmosphere atmosphere, boolean inSky) {
        this.atmosphere = atmosphere;
        this.inSky = inSky;
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public boolean checkInSky() {
        return inSky;
    }
}
