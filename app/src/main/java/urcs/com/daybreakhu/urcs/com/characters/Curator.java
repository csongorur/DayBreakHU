package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class Curator implements CharacterInterface {
    private String name;
    private Context context;
    private static Curator instance = null;

    protected Curator(Context context) {
        this.context = context;
        this.name = "Curator";
    }

    public static Curator getInstance(Context context) {
        if (instance == null) {
            instance = new Curator(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Curator", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
