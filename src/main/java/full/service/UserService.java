package full.service;

import full.entity.User;
import full.user.CrmUser;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);

	void save(CrmUser crmUser);

	public List<User> getUsers();

	public void saveUser(CrmUser theUser);

	public User getUser(Long theId);

	public void deleteUser(Long theId);

	public void saveUpdate(User user);

}
