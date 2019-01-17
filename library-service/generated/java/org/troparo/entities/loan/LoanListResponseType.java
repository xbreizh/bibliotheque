
package org.troparo.entities.loan;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://troparo.org/entities/loan}LoanListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loanListType"
})
@XmlRootElement(name = "LoanListResponseType")
public class LoanListResponseType {

    @XmlElement(name = "LoanListType", required = true)
    protected LoanListType loanListType;

    /**
     * Gets the value of the loanListType property.
     * 
     * @return
     *     possible object is
     *     {@link LoanListType }
     *     
     */
    public LoanListType getLoanListType() {
        return loanListType;
    }

    /**
     * Sets the value of the loanListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanListType }
     *     
     */
    public void setLoanListType(LoanListType value) {
        this.loanListType = value;
    }

}
