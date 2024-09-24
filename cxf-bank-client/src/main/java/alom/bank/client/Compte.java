
package alom.bank.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
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
@XmlType(name = "compte", propOrder = {
    "client",
    "typeCompte"
})
public class Compte {

    protected Client client;
    @XmlSchemaType(name = "string")
    protected TypeCompte typeCompte;

    /**
     * Obtient la valeur de la propri�t� client.
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
     * D�finit la valeur de la propri�t� client.
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
     * Obtient la valeur de la propri�t� typeCompte.
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
     * D�finit la valeur de la propri�t� typeCompte.
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
