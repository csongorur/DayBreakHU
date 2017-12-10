package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class Bodyguard implements CharacterInterface {
    private String name;
    private Context context;
    private static Bodyguard instance = null;

    protected Bodyguard(Context context) {
        this.context = context;
        this.name = "Bodyguard";
    }

    public static Bodyguard getInstance(Context context) {
        if (instance == null) {
            instance = new Bodyguard(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Bodyguard", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
