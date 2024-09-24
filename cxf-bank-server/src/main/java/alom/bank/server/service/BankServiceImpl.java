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
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;

@WebService(endpointInterface = "alom.bank.server.service.BankService")
public class BankServiceImpl implements BankService {
    
    private final ClientManager clientManager = new ClientManager();
    private final CompteManager compteManager = new CompteManager();
    private final OperationManager operationManager = new OperationManager();

    @WebMethod
    @Override
    public Client creerClient(
        @WebParam(name = "prenom") String prenom, 
        @WebParam(name = "nom") String nom, 
        @WebParam(name = "DateNaissance") Calendar dateNaissance) 
        throws ClientDejaExistantException {
        return clientManager.creerClient(prenom, nom, dateNaissance);
    }

    @WebMethod
    @Override
    public Client recupererClient(
        @WebParam(name = "prenom") String prenom, 
        @WebParam(name = "nom") String nom, 
        @WebParam(name = "DateNaissance") Calendar dateNaissance) 
        throws ClientInexistantException {
        return clientManager.recupererClient(prenom, nom, dateNaissance);
    }

    @WebMethod
    @Override
    public Compte creerCompte(
        @WebParam(name = "client") Client client, 
        @WebParam(name = "typeCompte") TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException {
        return compteManager.creerCompte(client, typeCompte);
    }

    @WebMethod
    @Override
    public Compte recupererCompte(
        @WebParam(name = "client") Client client, 
        @WebParam(name = "typeCompte") TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException {
        return compteManager.recupererCompte(client, typeCompte);
    }

    @WebMethod
    @Override
    public double ajouterArgent(
        @WebParam(name = "compte") Compte compte, 
        @WebParam(name = "somme") double somme) 
        throws CompteInexistantException, IllegalArgumentException {
        return operationManager.ajouterArgent(compte, somme);
    }

    @WebMethod
    @Override
    public double connaitreSolde(
        @WebParam(name = "compte") Compte compte) 
        throws CompteInexistantException {
        return operationManager.connaitreSolde(compte);
    }

    @WebMethod
    @Override
    public double retirerArgent(
        @WebParam(name = "compte") Compte compte, 
        @WebParam(name = "montant") double montant) 
        throws CompteInexistantException, MontantInvalideException, DecouvertNonAutoriseException {
        return operationManager.retirerArgent(compte, montant);
    }
}
