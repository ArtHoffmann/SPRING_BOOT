package group.user.dao.residence;

import group.user.entity.residence.Residence;

import java.util.List;

public interface ResidenceDAO {
    void addUser(Residence u) throws Exception;
    Residence updateUser(Residence user, int id) throws Exception;
    boolean deleteUser(int id) throws Exception;
    List<Residence> userList() throws Exception;
}
