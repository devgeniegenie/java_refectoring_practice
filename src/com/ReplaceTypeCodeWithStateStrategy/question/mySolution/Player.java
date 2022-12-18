package com.ReplaceTypeCodeWithStateStrategy.question.mySolution;

public class Player {
    private Media _media;

    public Player() {
        setmedia(Media.NULL);
    }

    public void setmedia(Media media) {
        this._media = media;
    }

    public void play(){
        this._media.play();
    }

    public void loop() {
        this._media.loop();
    }

    public void stop() {
        this._media.stop();
    }

    public void temp() {
    }
}
