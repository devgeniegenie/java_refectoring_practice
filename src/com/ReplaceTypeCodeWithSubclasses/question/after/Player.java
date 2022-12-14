package com.ReplaceTypeCodeWithSubclasses.question.after;

public abstract class Player {
    public static final int MUSIC = 0;
    public static final int VIDEO = 1;

    /** book`s Solution start */
    public static Player create(int type) {
        switch (type) {
            case MUSIC:
                return new MusicPlayer();
            case VIDEO:
                return new VideoPlayer();
            default:
                throw new IllegalArgumentException("type = " + type);
        }
    }
    /** book`s Solution end */

    /** My refactoring start */
    public static MusicPlayer createMusicPlayer() {
        return new MusicPlayer();
    }

    public static VideoPlayer createVideoPlayer() {
        return new VideoPlayer();
    }
    /** My refactoring end */

    public abstract void play();

    public abstract void loop();

    public abstract void stop();
}
