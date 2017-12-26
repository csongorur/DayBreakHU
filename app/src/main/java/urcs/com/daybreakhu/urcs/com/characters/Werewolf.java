package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 18.12.2017.
 */

public class Werewolf extends Character {
    private static Werewolf instance = null;

    private Werewolf(Context context) {
        super("Werewolf", context, R.raw.were_wolf, R.drawable.werewolf, 2);
    }

    public static Werewolf getInstance(Context context) {
        if (instance == null) {
            instance = new Werewolf(context);
        } else if (instance.isEnd) {
            instance = new Werewolf(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
