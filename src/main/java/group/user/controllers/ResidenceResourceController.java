package group.user.controllers;

import group.user.dao.residence.ResidenceImpl;
import group.user.entity.residence.Residence;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("residenceController")
@RequestMapping("residenceConfiguration")
@Api(value = "User Resource REST Endpoint", description = "Shows the user residence information")
public class ResidenceResourceController {

    @Autowired
    ResidenceImpl residence;

    @GetMapping("/residence")
    public @ResponseBody Iterable<Residence> getAllUsersResidence(){
        return residence.userList();
    }

}
