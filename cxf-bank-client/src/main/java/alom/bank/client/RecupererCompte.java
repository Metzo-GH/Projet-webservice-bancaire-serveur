
package alom.bank.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour recupererCompte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="recupererCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://service.server.bank.alom/}client" minOccurs="0"/>
 *         &lt;element name="typeCompte" type="{http://service.server.bank.alom/}typeCompte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recupererCompte", propOrder = {
    "client",
    "typeCompte"
})
public class RecupererCompte {

    protected Client client;
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
