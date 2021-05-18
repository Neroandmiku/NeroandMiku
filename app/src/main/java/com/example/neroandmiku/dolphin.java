package com.example.neroandmiku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dolphin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dolphin extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public dolphin() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dolphin.
     */
    // TODO: Rename and change types and number of parameters
    public static dolphin newInstance(String param1, String param2) {
        dolphin fragment = new dolphin();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    Button atras5;
    ImageView boton5;
    ImageButton dolphin;
    MediaPlayer sonidodelfin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dolphin, container, false);
        atras5 = view.findViewById(R.id.btnAtras5);
        boton5 =view.findViewById(R.id.ibEnlace5);
        dolphin = view.findViewById(R.id.imageButton3);
        sonidodelfin = MediaPlayer.create(getActivity(), R.raw.dolphin);

        atras5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_Animales2);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri enlace5 = Uri.parse("https://www.bioenciclopedia.com/delfin/");
                Intent intent = new Intent(Intent.ACTION_VIEW,enlace5);
                startActivity(intent);
            }
        });

        dolphin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodelfin.start();
            }
        });

        return view;
    }
}