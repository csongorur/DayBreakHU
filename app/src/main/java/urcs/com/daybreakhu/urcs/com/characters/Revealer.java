package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class Revealer implements CharacterInterface {
    private String name;
    private Context context;
    private static Revealer instance = null;

    protected Revealer(Context context) {
        this.context = context;
        this.name = "Revealer";
    }

    public static Revealer getInstance(Context context) {
        if (instance == null) {
            instance = new Revealer(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Revealer", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
