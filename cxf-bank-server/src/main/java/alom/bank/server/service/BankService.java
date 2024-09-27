package alom.bank.server.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Calendar;

import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

@WebService
public interface BankService {
    
    @WebMethod
    Client creerClient(
        @WebParam(name = "prenom") String prenom, 
        @WebParam(name = "nom") String nom, 
        @WebParam(name = "DateNaissance") Calendar DateNaissance) 
        throws ClientDejaExistantException;

    @WebMethod
    Client recupererClient(
        @WebParam(name = "prenom") String prenom, 
        @WebParam(name = "nom") String nom, 
        @WebParam(name = "DateNaissance") Calendar DateNaissance) 
        throws ClientInexistantException;

    @WebMethod
    Compte creerCompte(
        @WebParam(name = "client") Client client, 
        @WebParam(name = "typeCompte") TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException;

    @WebMethod
    Compte recupererCompte(
        @WebParam(name = "client") Client client, 
        @WebParam(name = "typeCompte") TypeCompte typeCompte)
        throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException;

    @WebMethod
    Compte ajouterArgent(
        @WebParam(name = "compte") Compte compte, 
        @WebParam(name = "somme") double somme) 
        throws CompteInexistantException, IllegalArgumentException;
    
    @WebMethod
    Compte connaitreSolde(
        @WebParam(name = "compte") Compte compte) 
        throws CompteInexistantException;

    @WebMethod
    Compte retirerArgent(
        @WebParam(name = "compte") Compte compte, 
        @WebParam(name = "montant") double montant) 
        throws CompteInexistantException, MontantInvalideException, DecouvertNonAutoriseException;

}
