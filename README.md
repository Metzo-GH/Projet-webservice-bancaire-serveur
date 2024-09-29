# Projet de Web Service Bancaire

Ce projet implémente un **web service bancaire** basé sur l'architecture SOAP. Il permet de gérer des comptes bancaires, d'effectuer des opérations comme la création de comptes, l'ajout et le retrait d'argent, ainsi que la consultation du solde.

## Fonctionnalités

- **Créer un client** : Crée un client avec un prénom, un nom et une date de naissance.
- **Créer un compte** : Associe un compte bancaire à un client.
- **Ajouter de l'argent** : Ajoute un montant à un compte bancaire existant.
- **Retirer de l'argent** : Retire un montant du compte si le solde le permet.
- **Consulter le solde** : Consulte le solde actuel du compte bancaire.

## Technologies utilisées

- **SOAP** : Protocole de communication utilisé pour les services web.
- **Java** : Langage de programmation pour le serveur et le client.
- **Apache CXF** : Framework pour implémenter les services SOAP.
- **Tomcat** : Serveur d'applications pour déployer le projet.
- **Maven** : Outil de gestion de dépendances et de construction.

## Structure du projet

Le projet est divisé en deux parties :

- **Serveur** : Fournit les services bancaires via des interfaces SOAP.
- **Client** : Consomme ces services à l'aide de proxies générés à partir du WSDL.

### Côté serveur

Les services sont implémentés dans la classe `BankServiceImpl` et exposés via le WSDL. Voici les principales fonctionnalités :

- **BankServiceImpl.java** : Implémente les opérations de gestion des comptes bancaires.
- **Gestion des exceptions** : Les exceptions comme `MontantInvalideException` et `DecouvertNonAutoriseException` gèrent les scénarios spécifiques de l'application.

### Côté client

Le client consomme les services en appelant les méthodes du serveur via des objets SOAP.

- **BankServiceClient.java** : Classe cliente permettant d'effectuer les différentes opérations bancaires en utilisant le web service.
- **Test client** : Le fichier `BankServiceClientTest.java` contient des exemples d'utilisation du service.
