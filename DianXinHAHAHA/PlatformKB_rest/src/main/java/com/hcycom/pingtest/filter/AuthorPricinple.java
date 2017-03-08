package com.hcycom.pingtest.filter;

import java.security.Principal;

/**
 * @author cy
 */
public class AuthorPricinple implements Principal {
    private String name;

    public AuthorPricinple(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
