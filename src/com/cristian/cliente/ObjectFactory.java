
package com.cristian.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cristian.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReturnName_QNAME = new QName("http://cristian.com/", "returnName");
    private final static QName _ReturnNameResponse_QNAME = new QName("http://cristian.com/", "returnNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cristian.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnNameResponse }
     * 
     */
    public ReturnNameResponse createReturnNameResponse() {
        return new ReturnNameResponse();
    }

    /**
     * Create an instance of {@link ReturnName }
     * 
     */
    public ReturnName createReturnName() {
        return new ReturnName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cristian.com/", name = "returnName")
    public JAXBElement<ReturnName> createReturnName(ReturnName value) {
        return new JAXBElement<ReturnName>(_ReturnName_QNAME, ReturnName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cristian.com/", name = "returnNameResponse")
    public JAXBElement<ReturnNameResponse> createReturnNameResponse(ReturnNameResponse value) {
        return new JAXBElement<ReturnNameResponse>(_ReturnNameResponse_QNAME, ReturnNameResponse.class, null, value);
    }

}
