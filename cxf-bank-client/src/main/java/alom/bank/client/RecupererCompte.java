
package alom.bank.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour recupererCompte complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="recupererCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.server.bank.alom/}client" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://service.server.bank.alom/}typeCompte" minOccurs="0"/>
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
    "arg0",
    "arg1"
})
public class RecupererCompte {

    protected Client arg0;
    @XmlSchemaType(name = "string")
    protected TypeCompte arg1;

    /**
     * Obtient la valeur de la propri�t� arg0.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getArg0() {
        return arg0;
    }

    /**
     * D�finit la valeur de la propri�t� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setArg0(Client value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg1.
     * 
     * @return
     *     possible object is
     *     {@link TypeCompte }
     *     
     */
    public TypeCompte getArg1() {
        return arg1;
    }

    /**
     * D�finit la valeur de la propri�t� arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCompte }
     *     
     */
    public void setArg1(TypeCompte value) {
        this.arg1 = value;
    }

}
