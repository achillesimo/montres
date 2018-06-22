package com.lm.users;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("services_users")
public interface UserFeign {

    @GetMapping("/users")
    List<User> lire();
}

