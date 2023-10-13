package pavel.spring3211.dao;


import pavel.spring3211.model.User;

import java.util.List;

public interface UserDAO {

    public User getUserById(Long id);

    public List<User> getAllUsers();

    public void saveUser(User user);

    public void deleteUser(Long id);

    public void editUser(User user);
}
