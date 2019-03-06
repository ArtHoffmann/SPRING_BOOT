package group.user.dao.user;
import group.user.entity.user.User;
import group.user.repository.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserDAO {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User u) {
        userRepository.save(u);
    }

    @Override
    public User updateUser(User user, int id) {
     userRepository.findById(id).map(x -> {
        x.setFirstName(user.getFirstName());
        x.setLastName(user.getLastName());
        return userRepository.save(x);

    });
        User u = userRepository.findById(id).get();
        return u;
    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteById(id);
        return true;
    }


}
