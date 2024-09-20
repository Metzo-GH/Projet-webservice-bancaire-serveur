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
    public void testAjouterArgent() {
        try {
            // Ajoutez un client et un compte d'abord
            Client client = bankService.creerClient("John", "Doe", Calendar.getInstance());
            Compte compte = bankService.creerCompte(client, TypeCompte.CHEQUES);
            double nouveauSolde = bankService.ajouterArgent(compte, 100.0);
            assertEquals(100.0, nouveauSolde);
        } catch (ClientDejaExistantException | CompteDejaExistantException | TypeCompteInvalideException | CompteInexistantException | ClientInexistantException e) {
            fail("Exception should not be thrown");
        }
    }

    // Ajoutez des tests similaires pour les autres méthodes
}
