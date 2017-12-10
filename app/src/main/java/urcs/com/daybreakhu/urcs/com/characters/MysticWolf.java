package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class MysticWolf implements CharacterInterface {
    private String name;
    private Context context;
    private static MysticWolf instance = null;

    protected MysticWolf(Context context) {
        this.context = context;
        this.name = "Mystic wolf";
    }

    public static MysticWolf getInstance(Context context) {
        if (instance == null) {
            instance = new MysticWolf(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Mystic wolf", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
