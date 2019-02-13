
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://troparo.org/entities/member}MemberTypeIn"/>
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
    "token",
    "memberTypeIn"
})
@XmlRootElement(name = "addMemberRequestType")
public class AddMemberRequestType {

    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "MemberTypeIn", required = true)
    protected MemberTypeIn memberTypeIn;

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
     * Gets the value of the memberTypeIn property.
     * 
     * @return
     *     possible object is
     *     {@link MemberTypeIn }
     *     
     */
    public MemberTypeIn getMemberTypeIn() {
        return memberTypeIn;
    }

    /**
     * Sets the value of the memberTypeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberTypeIn }
     *     
     */
    public void setMemberTypeIn(MemberTypeIn value) {
        this.memberTypeIn = value;
    }

}
