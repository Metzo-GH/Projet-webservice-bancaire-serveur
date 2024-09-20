package alom.bank.server.model;

public class Compte {
    private String numeroCompte; // Numéro de compte
    private Client titulaire; // Titulaire du compte
    private TypeCompte typeCompte; // Type de compte

    // Constructeur
    public Compte(String numeroCompte, Client titulaire, TypeCompte typeCompte) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.typeCompte = typeCompte;
    }

    // Getters et Setters
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }
}
