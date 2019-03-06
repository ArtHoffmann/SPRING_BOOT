package group.user.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("residenceConfiguration")
@Api(value = "User Resource REST Endpoint", description = "Shows the user residence information")
public class ResidenceResourceController {

    @GetMapping(value = "/residence")
    public String getResidence() {
        return "Adresse ";
    }

}
