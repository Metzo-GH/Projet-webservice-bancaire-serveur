
package alom.server.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ajouterArgent complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ajouterArgent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compte" type="{http://service.server.bank.alom/}compte" minOccurs="0"/&gt;
 *         &lt;element name="somme" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterArgent", propOrder = {
    "compte",
    "somme"
})
public class AjouterArgent {

    protected Compte compte;
    protected double somme;

    /**
     * Obtient la valeur de la propri�t� compte.
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
     * D�finit la valeur de la propri�t� compte.
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
     * Obtient la valeur de la propri�t� somme.
     * 
     */
    public double getSomme() {
        return somme;
    }

    /**
     * D�finit la valeur de la propri�t� somme.
     * 
     */
    public void setSomme(double value) {
        this.somme = value;
    }

}
