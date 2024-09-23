package alom.bank.server.service;

import java.util.Calendar;
import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.middle.ClientManager;
import alom.bank.server.middle.CompteManager;
import alom.bank.server.middle.OperationManager;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

public class BankServiceImpl implements BankService {
    
    private final ClientManager clientManager = new ClientManager();
    private final CompteManager compteManager = new CompteManager();
    private final OperationManager operationManager = new OperationManager();

    @Override
    public Client creerClient(String prenom, String nom, Calendar dateNaissance) throws ClientDejaExistantException {
        return clientManager.creerClient(prenom, nom, dateNaissance);
    }

    @Override
    public Client recupererClient(String prenom, String nom, Calendar dateNaissance) throws ClientInexistantException {
        return clientManager.recupererClient(prenom, nom, dateNaissance);
    }

    @Override
    public Compte creerCompte(Client client, TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException {
        return compteManager.creerCompte(client, typeCompte);
    }

    @Override
    public Compte recupererCompte(Client client, TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException {
        return compteManager.recupererCompte(client, typeCompte);
    }

    @Override
    public double ajouterArgent(Compte compte, double somme) 
        throws CompteInexistantException, IllegalArgumentException {
        return operationManager.ajouterArgent(compte, somme);
    }

    @Override
    public double connaitreSolde(Compte compte) throws CompteInexistantException {
        return operationManager.connaitreSolde(compte);
    }

    @Override
    public double retirerArgent(Compte compte, double montant) 
        throws CompteInexistantException, MontantInvalideException, DecouvertNonAutoriseException {
        return operationManager.retirerArgent(compte, montant);
    }
}
