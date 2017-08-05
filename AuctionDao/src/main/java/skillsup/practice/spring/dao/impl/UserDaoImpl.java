package skillsup.practice.spring.dao.impl;

import skillsup.practice.spring.dao.UserDao;
import skillsup.practice.spring.shared.model.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

    public void init() {
        User user = new User();
        user.setName("John");
        user.setLastName("Smith");
        user.setContactPhone("+380939218051");

        save(user);
    }
}
