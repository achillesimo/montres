package com.lm.suivis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@RequestMapping("/suivis")
public class SuivisCtrl {

    private static final Logger LOG = Logger.getLogger(SuivisCtrl.class.getName());

    UserFeign userFeign;

    public SuivisCtrl(UserFeign userFeign) {
        this.userFeign = userFeign;
    }

    @GetMapping("/user")
    public @ResponseBody  String getName() {
        LOG.info("Suivi du colis de : user");
        return userFeign.lire() + " de Nantes" ;
    }
}
