package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class Curator extends Character {
    private static Curator instance = null;

    private Curator(Context context) {
        super("Curator", context, R.raw.curator, R.drawable.curator, 10);
    }

    public static Curator getInstance(Context context) {
        if (instance == null) {
            instance = new Curator(context);
        } else if (instance.isEnd) {
            instance = new Curator(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
