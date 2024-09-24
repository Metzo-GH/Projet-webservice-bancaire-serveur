package alom.bank.client.client;

import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import alom.bank.client.BankService;

import java.util.concurrent.TimeUnit;

public class BankServiceClient {
    
    private BankService service;

    public BankServiceClient() {
        // Créer une instance de ClientProxyFactoryBean
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean(new JaxWsClientFactoryBean());
        
        // Spécifier la classe du service
        factory.setServiceClass(BankService.class);
        
        // Spécifier l'URL du serveur (adapter cette URL selon votre serveur)
        factory.setAddress("http://localhost:8080/cxf-bank-server/BankService");

        // Créer le client pour interagir avec le WebService
        this.service = (BankService) factory.create();

        // Configurer des options HTTP (timeouts, etc.)
        Client client = ClientProxy.getClient(this.service);
        HTTPConduit http = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();

        // Configuration des timeouts (par exemple : 30 secondes)
        httpClientPolicy.setConnectionTimeout(TimeUnit.SECONDS.toMillis(30)); // Timeout de connexion
        httpClientPolicy.setReceiveTimeout(TimeUnit.SECONDS.toMillis(30)); // Timeout de réception

        // Appliquer la politique HTTP au conduit
        http.setClient(httpClientPolicy);
    }

    public BankService getService() {
        return service;
    }
}
