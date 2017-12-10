package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class ApprenticeSeer implements CharacterInterface {
    private String name;
    private Context context;
    private static ApprenticeSeer instance = null;

    protected ApprenticeSeer(Context context) {
        this.context = context;
        this.name = "Apprentice Seer";
    }

    public static ApprenticeSeer getInstance(Context context) {
        if (instance == null) {
            instance = new ApprenticeSeer(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Apprentice seer", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
