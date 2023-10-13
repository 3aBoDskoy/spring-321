package pavel.spring3211.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pavel.spring3211.dao.UserDAO;
import pavel.spring3211.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Transactional
    @Override
    public void editeUser(User user) {
        userDAO.editUser(user);
    }
}
