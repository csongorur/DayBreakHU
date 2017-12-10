package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class Witch implements CharacterInterface {
    private String name;
    private Context context;
    private static Witch instance = null;

    protected Witch(Context context) {
        this.context = context;
        this.name = "Witch";
    }

    public static Witch getInstance(Context context) {
        if (instance == null) {
            instance = new Witch(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Witch", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
