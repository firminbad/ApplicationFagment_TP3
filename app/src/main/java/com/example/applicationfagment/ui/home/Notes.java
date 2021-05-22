package com.example.applicationfagment.ui.home;

public class Notes {
    private String nomCours;
    private String nbreH;
    private int point;

    public Notes(String nomCours, String nbreH, int point) {
        this.nomCours = nomCours;
        this.nbreH = nbreH;
        this.point = point;
    }

    public String getNomCours() {
        return nomCours;
    }

    public String getNbreH() {
        return nbreH;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "nomCours='" + nomCours + '\'' +
                ", nbreH='" + nbreH + '\'' +
                ", point=" + point +
                '}';
    }
}
