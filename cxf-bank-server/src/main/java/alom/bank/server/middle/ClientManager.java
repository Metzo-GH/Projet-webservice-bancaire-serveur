package alom.bank.server.middle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.model.Client;

public class ClientManager {

    private List<Client> clients = new ArrayList<>();

    // Méthode pour créer un client
    public Client creerClient(String prenom, String nom, Calendar dateNaissance) throws ClientDejaExistantException {
        // Vérification si le client existe déjà
        for (Client client : clients) {
            if (client.getPrenom().equals(prenom) && client.getNom().equals(nom) && client.getDateNaissance().equals(dateNaissance)) {
                throw new ClientDejaExistantException("Le client existe déjà.");
            }
        }
        // Création d'un nouveau client
        Client nouveauClient = new Client(prenom, nom, dateNaissance);
        clients.add(nouveauClient);
        return nouveauClient;
    }

    // Méthode pour récupérer un client existant
    public Client recupererClient(String prenom, String nom, Calendar dateNaissance) throws ClientInexistantException {
        // Parcourir la liste pour trouver le client correspondant
        for (Client client : clients) {
            if (client.getPrenom().equals(prenom) && client.getNom().equals(nom) && client.getDateNaissance().equals(dateNaissance)) {
                return client;
            }
        }
        // Si aucun client n'a été trouvé, on lève une exception
        throw new ClientInexistantException("Le client est introuvable.");
    }
}
