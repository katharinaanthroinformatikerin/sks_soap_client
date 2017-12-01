
package com.schallerl.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieWebServiceService", targetNamespace = "http://movie.schallerl.com/", wsdlLocation = "http://localhost:8080/MovieServiceWebApp/MovieWebService?wsdl")
public class MovieWebServiceService
    extends Service
{

    private final static URL MOVIEWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIEWEBSERVICESERVICE_EXCEPTION;
    private final static QName MOVIEWEBSERVICESERVICE_QNAME = new QName("http://movie.schallerl.com/", "MovieWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MovieServiceWebApp/MovieWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIEWEBSERVICESERVICE_WSDL_LOCATION = url;
        MOVIEWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MovieWebServiceService() {
        super(__getWsdlLocation(), MOVIEWEBSERVICESERVICE_QNAME);
    }

    public MovieWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIEWEBSERVICESERVICE_QNAME, features);
    }

    public MovieWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MOVIEWEBSERVICESERVICE_QNAME);
    }

    public MovieWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIEWEBSERVICESERVICE_QNAME, features);
    }

    public MovieWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieWebService
     */
    @WebEndpoint(name = "MovieWebServicePort")
    public MovieWebService getMovieWebServicePort() {
        return super.getPort(new QName("http://movie.schallerl.com/", "MovieWebServicePort"), MovieWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieWebService
     */
    @WebEndpoint(name = "MovieWebServicePort")
    public MovieWebService getMovieWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://movie.schallerl.com/", "MovieWebServicePort"), MovieWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIEWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MOVIEWEBSERVICESERVICE_EXCEPTION;
        }
        return MOVIEWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
