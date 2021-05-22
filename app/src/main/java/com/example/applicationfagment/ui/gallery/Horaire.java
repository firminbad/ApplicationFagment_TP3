package com.example.applicationfagment.ui.gallery;

public class Horaire {
    private String jour;
    private String cours;
    private String heures;

    public Horaire(String jour, String cours, String heures) {
        this.jour = jour;
        this.cours = cours;
        this.heures = heures;
    }

    public String getJour() {
        return jour;
    }

    public String getCours() {
        return cours;
    }

    public String getHeures() {
        return heures;
    }
}
