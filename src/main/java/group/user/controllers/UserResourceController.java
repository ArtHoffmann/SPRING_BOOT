package group.user.controllers;
import group.user.dao.user.UserImpl;
import group.user.entity.user.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@EnableAutoConfiguration
@RestController("userResourceController")
@RequestMapping("userConfiguration")
@Api(value = "User Resource REST Endpoint", description = "Shows the user info")
public class UserResourceController {


    @Autowired
    private UserImpl userDAO;


    @GetMapping(value="/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        System.out.println("Items MYSQL" + userDAO.userList());
        return userDAO.userList();
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public User newUser(@RequestBody User u){
        userDAO.addUser(u);
        return  u;
    }

    @RequestMapping(value = "/newUser/{id}", method = RequestMethod.DELETE)
    public boolean deleteUser(@PathVariable int id){
      if(userDAO.deleteUser(id)){
          return true;
      }else {
          return false;
      }
    }
    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User u, @PathVariable int id){
        return userDAO.updateUser(u, id);
    }
}
