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
 * Use the {@link lobo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class lobo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public lobo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment lobo.
     */
    // TODO: Rename and change types and number of parameters
    public static lobo newInstance(String param1, String param2) {
        lobo fragment = new lobo();
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

    Button atras;
    ImageView boton2;
    MediaPlayer aullido;
    ImageButton lobosonido;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lobo, container, false);

        atras = view.findViewById(R.id.btnAtras3);
        boton2 = view.findViewById(R.id.ibEnlace3);
        lobosonido = view.findViewById(R.id.imageButton2);
        aullido = MediaPlayer.create(getActivity(), R.raw.aullido);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_Animales2);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri enlace = Uri.parse("https://concepto.de/lobo/#ixzz6tra04kSQ");
                Intent intent = new Intent(Intent.ACTION_VIEW,enlace);
                startActivity(intent);
            }
        });

        lobosonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aullido.start();
            }
        });
        return view;
    }
}