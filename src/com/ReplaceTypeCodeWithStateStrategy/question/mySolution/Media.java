package com.ReplaceTypeCodeWithStateStrategy.question.mySolution;

public enum Media {
    VIDEO{
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
    },
    MUSIC {
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
    },
    NULL {
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

    public abstract void play();
    public abstract void loop();
    public abstract void stop();
}
