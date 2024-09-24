
package alom.bank.client;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "MontantInvalideException", targetNamespace = "http://service.server.bank.alom/")
public class MontantInvalideException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private MontantInvalideException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public MontantInvalideException_Exception(String message, MontantInvalideException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public MontantInvalideException_Exception(String message, MontantInvalideException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: alom.bank.client.MontantInvalideException
     */
    public MontantInvalideException getFaultInfo() {
        return faultInfo;
    }

}
