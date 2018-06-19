package com.lm.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class UsersCtrl {

    private static final Logger LOG = Logger.getLogger(UsersCtrl.class.getName());


    @RequestMapping("/")
    public String getName() {
        LOG.info("Name: ");
        return "Jean paul";
    }
}
