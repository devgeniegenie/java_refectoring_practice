package com.ReplaceTypeCodeWithStateStrategy.question.solution;

abstract class Media {
    public abstract void play();
    public abstract void loop();
    public abstract void stop();

    public static final Media Null = new Media() {
        @Override
        public void play() {
            System.out.println("Null: play");
        }

        @Override
        public void loop() {
            System.out.println("NULL: loop");
        }

        @Override
        public void stop() {
            System.out.println("NULL: stop");
        }
    };
}

class Music extends Media {
    @Override
    public void play() {
        System.out.println("Video: play");
    }

    @Override
    public void loop() {
        System.out.println("Video: loop");
    }

    @Override
    public void stop() {
        System.out.println("Video: stop");
    }
}

class Video extends Media {

    @Override
    public void play(){
        System.out.println("Video: play");
    }

    @Override
    public void loop() {
        System.out.println("Video: loop");
    }

    @Override
    public void stop() {
        System.out.println("Video: stop");
    }
}
