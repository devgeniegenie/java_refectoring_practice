package com.ReplaceTypeCodeWithStateStrategy.question.solution;

public class Player {
    private Media _media = Media.Null;

    public void play() {
        _media.play();
    }

    public void loop() {
        _media.loop();
    }

    public void stop() {
        _media.stop();
    }

    public void setMedia(Media media) {
        if (media == null) _media = Media.Null;
        else _media = media;
    }
}