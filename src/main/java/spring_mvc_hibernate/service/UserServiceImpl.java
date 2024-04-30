package spring_mvc_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_mvc_hibernate.model.User;
import spring_mvc_hibernate.dao.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepositoryInterfaces;

    @Autowired
    public UserServiceImpl(UserRepository userRepositoryInterfaces) {
        this.userRepositoryInterfaces = userRepositoryInterfaces;
    }

    @Override
    public List<User> getUsers() {
        return userRepositoryInterfaces.getUsers();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userRepositoryInterfaces.createUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepositoryInterfaces.deleteUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepositoryInterfaces.updateUser(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepositoryInterfaces.getUserById(id);
    }

}

