package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;

import urcs.com.daybreakhu.R;

/**
 * Created by ur on 10.12.2017.
 */

public class ParanormalInvestigator extends Character {
    private static ParanormalInvestigator instance = null;

    private ParanormalInvestigator(Context context) {
        super("Paranormal investigator", context, R.raw.paranormal_investigator, R.drawable.paranormal, 6);
    }

    public static ParanormalInvestigator getInstance(Context context) {
        if (instance == null) {
            instance = new ParanormalInvestigator(context);
        } else if (instance.isEnd) {
            instance = new ParanormalInvestigator(context);
        }

        return instance;
    }

    @Override
    public void deleteInstance() {
        instance = null;
    }
}
