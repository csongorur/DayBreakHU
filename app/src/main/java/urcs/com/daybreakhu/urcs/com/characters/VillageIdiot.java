package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class VillageIdiot extends Character {
    private static VillageIdiot instance = null;

    private VillageIdiot(Context context) {
        super("Village idiot", context, R.raw.village_idiot, R.drawable.village, 7);
    }

    public static VillageIdiot getInstance(Context context) {
        if (instance == null) {
            instance = new VillageIdiot(context);
        } else if (instance.isEnd) {
            instance = new VillageIdiot(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
