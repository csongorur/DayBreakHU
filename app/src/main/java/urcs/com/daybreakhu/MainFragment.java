package urcs.com.daybreakhu;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import urcs.com.daybreakhu.urcs.com.characters.AlphaWolf;
import urcs.com.daybreakhu.urcs.com.characters.ApprenticeSeer;
import urcs.com.daybreakhu.urcs.com.characters.Character;
import urcs.com.daybreakhu.urcs.com.characters.Curator;
import urcs.com.daybreakhu.urcs.com.characters.MysticWolf;
import urcs.com.daybreakhu.urcs.com.characters.ParanormalInvestigator;
import urcs.com.daybreakhu.urcs.com.characters.Revealer;
import urcs.com.daybreakhu.urcs.com.characters.Sentinel;
import urcs.com.daybreakhu.urcs.com.characters.Start;
import urcs.com.daybreakhu.urcs.com.characters.Stop;
import urcs.com.daybreakhu.urcs.com.characters.VillageIdiot;
import urcs.com.daybreakhu.urcs.com.characters.Werewolf;
import urcs.com.daybreakhu.urcs.com.characters.Witch;


public class MainFragment extends Fragment {

    private CheckBox sentinel_chb;
    private CheckBox alpha_chb;
    private CheckBox mystic_chb;
    private CheckBox apprentice_chb;
    private CheckBox paranormal_chb;
    private CheckBox witch_chb;
    private CheckBox village_chb;
    private CheckBox revealer_chb;
    private CheckBox curator_chb;

    private RelativeLayout sentinel_layout;
    private RelativeLayout alpha_layout;
    private RelativeLayout mystic_layout;
    private RelativeLayout apprentice_layout;
    private RelativeLayout paranormal_layout;
    private RelativeLayout witch_layout;
    private RelativeLayout village_layout;
    private RelativeLayout revealer_layout;
    private RelativeLayout curator_layout;

    private TextView sentinel_txt;
    private TextView alpha_txt;
    private TextView mystic_txt;
    private TextView apprentice_txt;
    private TextView paranormal_txt;
    private TextView witch_txt;
    private TextView village_txt;
    private TextView revealer_txt;
    private TextView curator_txt;

    private List<Character> characterList;

    private Button start_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragment_main, null);

        initObjects(view);
        initOnClickListeners();

        return view;
    }

    public List<Character> getCharacterList() {
        return this.characterList;
    }

    private void initObjects(View view) {
        // init character list
        characterList = new ArrayList<>();
        characterList.add(Start.getInstance(getContext()));
        characterList.add(Werewolf.getInstance(getContext()));
        characterList.add(Stop.getInstance(getContext()));

        // get checkboxes
        sentinel_chb = view.findViewById(R.id.sentinel_chb);
        alpha_chb = view.findViewById(R.id.alpha_chb);
        mystic_chb = view.findViewById(R.id.mystic_chb);
        apprentice_chb = view.findViewById(R.id.apprentice_chb);
        paranormal_chb = view.findViewById(R.id.paranormal_chb);
        witch_chb = view.findViewById(R.id.witch_chb);
        village_chb = view.findViewById(R.id.village_chb);
        revealer_chb = view.findViewById(R.id.revealer_chb);
        curator_chb = view.findViewById(R.id.curator_chb);

        // get character layouts
        sentinel_layout = view.findViewById(R.id.sentinel_layout);
        alpha_layout = view.findViewById(R.id.alpha_layout);
        mystic_layout = view.findViewById(R.id.mystic_layout);
        apprentice_layout = view.findViewById(R.id.apprentice_layout);
        paranormal_layout = view.findViewById(R.id.paranormal_layout);
        witch_layout = view.findViewById(R.id.witch_layout);
        village_layout = view.findViewById(R.id.village_layout);
        revealer_layout = view.findViewById(R.id.revealer_layout);
        curator_layout = view.findViewById(R.id.curator_layout);

        // get character texts
        sentinel_txt = view.findViewById(R.id.sentinel_txt);
        alpha_txt = view.findViewById(R.id.alpha_txt);
        mystic_txt = view.findViewById(R.id.mystic_txt);
        apprentice_txt = view.findViewById(R.id.apprentice_txt);
        paranormal_txt = view.findViewById(R.id.paranormal_txt);
        witch_txt = view.findViewById(R.id.witch_txt);
        village_txt = view.findViewById(R.id.village_txt);
        revealer_txt = view.findViewById(R.id.revealer_txt);
        curator_txt = view.findViewById(R.id.curator_txt);

        // get buttons
        start_btn = getActivity().findViewById(R.id.start_btn);
        start_btn.setEnabled(false);
        Button stop_btn = getActivity().findViewById(R.id.stop_btn);
        stop_btn.setText(R.string.stop);
        stop_btn.setEnabled(false);
        Button new_btn = getActivity().findViewById(R.id.new_btn);
        new_btn.setEnabled(false);
    }

    private void clickOnCharacterLayout(RelativeLayout layout, TextView text, CheckBox checkBox, Character character) {
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
            layout.setBackgroundResource(R.drawable.border);
            text.setTextColor(Color.BLACK);
            characterList.remove(character);
        } else {
            checkBox.setChecked(true);
            layout.setBackgroundColor(Color.parseColor("#4c0000"));
            text.setTextColor(Color.WHITE);
            characterList.add(character);
        }

        if (characterList.size() == 0) {
            start_btn.setEnabled(false);
        } else {
            start_btn.setEnabled(true);
        }
    }

    private void initOnClickListeners() {

        // add character layouts click listener
        sentinel_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(sentinel_layout, sentinel_txt, sentinel_chb, Sentinel.getInstance(getContext()));
            }
        });

        alpha_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(alpha_layout, alpha_txt, alpha_chb, AlphaWolf.getInstance(getContext()));
            }
        });

        mystic_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(mystic_layout, mystic_txt, mystic_chb, MysticWolf.getInstance(getContext()));
            }
        });

        apprentice_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(apprentice_layout, apprentice_txt, apprentice_chb, ApprenticeSeer.getInstance(getContext()));
            }
        });

        paranormal_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(paranormal_layout, paranormal_txt, paranormal_chb, ParanormalInvestigator.getInstance(getContext()));
            }
        });

        witch_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(witch_layout, witch_txt, witch_chb, Witch.getInstance(getContext()));
            }
        });

        village_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(village_layout, village_txt, village_chb, VillageIdiot.getInstance(getContext()));
            }
        });

        revealer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(revealer_layout, revealer_txt, revealer_chb, Revealer.getInstance(getContext()));
            }
        });

        curator_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOnCharacterLayout(curator_layout, curator_txt, curator_chb, Curator.getInstance(getContext()));
            }
        });
    }

}
