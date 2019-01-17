package org.library.impl;

import org.library.contract.MemberManager;
import org.library.model.Member;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.troparo.entities.connect.GetTokenRequestType;
import org.troparo.entities.connect.GetTokenResponseType;
import org.troparo.services.connectservice.BusinessException;
import org.troparo.services.connectservice.ConnectService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;
import java.util.logging.Logger;

@Named
public class ConnectManagerImpl implements AuthenticationProvider {


    @Inject
    MemberManager memberManager;
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private String token;
    private final String role = "USER";

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        logger.info(authentication.getPrincipal().toString());
        ConnectService cs = new ConnectService();
        GetTokenRequestType t = new GetTokenRequestType();
        String login = authentication.getName().toUpperCase();
        String password = (String) authentication.getCredentials();
        t.setLogin(login);
        t.setPassword(password);
        logger.info("login: "+login+" \n passwordd: "+password);
        try {
            GetTokenResponseType responseType = cs.getConnectServicePort().getToken(t);
            token = responseType.getReturn();
        } catch (BusinessException e) {
            e.printStackTrace();
            logger.info("issue while trying to get the token");

        }
        logger.info("token found: "+token);


        if (!token.equals("wrong login or pwd")) {
            Authentication auth = new UsernamePasswordAuthenticationToken(login,  token, buildUserAuthority());
            logger.info("trucko: "+auth.getAuthorities());
            logger.info("cred: "+auth.getCredentials());
            logger.info("login: "+auth.getName());

            ((UsernamePasswordAuthenticationToken) auth).setDetails(token);
            return auth;
        }  else {
            throw new
                    BadCredentialsException("External system authentication failed");

        }

    }


    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }





    private Collection<GrantedAuthority> buildUserAuthority() {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        // Build user's authorities
        setAuths.add(new SimpleGrantedAuthority(role));

        Collection<GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuths);
        logger.info("result: "+((ArrayList<GrantedAuthority>) result).get(0));

        return result;
    }



}
