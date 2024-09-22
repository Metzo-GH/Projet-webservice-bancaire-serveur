package alom.bank.server.middle;

import java.util.ArrayList;
import java.util.List;

import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

public class CompteManager {

    private List<Compte> comptes = new ArrayList<>();

    // Méthode pour créer un compte
    public Compte creerCompte(Client client, TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException {
        
        // Validation du client et du type de compte
        if (client == null) {
            throw new ClientInexistantException("Le client est inexistant.");
        }

        if (typeCompte == null) {
            throw new TypeCompteInvalideException("Type de compte invalide.");
        }

        // Vérification si le compte existe déjà pour ce client
        for (Compte compte : comptes) {
            if (compte.getClient().equals(client) && compte.getTypeCompte().equals(typeCompte)) {
                throw new CompteDejaExistantException("Ce client a déjà ce type de compte.");
            }
        }

        // Création du nouveau compte
        Compte nouveauCompte = new Compte(client, typeCompte);
        comptes.add(nouveauCompte);
        return nouveauCompte;
    }

    // Méthode pour récupérer un compte
    public Compte recupererCompte(Client client, TypeCompte typeCompte) 
        throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException {
        
        // Validation du client et du type de compte
        if (client == null) {
            throw new ClientInexistantException("Le client est inexistant.");
        }

        if (typeCompte == null) {
            throw new TypeCompteInvalideException("Type de compte invalide.");
        }

        // Recherche du compte
        for (Compte compte : comptes) {
            if (compte.getClient().equals(client) && compte.getTypeCompte().equals(typeCompte)) {
                return compte;
            }
        }

        // Si aucun compte n'est trouvé, lever une exception
        throw new CompteInexistantException("Le compte n'existe pas.");
    }
}
