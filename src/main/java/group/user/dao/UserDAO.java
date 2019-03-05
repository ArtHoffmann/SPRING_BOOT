package group.user.dao;

import group.user.entity.User;

import java.util.List;

public interface UserDAO {
    public void addUser(User u) throws Exception;
    public void updateUser(User u) throws Exception;
    public boolean deleteUser(int id) throws Exception;
    public List<User> userList() throws Exception;
}
