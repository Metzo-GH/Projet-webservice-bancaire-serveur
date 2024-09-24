
package alom.bank.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the alom.bank.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreerClientResponse_QNAME = new QName("http://service.server.bank.alom/", "creerClientResponse");
    private final static QName _CreerCompteResponse_QNAME = new QName("http://service.server.bank.alom/", "creerCompteResponse");
    private final static QName _MontantInvalideException_QNAME = new QName("http://service.server.bank.alom/", "MontantInvalideException");
    private final static QName _CompteDejaExistantException_QNAME = new QName("http://service.server.bank.alom/", "CompteDejaExistantException");
    private final static QName _CreerCompte_QNAME = new QName("http://service.server.bank.alom/", "creerCompte");
    private final static QName _RetirerArgent_QNAME = new QName("http://service.server.bank.alom/", "retirerArgent");
    private final static QName _RetirerArgentResponse_QNAME = new QName("http://service.server.bank.alom/", "retirerArgentResponse");
    private final static QName _AjouterArgent_QNAME = new QName("http://service.server.bank.alom/", "ajouterArgent");
    private final static QName _DecouvertNonAutoriseException_QNAME = new QName("http://service.server.bank.alom/", "DecouvertNonAutoriseException");
    private final static QName _RecupererClientResponse_QNAME = new QName("http://service.server.bank.alom/", "recupererClientResponse");
    private final static QName _ClientDejaExistantException_QNAME = new QName("http://service.server.bank.alom/", "ClientDejaExistantException");
    private final static QName _RecupererCompte_QNAME = new QName("http://service.server.bank.alom/", "recupererCompte");
    private final static QName _TypeCompteInvalideException_QNAME = new QName("http://service.server.bank.alom/", "TypeCompteInvalideException");
    private final static QName _AjouterArgentResponse_QNAME = new QName("http://service.server.bank.alom/", "ajouterArgentResponse");
    private final static QName _ConnaitreSoldeResponse_QNAME = new QName("http://service.server.bank.alom/", "connaitreSoldeResponse");
    private final static QName _CreerClient_QNAME = new QName("http://service.server.bank.alom/", "creerClient");
    private final static QName _ClientInexistantException_QNAME = new QName("http://service.server.bank.alom/", "ClientInexistantException");
    private final static QName _RecupererCompteResponse_QNAME = new QName("http://service.server.bank.alom/", "recupererCompteResponse");
    private final static QName _CompteInexistantException_QNAME = new QName("http://service.server.bank.alom/", "CompteInexistantException");
    private final static QName _RecupererClient_QNAME = new QName("http://service.server.bank.alom/", "recupererClient");
    private final static QName _ConnaitreSolde_QNAME = new QName("http://service.server.bank.alom/", "connaitreSolde");
    private final static QName _IllegalArgumentException_QNAME = new QName("http://service.server.bank.alom/", "IllegalArgumentException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: alom.bank.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerClientResponse }
     * 
     */
    public CreerClientResponse createCreerClientResponse() {
        return new CreerClientResponse();
    }

    /**
     * Create an instance of {@link CreerCompteResponse }
     * 
     */
    public CreerCompteResponse createCreerCompteResponse() {
        return new CreerCompteResponse();
    }

    /**
     * Create an instance of {@link MontantInvalideException }
     * 
     */
    public MontantInvalideException createMontantInvalideException() {
        return new MontantInvalideException();
    }

    /**
     * Create an instance of {@link CreerCompte }
     * 
     */
    public CreerCompte createCreerCompte() {
        return new CreerCompte();
    }

    /**
     * Create an instance of {@link CompteDejaExistantException }
     * 
     */
    public CompteDejaExistantException createCompteDejaExistantException() {
        return new CompteDejaExistantException();
    }

    /**
     * Create an instance of {@link AjouterArgent }
     * 
     */
    public AjouterArgent createAjouterArgent() {
        return new AjouterArgent();
    }

    /**
     * Create an instance of {@link RetirerArgentResponse }
     * 
     */
    public RetirerArgentResponse createRetirerArgentResponse() {
        return new RetirerArgentResponse();
    }

    /**
     * Create an instance of {@link RetirerArgent }
     * 
     */
    public RetirerArgent createRetirerArgent() {
        return new RetirerArgent();
    }

    /**
     * Create an instance of {@link DecouvertNonAutoriseException }
     * 
     */
    public DecouvertNonAutoriseException createDecouvertNonAutoriseException() {
        return new DecouvertNonAutoriseException();
    }

    /**
     * Create an instance of {@link TypeCompteInvalideException }
     * 
     */
    public TypeCompteInvalideException createTypeCompteInvalideException() {
        return new TypeCompteInvalideException();
    }

    /**
     * Create an instance of {@link RecupererCompte }
     * 
     */
    public RecupererCompte createRecupererCompte() {
        return new RecupererCompte();
    }

    /**
     * Create an instance of {@link RecupererClientResponse }
     * 
     */
    public RecupererClientResponse createRecupererClientResponse() {
        return new RecupererClientResponse();
    }

    /**
     * Create an instance of {@link ClientDejaExistantException }
     * 
     */
    public ClientDejaExistantException createClientDejaExistantException() {
        return new ClientDejaExistantException();
    }

    /**
     * Create an instance of {@link CreerClient }
     * 
     */
    public CreerClient createCreerClient() {
        return new CreerClient();
    }

    /**
     * Create an instance of {@link ClientInexistantException }
     * 
     */
    public ClientInexistantException createClientInexistantException() {
        return new ClientInexistantException();
    }

    /**
     * Create an instance of {@link AjouterArgentResponse }
     * 
     */
    public AjouterArgentResponse createAjouterArgentResponse() {
        return new AjouterArgentResponse();
    }

    /**
     * Create an instance of {@link ConnaitreSoldeResponse }
     * 
     */
    public ConnaitreSoldeResponse createConnaitreSoldeResponse() {
        return new ConnaitreSoldeResponse();
    }

    /**
     * Create an instance of {@link RecupererClient }
     * 
     */
    public RecupererClient createRecupererClient() {
        return new RecupererClient();
    }

    /**
     * Create an instance of {@link RecupererCompteResponse }
     * 
     */
    public RecupererCompteResponse createRecupererCompteResponse() {
        return new RecupererCompteResponse();
    }

    /**
     * Create an instance of {@link CompteInexistantException }
     * 
     */
    public CompteInexistantException createCompteInexistantException() {
        return new CompteInexistantException();
    }

    /**
     * Create an instance of {@link IllegalArgumentException }
     * 
     */
    public IllegalArgumentException createIllegalArgumentException() {
        return new IllegalArgumentException();
    }

    /**
     * Create an instance of {@link ConnaitreSolde }
     * 
     */
    public ConnaitreSolde createConnaitreSolde() {
        return new ConnaitreSolde();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "creerClientResponse")
    public JAXBElement<CreerClientResponse> createCreerClientResponse(CreerClientResponse value) {
        return new JAXBElement<CreerClientResponse>(_CreerClientResponse_QNAME, CreerClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "creerCompteResponse")
    public JAXBElement<CreerCompteResponse> createCreerCompteResponse(CreerCompteResponse value) {
        return new JAXBElement<CreerCompteResponse>(_CreerCompteResponse_QNAME, CreerCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontantInvalideException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "MontantInvalideException")
    public JAXBElement<MontantInvalideException> createMontantInvalideException(MontantInvalideException value) {
        return new JAXBElement<MontantInvalideException>(_MontantInvalideException_QNAME, MontantInvalideException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteDejaExistantException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "CompteDejaExistantException")
    public JAXBElement<CompteDejaExistantException> createCompteDejaExistantException(CompteDejaExistantException value) {
        return new JAXBElement<CompteDejaExistantException>(_CompteDejaExistantException_QNAME, CompteDejaExistantException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "creerCompte")
    public JAXBElement<CreerCompte> createCreerCompte(CreerCompte value) {
        return new JAXBElement<CreerCompte>(_CreerCompte_QNAME, CreerCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerArgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "retirerArgent")
    public JAXBElement<RetirerArgent> createRetirerArgent(RetirerArgent value) {
        return new JAXBElement<RetirerArgent>(_RetirerArgent_QNAME, RetirerArgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerArgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "retirerArgentResponse")
    public JAXBElement<RetirerArgentResponse> createRetirerArgentResponse(RetirerArgentResponse value) {
        return new JAXBElement<RetirerArgentResponse>(_RetirerArgentResponse_QNAME, RetirerArgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterArgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ajouterArgent")
    public JAXBElement<AjouterArgent> createAjouterArgent(AjouterArgent value) {
        return new JAXBElement<AjouterArgent>(_AjouterArgent_QNAME, AjouterArgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecouvertNonAutoriseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "DecouvertNonAutoriseException")
    public JAXBElement<DecouvertNonAutoriseException> createDecouvertNonAutoriseException(DecouvertNonAutoriseException value) {
        return new JAXBElement<DecouvertNonAutoriseException>(_DecouvertNonAutoriseException_QNAME, DecouvertNonAutoriseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "recupererClientResponse")
    public JAXBElement<RecupererClientResponse> createRecupererClientResponse(RecupererClientResponse value) {
        return new JAXBElement<RecupererClientResponse>(_RecupererClientResponse_QNAME, RecupererClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDejaExistantException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientDejaExistantException")
    public JAXBElement<ClientDejaExistantException> createClientDejaExistantException(ClientDejaExistantException value) {
        return new JAXBElement<ClientDejaExistantException>(_ClientDejaExistantException_QNAME, ClientDejaExistantException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "recupererCompte")
    public JAXBElement<RecupererCompte> createRecupererCompte(RecupererCompte value) {
        return new JAXBElement<RecupererCompte>(_RecupererCompte_QNAME, RecupererCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeCompteInvalideException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "TypeCompteInvalideException")
    public JAXBElement<TypeCompteInvalideException> createTypeCompteInvalideException(TypeCompteInvalideException value) {
        return new JAXBElement<TypeCompteInvalideException>(_TypeCompteInvalideException_QNAME, TypeCompteInvalideException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterArgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ajouterArgentResponse")
    public JAXBElement<AjouterArgentResponse> createAjouterArgentResponse(AjouterArgentResponse value) {
        return new JAXBElement<AjouterArgentResponse>(_AjouterArgentResponse_QNAME, AjouterArgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnaitreSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "connaitreSoldeResponse")
    public JAXBElement<ConnaitreSoldeResponse> createConnaitreSoldeResponse(ConnaitreSoldeResponse value) {
        return new JAXBElement<ConnaitreSoldeResponse>(_ConnaitreSoldeResponse_QNAME, ConnaitreSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "creerClient")
    public JAXBElement<CreerClient> createCreerClient(CreerClient value) {
        return new JAXBElement<CreerClient>(_CreerClient_QNAME, CreerClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientInexistantException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "ClientInexistantException")
    public JAXBElement<ClientInexistantException> createClientInexistantException(ClientInexistantException value) {
        return new JAXBElement<ClientInexistantException>(_ClientInexistantException_QNAME, ClientInexistantException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "recupererCompteResponse")
    public JAXBElement<RecupererCompteResponse> createRecupererCompteResponse(RecupererCompteResponse value) {
        return new JAXBElement<RecupererCompteResponse>(_RecupererCompteResponse_QNAME, RecupererCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteInexistantException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "CompteInexistantException")
    public JAXBElement<CompteInexistantException> createCompteInexistantException(CompteInexistantException value) {
        return new JAXBElement<CompteInexistantException>(_CompteInexistantException_QNAME, CompteInexistantException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "recupererClient")
    public JAXBElement<RecupererClient> createRecupererClient(RecupererClient value) {
        return new JAXBElement<RecupererClient>(_RecupererClient_QNAME, RecupererClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnaitreSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "connaitreSolde")
    public JAXBElement<ConnaitreSolde> createConnaitreSolde(ConnaitreSolde value) {
        return new JAXBElement<ConnaitreSolde>(_ConnaitreSolde_QNAME, ConnaitreSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalArgumentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.bank.alom/", name = "IllegalArgumentException")
    public JAXBElement<IllegalArgumentException> createIllegalArgumentException(IllegalArgumentException value) {
        return new JAXBElement<IllegalArgumentException>(_IllegalArgumentException_QNAME, IllegalArgumentException.class, null, value);
    }

}
