package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class Revealer extends Character {
    private static Revealer instance = null;

    private Revealer(Context context) {
        super("Revealer", context, R.raw.revealer, R.drawable.revealer, 8);
    }

    public static Revealer getInstance(Context context) {
        if (instance == null) {
            instance = new Revealer(context);
        } else if (instance.isEnd) {
            instance = new Revealer(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
