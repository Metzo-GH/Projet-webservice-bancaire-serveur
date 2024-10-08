package alom.bank.server.middle;

import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.model.Compte;

public class OperationManager {

    // Méthode pour ajouter de l'argent sur un compte
    public Compte ajouterArgent(Compte compte, double somme) 
        throws CompteInexistantException, IllegalArgumentException {
        
        // Validation du compte
        if (compte == null) {
            throw new CompteInexistantException("Le compte n'existe pas.");
        }

        // Validation du montant
        if (somme <= 0) {
            throw new IllegalArgumentException("Le montant à ajouter doit être positif.");
        }

        double nouveauSolde = compte.getSolde() + somme;
        compte.setSolde(nouveauSolde);
        return compte;
    }

    // Méthode pour connaître le solde d'un compte
    public Compte connaitreSolde(Compte compte) 
        throws CompteInexistantException {
        
        // Validation du compte
        if (compte == null) {
            throw new CompteInexistantException("Le compte n'existe pas.");
        }

        // Retourner le solde du compte
        return compte;
    }

    // Méthode pour retirer de l'argent d'un compte
    public Compte retirerArgent(Compte compte, double montant) 
        throws CompteInexistantException, MontantInvalideException, DecouvertNonAutoriseException {

        // Validation du compte
        if (compte == null) {
            throw new CompteInexistantException("Le compte n'existe pas.");
        }

        // Validation du montant à retirer
        if (montant <= 0) {
            throw new MontantInvalideException("Le montant à retirer doit être positif.");
        }

        // Validation du solde pour éviter le découvert non autorisé
        if (compte.getSolde() - montant < 0) {
            throw new DecouvertNonAutoriseException("Le solde est insuffisant pour retirer cette somme.");
        }

        double nouveauSolde = compte.getSolde() - montant;
        compte.setSolde(nouveauSolde);
        return compte;
    }
}
