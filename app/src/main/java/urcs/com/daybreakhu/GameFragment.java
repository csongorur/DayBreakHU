package urcs.com.daybreakhu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import urcs.com.daybreakhu.urcs.com.characters.CharacterInterface;


public class GameFragment extends Fragment {

    private List<CharacterInterface> character_list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_game, null);

        TextView text = view.findViewById(R.id.text);

        for (int i = 0; i < character_list.size(); i++) {
            character_list.get(i).playMusic();
        }

        return view;
    }

    public void setCharacterList(List<CharacterInterface> character_list) {
        this.character_list = character_list;
    }
}
