package org.troparo.services.loanservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-02-09T15:04:47.622+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "LoanService",
        wsdlLocation = "https://raw.githubusercontent.com/xbreizh/troparo/ed8a9d6701a117c82007848a9aa364a1c69688ac/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl",
                  targetNamespace = "http://troparo.org/services/LoanService/") 
public class LoanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://troparo.org/services/LoanService/", "LoanService");
    public final static QName LoanServicePort = new QName("http://troparo.org/services/LoanService/", "LoanServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/xbreizh/troparo/ed8a9d6701a117c82007848a9aa364a1c69688ac/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoanService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "https://raw.githubusercontent.com/xbreizh/troparo/ed8a9d6701a117c82007848a9aa364a1c69688ac/troparo-web/src/main/resources/org/troparo/web/services/LoanService.wsdl");
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
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
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
