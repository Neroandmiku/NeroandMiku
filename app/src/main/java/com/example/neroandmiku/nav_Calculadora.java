package com.example.neroandmiku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link com.example.neroandmiku.nav_Calculadora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav_Calculadora extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_Calculadora() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_Calculadora.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_Calculadora newInstance(String param1, String param2) {
        nav_Calculadora fragment = new nav_Calculadora();
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

    EditText N1, N2, N3;
    Button suma, dividir, resta, multipli, salir;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav__calculadora, container, false);

        N1 = view.findViewById(R.id.etNro1);
        N2 = view.findViewById(R.id.etNro2);
        N3 = view.findViewById(R.id.etResultado);
        suma = view.findViewById(R.id.btnSumar);
        dividir = view.findViewById(R.id.btnDiv);
        salir = view.findViewById(R.id.btnSalir);
        resta = view.findViewById(R.id.btnRestar);
        multipli = view.findViewById(R.id.btnMulti);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Sumar(); }
        });


        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Dividir(); }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Restar(); }
        });

        multipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Multiplicar(); }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_home);
            }
        });

        return view;
    }

    private void Sumar() {
        double nro1 = Double.valueOf(N1.getText().toString());
        double nro2 = Double.valueOf(N2.getText().toString());
        double suma = nro1 + nro2;
        N3.setText(String.valueOf(suma));
    }

    private void Restar() {
        double nro1 = Double.valueOf(N1.getText().toString());
        double nro2 = Double.valueOf(N2.getText().toString());
        double res = nro1 - nro2;
        N3.setText(String.valueOf(res));
    }

    private void Multiplicar() {
        double nro1 = Double.valueOf(N1.getText().toString());
        double nro2 = Double.valueOf(N2.getText().toString());
        double mult = nro1 * nro2;
        N3.setText(String.valueOf(mult));
    }


    private void Dividir() {
        double nro1 = Double.valueOf(N1.getText().toString());
        double nro2 = Double.valueOf(N2.getText().toString());
        if (nro2 == 0){
            N3.setText("Error: Division entre 0");
        }else{
            double Division = nro1 / nro2;
            N3.setText(String.valueOf(Division));
        }
    }
}