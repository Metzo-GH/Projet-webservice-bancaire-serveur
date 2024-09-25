
package alom.bank.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeCompte.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>
 * &lt;simpleType name="typeCompte"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHEQUES"/&gt;
 *     &lt;enumeration value="LIVRET_A"/&gt;
 *     &lt;enumeration value="LIVRET_DEVELOPPEMENT_DURABLE"/&gt;
 *     &lt;enumeration value="LIVRET_JEUNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCompte")
@XmlEnum
public enum TypeCompte {

    CHEQUES,
    LIVRET_A,
    LIVRET_DEVELOPPEMENT_DURABLE,
    LIVRET_JEUNE;

    public String value() {
        return name();
    }

    public static TypeCompte fromValue(String v) {
        return valueOf(v);
    }

}
