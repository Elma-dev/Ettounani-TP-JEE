
package com.ettounani.server.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.Server.ettounani.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionFromUroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionFromUroToDh", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.ConversionFromUroToDh")
    @ResponseWrapper(localName = "ConversionFromUroToDhResponse", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.ConversionFromUroToDhResponse")
    @Action(input = "http://ws.Server.ettounani.com/BanqueService/ConversionFromUroToDhRequest", output = "http://ws.Server.ettounani.com/BanqueService/ConversionFromUroToDhResponse")
    public double conversionFromUroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<com.ettounani.server.ws.Compte>
     */
    @WebMethod(operationName = "GetAllComptes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAllComptes", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.GetAllComptes")
    @ResponseWrapper(localName = "GetAllComptesResponse", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.GetAllComptesResponse")
    @Action(input = "http://ws.Server.ettounani.com/BanqueService/GetAllComptesRequest", output = "http://ws.Server.ettounani.com/BanqueService/GetAllComptesResponse")
    public List<Compte> getAllComptes();

    /**
     * 
     * @param code
     * @return
     *     returns com.ettounani.server.ws.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.Server.ettounani.com/", className = "com.ettounani.server.ws.GetCompteResponse")
    @Action(input = "http://ws.Server.ettounani.com/BanqueService/getCompteRequest", output = "http://ws.Server.ettounani.com/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
