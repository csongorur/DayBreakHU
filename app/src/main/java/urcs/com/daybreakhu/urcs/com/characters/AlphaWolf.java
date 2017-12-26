package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class AlphaWolf extends Character {
    private static AlphaWolf instance = null;

    private AlphaWolf(Context context) {
        super("Alpha wolf", context, R.raw.alpha_wolf, R.drawable.alphawolf, 2);
    }

    public static AlphaWolf getInstance(Context context) {
        if (instance == null) {
            instance = new AlphaWolf(context);
        } else if (instance.isEnd) {
            instance = new AlphaWolf(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
