package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class DreamWolf implements CharacterInterface {
    private String name;
    private Context context;
    private static DreamWolf instance = null;

    protected DreamWolf(Context context) {
        this.context = context;
        this.name = "Dream wolf";
    }

    public static DreamWolf getInstance(Context context) {
        if (instance == null) {
            instance = new DreamWolf(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Dream wolf", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
