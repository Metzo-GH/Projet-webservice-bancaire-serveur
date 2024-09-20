package alom.bank.server.model;

public class Compte {
    private Client client;
    private TypeCompte typeCompte;

    // Constructeur
    public Compte(Client client, TypeCompte typeCompte) {
        this.client = client;
        this.typeCompte = typeCompte;
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

    // Autres méthodes si nécessaire
}
