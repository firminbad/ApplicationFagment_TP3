package com.example.applicationfagment.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.applicationfagment.R;
import com.example.applicationfagment.ui.DataBaseHelp;
import com.example.applicationfagment.ui.home.Notes;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    DataBaseHelp db;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        List<Horaire> horaires = new ArrayList<>();
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));

        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));
        horaires.add(new Horaire("Lundi : ", "Analyse Math", "De 07h à 12H"));
        horaires.add(new Horaire("Mardi : ", "Informatique", "De 07h à 12H"));
        horaires.add(new Horaire("Mercredi : ", "Programmation mobile", "De 07h à 12H"));
        horaires.add(new Horaire("Jeudi : ", "EOE", "De 07h à 12H"));
        horaires.add(new Horaire("Vendredi : ", "Anglais", "De 07h à 12H"));
        horaires.add(new Horaire("Samedi : ", "SFO", "De 07h à 12H"));

        ListView listView = root.findViewById(R.id.calendrier);
        listView.setAdapter(new AdapterHoraire(horaires, getActivity().getApplicationContext()));
        return root;
    }
}