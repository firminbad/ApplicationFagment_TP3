package com.example.applicationfagment.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.applicationfagment.R;
import com.example.applicationfagment.ui.DataBaseHelp;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    DataBaseHelp db;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = root.findViewById(R.id.notes);

        List<Notes> notesList = new ArrayList<>();
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));

        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));
        notesList.add(new Notes("Informatiquees", "60", 10));
        notesList.add(new Notes("Informatique", "60", 10));












        listView.setAdapter(new AdapterNote(notesList, getActivity().getApplicationContext()));
        return root;
    }
}