package alom.bank.server.middle;

import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.model.Compte;

public class OperationManager {

    // Méthode pour ajouter de l'argent sur un compte
    public double ajouterArgent(Compte compte, double somme) 
        throws CompteInexistantException, IllegalArgumentException {
        
        // Validation du compte
        if (compte == null) {
            throw new CompteInexistantException("Le compte n'existe pas.");
        }

        // Validation du montant
        if (somme <= 0) {
            throw new IllegalArgumentException("Le montant à ajouter doit être positif.");
        }

        // Utilisation de la méthode ajouterSolde pour mettre à jour le solde
        compte.ajouterSolde(somme);
        return compte.getSolde();
    }

    // Méthode pour connaître le solde d'un compte
    public double connaitreSolde(Compte compte) 
        throws CompteInexistantException {
        
        // Validation du compte
        if (compte == null) {
            throw new CompteInexistantException("Le compte n'existe pas.");
        }

        // Retourner le solde du compte
        return compte.getSolde();
    }

    // Méthode pour retirer de l'argent d'un compte
    public double retirerArgent(Compte compte, double montant) 
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

        // Utilisation de la méthode retirerSolde pour mettre à jour le solde
        compte.retirerSolde(montant);
        return compte.getSolde();
    }
}
