package alom.bank.server.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.Calendar;

import alom.bank.server.exception.client.ClientAlreadyExistsException;
import alom.bank.server.exception.client.ClientInvalideException;
import alom.bank.server.exception.client.ClientNotFoundException;
import alom.bank.server.exception.compte.CompteDejaExisteException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

@WebService
public interface BankService {
    @WebMethod
    Client createClient(String prenom, String nom, Calendar DateNaissance) throws ClientAlreadyExistsException;

    @WebMethod
    Client getClient(String prenom, String nom, Calendar DateNaissance) throws ClientNotFoundException;

    @WebMethod
    Compte createCompte(Client client, TypeCompte typeCompte) throws ClientInvalideException, TypeCompteInvalideException, CompteDejaExisteException;
}
