public class Star extends CelestialObjects {
    private static Star star = null;

    private Star(Atmosphere atmosphere, boolean inSky) {
        super(atmosphere, inSky);
    }
    public static Star getStar(Atmosphere atmosphere, boolean inSky) {
        if (star == null) {
            star = new Star(atmosphere, inSky);
        }
        else {
            System.out.println("Невозможно создать ещё один небесный объект");
        }
        return star;
    }
    @Override
    public Sound move() {
        if(inSky) inSky = false;
        else {
            notifyObservers(Emotion.FUN);
            inSky = true;
        }
        return Sound.BELS;
    }
    private void notifyObservers(Emotion emotion) {
        for (Observer observer : observers) {
            observer.updateEmotion(emotion);
        }
    }
    public Sound starCry() {
        notifyObservers(Emotion.SAD);
        return Sound.CRY;
    }
    public Sound starLaugh() {
        notifyObservers(Emotion.FUN);
        return Sound.LAUGH;
    }
}
