package group.user.dao.residence;

import group.user.entity.residence.Residence;
import group.user.entity.user.User;
import group.user.repository.residenceRepository.ResidenceRepository;
import group.user.repository.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResidenceImpl implements ResidenceDAO{

    @Autowired
     ResidenceRepository residenceRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUserResidence(Residence u) throws Exception {
        if(u.getUser() == null ){
            User user = new User();
            user.setFirstName("Dummy");
            user.setLastName("Dummy");
            userRepository.save(user);
            residenceRepository.save(u);
        }
        residenceRepository.save(u);
    }

    @Override
    public Residence updateUserResidence(Residence user, Long userId, Long residenceId) throws Exception {
        User u = userRepository.findById(Math.toIntExact(userId)).get();
        residenceRepository.findById(Math.toIntExact(residenceId)).map(res -> {
            res.setUser(u);
            res.setAddress(user.getAddress());
            res.setPostcode(user.getPostcode());
            return residenceRepository.save(res);
        });
        return residenceRepository.findById(Math.toIntExact(residenceId)).get();
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
