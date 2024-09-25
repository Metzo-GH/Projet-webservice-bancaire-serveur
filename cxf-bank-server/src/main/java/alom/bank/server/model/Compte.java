package alom.bank.server.model;

public class Compte {
    private Client client;
    private TypeCompte typeCompte;
    private double solde;

    // Constructeur par défaut requis par JAXB
    public Compte() {}

    // Constructeur
    public Compte(Client client, TypeCompte typeCompte) {
        this.client = client;
        this.typeCompte = typeCompte;
        this.solde = 0; // Initialiser le solde à 0 lors de la création du compte
    }

    // Getters et Setters
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
}
