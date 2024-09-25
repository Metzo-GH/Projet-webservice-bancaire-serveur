package alom.bank.client.ClientImpl;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import alom.bank.client.BankService;
import alom.bank.client.Client;
import alom.bank.client.Compte;
import alom.bank.client.TypeCompte;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BankServiceClientTest {

    public static void main(String[] args) {
        // Instancier le client
        BankServiceClient bankServiceClient = new BankServiceClient();
        BankService service = bankServiceClient.getService();

        try {
            // Créer un client
            System.out.println("Création d'un nouveau client...");
            Calendar dateNaissance = Calendar.getInstance();
            dateNaissance.set(1990, Calendar.JANUARY, 1); // Exemple de date de naissance

            // Conversion de Calendar en XMLGregorianCalendar
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(dateNaissance.getTime());
            XMLGregorianCalendar xmlDateNaissance = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);

            Client nouveauClient = service.creerClient("John", "Doe", xmlDateNaissance);
            System.out.println("Client créé : " + nouveauClient.getPrenom() + " " + nouveauClient.getNom());

            // Récupérer un client existant
            System.out.println("Récupération du client...");
            Client clientRecupere = service.recupererClient("John", "Doe", xmlDateNaissance);
            System.out.println("Client récupéré : " + clientRecupere.getPrenom() + " " + clientRecupere.getNom());

            // Créer un compte pour le client
            System.out.println("Création d'un compte pour le client...");
            TypeCompte typeCompte = TypeCompte.CHEQUES; // Utilisation du type de compte (à adapter si nécessaire)
            Compte compteClient = service.creerCompte(clientRecupere, typeCompte);
            System.out.println("Compte créé pour le client : " + nouveauClient.getPrenom() + " " + nouveauClient.getNom());

            // Ajouter de l'argent au compte
            System.out.println("Ajout d'argent au compte...");
            double nouveauSolde = service.ajouterArgent(compteClient, 1000.0); // Ajouter 1000€
            System.out.println("Nouveau solde : " + nouveauSolde + "€");

            // Consulter le solde
            System.out.println("Consultation du solde...");
            double solde = service.connaitreSolde(compteClient);
            System.out.println("Solde actuel : " + solde + "€");

            // Retirer de l'argent
            System.out.println("Retrait d'argent...");
            double soldeApresRetrait = service.retirerArgent(compteClient, 500.0); // Retirer 500€
            System.out.println("Nouveau solde après retrait : " + soldeApresRetrait + "€");

        } catch (Exception e) {
            System.err.println("Une erreur est survenue lors de l'appel au WebService : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
