package alom.bank.server.model;

public class Compte {
    private Client client;
    private TypeCompte typeCompte;
    private double solde; // Ajout de la propriété solde

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

    public void ajouterSolde(double montant) {
        this.solde += montant;
    }

    public void retirerSolde(double montant) {
        this.solde -= montant; // Assurez-vous que "solde" est une propriété de la classe Compte.
    }
    
}
