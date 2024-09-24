
package alom.server.client;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-09-24T19:09:30.850+02:00
 * Generated source version: 4.0.5
 */

@WebFault(name = "TypeCompteInvalideException", targetNamespace = "http://service.server.bank.alom/")
public class TypeCompteInvalideException_Exception extends Exception {

    private alom.server.client.TypeCompteInvalideException faultInfo;

    public TypeCompteInvalideException_Exception() {
        super();
    }

    public TypeCompteInvalideException_Exception(String message) {
        super(message);
    }

    public TypeCompteInvalideException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public TypeCompteInvalideException_Exception(String message, alom.server.client.TypeCompteInvalideException typeCompteInvalideException) {
        super(message);
        this.faultInfo = typeCompteInvalideException;
    }

    public TypeCompteInvalideException_Exception(String message, alom.server.client.TypeCompteInvalideException typeCompteInvalideException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = typeCompteInvalideException;
    }

    public alom.server.client.TypeCompteInvalideException getFaultInfo() {
        return this.faultInfo;
    }
}
