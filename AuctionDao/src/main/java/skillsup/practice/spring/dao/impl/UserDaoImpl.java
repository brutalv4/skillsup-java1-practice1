package skillsup.practice.spring.dao.impl;

import org.springframework.stereotype.Repository;
import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.User;

import javax.annotation.PostConstruct;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

    @PostConstruct
    public void init() {
        User user = new User();
        user.setName("John");
        user.setLastName("Smith");
        user.setContactPhone("+380939218051");

        save(user);
    }
}
