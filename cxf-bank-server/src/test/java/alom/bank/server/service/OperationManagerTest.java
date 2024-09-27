package alom.bank.server.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import alom.bank.server.exception.compte.CompteInexistantException;
import alom.bank.server.exception.solde.DecouvertNonAutoriseException;
import alom.bank.server.exception.solde.MontantInvalideException;
import alom.bank.server.middle.OperationManager;
import alom.bank.server.model.Client;
import alom.bank.server.model.Compte;
import alom.bank.server.model.TypeCompte;
import java.util.Calendar;

public class OperationManagerTest {

    private OperationManager operationManager;
    private Compte compte;

    @BeforeEach
    public void setUp() {
        operationManager = new OperationManager();
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);
        Client client = new Client("John", "Doe", dateNaissance);
        compte = new Compte(client, TypeCompte.CHEQUES);
    }

    @Test
    public void testAjouterArgent() throws CompteInexistantException, IllegalArgumentException {
        operationManager.ajouterArgent(compte, 100.0);
        assertEquals(100.0, compte.getSolde());
    }

    @Test
    public void testAjouterArgentMontantInvalide() {
        assertThrows(IllegalArgumentException.class, () -> {
            operationManager.ajouterArgent(compte, -50.0);
        });
    }

    @Test
    public void testConnaitreSolde() throws CompteInexistantException {
        operationManager.ajouterArgent(compte, 100.0);
        operationManager.connaitreSolde(compte);
        assertEquals(100.0, compte.getSolde());
    }

    @Test
    public void testRetirerArgent() throws CompteInexistantException, MontantInvalideException, DecouvertNonAutoriseException {
        operationManager.ajouterArgent(compte, 100.0);
        operationManager.retirerArgent(compte, 50.0);
        assertEquals(50.0, compte.getSolde());
    }

    @Test
    public void testRetirerArgentMontantInvalide() throws CompteInexistantException {
        assertThrows(MontantInvalideException.class, () -> {
            operationManager.retirerArgent(compte, -50.0);
        });
    }

    @Test
    public void testRetirerArgentDecouvertNonAutorise() throws CompteInexistantException, MontantInvalideException {
        operationManager.ajouterArgent(compte, 50.0);

        assertThrows(DecouvertNonAutoriseException.class, () -> {
            operationManager.retirerArgent(compte, 100.0);
        });
    }
}
