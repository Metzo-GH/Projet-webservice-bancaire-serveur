package alom.bank.server.service;

import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;
import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import jakarta.jws.WebService;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@WebService
public class BankServiceImpl implements BankService {
    private final Map<String, Client> clients = new HashMap<>();
    private final Map<Client, Map<TypeCompte, Compte>> comptes = new HashMap<>();

    @Override
    public Client creerClient(String prenom, String nom, Calendar dateNaissance) throws ClientDejaExistantException {
        String key = prenom + nom + dateNaissance.getTimeInMillis();
        if (clients.containsKey(key)) {
            throw new ClientDejaExistantException("Un client avec ces informations existe déjà.");
        }
        Client client = new Client(prenom, nom, dateNaissance);
        clients.put(key, client);
        return client;
    }

    @Override
    public Client recupererClient(String prenom, String nom, Calendar dateNaissance) throws ClientInexistantException {
        String key = prenom + nom + dateNaissance.getTimeInMillis();
        Client client = clients.get(key);
        if (client == null) {
            throw new ClientInexistantException("Aucun client trouvé avec ces informations.");
        }
        return client;
    }

    @Override
    public Compte creerCompte(Client client, TypeCompte typeCompte) throws TypeCompteInvalideException, CompteDejaExistantException, ClientInexistantException {
        if (client == null || !clients.containsValue(client)) {
            throw new ClientInexistantException("Le client spécifié est incorrect ou n'existe pas.");
        }
        if (typeCompte == null) {
            throw new TypeCompteInvalideException("Le type de compte spécifié n'existe pas.");
        }

        // Créer un compte s'il n'existe pas déjà
        return comptes.computeIfAbsent(client, k -> new HashMap<>()).computeIfAbsent(typeCompte, k -> {
            Compte compte = new Compte(client, typeCompte);
            return compte;
        });
    }

    @Override
    public Compte recupererCompte(Client client, TypeCompte typeCompte) throws CompteInexistantException, ClientInexistantException, TypeCompteInvalideException {
        if (client == null || !clients.containsValue(client)) {
            throw new ClientInexistantException("Le client spécifié est incorrect ou n'existe pas.");
        }
        if (typeCompte == null) {
            throw new TypeCompteInvalideException("Le type de compte spécifié n'existe pas.");
        }

        Compte compte = comptes.getOrDefault(client, new HashMap<>()).get(typeCompte);
        if (compte == null) {
            throw new CompteInexistantException("Le compte recherché n'existe pas.");
        }
        return compte;
    }
}
