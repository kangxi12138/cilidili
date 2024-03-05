package com.github.codeman.cilidili;


import com.github.codeman.cilidili.domain.auth.UserAuthorities;

public interface UserAuthService {
    UserAuthorities getUserAuthorities(Long userId);

    void addUserDefaultRole(Long id);
}
