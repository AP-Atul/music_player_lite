package com.atul.musicplayerlite.service;

import androidx.annotation.IntDef;

import com.atul.musicplayerlite.model.Music;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface PlayerListener {

    void onPrepared();
    void onContentUpdate();
    void onStateChanged(@State int state);
    void onPositionChanged(int position);
    void onMusicSet(Music music);
    void onPlaybackCompleted();
    void onRelease();

    @IntDef({PlayerListener.State.INVALID,
            PlayerListener.State.PLAYING,
            PlayerListener.State.PAUSED,
            PlayerListener.State.COMPLETED,
            PlayerListener.State.RESUMED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {

        int INVALID = -1;
        int PLAYING = 0;
        int PAUSED = 1;
        int COMPLETED = 2;
        int RESUMED = 3;
    }
}
