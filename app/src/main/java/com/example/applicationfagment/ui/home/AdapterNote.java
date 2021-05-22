package com.example.applicationfagment.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.applicationfagment.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterNote   extends BaseAdapter {
    private List<Notes> notes = new ArrayList<>();
    private Context context;
    private LayoutInflater inflater;

    public AdapterNote(List<Notes> notes, Context context) {
        this.notes = notes;
        this.context = context;
        this.inflater = inflater.from(context);
    }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Override
    public Object getItem(int position) {
        return  notes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.adapter_note, null);
        Notes item = (Notes)getItem(position);
        String nomCours = item.getNomCours();
        String nbreH = item.getNbreH();
        String point = String.valueOf(item.getPoint());


        TextView cours = view.findViewById(R.id.textView2);
        cours.setText(nomCours);
        TextView nb = view.findViewById(R.id.textView3);
        nb.setText(nbreH);
        TextView points = view.findViewById(R.id.textView4);
        points.setText(point);

        return view;
    }
}
