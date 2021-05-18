package com.example.neroandmiku;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_Animales#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_Animales extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_Animales() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_Animales.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_Animales newInstance(String param1, String param2) {
        nav_Animales fragment = new nav_Animales();
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

    ImageView primero, segundo, tercero, cuarto;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav__animales, container, false);

        primero = view.findViewById(R.id.imageViewLeon);
        segundo = view.findViewById(R.id.imageViewLobo);
        tercero = view.findViewById(R.id.imageViewcacatua);
        cuarto = view.findViewById(R.id.imageViewdolphin);


        primero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Navigation.findNavController(v).navigate(R.id.leon); }
        });

        segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.lobo);
            }
        });
        tercero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.cacatua);
            }
        });
        cuarto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.dolphin);
            }
        });

    return  view;
    }
}