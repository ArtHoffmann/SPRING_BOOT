package group.user.dao.residence;

import group.user.entity.residence.Residence;
import group.user.repository.residenceRepository.ResidenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResidenceImpl implements ResidenceDAO{

    @Autowired
     ResidenceRepository residenceRepository;

    @Override
    public void addUser(Residence u) throws Exception {

    }

    @Override
    public Residence updateUser(Residence user, int id) throws Exception {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws Exception {
        return false;
    }

    @Override
    public List<Residence> userList() {
        return residenceRepository.findAll();
    }
}
