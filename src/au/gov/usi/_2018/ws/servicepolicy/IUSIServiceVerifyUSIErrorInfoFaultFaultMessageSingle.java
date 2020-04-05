
package au.gov.usi._2018.ws.servicepolicy;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-27T13:59:32.289+11:00
 * Generated source version: 3.3.5
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://usi.gov.au/2018/ws")
public class IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle extends Exception {

    private au.gov.usi._2018.ws.ErrorInfo errorInfo;

    public IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle() {
        super();
    }

    public IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle(String message) {
        super(message);
    }

    public IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle(String message, au.gov.usi._2018.ws.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public IUSIServiceVerifyUSIErrorInfoFaultFaultMessageSingle(String message, au.gov.usi._2018.ws.ErrorInfo errorInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public au.gov.usi._2018.ws.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}