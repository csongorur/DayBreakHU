package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by ur on 16.12.2017.
 */

public abstract class Character implements CharacterInterface {
    protected String name;
    protected Context context;
    private MediaPlayer mediaPlayer;
    private int imageId;
    private int order;
    protected boolean isEnd;

    protected Character(String name, Context context, int soundId, int imageId, int order) {
        this.name = name;
        this.context = context;
        this.imageId = imageId;
        this.order = order;
        this.mediaPlayer = MediaPlayer.create(context, soundId);
        this.isEnd = false;
    }

    public void playSong() {
        this.mediaPlayer.start();
    }

    public void pauseSong() {
        if (this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
        }
    }

    public void stopSong() {
        if (this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.stop();
        }
    }

    public String getName() {
        return this.name;
    }

    public int getImageId() {
        return this.imageId;
    }

    public int getOrder() {
        return this.order;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public void setIsEnd(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }
}
