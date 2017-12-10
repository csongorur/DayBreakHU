package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class Sentinel implements CharacterInterface {
    private String name;
    private Context context;
    private static Sentinel instance = null;

    protected Sentinel(Context context) {
        this.context = context;
        this.name = "Sentinel";
    }

    public static Sentinel getInstance(Context context) {
        if (instance == null) {
            instance = new Sentinel(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Sentinel", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
