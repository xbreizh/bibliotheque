package org.troparo.services.loanservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-11T00:25:59.354+01:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "LoanService",
                  wsdlLocation = "file:/C:/Users/john/Documents/openClassrooms/Project_7-Library_troparo/project/new/troparo/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl",
                  targetNamespace = "http://troparo.org/services/LoanService/")
public class LoanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://troparo.org/services/LoanService/", "LoanService");
    public final static QName LoanServicePort = new QName("http://troparo.org/services/LoanService/", "LoanServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/john/Documents/openClassrooms/Project_7-Library_troparo/project/new/troparo/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoanService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/john/Documents/openClassrooms/Project_7-Library_troparo/project/new/troparo/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LoanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ILoanService
     */
    @WebEndpoint(name = "LoanServicePort")
    public ILoanService getLoanServicePort() {
        return super.getPort(LoanServicePort, ILoanService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILoanService
     */
    @WebEndpoint(name = "LoanServicePort")
    public ILoanService getLoanServicePort(WebServiceFeature... features) {
        return super.getPort(LoanServicePort, ILoanService.class, features);
    }

}
