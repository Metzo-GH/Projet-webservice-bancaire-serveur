package alom.bank.server.model;

import java.util.Calendar;

public class Client {
    private String prenom;
    private String nom;
    private Calendar DateNaissance;

    // Constructeur
    public Client(String prenom, String nom, Calendar DateNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.DateNaissance = DateNaissance;
    }

    // Getters
    public String getprenom() {
        return prenom;
    }

    public String getnom() {
        return nom;
    }

    public Calendar getDateNaissance() {
        return DateNaissance;
    }
}
