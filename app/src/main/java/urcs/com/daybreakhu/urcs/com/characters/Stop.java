package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 26.12.2017.
 */

public class Stop extends Character {
    private static Stop instance = null;

    private Stop(Context context) {
        super("Stop", context, R.raw.stop, R.mipmap.ic_launcher, 11);
    }

    public static Stop getInstance(Context context) {
        if (instance == null) {
            instance = new Stop(context);
        } else if (instance.isEnd) {
            instance = new Stop(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
