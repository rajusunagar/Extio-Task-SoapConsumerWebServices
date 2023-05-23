
package com.example.tempwordsoap.number;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NumberConversionSoapType", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NumberConversionSoapType {


    /**
     * Returns the word corresponding to the positive number passed as parameter. Limited to quadrillions.
     * 
     * @param ubiNum
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NumberToWords")
    @WebResult(name = "NumberToWordsResult", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
    @RequestWrapper(localName = "NumberToWords", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.example.tempwordsoap.number.NumberToWords")
    @ResponseWrapper(localName = "NumberToWordsResponse", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.example.tempwordsoap.number.NumberToWordsResponse")
    public String numberToWords(
        @WebParam(name = "ubiNum", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
        BigInteger ubiNum);

    /**
     * Returns the non-zero dollar amount of the passed number.
     * 
     * @param dNum
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NumberToDollars")
    @WebResult(name = "NumberToDollarsResult", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
    @RequestWrapper(localName = "NumberToDollars", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.example.tempwordsoap.number.NumberToDollars")
    @ResponseWrapper(localName = "NumberToDollarsResponse", targetNamespace = "http://www.dataaccess.com/webservicesserver/", className = "com.example.tempwordsoap.number.NumberToDollarsResponse")
    public String numberToDollars(
        @WebParam(name = "dNum", targetNamespace = "http://www.dataaccess.com/webservicesserver/")
        BigDecimal dNum);

}
