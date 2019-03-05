package group.user.dao;
import group.user.entity.User;
import group.user.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public void updateUser(User u) {

    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteById(id);
        return true;
    }


}
