package group.user.controllers;

import group.user.dao.residence.ResidenceImpl;
import group.user.entity.residence.Residence;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("residenceController")
@RequestMapping("residenceConfiguration")
@Api(value = "User Resource REST Endpoint", description = "Shows the user residence information")
public class ResidenceResourceController {

    @Autowired
    ResidenceImpl residence;

    @GetMapping("/residence")
    public @ResponseBody List<Residence> getAllUsersResidence(){
        return residence.userList();
    }

    @PostMapping("/newUserAndResidence")
    public Residence newUser(@RequestBody Residence u) throws Exception{
        residence.addUserResidence(u);
        return  u;
    }
    @PostMapping("/updateUserResidence/{userId}/{residenceId}")
    public Residence updateUserResidence(@RequestBody Residence u, Long userId, Long residenceId) throws Exception{
       residence.updateUserResidence(u, userId, residenceId);
       return  u;
    }
}
