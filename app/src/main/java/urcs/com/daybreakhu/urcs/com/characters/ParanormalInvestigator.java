package urcs.com.daybreakhu.urcs.com.characters;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ur on 10.12.2017.
 */

public class ParanormalInvestigator implements CharacterInterface {
    private String name;
    private Context context;
    private static ParanormalInvestigator instance = null;

    protected ParanormalInvestigator(Context context) {
        this.context = context;
        this.name = "Paranormal investigator";
    }

    public static ParanormalInvestigator getInstance(Context context) {
        if (instance == null) {
            instance = new ParanormalInvestigator(context);
        }

        return instance;
    }

    @Override
    public void playMusic() {
        Toast.makeText(context, "Play Paranormal investigator", Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
