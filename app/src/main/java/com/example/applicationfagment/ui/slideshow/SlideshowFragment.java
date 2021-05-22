package com.example.applicationfagment.ui.slideshow;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.applicationfagment.R;
import com.example.applicationfagment.ui.DataBaseHelp;

public class SlideshowFragment extends Fragment {
    DataBaseHelp db;
    private EditText nom, prenom, password;
    private Button btn_valider, btn_imprimer;

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        nom = (EditText)root.findViewById(R.id.nomTv);
        prenom = (EditText)root.findViewById(R.id.prenomTV);
        password = (EditText)root.findViewById(R.id.motPass);
        btn_imprimer = (Button)root.findViewById(R.id.btnImpr);
        btn_valider = (Button)root.findViewById(R.id.btnEnr);
        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!nom.getText().toString().equals("") && !prenom.getText().toString().equals("") && !password.getText().toString().equals("")){
                    db = new DataBaseHelp(root.getContext());
                    if (db.insert(nom.getText().toString(), prenom.getText().toString(), password.getText().toString()))
                        Toast.makeText(getActivity().getApplicationContext(), "Vos données sont enregistrées avec succès ! ! !", Toast.LENGTH_SHORT).show();
                    else Log.e("Erreur", "Echec");
                }else Toast.makeText(getActivity().getApplicationContext(), "Veuillez remplir les champs vides SVP ! ! !", Toast.LENGTH_SHORT).show();

            }
        });




        return root;
    }
}