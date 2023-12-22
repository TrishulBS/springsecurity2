package com.trishul.springsecurity2.security;

import com.trishul.springsecurity2.entities.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority(){
        return authority.getName();
    }
}
