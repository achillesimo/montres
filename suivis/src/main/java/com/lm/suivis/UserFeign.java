package com.lm.suivis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("utilisateurs")
public interface UserFeign {

    @GetMapping("/api/users")
    String lire();
}
