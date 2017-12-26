package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class MysticWolf extends Character {
    private static MysticWolf instance = null;

    private MysticWolf(Context context) {
        super("Mystic wolf", context, R.raw.mystic_wolf, R.drawable.mysticwolf, 4);
    }

    public static MysticWolf getInstance(Context context) {
        if (instance == null) {
            instance = new MysticWolf(context);
        } else if (instance.isEnd) {
            instance = new MysticWolf(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
