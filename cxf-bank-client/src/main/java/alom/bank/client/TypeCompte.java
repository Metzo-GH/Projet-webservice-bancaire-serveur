
package alom.bank.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeCompte.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCompte">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHEQUES"/>
 *     &lt;enumeration value="LIVRET_A"/>
 *     &lt;enumeration value="LIVRET_DEVELOPPEMENT_DURABLE"/>
 *     &lt;enumeration value="LIVRET_JEUNE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
