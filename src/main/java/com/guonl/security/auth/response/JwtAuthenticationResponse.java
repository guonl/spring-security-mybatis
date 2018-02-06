package com.guonl.security.auth.response;

/**
 * Author: guonl
 * Description: TODO
 * Date: 2018/2/6 17:29
 */
public class JwtAuthenticationResponse {

    private static final long serialVersionUID = 1250162333152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

}
