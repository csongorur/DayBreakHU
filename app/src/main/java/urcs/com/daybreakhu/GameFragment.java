package urcs.com.daybreakhu;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import urcs.com.daybreakhu.urcs.com.characters.Character;


public class GameFragment extends Fragment implements View.OnClickListener {

    private List<Character> characterList;
    private View view;
    private Button stop_btn;
    private ImageView character_img;
    private TextView character_name;
    private int currentCharacterIndex;
    private boolean isPause = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.fragment_game, null);

        initObjects();

        playSongs(0);

        stop_btn.setOnClickListener(this);

        return view;
    }


    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    private void initObjects() {
        character_img = view.findViewById(R.id.character_img);
        character_name = view.findViewById(R.id.character_name);

        // get buttons
        Button start_btn = getActivity().findViewById(R.id.start_btn);
        start_btn.setEnabled(false);
        stop_btn = getActivity().findViewById(R.id.stop_btn);
        stop_btn.setText(R.string.stop);
        stop_btn.setEnabled(true);
        Button new_btn = getActivity().findViewById(R.id.new_btn);
        new_btn.setEnabled(true);

        // order character list
        Collections.sort(this.characterList, new Comparator<Character>() {
            @Override
            public int compare(Character characterA, Character characterB) {
                return Integer.valueOf(characterA.getOrder()).compareTo(characterB.getOrder());
            }
        });
    }

    private void playSongs(final int characterIndex) {
        if (characterIndex >= characterList.size()) {
            return;
        }

        final Character character = characterList.get(characterIndex);

        this.currentCharacterIndex = characterIndex;

        MediaPlayer mediaPlayer = character.getMediaPlayer();

        character_img.setImageResource(character.getImageId());
        character_name.setText(character.getName());

        character.playSong();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                character.setIsEnd(true);
                playSongs(characterIndex + 1);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.stop_btn:
                if (isPause) {
                    stop_btn.setText(R.string.stop);
                    playSongs(currentCharacterIndex);
                    isPause = false;
                } else {
                    stop_btn.setText(R.string.start_hu);
                    characterList.get(currentCharacterIndex).pauseSong();
                    isPause = true;
                }
                break;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if (currentCharacterIndex < characterList.size()) {
            characterList.get(currentCharacterIndex).stopSong();
        }

        for (int i = 0; i < characterList.size(); i++) {
            characterList.get(i).deleteInstance();
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (currentCharacterIndex < characterList.size()) {
            characterList.get(currentCharacterIndex).pauseSong();
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (currentCharacterIndex < characterList.size() && !characterList.get(currentCharacterIndex).getIsEnd()) {
            characterList.get(currentCharacterIndex).playSong();
        }
    }
}
