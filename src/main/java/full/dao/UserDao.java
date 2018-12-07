package full.dao;

import java.util.List;

import full.entity.User;

public interface UserDao {

	User findByUserName(String userName);

	void save(User user);

	public List<User> getUsers();

//	Save or update
	public void saveUser(User theUser);

	public User getUser(Long theId);

	public void deleteUser(Long theId);
}
