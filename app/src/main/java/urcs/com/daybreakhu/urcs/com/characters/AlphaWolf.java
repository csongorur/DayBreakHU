package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class AlphaWolf implements CharacterInterface {
    private String name;
    private Context context;
    private static AlphaWolf instance = null;

    protected AlphaWolf(Context context) {
        this.context = context;
        this.name = "Alpha wolf";
    }

    public static AlphaWolf getInstance(Context context) {
        if (instance == null) {
            instance = new AlphaWolf(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Alpha wolf", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
