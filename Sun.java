public class Sun extends CelestialObjects {
    private static Sun sun = null;

    private Sun(Atmosphere atmosphere, boolean inSky) {
        super(atmosphere, inSky);
    }
    public static Sun getSun(Atmosphere atmosphere, boolean inSky) {
        if (sun == null) {
            sun = new Sun(atmosphere, inSky);
        }
        else {
            System.out.println("Невозможно создать ещё один небесный объект");
        }
        return sun;
    }
    @Override
    public Sound move() {
        if(inSky) inSky = false;
        else {
            notifyObservers(Emotion.FUN);
            inSky = true;
        }
        return Sound.VIBRATION;
    }
    private void notifyObservers(Emotion emotion) {
        for (Observer observer : observers) {
            observer.updateEmotion(emotion);
        }
    }
}
