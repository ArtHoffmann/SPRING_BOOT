package group.user.entity.residence;

import group.user.entity.user.User;
import javax.persistence.*;

@Entity
@Table(name="residence")
public class Residence {
    public Residence(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idresidence;
    @Column(name="postcode", nullable = false, unique = true)
    private int postcode;
    @Column(name="address", nullable = false, unique = true)
    private String address;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid")
    private User user;

    public Residence(int postcode, String address, User user){
        this.postcode = postcode;
        this.address = address;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
