package group.user.controllers;
import group.user.dao.UserDAO;
import group.user.dao.UserImpl;
import group.user.entity.User;
import group.user.repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest")
@Api(value = "User Resource REST Endpoint", description = "Shows the user info")
public class UserResourceController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserImpl userDAO;


    @GetMapping(value="/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        System.out.println("Items MYSQL" + userDAO.userList());
        return userRepository.findAll();
    }





}
