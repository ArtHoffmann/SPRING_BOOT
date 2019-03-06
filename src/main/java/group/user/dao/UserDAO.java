package group.user.dao;

import group.user.entity.User;

import java.util.List;

public interface UserDAO {
   void addUser(User u) throws Exception;
   User updateUser(User user, int id) throws Exception;
   boolean deleteUser(int id) throws Exception;
   List<User> userList() throws Exception;
}
