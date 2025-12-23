package interfaces;

import enums.Emotion;

public interface Observer {
    public void updateEmotion(Emotion emotion);
}