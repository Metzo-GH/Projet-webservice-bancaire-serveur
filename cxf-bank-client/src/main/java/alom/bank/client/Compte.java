
package alom.bank.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://service.server.bank.alom/}client" minOccurs="0"/&gt;
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="typeCompte" type="{http://service.server.bank.alom/}typeCompte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "client",
    "solde",
    "typeCompte"
})
public class Compte {

    protected Client client;
    protected double solde;
    @XmlSchemaType(name = "string")
    protected TypeCompte typeCompte;

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Obtient la valeur de la propriété typeCompte.
     * 
     * @return
     *     possible object is
     *     {@link TypeCompte }
     *     
     */
    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    /**
     * Définit la valeur de la propriété typeCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCompte }
     *     
     */
    public void setTypeCompte(TypeCompte value) {
        this.typeCompte = value;
    }

}
