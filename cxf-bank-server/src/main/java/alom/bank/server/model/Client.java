package alom.bank.server.model;

import java.util.Calendar;

public class Client {
    private String prenom;
    private String nom;
    private Calendar DateNaissance;

    // Constructeur par défaut requis par JAXB
    public Client() {}

    // Constructeur
    public Client(String prenom, String nom, Calendar DateNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.DateNaissance = DateNaissance;
    }

    // Getters
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public Calendar getDateNaissance() {
        return DateNaissance;
    }

    // Setters
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateNaissance(Calendar dateNaissance) {
        this.DateNaissance = dateNaissance;
    }
}
