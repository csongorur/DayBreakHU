package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 26.12.2017.
 */

public class Start extends Character {
    private static Start instance = null;

    private Start(Context context) {
        super("Start", context, R.raw.start, R.mipmap.ic_launcher, 0);
    }

    public static Start getInstance(Context context) {
        if (instance == null) {
            instance = new Start(context);
        } else if (instance.isEnd) {
            instance = new Start(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
