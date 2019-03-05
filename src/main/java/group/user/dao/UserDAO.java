package group.user.dao;

import group.user.entity.User;

import java.util.List;

public interface UserDAO {
   void addUser(User u) throws Exception;
   void updateUser(User u) throws Exception;
   boolean deleteUser(int id) throws Exception;
   List<User> userList() throws Exception;
}
