
package alom.bank.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour retirerArgent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="retirerArgent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compte" type="{http://service.server.bank.alom/}compte" minOccurs="0"/&gt;
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retirerArgent", propOrder = {
    "compte",
    "montant"
})
public class RetirerArgent {

    protected Compte compte;
    protected double montant;

    /**
     * Obtient la valeur de la propriété compte.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCompte() {
        return compte;
    }

    /**
     * Définit la valeur de la propriété compte.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCompte(Compte value) {
        this.compte = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

}
