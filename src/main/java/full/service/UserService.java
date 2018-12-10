package full.service;

import full.entity.User;
import full.user.CrmUser;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);

	public void register(CrmUser crmUser);

	public List<User> getUsers();

	public void createAdmin(CrmUser theUser);

	public User getUser(Long theId);

	public void deleteUser(Long theId);

	public void update(User user);
	 
	public void upgrade(User user);

}
