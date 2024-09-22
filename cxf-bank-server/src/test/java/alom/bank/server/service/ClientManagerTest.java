package alom.bank.server.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import alom.bank.server.exception.client.ClientDejaExistantException;
import alom.bank.server.exception.client.ClientInexistantException;
import alom.bank.server.middle.ClientManager;
import alom.bank.server.model.Client;

public class ClientManagerTest {
    
    private ClientManager clientManager;

    @BeforeEach
    public void setUp() {
        clientManager = new ClientManager();
    }

    @Test
    public void testCreerClient() throws ClientDejaExistantException {
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);
        Client client = clientManager.creerClient("John", "Doe", dateNaissance);
        assertNotNull(client);
        assertEquals("John", client.getPrenom());
        assertEquals("Doe", client.getNom());
    }

    @Test
    public void testCreerClientDejaExistant() throws ClientDejaExistantException {
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);
        clientManager.creerClient("John", "Doe", dateNaissance);

        assertThrows(ClientDejaExistantException.class, () -> {
            clientManager.creerClient("John", "Doe", dateNaissance);
        });
    }

    @Test
    public void testRecupererClient() throws ClientInexistantException, ClientDejaExistantException {
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);
        clientManager.creerClient("John", "Doe", dateNaissance);

        Client client = clientManager.recupererClient("John", "Doe", dateNaissance);
        assertNotNull(client);
    }

    @Test
    public void testRecupererClientInexistant() {
        Calendar dateNaissance = Calendar.getInstance();
        dateNaissance.set(1990, Calendar.JANUARY, 1);

        assertThrows(ClientInexistantException.class, () -> {
            clientManager.recupererClient("Jane", "Doe", dateNaissance);
        });
    }
}
