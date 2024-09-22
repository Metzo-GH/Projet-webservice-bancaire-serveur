package alom.bank.server.service;

import org.junit.jupiter.api.Test;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;
import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.front.BankServiceImpl;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

public class BankServiceImplTest {

    private final BankServiceImpl bankService = new BankServiceImpl();

    @Test
    public void testCreerClient() {
        try {
            Client client = bankService.creerClient("John", "Doe", Calendar.getInstance());
            assertNotNull(client);
        } catch (ClientDejaExistantException e) {
            fail("Client should not already exist");
        }
    }

    @Test
    public void testRecupererClient() {
        try {
            // Ajoutez un client d'abord
            Client client = bankService.creerClient("Jane", "Doe", Calendar.getInstance());
            Client recuperer = bankService.recupererClient("Jane", "Doe", Calendar.getInstance());
            assertEquals(client, recuperer);
        } catch (ClientDejaExistantException | ClientInexistantException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void testCreerCompte() {
        try {
            Client client = bankService.creerClient("John", "Doe", Calendar.getInstance());
            Compte compte = bankService.creerCompte(client, TypeCompte.CHEQUES);
            assertNotNull(compte);
        } catch (ClientDejaExistantException | TypeCompteInvalideException | CompteDejaExistantException | ClientInexistantException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void testAjouterArgent() {
        try {
            Client client = bankService.creerClient("John", "Doe", Calendar.getInstance());
            Compte compte = bankService.creerCompte(client, TypeCompte.CHEQUES);
            double nouveauSolde = bankService.ajouterArgent(compte, 100.0);
            assertEquals(100.0, nouveauSolde);
        } catch (ClientDejaExistantException | CompteDejaExistantException | TypeCompteInvalideException | CompteInexistantException | ClientInexistantException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void testRetirerArgent() {
        try {
            Client client = bankService.creerClient("John", "Doe", Calendar.getInstance());
            Compte compte = bankService.creerCompte(client, TypeCompte.CHEQUES);
            bankService.ajouterArgent(compte, 100.0);
            double nouveauSolde = bankService.retirerArgent(compte, 50.0);
            assertEquals(50.0, nouveauSolde);
        } catch (ClientDejaExistantException | CompteDejaExistantException | TypeCompteInvalideException | CompteInexistantException | MontantInvalideException | DecouvertNonAutoriseException | ClientInexistantException e) {
            fail("Exception should not be thrown");
        }
    }

    // Ajout d'un test pour la vérification des exceptions (exemple pour CompteInexistantException)
    @Test
    public void testRetirerArgent_CompteInexistant() {
        try {
            Compte compte = new Compte(null, TypeCompte.CHEQUES); // Compte sans client
            bankService.retirerArgent(compte, 50.0);
            fail("Should have thrown CompteInexistantException");
        } catch (CompteInexistantException e) {
            // Test réussi si l'exception est levée
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }
}
