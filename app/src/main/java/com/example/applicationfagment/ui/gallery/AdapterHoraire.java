package com.example.applicationfagment.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.applicationfagment.R;
import com.example.applicationfagment.ui.home.Notes;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterHoraire  extends BaseAdapter {
    private List<Horaire> horaires = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public AdapterHoraire(List<Horaire> horaires, Context context) {
        this.horaires = horaires;
        this.context = context;
        this.inflater = inflater.from(context);
    }

    @Override
    public int getCount() {
        return horaires.size();
    }

    @Override
    public Object getItem(int position) {
        return horaires.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.adapter_horaire, null);
        Horaire item = (Horaire) getItem(position);
        String jours = item.getJour();
        String heure = item.getHeures();
        String cours = item.getCours();


        TextView jour = view.findViewById(R.id.textView5);
        jour.setText(jours);
        TextView courss = view.findViewById(R.id.textView6);
        courss.setText(cours);
        TextView heur = view.findViewById(R.id.textView7);
        heur.setText(heure);
        return view;
    }
}
