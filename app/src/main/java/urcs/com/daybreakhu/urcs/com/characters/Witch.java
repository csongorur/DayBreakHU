package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class Witch extends Character {
    private static Witch instance = null;

    private Witch(Context context) {
        super("Witch", context, R.raw.witch, R.drawable.witch, 7);
    }

    public static Witch getInstance(Context context) {
        if (instance == null) {
            instance = new Witch(context);
        } else if (instance.isEnd) {
            instance = new Witch(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
