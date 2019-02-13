
package org.troparo.entities.member;

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
 *         &lt;element ref="{http://troparo.org/entities/member}MemberTypeOut"/&gt;
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
    "memberTypeOut"
})
@XmlRootElement(name = "getMemberByIdResponseType")
public class GetMemberByIdResponseType {

    @XmlElement(name = "MemberTypeOut", required = true)
    protected MemberTypeOut memberTypeOut;

    /**
     * Gets the value of the memberTypeOut property.
     * 
     * @return
     *     possible object is
     *     {@link MemberTypeOut }
     *     
     */
    public MemberTypeOut getMemberTypeOut() {
        return memberTypeOut;
    }

    /**
     * Sets the value of the memberTypeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberTypeOut }
     *     
     */
    public void setMemberTypeOut(MemberTypeOut value) {
        this.memberTypeOut = value;
    }

}
