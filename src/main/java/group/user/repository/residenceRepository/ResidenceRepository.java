package group.user.repository.residenceRepository;

import group.user.entity.residence.Residence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidenceRepository extends JpaRepository<Residence, Integer> {
}
