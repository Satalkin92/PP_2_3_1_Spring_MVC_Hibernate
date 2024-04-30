package spring_mvc_hibernate.service;

import spring_mvc_hibernate.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void createUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User getUserById(long id);
}
