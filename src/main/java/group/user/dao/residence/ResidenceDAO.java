package group.user.dao.residence;

import group.user.entity.residence.Residence;

import java.util.List;

public interface ResidenceDAO {
    void addUserResidence(Residence u) throws Exception;
    Residence updateUserResidence(Residence user, Long userId, Long residenceId) throws Exception;
    boolean deleteUser(int id) throws Exception;
    List<Residence> userList() throws Exception;
}
