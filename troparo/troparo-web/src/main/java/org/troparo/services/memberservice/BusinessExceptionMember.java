
package org.troparo.services.memberservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-02-11T00:25:59.095+01:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "BusinessMemberFaultType", targetNamespace = "http://troparo.org/entities/member")
public class BusinessExceptionMember extends Exception {

    private org.troparo.entities.member.BusinessMemberFaultType businessMemberFaultType;

    public BusinessExceptionMember() {
        super();
    }

    public BusinessExceptionMember(String message) {
        super(message);
    }

    public BusinessExceptionMember(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BusinessExceptionMember(String message, org.troparo.entities.member.BusinessMemberFaultType businessMemberFaultType) {
        super(message);
        this.businessMemberFaultType = businessMemberFaultType;
    }

    public BusinessExceptionMember(String message, org.troparo.entities.member.BusinessMemberFaultType businessMemberFaultType, java.lang.Throwable cause) {
        super(message, cause);
        this.businessMemberFaultType = businessMemberFaultType;
    }

    public org.troparo.entities.member.BusinessMemberFaultType getFaultInfo() {
        return this.businessMemberFaultType;
    }
}
