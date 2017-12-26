package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class Sentinel extends Character {
    private static Sentinel instance = null;

    private Sentinel(Context context) {
        super("Sentinel", context, R.raw.sentinel, R.drawable.sentinel, 1);
    }

    public static Sentinel getInstance(Context context) {
        if (instance == null) {
            instance = new Sentinel(context);
        } else if (instance.isEnd) {
            instance = new Sentinel(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
