package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class ApprenticeSeer extends Character {
    private static ApprenticeSeer instance = null;

    private ApprenticeSeer(Context context) {
        super("Apprentice Seer", context, R.raw.apprentice_seer, R.drawable.apprenticeseer, 5);
    }

    public static ApprenticeSeer getInstance(Context context) {
        if (instance == null) {
            instance = new ApprenticeSeer(context);
        } else if (instance.isEnd) {
            instance = new ApprenticeSeer(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
