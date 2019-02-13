
package org.troparo.entities.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://troparo.org/entities/book}Token"/&gt;
 *         &lt;element ref="{http://troparo.org/entities/book}BookTypeIn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "bookTypeIn"
})
@XmlRootElement(name = "addBookRequestType")
public class AddBookRequestType {

    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "BookTypeIn", required = true)
    protected BookTypeIn bookTypeIn;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the bookTypeIn property.
     * 
     * @return
     *     possible object is
     *     {@link BookTypeIn }
     *     
     */
    public BookTypeIn getBookTypeIn() {
        return bookTypeIn;
    }

    /**
     * Sets the value of the bookTypeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTypeIn }
     *     
     */
    public void setBookTypeIn(BookTypeIn value) {
        this.bookTypeIn = value;
    }

}
