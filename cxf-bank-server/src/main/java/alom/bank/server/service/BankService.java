package alom.bank.server.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.Calendar;

import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.client.ClientNotFoundException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

@WebService
public interface BankService {
    @WebMethod
    Client creerClient(String prenom, String nom, Calendar DateNaissance) throws ClientDejaExistantException;

    @WebMethod
    Client recupererClient(String prenom, String nom, Calendar DateNaissance) throws ClientNotFoundException;

    @WebMethod
    Compte creerCompte(Client client, TypeCompte typeCompte) throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException;

    @WebMethod
    Compte recupererCompte(Client client, TypeCompte typeCompte)
            throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException;
}
