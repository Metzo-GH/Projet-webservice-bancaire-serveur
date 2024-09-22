package alom.bank.server.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.exception.compte.CompteDejaExistantException;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.compte.TypeCompteInvalideException;
import alom.bank.server.middle.CompteManager;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;

public class CompteManagerTest {

    private CompteManager compteManager;
    private Client client;

    @BeforeEach
    public void setUp() {
        compteManager = new CompteManager();
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);
        client = new Client("John", "Doe", dateNaissance);
    }

    @Test
    public void testCreerCompte() throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException {
        Compte compte = compteManager.creerCompte(client, TypeCompte.CHEQUES);
        assertNotNull(compte);
        assertEquals(TypeCompte.CHEQUES, compte.getTypeCompte());
    }

    @Test
    public void testCreerCompteDejaExistant() throws ClientInexistantException, TypeCompteInvalideException, CompteDejaExistantException {
        compteManager.creerCompte(client, TypeCompte.CHEQUES);

        assertThrows(CompteDejaExistantException.class, () -> {
            compteManager.creerCompte(client, TypeCompte.CHEQUES);
        });
    }

    @Test
    public void testRecupererCompte() throws ClientInexistantException, TypeCompteInvalideException, CompteInexistantException, CompteDejaExistantException {
        compteManager.creerCompte(client, TypeCompte.CHEQUES);
        Compte compte = compteManager.recupererCompte(client, TypeCompte.CHEQUES);
        assertNotNull(compte);
    }

    @Test
    public void testRecupererCompteInexistant() throws ClientInexistantException, TypeCompteInvalideException {
        assertThrows(CompteInexistantException.class, () -> {
            compteManager.recupererCompte(client, TypeCompte.CHEQUES);
        });
    }
}
