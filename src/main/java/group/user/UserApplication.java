package group.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UserApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class, args);
        System.out.println(".......Hibernate Maven Example.......\n");
    }

}
