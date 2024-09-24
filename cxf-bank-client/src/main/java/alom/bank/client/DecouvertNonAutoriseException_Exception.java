
package alom.bank.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DecouvertNonAutoriseException", targetNamespace = "http://service.server.bank.alom/")
public class DecouvertNonAutoriseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DecouvertNonAutoriseException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DecouvertNonAutoriseException_Exception(String message, DecouvertNonAutoriseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DecouvertNonAutoriseException_Exception(String message, DecouvertNonAutoriseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: alom.bank.client.DecouvertNonAutoriseException
     */
    public DecouvertNonAutoriseException getFaultInfo() {
        return faultInfo;
    }

}
