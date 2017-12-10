package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class VillageIdiot implements CharacterInterface {
    private String name;
    private Context context;
    private static VillageIdiot instance = null;

    protected VillageIdiot(Context context) {
        this.context = context;
        this.name = "Village idiot";
    }

    public static VillageIdiot getInstance(Context context) {
        if (instance == null) {
            instance = new VillageIdiot(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Village idiot", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
