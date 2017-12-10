package urcs.com.daybreakhu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    private Button start_btn;
    private Button new_btn;

    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initObjects();
        initOnClickListeners();

        mainFragment = new MainFragment();

        changeFragment(mainFragment, true);

    }

    private void initObjects() {
        start_btn = findViewById(R.id.start_btn);
        new_btn = findViewById(R.id.new_btn);
    }

    private void initOnClickListeners() {
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();
            }
        });
        new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();
            }
        });
    }

    private void changeFragment(Fragment fragment, boolean first) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (!first) {
            fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }

        fragmentTransaction.replace(R.id.content, fragment);
        fragmentTransaction.commit();
    }

    private void startGame() {
        GameFragment gameFragment = new GameFragment();
        gameFragment.setCharacterList(mainFragment.getCharacterList());
        changeFragment(gameFragment, false);
    }

    private void newGame() {
        mainFragment = new MainFragment();
        changeFragment(mainFragment, false);
    }
}
