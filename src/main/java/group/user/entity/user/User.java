package group.user.entity.user;

import group.user.entity.residence.Residence;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    public User() {

    }
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name="idresidence")
    private List<Residence> residence;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="firstname", nullable = false, unique = true)
    private String firstname;

    @Column(name="lastname", nullable = false, unique = true)
    private String lastname;


    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
}
